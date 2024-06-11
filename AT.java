// class AT  implements Runnable{
//     public void run(){
//         System.out.println("AT");
//     }
// }

// class Main{
//     public  static void main(String[] args){
//     AT a1=new AT();
//     Thread t1=new Thread(a1);
//     t1.start();
// }
// }


// class ThreadRun2 implements Runnable {
//     public void run(){
//       Thread t = Thread.currentThread();
//       System.out.println("Default priority of " + t.getName() + ": "+t.getPriority());
//       t.setPriority(Thread.MAX_PRIORITY);
//       System.out.println("Priority of " + t.getName() + ": " + t.getPriority());
//     }
//     public static void main(String[] args) {
//       ThreadRun2 a = new ThreadRun2();
//       System.out.println(" ");
//       System.out.println("Main thread priority: "+Thread.currentThread().getPriority());
//       Thread t1 = new Thread(a,"NewThread");
//       t1.start();
//     }
//   }


  