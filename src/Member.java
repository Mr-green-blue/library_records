public class Member {
    private String memberld;
    private String name;
    Member(String memberld, String name){
        this.memberld=memberld;
        this.name=name;
    }
    void getMemberld(){
        System.out.println(this.memberld);
    }
    void getName(){
        System.out.println(this.name);
    }
    void setMemberld(String memberld){
        this.memberld=memberld;
    }
    void setName(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return this.name +" : "+ this.memberld;
    }
}
