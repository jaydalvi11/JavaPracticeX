public class App{
    public static void main(String[] args) {
        // Job1
        System.out.println("==Application Started==");

        // Job2  ------------------------------------------- (1)
        // Tasks tsk = new Tasks();
        // tsk.start();  

        // Job2
        Runnable r = new Tasks();    //------------------------------(2)
        Thread thr = new Thread(r);
        thr.setDaemon(true);
        thr.start();

        // Job3
        Runnable rn = new otherTask();   //------------------------------(3)
        Thread th = new Thread(rn);
        th.start();

        // Job4
        for(int doc = 0; doc <= 10; doc++){
            System.out.println("**Printing document " +doc);
        }

        // Job4
        System.out.println("==Application Stopped==");
    }
}

class CA{}

class Tasks extends CA implements Runnable{    //-------------------------------------------(2)
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Printing Paper "+i);
        }
    }
}

class otherTask implements Runnable{      //-----------------------------------------(3)
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Printing Stuff "+i);
        }
    }
}

// class Tasks extends Thread{      --------------------------------------(1)
//     public void run(){
//         for(int i = 0; i <= 5; i++){
//             System.out.println("Printing Paper "+i);
//     }
//     }
// }