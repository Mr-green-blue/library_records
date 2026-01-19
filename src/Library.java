import java.util.ArrayList;
import java.util.HashMap;
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
            if (b1.get_issued()){
                System.out.println(b1);
            }
        }
    }
    void listAllMembers(){
        for(Member m1: members){
            System.out.println(m1);
        }
    }
}
