
package use_inspection;


public class HospitalInspections extends inspection {
   
   public HospitalInspections (String hospitalLocation, String hospitalName, int numInspections, String inspectionsNeeded){
        super();
        this.hospitalLocation = hospitalLocation;
        this.hospitalName = hospitalName;
        this.numInspections = numInspections;
        this.inspectionNeeded = inspectionNeeded;
    }

    HospitalInspections() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   

    
    
   
    
public void printInspections(){
System.out.println("HOSPITAL INSPECTION REPORT \n ************************* \nHOSPITAL LOCATION:" + hospitalLocation
+ "\nHOSPITAL NAME:" + hospitalName + "\nYEARS SINCE INSPECTION:" + numInspections + "\nINSPECTION NEEDED:" + inspectionNeeded);
}  
    
}

