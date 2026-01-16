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
    }
}