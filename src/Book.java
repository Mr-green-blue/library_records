public class Book {
   //encapsulation:making all the things that user can't able to modify from that main class
    private int id;
    private String title;
    private String author;
    private boolean issued;

    Book(int id,String title,String author,boolean issued){
        this.id=id;
        this.title=title;
        this.author=author;
        this.issued=issued;
    }
    int get_id(){
        return this.id;
    }
    String get_title(){
        return this.title;
    }
    String get_author(){
         return this.author;
    }
    boolean get_issued(){
        return this.issued;
    }
    void set_id(int id){
        this.id=id;
    }
    void set_title(String title){
        this.title=title;
    }
    void set_author(String author){
        this.author=author;
    }
    void set_issued(boolean issued ){
        this.issued=issued;
    }
    @Override
    public String toString(){
       return "This is book title "+this.title+"\nThe author name is "+this.author+"\nAnd there id is "+this.id+"\nAvailabily is "+this.issued;
    }
}
