class Thjoin implements Runnable{
    public void run(){
        Thread th=Thread.currentThread();
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
            System.out.println(th.getName()+ " completed ");
        }catch(InterruptedException e){
            System.out.println("threadvInterrupted" + e);
        }
    }
}
class Main{
    public static void main(String... ar){
        Thjoin newTh=new Thjoin();
        Thread th=new Thread(newTh,"OtherThread");
        th.start();
        try{
            th.join();
            System.out.println("Main thread completed");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}