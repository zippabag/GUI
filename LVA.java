
import java.util.ArrayList;

public class LVA {
 private String name_LVA= " ";
 private String kurzname_LVA= " ";   
 public LVA(String kurzname_LVA,String name_LVA) {
        this.name_LVA = name_LVA;
        this.kurzname_LVA = kurzname_LVA;
        
        
        
    }
 private ArrayList<String> lvamitstudent = new ArrayList<>();
 private ArrayList<String> lvamitdozent = new ArrayList<>();

    public ArrayList<String> getLvamitdozent() {
        return lvamitdozent;
    }

    public void setLvamitdozent(ArrayList<String> lvamitdozent) {
        this.lvamitdozent = lvamitdozent;
    }

    public ArrayList<String> getLvamitstudent() {
        return lvamitstudent;
    }

    public void setLvamitstudent(ArrayList<String> lvamitstudent) {
        this.lvamitstudent = lvamitstudent;
    }

    public String getName_LVA() {
        return name_LVA;
    }

    public void setName_LVA(String name_LVA) {
        this.name_LVA = name_LVA;
    }

    public String getKurzname_LVA() {
        return kurzname_LVA;
    }

    public void setKurzname_LVA(String kurzname_LVA) {
        this.kurzname_LVA = kurzname_LVA;
    }
    public static boolean checkkurzname_LVA(String q) {
        if(q.length()==6) {
            for(int i=0; i<3; i++) {
                if(Character.isLetter(q.charAt(i))==false || Character.isUpperCase(q.charAt(i))==false) {
                    return false;
                }
            } for(int i=3; i<6; i++) {
                if(Character.isDigit(q.charAt(i))==false) {
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
        return  kurzname_LVA + "," + name_LVA;
    }
}
//Emir Atakan Ozaltun 170504038
