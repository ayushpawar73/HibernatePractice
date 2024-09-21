public class MyThread3 extends Thread {
    public void run(){
        try{
            for (int i=0;i<=10;i++){
                System.out.println(i+": " +Thread.currentThread().getName());
            }
        }
        catch(Exception e){
            System.out.println();
        }
    }
}
