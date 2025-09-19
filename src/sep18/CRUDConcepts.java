package sep18;

import java.security.PrivateKey;

//CRUD stands for Create, repeat, update, delete
class Samples{

    private String sampleID;
    private String sampleName;

    //Here we are using method chaining

    public Samples setSampleID(String sampleID){
        this.sampleID = sampleID;
        return this;
    }

    public Samples setSampleName(String sampleName){
        this.sampleName = sampleName;
        return this;
    }

    public String getSampleID(){
        return sampleID;
    }

    public String getSampleName(){
        return sampleName;
    }

    public Samples(String sampleID, String sampleName){
        this.sampleID = sampleID;
        this.sampleName = sampleName;
    }

    public void displaySampleDetails(){
        System.out.println(sampleID+" --Sample ID");
        System.out.println(sampleName+" --Sample Name");
    }

}
public class CRUDConcepts {

    public static void main(String[] args) {

        //Create:
        System.out.println("****************");
        Samples s1 = new Samples("jkdjfn","nijwnfws");
        s1.displaySampleDetails();

        //Read:
        System.out.println("****************");
        System.out.println(s1.getSampleID());
        System.out.println(s1.getSampleName());

        //Update: Here we update the data based on the setters
        System.out.println("****************");
        s1.setSampleName("jhbcsdic")
                .setSampleID("9873289748");

        //Delete: Deletes the object details
//        s1 = null; //Object is deleted
//        s1.displaySampleDetails();


    }
}
