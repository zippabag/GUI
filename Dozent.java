
import java.util.ArrayList;


public class Dozent extends Person {
    private String tcnumarasi;
    public Dozent(String vorname_Dozent, String nachname_Dozent, String tcnumarasi, String fakultat) {
        this.setVorname(vorname_Dozent);
        this.setNachname(nachname_Dozent); 
        this.tcnumarasi = tcnumarasi;
        this.setFakultat(fakultat); 
        
    };
    private ArrayList<String> dozentmitlva = new ArrayList<>();

    public ArrayList<String> getDozentmitlva() {
        return dozentmitlva;
    }

    public void setDozentmitlva(ArrayList<String> dozentmitlva) {
        this.dozentmitlva = dozentmitlva;
    }
    
    public String getTcnumarasi() {
        return tcnumarasi;
    }

    public void setTcnumarasi(String tcnumarasi) {
        this.tcnumarasi = tcnumarasi;
        
    }
    public static boolean checkTcnumarasi(String u) {
        if (u.length() == 11) {
            for (int i = 0; i < u.length(); i++) {
                if (Character.isDigit(u.charAt(i)) == false )  {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
        }
    @Override
    public String toString() {
        return tcnumarasi+","+ getVorname() +","+  getNachname().toUpperCase() ;
    }
    
}
//Emir Atakan Ozaltun 170504038
