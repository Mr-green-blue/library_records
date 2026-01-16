public class Student extends Member {
    private String member;
    Student(String memberld,String name,String member) {
        super(memberld, name);
        this.member = member;
    }
    @Override
    public String toString(){
        return super.toString()+" and his role is "+this.member;
    }
}
