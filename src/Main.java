import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Member> members =  new ArrayList<>();

    Student s1 = new Student("2321412412","kishore","student");
    Student s2 = new Student("2214534264","jonith","student");
    Student s3 = new Student("157653454","Abirami","student");
    Student s4 = new Student("53426234","deepti","student");


    Librarian l1 = new Librarian("mec@324234","Arigovinthan","faculty");
    Librarian l2 = new Librarian("mec@756765","sathish","faculty");
    Librarian l3 = new Librarian("mec@367567","jorge","faculty");
    Librarian l4 = new Librarian("mec@356456","saravana","faculty");

    members.add(s1);
    members.add(s2);
    members.add(s3);
    members.add(s4);

    members.add(l1);
    members.add(l2);
    members.add(l3);
    members.add(l4);

    //polymorphism
    for(Member mem:members){
        System.out.println(mem);

    }
    Library f1 = new Library();
    f1.addBook(new Book(2134354324,"kishore v","tiles of no where",false));
    f1.addBook(new Book(3453454,"jayasree s","tiles of everywhere",false));
    f1.addBook(new Book(215354324,"jk","tiles of final path",true));

    f1.registerMember(new Member("5465788","jonith"));
    f1.registerMember(new Member("4545614","jai"));
    f1.registerMember(new Member("53252345","lakshit"));
    f1.registerMember(new Member("5543543","barath"));

    f1.listAllMembers();

   f1.lisAllBooks();
   f1.listAvailableBooks();
    }
}