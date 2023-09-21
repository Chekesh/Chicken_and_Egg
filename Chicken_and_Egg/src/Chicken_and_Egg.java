public class Chicken_and_Egg extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Chicken_Coo Chicken = new Chicken_Coo("Курица");
        Chicken_Coo Egg = new Chicken_Coo("Яйцо");
        Chicken.start();
        Egg.start();
        boolean winner = true;
        System.out.println(Chicken.isAlive());
        System.out.println(Egg.isAlive());

        try {
            Chicken.join();
            Egg.join();
            if(Chicken.isAlive()){
                System.out.println("Спор окончен. Победило яйцо");
            }
            else{
                System.out.println("Спор окончен. Победила курица");
            }
                Chicken.join();
                Egg.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
