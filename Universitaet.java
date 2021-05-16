import java.util.ArrayList;
import javax.swing.JTextField;
public class Universitaet {

   
    private  String name_Universitaet;
    public Universitaet(String name_Universitaet) {
        this.name_Universitaet = name_Universitaet;
    }
    private static ArrayList<Student> studenten = new ArrayList<>();
    private static ArrayList<Dozent> dozenten = new ArrayList<>();
    private static ArrayList<LVA> lvas = new ArrayList<>();

    public ArrayList<Student> getStudenten() {
        return studenten;
    }

    public ArrayList<Dozent> getDozenten() {
        return dozenten;
    }

    public ArrayList<LVA> getLvas() {
        return lvas;
    }

    public void setLvas(ArrayList<LVA> lvas) {
        this.lvas = lvas;
    }
    

    public void setStudenten(ArrayList<Student> studenten) {
        this.studenten = studenten;
    }

    public void setDozenten(ArrayList<Dozent> dozenten) {
        this.dozenten = dozenten;
    }

    public String getName_Universitaet() {
        return name_Universitaet;
    }

    public void setName_Universitaet(String name_Universitaet) {
        this.name_Universitaet = name_Universitaet;
    }
    public static boolean checkMatrikelnummer2(String s) {
        for(int i=0; i< studenten.size(); i ++) {
                        if (s.equals(studenten.get(i).getMatrikelnummer())) {
                    return true;}
                  }
        
        return false;
        }
    public static boolean checkKurznameLVA(String s) {
        for(int i=0; i< lvas.size(); i ++) {
                        if (s.equals(lvas.get(i).getKurzname_LVA())) {
                    return true;}
                  }
        
        return false;
        }
    public static boolean checkTcnumarasi2(String s) {
        for(int i=0; i< dozenten.size(); i ++) {
                        if (s.equals(dozenten.get(i).getTcnumarasi())) {
                    return true;}
                  }
        
        return false;
        }
    
}
//Emir Atakan Ozaltun 170504038