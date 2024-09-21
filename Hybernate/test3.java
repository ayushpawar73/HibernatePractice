public class test3{
    public static void main(String[] args) {
        MyThread3 mt3=new MyThread3();
        mt3.start();
        try{
            for (int i=0;i<=10;i++){
                System.out.println(i+": " +Thread.currentThread().getName());
            }
        }catch (Exception ae){
            System.out.println(ae);
        }
    }9
}