public class Chicken_Coo extends Thread{
    String name;
    static boolean first = false;
    Chicken_Coo(String name){
        this.name = name;
    }
    @Override
    public void run(){
        for (int i = 1; i<6; i++) {
            System.out.println(name);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
