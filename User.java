import java.time.LocalDate;
public class User {
    protected String name;
    protected LocalDate dob;
    protected User(String name,int year,int month,int day){
        this.name = name;
        this.dob = LocalDate.of(year,month,day);
    }
    protected User(){
        this.name = "null";
        this.dob = LocalDate.now();
    }
    protected void displayInfo(){
        System.out.println("User Name : " + name);
        System.out.println("User Birthday : " + dob);
    }


}
