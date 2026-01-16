public class Librarian extends Member {
    private String employeed;

    Librarian(String memberld, String name, String employeed) {
        super(memberld, name);
        this.employeed = employeed;
    }

    @Override
    public String toString() {
        return super.toString() + " and his role is " + this.employeed;
    }
}