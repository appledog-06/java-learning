public class InvalidVoterException extends Exception{
    public InvalidVoterException(String msg){
        super(msg);
    }
}
class voter{
    String name;
    int age;
    public voter(String name,int age)throws InvalidVoterException{
        if(age<18) {
            throw new InvalidVoterException("CANT VOTE");
        }
        else{
            this.name=name;
            this.age=age;
        }
    }
}
class Vote{
    public static void main(String[]args){
        try {
            voter v = new voter("surbi", 12);
        }
        catch(InvalidVoterException e){
            System.out.println(e.getMessage());
        }
    }
}
