
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.lang.reflect.Array;
import static java.time.Clock.system;
import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class AnaEkran extends javax.swing.JFrame {

    
    public AnaEkran() {
        initComponents();
        Student_Table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
          int a = Student_Table.getSelectedRow();
            if(a >= 0){
               StuVorname_Textfield.setText((String)Student_Table.getModel().getValueAt(a, 0));
               StuNachname_Textfield.setText((String)Student_Table.getModel().getValueAt(a, 1));
               StuMatrikelnummer_Textfield.setText((String)Student_Table.getModel().getValueAt(a, 2));
               StuFakultat_Textfield.setText((String)Student_Table.getModel().getValueAt(a, 3));
               StuFach_Textfield.setText((String)Student_Table.getModel().getValueAt(a, 4));
               StuSemester_Textfield.setText((String)Student_Table.getModel().getValueAt(a, 5));
               StuJahre_Textfield.setText((String)Student_Table.getModel().getValueAt(a, 6));
               StuEmail_Textfield.setText((String)Student_Table.getModel().getValueAt(a, 7));
               StuGeschlecht_Textfield.setText((String)Student_Table.getModel().getValueAt(a, 8));
               StuNoten_Textfield.setText((String)Student_Table.getModel().getValueAt(a, 9));
            }
       
      }

    });//Ogrenci tablosuna listener eklemek
       Dozent_Table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
          int a = Dozent_Table.getSelectedRow();
            if(a >= 0){
               DozVorname_Textfield.setText((String)Dozent_Table.getModel().getValueAt(a, 0));
               DozNachname_Textfield.setText((String)Dozent_Table.getModel().getValueAt(a, 1));
               DozTcnummer_Textfield.setText((String)Dozent_Table.getModel().getValueAt(a, 2));
               DozFakultat_Textfield.setText((String)Dozent_Table.getModel().getValueAt(a, 3));
            }
       
      }

    });//Dozent tablosuna listener eklemek 
     Lva_Table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
          int a = Lva_Table.getSelectedRow();
            if(a >= 0){
               LvaKurzname_Textfield.setText((String)Lva_Table.getModel().getValueAt(a, 0));
               LvaName_Textfield.setText((String)Lva_Table.getModel().getValueAt(a, 1));
            }
       
      }

    });//Dozent tablosuna listener eklemek  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LvaKurzname_Textfield = new javax.swing.JTextField();
        LvaName_Textfield = new javax.swing.JTextField();
        LvaHinzu_Button = new javax.swing.JButton();
        LvaLoschen_Button = new javax.swing.JButton();
        LvaAktualisieren_Button = new javax.swing.JButton();
        LvaMesaj = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lva_Table = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        Lva_Table2 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        Lva_Table3 = new javax.swing.JTable();
        LvaAuflisten_Button = new javax.swing.JButton();
        LvaSuchen_Button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DozVorname_Textfield = new javax.swing.JTextField();
        DozNachname_Textfield = new javax.swing.JTextField();
        DozTcnummer_Textfield = new javax.swing.JTextField();
        DozFakultat_Textfield = new javax.swing.JTextField();
        DozHinzu_Button = new javax.swing.JButton();
        DozLoschen_Button = new javax.swing.JButton();
        DozAktual_Button = new javax.swing.JButton();
        DozMesaj = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Dozent_Table = new javax.swing.JTable();
        DozAuflisten_Button = new javax.swing.JButton();
        DozSuchen_Button = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        Dozent_Table2 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        Dozent_Table3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        StuLvaMatrikelnummer_Textfield = new javax.swing.JTextField();
        StuLvaKurzname_Textfield = new javax.swing.JTextField();
        StuAnmelden_Button = new javax.swing.JButton();
        StuAbmelden_Button = new javax.swing.JButton();
        StuLvaMesaj = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        StudentLva_Table = new javax.swing.JTable();
        StuAnzeigen_Button = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        StudentLva_Table2 = new javax.swing.JTable();
        LvaAnzeigen_Button = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        StudentLva_Table3 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        DozLvaTcnummer_Textfield = new javax.swing.JTextField();
        DozLvaKurzname_Textfield = new javax.swing.JTextField();
        DozAnmelden_Button = new javax.swing.JButton();
        DozAbmelden_Button = new javax.swing.JButton();
        DozAnzeigen_Button = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        DozentLva_Table = new javax.swing.JTable();
        DozLvaMesaj = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        DozentLva_Table2 = new javax.swing.JTable();
        LvaAnzeigen_Button2 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        DozentLva_Table3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Student_Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        StuVorname_Textfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        StuNachname_Textfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        StuMatrikelnummer_Textfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        StuFakultat_Textfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        StuFach_Textfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        StuSemester_Textfield = new javax.swing.JTextField();
        StuHinzu_Button = new javax.swing.JButton();
        StuLoschen_Button = new javax.swing.JButton();
        StuAktualisieren_Button = new javax.swing.JButton();
        StuMesaj = new javax.swing.JLabel();
        StuAuflisten_Button = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Student_Table2 = new javax.swing.JTable();
        StuSuchen_Button = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Student_Table3 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        StuJahre_Textfield = new javax.swing.JTextField();
        StuEmail_Textfield = new javax.swing.JTextField();
        StuGeschlecht_Textfield = new javax.swing.JTextField();
        StuNoten_Textfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Kurzname");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Name");

        LvaKurzname_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        LvaName_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        LvaHinzu_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LvaHinzu_Button.setText("LVA Hinzufugen");
        LvaHinzu_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LvaHinzu_ButtonActionPerformed(evt);
            }
        });

        LvaLoschen_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LvaLoschen_Button.setText("LVA Loschen");
        LvaLoschen_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LvaLoschen_ButtonActionPerformed(evt);
            }
        });

        LvaAktualisieren_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LvaAktualisieren_Button.setText("LVA Aktualisieren");
        LvaAktualisieren_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LvaAktualisieren_ButtonActionPerformed(evt);
            }
        });

        Lva_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kurzname", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Lva_Table);

        Lva_Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kurzname", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(Lva_Table2);

        Lva_Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Kurzname", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(Lva_Table3);

        LvaAuflisten_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LvaAuflisten_Button.setText("LVA Auflisten");
        LvaAuflisten_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LvaAuflisten_ButtonActionPerformed(evt);
            }
        });

        LvaSuchen_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LvaSuchen_Button.setText("LVA Suchen");
        LvaSuchen_Button.setToolTipText("");
        LvaSuchen_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LvaSuchen_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LvaAktualisieren_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LvaHinzu_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(150, 150, 150)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LvaName_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(LvaKurzname_Textfield)))
                    .addComponent(LvaLoschen_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LvaMesaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LvaAuflisten_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LvaSuchen_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LvaKurzname_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LvaName_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LvaHinzu_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LvaLoschen_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LvaAktualisieren_Button)
                        .addGap(18, 18, 18)
                        .addComponent(LvaAuflisten_Button)
                        .addGap(18, 18, 18)
                        .addComponent(LvaSuchen_Button)
                        .addGap(83, 83, 83)
                        .addComponent(LvaMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(573, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lehrverwaltung", jPanel3);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Vorname");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Nachname");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("TC Nummer");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Fakultat");

        DozVorname_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DozVorname_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozVorname_TextfieldActionPerformed(evt);
            }
        });

        DozNachname_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DozNachname_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozNachname_TextfieldActionPerformed(evt);
            }
        });

        DozTcnummer_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DozTcnummer_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozTcnummer_TextfieldActionPerformed(evt);
            }
        });

        DozFakultat_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DozFakultat_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozFakultat_TextfieldActionPerformed(evt);
            }
        });

        DozHinzu_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DozHinzu_Button.setText("Dozent Hinzufugen");
        DozHinzu_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozHinzu_ButtonActionPerformed(evt);
            }
        });

        DozLoschen_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DozLoschen_Button.setText("Dozent Loschen");
        DozLoschen_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozLoschen_ButtonActionPerformed(evt);
            }
        });

        DozAktual_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DozAktual_Button.setText("Dozent Aktualisieren");
        DozAktual_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozAktual_ButtonActionPerformed(evt);
            }
        });

        Dozent_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vorname", "Nachname", "TC Nummer", "Fakultat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Dozent_Table);

        DozAuflisten_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DozAuflisten_Button.setText("Dozent Auflisten");
        DozAuflisten_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozAuflisten_ButtonActionPerformed(evt);
            }
        });

        DozSuchen_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DozSuchen_Button.setText("Dozent Suchen");
        DozSuchen_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozSuchen_ButtonActionPerformed(evt);
            }
        });

        Dozent_Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vorname", "Nachname", "TC Nummer", "Fakultat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(Dozent_Table2);

        Dozent_Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Vorname", "Nachname", "TC Nummer", "Fakultat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Dozent_Table3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane7.setViewportView(Dozent_Table3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DozMesaj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DozSuchen_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DozAuflisten_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DozAktual_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DozLoschen_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DozHinzu_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(150, 150, 150)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DozTcnummer_Textfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(DozNachname_Textfield, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DozVorname_Textfield, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DozFakultat_Textfield))))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DozVorname_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DozNachname_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DozTcnummer_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DozFakultat_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(DozHinzu_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DozLoschen_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DozAktual_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DozAuflisten_Button)
                        .addGap(18, 18, 18)
                        .addComponent(DozSuchen_Button))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DozMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(504, 504, 504))
        );

        jTabbedPane1.addTab("Dozentverwaltung", jPanel2);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Matrikelnummer");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Kurzname von LVA");

        StuLvaMatrikelnummer_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        StuLvaKurzname_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        StuAnmelden_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StuAnmelden_Button.setText("Student zur LVA anmelden");
        StuAnmelden_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuAnmelden_ButtonActionPerformed(evt);
            }
        });

        StuAbmelden_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StuAbmelden_Button.setText("Student von LVA abmelden");
        StuAbmelden_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuAbmelden_ButtonActionPerformed(evt);
            }
        });

        StudentLva_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vorname", "Nachname", "Matrikelnummer", "Fakultat", "Fach", "Semester", "Kurzname LVA", "LVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(StudentLva_Table);

        StuAnzeigen_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StuAnzeigen_Button.setText("Alle LVAs eines Studenten anzeigen");
        StuAnzeigen_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuAnzeigen_ButtonActionPerformed(evt);
            }
        });

        StudentLva_Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vorname", "Nachname", "Matrikelnummer", "Fakultat", "Fach", "Semester", "Kurzname von LVA", "LVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(StudentLva_Table2);

        LvaAnzeigen_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LvaAnzeigen_Button.setText("Alle angemeldeten Studenten der LVA auflisten");
        LvaAnzeigen_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LvaAnzeigen_ButtonActionPerformed(evt);
            }
        });

        StudentLva_Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kurzname von LVA", "LVA", "Vorname", "Nachname", "Matrikelnummer", "Fakultat", "Fach", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(StudentLva_Table3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(150, 150, 150)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StuLvaKurzname_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(StuLvaMatrikelnummer_Textfield)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(StuAnzeigen_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                        .addComponent(StuLvaMesaj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StuAbmelden_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StuAnmelden_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LvaAnzeigen_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addComponent(jScrollPane14)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StuLvaMatrikelnummer_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StuLvaKurzname_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(StuAnmelden_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StuAbmelden_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StuAnzeigen_Button)
                        .addGap(18, 18, 18)
                        .addComponent(LvaAnzeigen_Button))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(StuLvaMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(603, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student-LVA anmelden", jPanel4);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("TC Nummer");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Kurzname von LVA");

        DozLvaTcnummer_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        DozLvaKurzname_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        DozAnmelden_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DozAnmelden_Button.setText("Dozent zur LVA anmelden");
        DozAnmelden_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozAnmelden_ButtonActionPerformed(evt);
            }
        });

        DozAbmelden_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DozAbmelden_Button.setText("Dozent von LVA abmelden");
        DozAbmelden_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozAbmelden_ButtonActionPerformed(evt);
            }
        });

        DozAnzeigen_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DozAnzeigen_Button.setText("Alle LVAs eines Dozenten anzeigen");
        DozAnzeigen_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozAnzeigen_ButtonActionPerformed(evt);
            }
        });

        DozentLva_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vorname", "Nachname", "TC Nummer", "Fakultat", "Kurzname von LVA", "LVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(DozentLva_Table);

        DozentLva_Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vorname", "Nachname", "TC Nummer", "Fakultat", "Kurzname von LVA", "LVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(DozentLva_Table2);

        LvaAnzeigen_Button2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LvaAnzeigen_Button2.setText("Alle verantwortlichen Dozenten der LVA auflisten");
        LvaAnzeigen_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LvaAnzeigen_Button2ActionPerformed(evt);
            }
        });

        DozentLva_Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kurzname von LVA", "LVA", "Vorname", "Nachname", "TC Nummer", "Fakultat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(DozentLva_Table3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LvaAnzeigen_Button2, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addComponent(DozLvaMesaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addGap(150, 150, 150)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DozLvaKurzname_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(DozLvaTcnummer_Textfield)))
                    .addComponent(DozAbmelden_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DozAnzeigen_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DozAnmelden_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addComponent(jScrollPane15)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DozLvaTcnummer_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DozLvaKurzname_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(DozAnmelden_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DozAbmelden_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DozAnzeigen_Button))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LvaAnzeigen_Button2)
                        .addGap(33, 33, 33)
                        .addComponent(DozLvaMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(629, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dozent-LVA anmelden", jPanel5);

        Student_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vorname", "Nachname", "Matrikelnummer", "Fakultat", "Fach", "Semester", "Jahre", "Email", "Geschlecht", "Notendurchschnittlich"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Student_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Student_Table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Vorname");

        StuVorname_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StuVorname_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuVorname_TextfieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nachname");

        StuNachname_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StuNachname_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuNachname_TextfieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Matrikelnummer");

        StuMatrikelnummer_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StuMatrikelnummer_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuMatrikelnummer_TextfieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Fakultat");

        StuFakultat_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StuFakultat_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuFakultat_TextfieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Fach");

        StuFach_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StuFach_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuFach_TextfieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Semester");

        StuSemester_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StuSemester_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuSemester_TextfieldActionPerformed(evt);
            }
        });

        StuHinzu_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StuHinzu_Button.setText("Student Hinzufugen");
        StuHinzu_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuHinzu_ButtonActionPerformed(evt);
            }
        });

        StuLoschen_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StuLoschen_Button.setText("Student Loschen");
        StuLoschen_Button.setToolTipText("");
        StuLoschen_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuLoschen_ButtonActionPerformed(evt);
            }
        });

        StuAktualisieren_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StuAktualisieren_Button.setText("Student Aktualisieren");
        StuAktualisieren_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuAktualisieren_ButtonActionPerformed(evt);
            }
        });

        StuAuflisten_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StuAuflisten_Button.setText("Student Auflisten");
        StuAuflisten_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuAuflisten_ButtonActionPerformed(evt);
            }
        });

        Student_Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vorname", "Nachname", "Matrikelnummer", "Fakultat", "Fach", "Semester", "Jahre", "Email", "Geschlecht", "Notendurchschnittlich"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(Student_Table2);

        StuSuchen_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StuSuchen_Button.setText("Student Suchen");
        StuSuchen_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuSuchen_ButtonActionPerformed(evt);
            }
        });

        Student_Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Vorname", "Nachname", "Matrikelnummer", "Fakultat", "Fach", "Semester", "Jahre", "Email", "Geschlecht", "Notendurchschnittlich"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(Student_Table3);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Jahre");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("E-Mail");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("Geschlecht");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Notendurchschnitt");

        StuJahre_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        StuEmail_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        StuGeschlecht_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        StuNoten_Textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StuMesaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(StuSuchen_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StuAuflisten_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StuAktualisieren_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StuLoschen_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StuHinzu_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(150, 150, 150)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(StuSemester_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(StuFach_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(StuJahre_Textfield)
                                    .addComponent(StuEmail_Textfield)
                                    .addComponent(StuGeschlecht_Textfield)
                                    .addComponent(StuNoten_Textfield)
                                    .addComponent(StuNachname_Textfield)
                                    .addComponent(StuMatrikelnummer_Textfield)
                                    .addComponent(StuFakultat_Textfield)
                                    .addComponent(StuVorname_Textfield))))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(StuVorname_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(StuNachname_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(StuMatrikelnummer_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(StuFakultat_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StuFach_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StuSemester_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(StuJahre_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(StuEmail_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StuGeschlecht_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StuNoten_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(StuHinzu_Button)
                        .addGap(18, 18, 18)
                        .addComponent(StuLoschen_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StuAktualisieren_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StuAuflisten_Button)
                        .addGap(18, 18, 18)
                        .addComponent(StuSuchen_Button))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(StuMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Studentverwaltung", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DozVorname_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozVorname_TextfieldActionPerformed
        
    }//GEN-LAST:event_DozVorname_TextfieldActionPerformed

    private void DozFakultat_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozFakultat_TextfieldActionPerformed
        
    }//GEN-LAST:event_DozFakultat_TextfieldActionPerformed

    private void DozNachname_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozNachname_TextfieldActionPerformed
        
    }//GEN-LAST:event_DozNachname_TextfieldActionPerformed

    private void DozTcnummer_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozTcnummer_TextfieldActionPerformed
        
    }//GEN-LAST:event_DozTcnummer_TextfieldActionPerformed

    private void DozHinzu_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozHinzu_ButtonActionPerformed

        String Tcnummer = DozTcnummer_Textfield.getText();
        String vorname_Dozent = DozVorname_Textfield.getText();
        String nachname_Dozent = DozNachname_Textfield.getText();
        String fakultat = DozFakultat_Textfield.getText();
        if(Universitaet.checkTcnumarasi2(Tcnummer)==true){
                DozMesaj.setText("In dieser TC-Nummer befindet sich ein weiterer Dozent.");}
        else if(Dozent.checkTcnumarasi(Tcnummer)==true){
        uni.getDozenten().add(new Dozent(vorname_Dozent, nachname_Dozent, Tcnummer, fakultat));
        DozMesaj.setText("Dozent ist erfolgreich hinzugefugt." + uni.getDozenten().size());
         
        ss2[0] = DozVorname_Textfield.getText();
        ss2[1] = DozNachname_Textfield.getText();
        ss2[2] = DozTcnummer_Textfield.getText();
        ss2[3] = DozFakultat_Textfield.getText();
        DefaultTableModel dtm = (DefaultTableModel) Dozent_Table.getModel();
        dtm.addRow(ss2);
         }
        else{
                       DozMesaj.setText("Die TC-Nummer muss aus Zahlen bestehen und 11-stellig sein."); 
                    }
    }//GEN-LAST:event_DozHinzu_ButtonActionPerformed

    private void DozLoschen_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozLoschen_ButtonActionPerformed
      int a = Dozent_Table.getSelectedRow();
       if(a >= 0){
           String z;
           z = uni.getDozenten().get(a).getTcnumarasi();
           uni.getDozenten().remove(a);
           DefaultTableModel dtm = (DefaultTableModel) Dozent_Table.getModel();
           dtm.removeRow(a);
           for(int i=0; i<doz.getDozentmitlva().size(); i++) {
            if (doz.getDozentmitlva().get(i).contains(z)){
                doz.getDozentmitlva().remove(i);
                i=i-1;
            }
        }
            for(int i=0; i<lva.getLvamitdozent().size(); i++) {
            if (lva.getLvamitdozent().get(i).contains(z)){
                lva.getLvamitdozent().remove(i);
                i=i-1;
            }
        }
        DefaultTableModel dtm2 = (DefaultTableModel) DozentLva_Table.getModel(); 
        for(int i=0; i<DozentLva_Table.getRowCount(); i++) {
                  if (DozentLva_Table.getValueAt(i, 2).equals(z)==true) {
                     dtm2.removeRow(i);
                     i=i-1;
                  }}
       }  
    }//GEN-LAST:event_DozLoschen_ButtonActionPerformed

    private void DozAktual_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozAktual_ButtonActionPerformed
        int a = Dozent_Table.getSelectedRow();
        if(a >= 0){
            Dozent doze = uni.getDozenten().get(a);
            String z;
            z = uni.getDozenten().get(a).getTcnumarasi();
            String Tcnumarasi = DozTcnummer_Textfield.getText();
            if(Universitaet.checkTcnumarasi2(Tcnumarasi)==true){
                DozMesaj.setText("In dieser TC-Nummer befindet sich ein weiterer Dozent.");}
            else if(Dozent.checkTcnumarasi(Tcnumarasi)==true){
            doze.setTcnumarasi(DozTcnummer_Textfield.getText()); 
            doze.setVorname(DozVorname_Textfield.getText()); 
            doze.setNachname(DozNachname_Textfield.getText()); 
            doze.setFakultat(DozFakultat_Textfield.getText()); 
            Dozent_Table.getModel().setValueAt(doze.getVorname(), a, 0);
            Dozent_Table.getModel().setValueAt(doze.getNachname(), a, 1);
            Dozent_Table.getModel().setValueAt(doze.getTcnumarasi(), a, 2);
            Dozent_Table.getModel().setValueAt(doze.getFakultat(), a, 3);
            for(int i=0; i<doz.getDozentmitlva().size(); i++) {
            if (doz.getDozentmitlva().get(i).contains(z)){
                doz.getDozentmitlva().remove(i);
                i=i-1;
            }}
                for(int i=0; i<lva.getLvamitdozent().size(); i++) {
            if (lva.getLvamitdozent().get(i).contains(z)){
                doz.getDozentmitlva().add(uni.getDozenten().get(a).toString());
            }}
              for(int i=0; i<DozentLva_Table.getRowCount(); i++) {
                  if (DozentLva_Table.getValueAt(i, 2).equals(z)==true) {
              DozentLva_Table.getModel().setValueAt(doze.getVorname(), i, 0);    
              DozentLva_Table.getModel().setValueAt(doze.getNachname(), i, 1);    
              DozentLva_Table.getModel().setValueAt(doze.getTcnumarasi(), i, 2);
              DozentLva_Table.getModel().setValueAt(doze.getFakultat(), i, 3);
            }}
              
        }
            else {
                       DozMesaj.setText("Die TC-Nummer muss aus Zahlen bestehen und 11-stellig sein."); 
                    }
        
        
        }
    }//GEN-LAST:event_DozAktual_ButtonActionPerformed

    private void LvaHinzu_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LvaHinzu_ButtonActionPerformed
        
        String kurzname = LvaKurzname_Textfield.getText();
        String name = LvaName_Textfield.getText();
        if(Universitaet.checkKurznameLVA(kurzname)==true){
                LvaMesaj.setText("Es gibt eine weitere LVA in dieser Kurzname.");}
        else if(LVA.checkkurzname_LVA(kurzname)==true){
        uni.getLvas().add(new LVA(kurzname, name));
        LvaMesaj.setText("LVA ist erfolgreich hinzugefugt." + uni.getLvas().size());
         
        ss3[0] = LvaKurzname_Textfield.getText();
        ss3[1] = LvaName_Textfield.getText();
        DefaultTableModel dtm = (DefaultTableModel) Lva_Table.getModel();
        dtm.addRow(ss3);
         }
        else{
                       LvaMesaj.setText("Die ersten drei Ziffern der Kurzname mussen in Grossbuchstaben und die letzten drei Ziffern in Zahlen sein."); 
                    }  
    }//GEN-LAST:event_LvaHinzu_ButtonActionPerformed

    private void LvaLoschen_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LvaLoschen_ButtonActionPerformed
        int a = Lva_Table.getSelectedRow();
       if(a >= 0){
           uni.getLvas().remove(a);
           DefaultTableModel dtm = (DefaultTableModel) Lva_Table.getModel();
           dtm.removeRow(a);
           
       }
    }//GEN-LAST:event_LvaLoschen_ButtonActionPerformed

    private void LvaAktualisieren_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LvaAktualisieren_ButtonActionPerformed
       int a = Lva_Table.getSelectedRow();
        if(a >= 0){
            LVA lva1 = uni.getLvas().get(a);
            String kisaisim = LvaKurzname_Textfield.getText();
            if(Universitaet.checkKurznameLVA(kisaisim)==true){
                LvaMesaj.setText("Es gibt eine weitere LVA in dieser Kurzname.");}
            else if(LVA.checkkurzname_LVA(kisaisim)==true){
            lva1.setKurzname_LVA(LvaKurzname_Textfield.getText()); 
            lva1.setName_LVA(LvaName_Textfield.getText()); 
            Lva_Table.getModel().setValueAt(lva1.getKurzname_LVA(), a, 0);
            Lva_Table.getModel().setValueAt(lva1.getName_LVA(), a, 1);
        }
            else {
                       LvaMesaj.setText("Die ersten drei Ziffern der Kurzname mussen in Grossbuchstaben und die letzten drei Ziffern in Zahlen sein."); 
                    }
        
        
        } 
    }//GEN-LAST:event_LvaAktualisieren_ButtonActionPerformed

    private void StuAuflisten_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuAuflisten_ButtonActionPerformed
          DefaultTableModel dtm = (DefaultTableModel) Student_Table2.getModel();
          int q = Student_Table2.getRowCount();
          for(int i=0; i< q; i ++) {
          dtm.removeRow(0);}
          for(int i=0; i< uni.getStudenten().size(); i ++) {
        Student st = uni.getStudenten().get(i);
        dtm.addRow(ss);
                Student_Table2.getModel().setValueAt(st.getVorname(), i, 0);
                Student_Table2.getModel().setValueAt(st.getNachname(), i, 1);
                Student_Table2.getModel().setValueAt(st.getMatrikelnummer(), i, 2);
                Student_Table2.getModel().setValueAt(st.getFakultat(), i, 3);
                Student_Table2.getModel().setValueAt(st.getFach_Student(), i, 4);
                Student_Table2.getModel().setValueAt(st.getSemester_Student(), i, 5);
                Student_Table2.getModel().setValueAt(st.getJahre(), i, 6);
                Student_Table2.getModel().setValueAt(st.getEmail(), i, 7);
                Student_Table2.getModel().setValueAt(st.getGeschlecht(), i, 8);
                Student_Table2.getModel().setValueAt(st.getNotendurchschnitt(), i, 9);
         }
        
    }//GEN-LAST:event_StuAuflisten_ButtonActionPerformed

    private void StuAktualisieren_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuAktualisieren_ButtonActionPerformed
        int a = Student_Table.getSelectedRow();
        if(a >= 0){
            Student st = uni.getStudenten().get(a);
            String z;
            z = uni.getStudenten().get(a).getMatrikelnummer();
            String Matrikelnummer = StuMatrikelnummer_Textfield.getText();
            if(Universitaet.checkMatrikelnummer2(Matrikelnummer)==true){
                StuMesaj.setText("Es gibt einen anderen Studenten in dieser Matrikelnummer.");}
            else if(Student.checkMatrikelnummer(Matrikelnummer)==true){
                st.setMatrikelnummer(StuMatrikelnummer_Textfield.getText()); 
                st.setVorname(StuVorname_Textfield.getText()); 
                st.setNachname(StuNachname_Textfield.getText()); 
                st.setFakultat(StuFakultat_Textfield.getText()); 
                st.setFach_Student(StuFach_Textfield.getText());
                st.setSemester_Student(StuSemester_Textfield.getText());
                st.setJahre(StuJahre_Textfield.getText()); 
                st.setEmail(StuEmail_Textfield.getText()); 
                st.setGeschlecht(StuGeschlecht_Textfield.getText()); 
                st.setNotendurchschnitt(StuNoten_Textfield.getText());
                Student_Table.getModel().setValueAt(st.getVorname(), a, 0);
                Student_Table.getModel().setValueAt(st.getNachname(), a, 1);
                Student_Table.getModel().setValueAt(st.getMatrikelnummer(), a, 2);
                Student_Table.getModel().setValueAt(st.getFakultat(), a, 3);
                Student_Table.getModel().setValueAt(st.getFach_Student(), a, 4);
                Student_Table.getModel().setValueAt(st.getSemester_Student(), a, 5);
                Student_Table.getModel().setValueAt(st.getJahre(), a, 6);
                Student_Table.getModel().setValueAt(st.getEmail(), a, 7);
                Student_Table.getModel().setValueAt(st.getGeschlecht(), a, 8);
                Student_Table.getModel().setValueAt(st.getNotendurchschnitt(), a, 9);
                for(int i=0; i<stu.getStudentmitlva().size(); i++) {
            if (stu.getStudentmitlva().get(i).contains(z)){
                stu.getStudentmitlva().remove(i);
                i=i-1;
            }}
                for(int i=0; i<lva.getLvamitstudent().size(); i++) {
            if (lva.getLvamitstudent().get(i).contains(z)){
                stu.getStudentmitlva().add(uni.getStudenten().get(a).toString());
            }}
              for(int i=0; i<StudentLva_Table.getRowCount(); i++) {
                  if (StudentLva_Table.getValueAt(i, 2).equals(z)==true) {
              StudentLva_Table.getModel().setValueAt(st.getVorname(), i, 0);    
              StudentLva_Table.getModel().setValueAt(st.getNachname(), i, 1);    
              StudentLva_Table.getModel().setValueAt(st.getMatrikelnummer(), i, 2);
              StudentLva_Table.getModel().setValueAt(st.getFakultat(), i, 3);
              StudentLva_Table.getModel().setValueAt(st.getFach_Student(), i, 4);
              StudentLva_Table.getModel().setValueAt(st.getSemester_Student(), i, 5);
            }}
            }
            
            else {
                StuMesaj.setText("Die Matrikelnummer muss aus Zahlen bestehen und 7-stellig sein.");
            }

        }

    }//GEN-LAST:event_StuAktualisieren_ButtonActionPerformed

    private void StuLoschen_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuLoschen_ButtonActionPerformed
        int a = Student_Table.getSelectedRow();
        if(a >= 0){
            String z;
            z = uni.getStudenten().get(a).getMatrikelnummer();
            uni.getStudenten().remove(a);
            DefaultTableModel dtm = (DefaultTableModel) Student_Table.getModel();
            dtm.removeRow(a);
            for(int i=0; i<stu.getStudentmitlva().size(); i++) {
            if (stu.getStudentmitlva().get(i).contains(z)){
                stu.getStudentmitlva().remove(i);
                i=i-1;
            }
        }
            for(int i=0; i<lva.getLvamitstudent().size(); i++) {
            if (lva.getLvamitstudent().get(i).contains(z)){
                lva.getLvamitstudent().remove(i);
                i=i-1;
            }
        }
        DefaultTableModel dtm2 = (DefaultTableModel) StudentLva_Table.getModel(); 
        for(int i=0; i<StudentLva_Table.getRowCount(); i++) {
                  if (StudentLva_Table.getValueAt(i, 2).equals(z)==true) {
                     dtm2.removeRow(i);
                     i=i-1;
                  }}
        }
    }//GEN-LAST:event_StuLoschen_ButtonActionPerformed

    private void StuHinzu_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuHinzu_ButtonActionPerformed

        
        String Matrikelnummer = StuMatrikelnummer_Textfield.getText();
        String vorname_Student = StuVorname_Textfield.getText();
        String nachname_Student = StuNachname_Textfield.getText();
        String fakultat_Student = StuFakultat_Textfield.getText();
        String fach_Student = StuFach_Textfield.getText();
        String semester_Student = StuSemester_Textfield.getText();
        String jahre_Student = StuJahre_Textfield.getText();
        String email_Student = StuEmail_Textfield.getText();
        String geschlecht_Student = StuGeschlecht_Textfield.getText();
        String noten_Student = StuNoten_Textfield.getText();
        if(Universitaet.checkMatrikelnummer2(Matrikelnummer)==true){
            StuMesaj.setText("Es gibt einen anderen Studenten in dieser Matrikelnummer.");}
        else if(Student.checkMatrikelnummer(Matrikelnummer)==true){
            uni.getStudenten().add(new Student(vorname_Student, nachname_Student, Matrikelnummer, fakultat_Student, fach_Student, semester_Student, jahre_Student, email_Student, geschlecht_Student, noten_Student));
            StuMesaj.setText("Student ist erfolgreich hinzugefugt." + uni.getStudenten().size());

            ss[0] = StuVorname_Textfield.getText();
            ss[1] = StuNachname_Textfield.getText();
            ss[2] = StuMatrikelnummer_Textfield.getText();
            ss[3] = StuFakultat_Textfield.getText();
            ss[4] = StuFach_Textfield.getText();
            ss[5] = StuSemester_Textfield.getText();
            ss[6] = StuJahre_Textfield.getText();
            ss[7] = StuEmail_Textfield.getText();
            ss[8] = StuGeschlecht_Textfield.getText();
            ss[9] = StuNoten_Textfield.getText();
            DefaultTableModel dtm = (DefaultTableModel) Student_Table.getModel();
            dtm.addRow(ss);
        }
        else{
            StuMesaj.setText("Die Matrikelnummer muss aus Zahlen bestehen und 7-stellig sein.");
        }
    }//GEN-LAST:event_StuHinzu_ButtonActionPerformed

    private void StuSemester_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuSemester_TextfieldActionPerformed

    }//GEN-LAST:event_StuSemester_TextfieldActionPerformed

    private void StuFach_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuFach_TextfieldActionPerformed

    }//GEN-LAST:event_StuFach_TextfieldActionPerformed

    private void StuFakultat_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuFakultat_TextfieldActionPerformed

    }//GEN-LAST:event_StuFakultat_TextfieldActionPerformed

    private void StuMatrikelnummer_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuMatrikelnummer_TextfieldActionPerformed

    }//GEN-LAST:event_StuMatrikelnummer_TextfieldActionPerformed

    private void StuNachname_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuNachname_TextfieldActionPerformed

    }//GEN-LAST:event_StuNachname_TextfieldActionPerformed

    private void StuVorname_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuVorname_TextfieldActionPerformed

    }//GEN-LAST:event_StuVorname_TextfieldActionPerformed

    private void StuSuchen_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuSuchen_ButtonActionPerformed
        String Matrikelnummer = StuMatrikelnummer_Textfield.getText();
        if(Universitaet.checkMatrikelnummer2(Matrikelnummer)==false){
            StuMesaj.setText("Unter dieser Matrikelnummer wurde kein Schuler gefunden.");}
        else{
          
                    for(int i=0; i< uni.getStudenten().size(); i++) {
                        if (Matrikelnummer.equals(uni.getStudenten().get(i).getMatrikelnummer())) {
                            Student st = uni.getStudenten().get(i);
                            Student_Table3.getModel().setValueAt(st.getVorname(), 0, 0);
                            Student_Table3.getModel().setValueAt(st.getNachname(), 0, 1);
                            Student_Table3.getModel().setValueAt(st.getMatrikelnummer(), 0, 2);
                            Student_Table3.getModel().setValueAt(st.getFakultat(), 0, 3);
                            Student_Table3.getModel().setValueAt(st.getFach_Student(), 0, 4);
                            Student_Table3.getModel().setValueAt(st.getSemester_Student(), 0, 5);
                            Student_Table3.getModel().setValueAt(st.getJahre(), 0, 6);
                            Student_Table3.getModel().setValueAt(st.getEmail(), 0, 7);
                            Student_Table3.getModel().setValueAt(st.getGeschlecht(), 0, 8);
                            Student_Table3.getModel().setValueAt(st.getNotendurchschnitt(), 0, 9);
        }}}
    }//GEN-LAST:event_StuSuchen_ButtonActionPerformed

    private void DozAuflisten_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozAuflisten_ButtonActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) Dozent_Table2.getModel();
          int q = Dozent_Table2.getRowCount();
          for(int i=0; i< q; i ++) {
          dtm.removeRow(0);}
          for(int i=0; i< uni.getDozenten().size(); i ++) {
        Dozent doz1 = uni.getDozenten().get(i);
        dtm.addRow(ss2);
                Dozent_Table2.getModel().setValueAt(doz1.getVorname(), i, 0);
                Dozent_Table2.getModel().setValueAt(doz1.getNachname(), i, 1);
                Dozent_Table2.getModel().setValueAt(doz1.getTcnumarasi(), i, 2);
                Dozent_Table2.getModel().setValueAt(doz1.getFakultat(), i, 3);
         }
    }//GEN-LAST:event_DozAuflisten_ButtonActionPerformed

    private void DozSuchen_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozSuchen_ButtonActionPerformed
        String Tcnumarasi = DozTcnummer_Textfield.getText();
        if(Universitaet.checkTcnumarasi2(Tcnumarasi)==false){
            DozMesaj.setText("In dieser TC-Nummer wurde kein Dozent gefunden.");}
        else{
          
                    for(int i=0; i< uni.getDozenten().size(); i++) {
                        if (Tcnumarasi.equals(uni.getDozenten().get(i).getTcnumarasi())) {
                            Dozent doz1 = uni.getDozenten().get(i);
                            Dozent_Table3.getModel().setValueAt(doz1.getVorname(), 0, 0);
                            Dozent_Table3.getModel().setValueAt(doz1.getNachname(), 0, 1);
                            Dozent_Table3.getModel().setValueAt(doz1.getTcnumarasi(), 0, 2);
                            Dozent_Table3.getModel().setValueAt(doz1.getFakultat(), 0, 3);
        }}}
    }//GEN-LAST:event_DozSuchen_ButtonActionPerformed

    private void LvaAuflisten_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LvaAuflisten_ButtonActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) Lva_Table2.getModel();
          int q = Lva_Table2.getRowCount();
          for(int i=0; i< q; i ++) {
          dtm.removeRow(0);}
          for(int i=0; i< uni.getLvas().size(); i ++) {
        LVA lva1 = uni.getLvas().get(i);
        dtm.addRow(ss3);
                Lva_Table2.getModel().setValueAt(lva1.getKurzname_LVA(), i, 0);
                Lva_Table2.getModel().setValueAt(lva1.getName_LVA(), i, 1);
         }
    }//GEN-LAST:event_LvaAuflisten_ButtonActionPerformed

    private void LvaSuchen_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LvaSuchen_ButtonActionPerformed
       String kisaisim = LvaKurzname_Textfield.getText();
        if(Universitaet.checkKurznameLVA(kisaisim)==false){
            LvaMesaj.setText("In dieser Kurzname wurden keine LVA gefunden.");}
        else{
          
                    for(int i=0; i< uni.getLvas().size(); i++) {
                        if (kisaisim.equals(uni.getLvas().get(i).getKurzname_LVA())) {
                            LVA lva1 = uni.getLvas().get(i);
                            Lva_Table3.getModel().setValueAt(lva1.getKurzname_LVA(), 0, 0);
                            Lva_Table3.getModel().setValueAt(lva1.getName_LVA(), 0, 1);
        }}}
    }//GEN-LAST:event_LvaSuchen_ButtonActionPerformed

    private void StuAnmelden_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuAnmelden_ButtonActionPerformed

                    String numara = StuLvaMatrikelnummer_Textfield.getText();
                    int g=0; 
                    int t=0;
                    for(int i=0; i< uni.getStudenten().size(); i++) {
                        if (numara.equals(uni.getStudenten().get(i).getMatrikelnummer())) {
                    g=1;
                    t=i;} }
                    if (g==0) {StuLvaMesaj.setText("Unter dieser Matrikelnummer wurde kein Schuler gefunden.");}
                    else {
                    String kisaltma = StuLvaKurzname_Textfield.getText();
                    int a=0;
                    int y=0;
                    for (int i = 0; i < uni.getLvas().size(); i++) {
                        if (kisaltma.equals(uni.getLvas().get(i).getKurzname_LVA())) {
                    a=1;
                    y=i;
                }
            }
                    if  (a == 0) {
                    StuLvaMesaj.setText("In dieser Kurzname wurden keine LVA gefunden.");
                    
                    } else {
                        int o=0;
                            for (int i=0; i<stu.getStudentmitlva().size(); i++) {
                      if (stu.getStudentmitlva().get(i).contains(numara) && stu.getStudentmitlva().get(i).contains(kisaltma)) {
                          o=1;}}
                          if(o==1){
                          StuLvaMesaj.setText("Dieser Schuler hat diese LVA bereits genommen.");
                          
                      }
                          else{
                stu.getStudentmitlva().add(uni.getStudenten().get(t).toString() + " " + uni.getLvas().get(y).toString());
                lva.getLvamitstudent().add(uni.getLvas().get(y).toString() + " " + uni.getStudenten().get(t).toString());
                DefaultTableModel dtm = (DefaultTableModel) StudentLva_Table.getModel();
                Student st = uni.getStudenten().get(t);
                LVA lva1 = uni.getLvas().get(y);
                ss4[0] = st.getVorname();
                ss4[1] = st.getNachname();
                ss4[2] = st.getMatrikelnummer();
                ss4[3] = st.getFakultat();
                ss4[4] = st.getFach_Student();
                ss4[5] = st.getSemester_Student();
                ss4[6] = lva1.getKurzname_LVA();
                ss4[7] = lva1.getName_LVA();
                dtm.addRow(ss4);
                        
                    
                   
            }}}
    }//GEN-LAST:event_StuAnmelden_ButtonActionPerformed

    private void StuAbmelden_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuAbmelden_ButtonActionPerformed
        int a = StudentLva_Table.getSelectedRow();
        if(a >= 0){
           stu.getStudentmitlva().remove(a);
           lva.getLvamitstudent().remove(a);
           DefaultTableModel dtm = (DefaultTableModel) StudentLva_Table.getModel();
           dtm.removeRow(a);
           
       }
    }//GEN-LAST:event_StuAbmelden_ButtonActionPerformed

    private void StuAnzeigen_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuAnzeigen_ButtonActionPerformed
                    String numara = StuLvaMatrikelnummer_Textfield.getText();
                    DefaultTableModel dtm = (DefaultTableModel) StudentLva_Table2.getModel();
                    DefaultTableModel dtm2 = (DefaultTableModel) StudentLva_Table.getModel();
                    int k = StudentLva_Table2.getRowCount();
                    for(int i=0; i< k; i ++) {
                    dtm.removeRow(0);}
                    int g=0; 
                    int t=0;
                    for(int i=0; i< uni.getStudenten().size(); i++) {
                        if (numara.equals(uni.getStudenten().get(i).getMatrikelnummer())) {
                    g=1;
                    t=i;} }
                    if (g==0) {StuLvaMesaj.setText("Unter dieser Matrikelnummer wurde kein Schuler gefunden.");}
                    else {          
              for(int i=0; i<stu.getStudentmitlva().size(); i++) {
                  if (stu.getStudentmitlva().get(i).contains(numara)) {
                      Student st = uni.getStudenten().get(t);
                      ss4[0] = st.getVorname();
                      ss4[1] = st.getNachname();
                      ss4[2] = st.getMatrikelnummer();
                      ss4[3] = st.getFakultat();
                      ss4[4] = st.getFach_Student();
                      ss4[5] = st.getSemester_Student();
                      ss4[6] = "";
                      ss4[7] = "";
                      dtm.addRow(ss4);
                  }
              
          }int q=0;
              for(int i=0; i<StudentLva_Table.getRowCount(); i++) {
                  if (StudentLva_Table.getValueAt(i, 2).equals(numara)==true) {
                  
                  
              StudentLva_Table2.getModel().setValueAt(StudentLva_Table.getValueAt(i, 6), q, 6);
              StudentLva_Table2.getModel().setValueAt(StudentLva_Table.getValueAt(i, 7), q, 7);
              if (q<StudentLva_Table2.getRowCount()) {
                      q=q+1;
                    }}}}
    }//GEN-LAST:event_StuAnzeigen_ButtonActionPerformed

    private void DozAnmelden_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozAnmelden_ButtonActionPerformed
                    String tcnumara = DozLvaTcnummer_Textfield.getText();
                    int g=0; 
                    int t=0;
                    for(int i=0; i< uni.getDozenten().size(); i++) {
                        if (tcnumara.equals(uni.getDozenten().get(i).getTcnumarasi())) {
                    g=1;
                    t=i;} }
                    if (g==0) {DozLvaMesaj.setText("In dieser TC-Nummer wurde kein Dozent gefunden.");}
                    else {
                    String kisaltma = DozLvaKurzname_Textfield.getText();
                    int a=0;
                    int y=0;
                    for (int i = 0; i < uni.getLvas().size(); i++) {
                        if (kisaltma.equals(uni.getLvas().get(i).getKurzname_LVA())) {
                    a=1;
                    y=i;
                }
            }
                    if  (a == 0) {
                    DozLvaMesaj.setText("In dieser Kurzname wurden keine LVA gefunden.");
                    
                    } else {
                        int o=0;
                            for (int i=0; i<doz.getDozentmitlva().size(); i++) {
                      if (doz.getDozentmitlva().get(i).contains(tcnumara) && doz.getDozentmitlva().get(i).contains(kisaltma)) {
                          o=1;}}
                          if(o==1){
                          DozLvaMesaj.setText("Dieser Dozent hat diesen LVA bereits genommen.");
                          
                      }
                          else{
                doz.getDozentmitlva().add(uni.getDozenten().get(t).toString() + " " + uni.getLvas().get(y).toString());
                lva.getLvamitdozent().add(uni.getLvas().get(y).toString() + " " + uni.getDozenten().get(t).toString());
                DefaultTableModel dtm = (DefaultTableModel) DozentLva_Table.getModel();
                Dozent doze = uni.getDozenten().get(t);
                LVA lva1 = uni.getLvas().get(y);
                ss5[0] = doze.getVorname();
                ss5[1] = doze.getNachname();
                ss5[2] = doze.getTcnumarasi();
                ss5[3] = doze.getFakultat();
                ss5[4] = lva1.getKurzname_LVA();
                ss5[5] = lva1.getName_LVA();
                dtm.addRow(ss5);
                        
                    
                   
            }}}
    }//GEN-LAST:event_DozAnmelden_ButtonActionPerformed

    private void DozAbmelden_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozAbmelden_ButtonActionPerformed
        int a = DozentLva_Table.getSelectedRow();
        if(a >= 0){
           doz.getDozentmitlva().remove(a);
           lva.getLvamitdozent().remove(a);
           DefaultTableModel dtm = (DefaultTableModel) DozentLva_Table.getModel();
           dtm.removeRow(a);
           
       }
    }//GEN-LAST:event_DozAbmelden_ButtonActionPerformed

    private void DozAnzeigen_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozAnzeigen_ButtonActionPerformed
                    String tcnumara = DozLvaTcnummer_Textfield.getText();
                    DefaultTableModel dtm = (DefaultTableModel) DozentLva_Table2.getModel();
                    DefaultTableModel dtm2 = (DefaultTableModel) DozentLva_Table.getModel();
                    int k = DozentLva_Table2.getRowCount();
                    for(int i=0; i< k; i ++) {
                    dtm.removeRow(0);}
                    int g=0; 
                    int t=0;
                    for(int i=0; i< uni.getDozenten().size(); i++) {
                        if (tcnumara.equals(uni.getDozenten().get(i).getTcnumarasi())) {
                    g=1;
                    t=i;} }
                    if (g==0) {DozLvaMesaj.setText("In dieser TC-Nummer wurde kein Dozent gefunden.");}
                    else {          
              for(int i=0; i<doz.getDozentmitlva().size(); i++) {
                  if (doz.getDozentmitlva().get(i).contains(tcnumara)) {
                      Dozent doze = uni.getDozenten().get(t);
                      ss5[0] = doze.getVorname();
                      ss5[1] = doze.getNachname();
                      ss5[2] = doze.getTcnumarasi();
                      ss5[3] = doze.getFakultat();
                      ss5[4] = "";
                      ss5[5] = "";
                      dtm.addRow(ss5);
                  }
              
          }int q=0;
              for(int i=0; i<DozentLva_Table.getRowCount(); i++) {
                  if (DozentLva_Table.getValueAt(i, 2).equals(tcnumara)==true) {
                  
                  
              DozentLva_Table2.getModel().setValueAt(DozentLva_Table.getValueAt(i, 4), q, 4);
              DozentLva_Table2.getModel().setValueAt(DozentLva_Table.getValueAt(i, 5), q, 5);
              if (q<DozentLva_Table2.getRowCount()) {
                      q=q+1;
                    }}}}
    }//GEN-LAST:event_DozAnzeigen_ButtonActionPerformed

    private void LvaAnzeigen_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LvaAnzeigen_ButtonActionPerformed
                    String kisaltma = StuLvaKurzname_Textfield.getText();
                    DefaultTableModel dtm = (DefaultTableModel) StudentLva_Table3.getModel();
                    DefaultTableModel dtm2 = (DefaultTableModel) StudentLva_Table.getModel();
                    int k = StudentLva_Table3.getRowCount();
                    for(int i=0; i< k; i ++) {
                    dtm.removeRow(0);}
                    int g=0; 
                    int t=0;
                    for(int i=0; i< uni.getLvas().size(); i++) {
                        if (kisaltma.equals(uni.getLvas().get(i).getKurzname_LVA())) {
                    g=1;
                    t=i;} }
                    if (g==0) {StuLvaMesaj.setText("In dieser Kurzname wurden keine LVA gefunden.");}
                    else {          
              for(int i=0; i<lva.getLvamitstudent().size(); i++) {
                  if (lva.getLvamitstudent().get(i).contains(kisaltma)) {
                      LVA lv = uni.getLvas().get(t);
                      ss4[0] = lv.getKurzname_LVA();
                      ss4[1] = lv.getName_LVA();
                      ss4[2] = "";
                      ss4[3] = "";
                      ss4[4] = "";
                      ss4[5] = "";
                      ss4[6] = "";
                      ss4[7] = "";
                      dtm.addRow(ss4);
                  }
              
          }int q=0;
              for(int i=0; i<StudentLva_Table.getRowCount(); i++) {
                  if (StudentLva_Table.getValueAt(i, 6).equals(kisaltma)==true) {
                  
                  
              StudentLva_Table3.getModel().setValueAt(StudentLva_Table.getValueAt(i, 0), q, 2);
              StudentLva_Table3.getModel().setValueAt(StudentLva_Table.getValueAt(i, 1), q, 3);
              StudentLva_Table3.getModel().setValueAt(StudentLva_Table.getValueAt(i, 2), q, 4);
              StudentLva_Table3.getModel().setValueAt(StudentLva_Table.getValueAt(i, 3), q, 5);
              StudentLva_Table3.getModel().setValueAt(StudentLva_Table.getValueAt(i, 4), q, 6);
              StudentLva_Table3.getModel().setValueAt(StudentLva_Table.getValueAt(i, 5), q, 7);
              if (q<StudentLva_Table3.getRowCount()) {
                      q=q+1;
                    }}}}
    }//GEN-LAST:event_LvaAnzeigen_ButtonActionPerformed

    private void LvaAnzeigen_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LvaAnzeigen_Button2ActionPerformed
                    String kisaltma = DozLvaKurzname_Textfield.getText();
                    DefaultTableModel dtm = (DefaultTableModel) DozentLva_Table3.getModel();
                    DefaultTableModel dtm2 = (DefaultTableModel) DozentLva_Table.getModel();
                    int k = DozentLva_Table3.getRowCount();
                    for(int i=0; i< k; i ++) {
                    dtm.removeRow(0);}
                    int g=0; 
                    int t=0;
                    for(int i=0; i< uni.getLvas().size(); i++) {
                        if (kisaltma.equals(uni.getLvas().get(i).getKurzname_LVA())) {
                    g=1;
                    t=i;} }
                    if (g==0) {StuLvaMesaj.setText("In dieser Kurzname wurden keine LVA gefunden.");}
                    else {          
              for(int i=0; i<lva.getLvamitdozent().size(); i++) {
                  if (lva.getLvamitdozent().get(i).contains(kisaltma)) {
                      LVA lv = uni.getLvas().get(t);
                      ss5[0] = lv.getKurzname_LVA();
                      ss5[1] = lv.getName_LVA();
                      ss5[2] = "";
                      ss5[3] = "";
                      ss5[4] = "";
                      ss5[5] = "";
                      dtm.addRow(ss5);
                  }
              
          }int q=0;
              for(int i=0; i<DozentLva_Table.getRowCount(); i++) {
                  if (DozentLva_Table.getValueAt(i, 4).equals(kisaltma)==true) {
                  
                  
              DozentLva_Table3.getModel().setValueAt(DozentLva_Table.getValueAt(i, 0), q, 2);
              DozentLva_Table3.getModel().setValueAt(DozentLva_Table.getValueAt(i, 1), q, 3);
              DozentLva_Table3.getModel().setValueAt(DozentLva_Table.getValueAt(i, 2), q, 4);
              DozentLva_Table3.getModel().setValueAt(DozentLva_Table.getValueAt(i, 3), q, 5);
              if (q<DozentLva_Table3.getRowCount()) {
                      q=q+1;
                    }}}}
    }//GEN-LAST:event_LvaAnzeigen_Button2ActionPerformed
    String[] ss = new String[10];
    String[] ss2 = new String[4];
    String[] ss3 = new String[2];
    String[] ss4 = new String[8];
    String[] ss5 = new String[6];
    Universitaet uni = new Universitaet("TAU");
    Student stu = new Student("","","","","","","","","","");
    LVA lva = new LVA("","");
    Dozent doz = new Dozent("","","","");
    public static void main(String args[]) {
        AnaEkran e =new AnaEkran();
        e.setVisible(true);
        //Emir Atakan Ozaltun 170504038
        
        
     

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DozAbmelden_Button;
    private javax.swing.JButton DozAktual_Button;
    private javax.swing.JButton DozAnmelden_Button;
    private javax.swing.JButton DozAnzeigen_Button;
    private javax.swing.JButton DozAuflisten_Button;
    private javax.swing.JTextField DozFakultat_Textfield;
    private javax.swing.JButton DozHinzu_Button;
    private javax.swing.JButton DozLoschen_Button;
    private javax.swing.JTextField DozLvaKurzname_Textfield;
    private javax.swing.JLabel DozLvaMesaj;
    private javax.swing.JTextField DozLvaTcnummer_Textfield;
    private javax.swing.JLabel DozMesaj;
    private javax.swing.JTextField DozNachname_Textfield;
    private javax.swing.JButton DozSuchen_Button;
    private javax.swing.JTextField DozTcnummer_Textfield;
    private javax.swing.JTextField DozVorname_Textfield;
    private javax.swing.JTable DozentLva_Table;
    private javax.swing.JTable DozentLva_Table2;
    private javax.swing.JTable DozentLva_Table3;
    private javax.swing.JTable Dozent_Table;
    private javax.swing.JTable Dozent_Table2;
    private javax.swing.JTable Dozent_Table3;
    private javax.swing.JButton LvaAktualisieren_Button;
    private javax.swing.JButton LvaAnzeigen_Button;
    private javax.swing.JButton LvaAnzeigen_Button2;
    private javax.swing.JButton LvaAuflisten_Button;
    private javax.swing.JButton LvaHinzu_Button;
    private javax.swing.JTextField LvaKurzname_Textfield;
    private javax.swing.JButton LvaLoschen_Button;
    private javax.swing.JLabel LvaMesaj;
    private javax.swing.JTextField LvaName_Textfield;
    private javax.swing.JButton LvaSuchen_Button;
    private javax.swing.JTable Lva_Table;
    private javax.swing.JTable Lva_Table2;
    private javax.swing.JTable Lva_Table3;
    private javax.swing.JButton StuAbmelden_Button;
    private javax.swing.JButton StuAktualisieren_Button;
    private javax.swing.JButton StuAnmelden_Button;
    private javax.swing.JButton StuAnzeigen_Button;
    private javax.swing.JButton StuAuflisten_Button;
    private javax.swing.JTextField StuEmail_Textfield;
    private javax.swing.JTextField StuFach_Textfield;
    private javax.swing.JTextField StuFakultat_Textfield;
    private javax.swing.JTextField StuGeschlecht_Textfield;
    private javax.swing.JButton StuHinzu_Button;
    private javax.swing.JTextField StuJahre_Textfield;
    private javax.swing.JButton StuLoschen_Button;
    private javax.swing.JTextField StuLvaKurzname_Textfield;
    private javax.swing.JTextField StuLvaMatrikelnummer_Textfield;
    private javax.swing.JLabel StuLvaMesaj;
    private javax.swing.JTextField StuMatrikelnummer_Textfield;
    private javax.swing.JLabel StuMesaj;
    private javax.swing.JTextField StuNachname_Textfield;
    private javax.swing.JTextField StuNoten_Textfield;
    private javax.swing.JTextField StuSemester_Textfield;
    private javax.swing.JButton StuSuchen_Button;
    private javax.swing.JTextField StuVorname_Textfield;
    private javax.swing.JTable StudentLva_Table;
    private javax.swing.JTable StudentLva_Table2;
    private javax.swing.JTable StudentLva_Table3;
    private javax.swing.JTable Student_Table;
    private javax.swing.JTable Student_Table2;
    private javax.swing.JTable Student_Table3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
