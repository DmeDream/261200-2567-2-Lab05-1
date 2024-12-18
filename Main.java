public class Main {
    public static void main(String[] args) {
        User john = new User("Jonh",1954,2,18);
        john.displayInfo();
        Admin nicolas = new Admin("nicolas",1964,1,7);
        nicolas.displayInfo(true);
        Admin chaem = new Admin("chaem",1998,7,5);
        chaem.displayInfo(false);
    }
}