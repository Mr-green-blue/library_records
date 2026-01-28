import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>() ;
    private List<Member> members = new ArrayList<>();


    void addBook(Book b){
        this.books.add(b);
    }
    void registerMember(Member m){
        this.members.add(m);
    }
    void lisAllBooks(){
        for (Book b1 : books) {
            System.out.println(b1);
        }
    }
    void listAvailableBooks(){
        for(Book b1: books){
            if (!b1.get_issued()){
                System.out.println(b1);
            }
        }
    }
   public String borrowBook(String memberld,int bookld){
        Book bookFound =null;
        Member memberFound=null;
        for(Book b1:books) {
            if (b1.get_id() == bookld) {
                bookFound = b1;
                break;
            }
        }
        if(bookFound==null) return "Book not found";
        for (Member m1 : members) {
            if (m1.getMemberld().equals(memberld) ) {
               memberFound = m1;
               break;
            }
        }
        if (memberFound==null) return "memeber not found";
       if(bookFound.get_issued()) return "Book ins already borrowed";
       else {
           bookFound.set_issued(true);
           return "Success:Book borrowed";
       }
   }
   public String returnBook(String memberld,int bookld){
       Member foundMember=null;
       Book foundBook = null;
       for(Member m1 : members){
           if(memberld.equals(m1.getMemberld())){
               foundMember=m1;
               break;
           }
       }
       if(foundMember==null) return "memberb is not founded";
       for(Book b1:books){
           if(b1.get_id()==bookld) {
               foundBook=b1;
               break;
           }

       }
       if(foundBook==null) return "Book is not founded";
       if(foundBook.get_issued()==false) return "Book wasn't borrowed";
       else {
          foundBook.set_issued(false);
          return "Success : Book returned";
       }
    }
}

