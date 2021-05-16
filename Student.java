import java.util.ArrayList;

public class Student extends Person {
    private String matrikelnummer= " ";
    private String fach_Student;
    private String semester_Student;
    private String notendurchschnitt;
    private String deutschniveau;
    
    

    public Student(String vorname_Student, String nachname_Student, String matrikelnummer, String fakultat_Student, String fach_Student, String semester_Student, String jahre, String email, String geschlecht, String notendurchschnitt) {
        this.setVorname(vorname_Student);
        this.setNachname(nachname_Student); 
        this.matrikelnummer = matrikelnummer;
        this.setFakultat(fakultat_Student); 
        this.fach_Student = fach_Student;
        this.semester_Student = semester_Student;
        this.setJahre(jahre);
        this.setEmail(email); 
        this.setGeschlecht(geschlecht);
        this.notendurchschnitt = notendurchschnitt;
        
    }
    private ArrayList<String> studentmitlva = new ArrayList<>();

    public ArrayList<String> getStudentmitlva() {
        return studentmitlva;
    }

    public void setStudentmitlva(ArrayList<String> studentmitlva) {
        this.studentmitlva = studentmitlva;
    }
    

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getFach_Student() {
        return fach_Student;
    }

    public void setFach_Student(String fach_Student) {
        this.fach_Student = fach_Student;
    }

    public String getSemester_Student() {
        return semester_Student;
    }

    public void setSemester_Student(String semester_Student) {
        this.semester_Student = semester_Student;
    }

    public String getNotendurchschnitt() {
        return notendurchschnitt;
    }

    public void setNotendurchschnitt(String notendurchschnitt) {
        this.notendurchschnitt = notendurchschnitt;
    }

    

    

    public static boolean checkMatrikelnummer(String s) {
        if (s.length() == 7) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i)) == false || s.startsWith("0"))  {
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
        return matrikelnummer+","+ getVorname() +","+  getNachname().toUpperCase() +","+ getFakultat() +","+ fach_Student +","+ semester_Student ;
    }

    
    }
//Emir Atakan Ozaltun 170504038