package assigmentmuci1;

public class SoftwareDevelopment extends Department {


    public SoftwareDevelopment(String name, int numberOfWorker) {

        super(name,numberOfWorker);
        number++;
       
    }

    
  
    public static int getNumber() {

        return number;

    }
    
}
