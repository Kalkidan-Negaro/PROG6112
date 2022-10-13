
package use_inspection;

import java.util.Scanner;

public class Use_Inspection {


    public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Enter the hospital location:");
    String hospitalLocation = input.next();
    
    System.out.println("Enter the hospital name:");
    String hospitalName = input.next();
    
    System.out.println("Enter the years since the last inspection:");
    int numInspection = input.nextInt();
   
    if (numInspection > 2){
        String inspectionNeeded = "Yes";
    }
    
    else{
        String inspectionNeeded = "No";
    }
    HospitalInspections myWork = new HospitalInspections();
    myWork.printInspections();
    }
    
}
