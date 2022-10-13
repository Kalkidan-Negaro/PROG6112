
package use_inspection;



public abstract class inspection {
 String hospitalName;
 String hospitalLocation;
 int numInspections;
 String inspectionNeeded;


    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public int getNumInspections() {
        return numInspections;
    }

    public String getInspectionNeeded() {
        return inspectionNeeded;
    }
    
    
    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setNumInspections(int numInspections) {
        this.numInspections = numInspections;
    }

    public void setInspectionNeeded(String inspectionNeeded) {
        this.inspectionNeeded = inspectionNeeded;
    }

    
  
}

interface iInspection {
public String getLocation();
public String getHospitalName(); 
public int getYearsSinceInspection();
public String getInspectionNeeded();
}
