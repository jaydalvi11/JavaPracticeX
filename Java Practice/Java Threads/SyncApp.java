public class SyncApp {
    public static void main(String[] args) {
        System.out.println("===Application Started===");

        Printer prnter = new Printer();
       // prnter.printDocuments(6, "GubuGubu");
        
       myThread mth = new myThread(prnter);
       mth.start();
        System.out.println("===Application Stopped===");
    }
    
}

class Printer{
    void printDocuments(int documentNumber, String documentName){
        for(int i = 0; i <= documentNumber; i++){
            System.out.println("Printing "+documentName+" "+i);
        }
    }
}

class myThread extends Thread{
    Printer prn;
    myThread(Printer p){
        prn = p;
    }
    public void run(){
        prn.printDocuments(6, "Jay's Profile");
    }
}

class yourThread extends Thread{
    Printer prn;
    myThread(Printer p){
        prn = p;
    }
    public void run(){
        prn.printDocuments(6, "Jay's Profile");
    }
}