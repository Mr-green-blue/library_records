public class Member {    //parent class
    private String memberld;
    private String name;
    Member(String memberld, String name){
        this.memberld=memberld;
        this.name=name;
    }
    String getMemberld(){
         return this.memberld;
    }
    String getName(){
        return this.name;
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
