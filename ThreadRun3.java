class ThreadRun3 implements Runnable{
    public void run(){
        Thread t=Thread.currentThread();
        int total=0;
        for(int i=0;i<100000000;i++){
            total+=i;
        }
        System.out.println(t.getName() + " with priority " + t.getPriority()+ " has finished its execution with total = " + total);
    }
  }
  class Main{
      public static void main(String[] args){
          ThreadRun3 a=new ThreadRun3();
          Thread t1=new Thread(a,"Thread1");
          Thread t2=new Thread(a,"Thread2");
          Thread t3=new Thread(a,"Thread3");
          t1.setPriority(Thread.MAX_PRIORITY);
          t2.setPriority(Thread.MIN_PRIORITY);
          t3.setPriority(Thread.NORM_PRIORITY);
          t1.start();
          t2.start();
          t3.start();
      }
    //   public static void main(String args[]){
    //     Thread t=Thread.currentThread();
    //     t.setName("Main Thread");
    //     t.setPriority(Thread.MIN_PRIORITY);
    //     ThreadRun3 newTh=new ThreadRun3();
    //     Thread th1=new Thread(newTh,"NewThread");
    //     th1.setPriority(Thread.MAX_PRIORITY);
    //     th1.start();
    //     int total=0;
    //     for(int i=0;i<100000000;i++){
    //         total+=i;
    //     }
    //     System.out.println(t.getName() + " with priority " + t.getPriority()+ " has finished its execution with total = " + total);
    //   }
  }