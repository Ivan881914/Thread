public class Main {
    public static void main(String[] args) throws InterruptedException {
        FirstThread firstThread = new FirstThread();
        firstThread.start();

        SecondThread secondThread = new SecondThread();
        secondThread.start();


        System.out.println("Hello world!");
        Thread.sleep(1000*5);
        System.out.println("Спасибо что подождали 5 секунд");
    }
}
class FirstThread extends Thread{
    public void run(){
        for (int i = 0; i<100; i++) {
            System.out.println("Поток 1 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class SecondThread extends Thread{
    public void run(){
        for (int i = 0; i<100; i++){
            System.out.println("Поток 2 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}