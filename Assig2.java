import java.io.*;
class Residential_Society{
    String society_name;
    String locality;
    String Secretory_name;
}
class building extends Residential_Society{
    String building_name;
    int apartement_name;
}
class appart extends building{
    int appartmentno;
    String ownername;
    String meter_name;
}
public class Assig2 {
    public static void main(String[] args) {
        Residential_Society r=new Residential_Society();
        building b1=new building();
        building b2=new building();
        building b3=new building();
        String l=null;
        try{
            BufferedReader b=new BufferedReader(new FileReader("Sample.csv"));
            while((l=b.readLine())!=null){
                String []appt=l.split(",");
                System.out.println(appt[0]+" "+appt[1]+" "+appt[2]+" "+appt[3]);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
