package TimeTable;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;
import java.sql.*;

public class ViewTimeTable extends javax.swing.JFrame {
    public int GrpId;
    public DatabaseConnection db = new DatabaseConnection();
    public ArrayList<JLabel> mon ;
    public ArrayList<JLabel> tue ;
    public ArrayList<JLabel> wed ;
    public ArrayList<JLabel> thu ;
    public ArrayList<JLabel> fri ;
    public ArrayList<JLabel> sat ;
    SplashScreen splash = new SplashScreen();

    public ViewTimeTable() {
        initComponents();
        mon = new ArrayList<>(Arrays.asList(mon1,mon2,mon3,mon4,mon5,mon6,mon7));
        tue = new ArrayList<>(Arrays.asList(tue1,tue2,tue3,tue4,tue5,tue6,tue7));
        wed = new ArrayList<>(Arrays.asList(wed1,wed2,wed3,wed4,wed5,wed6,wed7));
        thu = new ArrayList<>(Arrays.asList(thu1,thu2,thu3,thu4,thu5,thu6,thu7));
        fri = new ArrayList<>(Arrays.asList(fri1,fri2,fri3,fri4,fri5,fri6,fri7));
        sat = new ArrayList<>(Arrays.asList(sat1,sat2,sat3,sat4,sat5,sat6,sat7));
    }
    
    public void initInput(){
        setToNull();
        splash.setVisible(true);
        ResultSet rs = db.executeQuery("SELECT * FROM TimeTable WHERE GrpId = "+GrpId);
        try {
            while(rs.next()){
                int i = 0;
                while(rs.getString("Day").equalsIgnoreCase("MONDAY")){
                    mon.get(i).setText("<html>"+Subject.getSubjectName(rs.getString("SubId"))+" :</br> "+ new Teacher().getTeacherName(rs.getInt("TeacherId"))+"</html>");
                    i++;
                    rs.next();
                }
                i=0;
                splash.progressBar.setValue(20);
                while(rs.getString("Day").equalsIgnoreCase("TUESDAY")){
                    tue.get(i).setText("<html>"+Subject.getSubjectName(rs.getString("SubId"))+" :</br> "+ new Teacher().getTeacherName(rs.getInt("TeacherId"))+"</html>");
                    i++;
                    rs.next();
                }
                i=0;
                splash.progressBar.setValue(40);
                while(rs.getString("Day").equalsIgnoreCase("WENESDAY")){
                    wed.get(i).setText("<html>"+Subject.getSubjectName(rs.getString("SubId"))+" :</br> "+ new Teacher().getTeacherName(rs.getInt("TeacherId"))+"</html>");
                    i++;
                    rs.next();
                }
                i=0;
                splash.progressBar.setValue(60);
                while(rs.getString("Day").equalsIgnoreCase("THURSDAY")){
                    thu.get(i).setText("<html>"+Subject.getSubjectName(rs.getString("SubId"))+" :</br> "+ new Teacher().getTeacherName(rs.getInt("TeacherId"))+"</html>");
                    i++;
                    rs.next();
                }
                i=0;
                splash.progressBar.setValue(80);
                while(rs.getString("Day").equalsIgnoreCase("FRIDAY")){
                    fri.get(i).setText("<html>"+Subject.getSubjectName(rs.getString("SubId"))+" :</br> "+ new Teacher().getTeacherName(rs.getInt("TeacherId"))+"</html>");
                    i++;
                    rs.next();
                }
                i=0;
                splash.progressBar.setValue(90);
                while(rs.getString("Day").equalsIgnoreCase("SATURDAY")){
                    sat.get(i).setText("<html>"+Subject.getSubjectName(rs.getString("SubId"))+" :</br> "+ new Teacher().getTeacherName(rs.getInt("TeacherId"))+"</html>");
                    i++;
                    rs.next();
                }
                
                
            }
            
        } catch (SQLException ex) {
        	
        }
        splash.setVisible(false);
        splash.dispose();
    }
    
    public void setToNull(){
        for (int i = 0; i < 7; i++) {
             mon.get(i).setText(" ");
             tue.get(i).setText(" ");
             wed.get(i).setText(" ");
             thu.get(i).setText(" ");
             fri.get(i).setText(" ");
             sat.get(i).setText(" ");
        }
       
    }

    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        table = new javax.swing.JPanel();
        tab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab1 = new javax.swing.JPanel();
        tab8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tab9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tab10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tab11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tab12 = new javax.swing.JPanel();
        mon1 = new javax.swing.JLabel();
        tab13 = new javax.swing.JPanel();
        mon2 = new javax.swing.JLabel();
        tab14 = new javax.swing.JPanel();
        mon3 = new javax.swing.JLabel();
        tab15 = new javax.swing.JPanel();
        mon4 = new javax.swing.JLabel();
        tab16 = new javax.swing.JPanel();
        mon5 = new javax.swing.JLabel();
        tab17 = new javax.swing.JPanel();
        mon6 = new javax.swing.JLabel();
        tab18 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        tab19 = new javax.swing.JPanel();
        tue1 = new javax.swing.JLabel();
        tab20 = new javax.swing.JPanel();
        tue2 = new javax.swing.JLabel();
        tab21 = new javax.swing.JPanel();
        tue3 = new javax.swing.JLabel();
        tab22 = new javax.swing.JPanel();
        tue4 = new javax.swing.JLabel();
        tab23 = new javax.swing.JPanel();
        tue5 = new javax.swing.JLabel();
        tab24 = new javax.swing.JPanel();
        tue6 = new javax.swing.JLabel();
        tab25 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        tab26 = new javax.swing.JPanel();
        wed1 = new javax.swing.JLabel();
        tab27 = new javax.swing.JPanel();
        wed2 = new javax.swing.JLabel();
        tab28 = new javax.swing.JPanel();
        wed3 = new javax.swing.JLabel();
        tab29 = new javax.swing.JPanel();
        wed4 = new javax.swing.JLabel();
        tab30 = new javax.swing.JPanel();
        wed5 = new javax.swing.JLabel();
        tab31 = new javax.swing.JPanel();
        wed6 = new javax.swing.JLabel();
        tab37 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        tab38 = new javax.swing.JPanel();
        thu1 = new javax.swing.JLabel();
        tab39 = new javax.swing.JPanel();
        thu2 = new javax.swing.JLabel();
        tab40 = new javax.swing.JPanel();
        thu3 = new javax.swing.JLabel();
        tab41 = new javax.swing.JPanel();
        thu4 = new javax.swing.JLabel();
        tab42 = new javax.swing.JPanel();
        thu5 = new javax.swing.JLabel();
        tab43 = new javax.swing.JPanel();
        thu6 = new javax.swing.JLabel();
        tab44 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        tab45 = new javax.swing.JPanel();
        fri1 = new javax.swing.JLabel();
        tab46 = new javax.swing.JPanel();
        fri6 = new javax.swing.JLabel();
        tab47 = new javax.swing.JPanel();
        fri2 = new javax.swing.JLabel();
        tab48 = new javax.swing.JPanel();
        fri3 = new javax.swing.JLabel();
        tab49 = new javax.swing.JPanel();
        fri4 = new javax.swing.JLabel();
        tab50 = new javax.swing.JPanel();
        fri5 = new javax.swing.JLabel();
        tab6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tab7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tab53 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        tab54 = new javax.swing.JPanel();
        sat1 = new javax.swing.JLabel();
        tab55 = new javax.swing.JPanel();
        sat2 = new javax.swing.JLabel();
        tab56 = new javax.swing.JPanel();
        sat3 = new javax.swing.JLabel();
        tab57 = new javax.swing.JPanel();
        sat4 = new javax.swing.JLabel();
        tab58 = new javax.swing.JPanel();
        sat5 = new javax.swing.JLabel();
        tab59 = new javax.swing.JPanel();
        sat6 = new javax.swing.JLabel();
        tab61 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        tab62 = new javax.swing.JPanel();
        mon7 = new javax.swing.JLabel();
        tab65 = new javax.swing.JPanel();
        tue7 = new javax.swing.JLabel();
        tab66 = new javax.swing.JPanel();
        wed7 = new javax.swing.JLabel();
        tab67 = new javax.swing.JPanel();
        thu7 = new javax.swing.JLabel();
        tab68 = new javax.swing.JPanel();
        fri7 = new javax.swing.JLabel();
        tab69 = new javax.swing.JPanel();
        sat7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("     Time Table Generator (Group 15)");

        backButton.setBackground(new java.awt.Color(204, 255, 255));
        backButton.setFont(new java.awt.Font("Dialog", 1, 48));
        backButton.setText("<-");
        backButton.setBorder(null);

        table.setBackground(new java.awt.Color(0, 51, 255));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setPreferredSize(new java.awt.Dimension(1100, 672));
        table.setVerifyInputWhenFocusTarget(false);

        tab.setBackground(new java.awt.Color(255, 255, 255));
        tab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab.setPreferredSize(new java.awt.Dimension(142, 41));

        jLabel2.setText("09:00 - 10.00 AM");

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabLayout.setVerticalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab1.setBackground(new java.awt.Color(51, 51, 51));
        tab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        tab8.setBackground(new java.awt.Color(255, 255, 255));
        tab8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("12:10 - 1.10 PM");

        javax.swing.GroupLayout tab8Layout = new javax.swing.GroupLayout(tab8);
        tab8.setLayout(tab8Layout);
        tab8Layout.setHorizontalGroup(
            tab8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab8Layout.setVerticalGroup(
            tab8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab9.setBackground(new java.awt.Color(255, 255, 255));
        tab9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("01:40 - 2.40 PM");

        javax.swing.GroupLayout tab9Layout = new javax.swing.GroupLayout(tab9);
        tab9.setLayout(tab9Layout);
        tab9Layout.setHorizontalGroup(
            tab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab9Layout.setVerticalGroup(
            tab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab10.setBackground(new java.awt.Color(255, 255, 255));
        tab10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("02:40 - 3.40 PM");

        javax.swing.GroupLayout tab10Layout = new javax.swing.GroupLayout(tab10);
        tab10.setLayout(tab10Layout);
        tab10Layout.setHorizontalGroup(
            tab10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab10Layout.setVerticalGroup(
            tab10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab11.setBackground(new java.awt.Color(255, 255, 255));
        tab11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab11.setPreferredSize(new java.awt.Dimension(132, 92));

        jLabel13.setText("MONDAY");

        javax.swing.GroupLayout tab11Layout = new javax.swing.GroupLayout(tab11);
        tab11.setLayout(tab11Layout);
        tab11Layout.setHorizontalGroup(
            tab11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab11Layout.setVerticalGroup(
            tab11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab12.setBackground(new java.awt.Color(255, 255, 255));
        tab12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab12.setPreferredSize(new java.awt.Dimension(142, 92));

        mon1.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        mon1.setText("DSGT");

        javax.swing.GroupLayout tab12Layout = new javax.swing.GroupLayout(tab12);
        tab12.setLayout(tab12Layout);
        tab12Layout.setHorizontalGroup(
            tab12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab12Layout.setVerticalGroup(
            tab12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab13.setBackground(new java.awt.Color(255, 255, 255));
        tab13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab13.setPreferredSize(new java.awt.Dimension(142, 92));

        mon2.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        mon2.setText("DS");

        javax.swing.GroupLayout tab13Layout = new javax.swing.GroupLayout(tab13);
        tab13.setLayout(tab13Layout);
        tab13Layout.setHorizontalGroup(
            tab13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab13Layout.setVerticalGroup(
            tab13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab14.setBackground(new java.awt.Color(255, 255, 255));
        tab14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab14.setPreferredSize(new java.awt.Dimension(142, 92));

        mon3.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        mon3.setText("AME-1");

        javax.swing.GroupLayout tab14Layout = new javax.swing.GroupLayout(tab14);
        tab14.setLayout(tab14Layout);
        tab14Layout.setHorizontalGroup(
            tab14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab14Layout.setVerticalGroup(
            tab14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab15.setBackground(new java.awt.Color(255, 255, 255));
        tab15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab15.setPreferredSize(new java.awt.Dimension(142, 92));

        mon4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); 
        mon4.setText("CG");

        javax.swing.GroupLayout tab15Layout = new javax.swing.GroupLayout(tab15);
        tab15.setLayout(tab15Layout);
        tab15Layout.setHorizontalGroup(
            tab15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab15Layout.setVerticalGroup(
            tab15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab16.setBackground(new java.awt.Color(255, 255, 255));
        tab16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab16.setPreferredSize(new java.awt.Dimension(142, 92));

        mon5.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        mon5.setText("CG LAB");

        javax.swing.GroupLayout tab16Layout = new javax.swing.GroupLayout(tab16);
        tab16.setLayout(tab16Layout);
        tab16Layout.setHorizontalGroup(
            tab16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab16Layout.setVerticalGroup(
            tab16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab17.setBackground(new java.awt.Color(255, 255, 255));
        tab17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab17.setPreferredSize(new java.awt.Dimension(142, 92));

        mon6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); 
        mon6.setText("CG LAB");

        javax.swing.GroupLayout tab17Layout = new javax.swing.GroupLayout(tab17);
        tab17.setLayout(tab17Layout);
        tab17Layout.setHorizontalGroup(
            tab17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon6, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab17Layout.setVerticalGroup(
            tab17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab18.setBackground(new java.awt.Color(255, 255, 255));
        tab18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab18.setPreferredSize(new java.awt.Dimension(132, 92));

        jLabel20.setText("TUESDAY");

        javax.swing.GroupLayout tab18Layout = new javax.swing.GroupLayout(tab18);
        tab18.setLayout(tab18Layout);
        tab18Layout.setHorizontalGroup(
            tab18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab18Layout.setVerticalGroup(
            tab18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab19.setBackground(new java.awt.Color(255, 255, 255));
        tab19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab19.setPreferredSize(new java.awt.Dimension(142, 92));

        tue1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); 
        tue1.setText("DL & CA");

        javax.swing.GroupLayout tab19Layout = new javax.swing.GroupLayout(tab19);
        tab19.setLayout(tab19Layout);
        tab19Layout.setHorizontalGroup(
            tab19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab19Layout.setVerticalGroup(
            tab19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab20.setBackground(new java.awt.Color(255, 255, 255));
        tab20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab20.setPreferredSize(new java.awt.Dimension(142, 92));

        tue2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); 
        tue2.setText("DS & GT");

        javax.swing.GroupLayout tab20Layout = new javax.swing.GroupLayout(tab20);
        tab20.setLayout(tab20Layout);
        tab20Layout.setHorizontalGroup(
            tab20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab20Layout.setVerticalGroup(
            tab20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab21.setBackground(new java.awt.Color(255, 255, 255));
        tab21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab21.setPreferredSize(new java.awt.Dimension(142, 92));

        tue3.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        tue3.setText("DS LAB");

        javax.swing.GroupLayout tab21Layout = new javax.swing.GroupLayout(tab21);
        tab21.setLayout(tab21Layout);
        tab21Layout.setHorizontalGroup(
            tab21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab21Layout.setVerticalGroup(
            tab21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab22.setBackground(new java.awt.Color(255, 255, 255));
        tab22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab22.setPreferredSize(new java.awt.Dimension(142, 92));

        tue4.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        tue4.setText("DS LAB");

        javax.swing.GroupLayout tab22Layout = new javax.swing.GroupLayout(tab22);
        tab22.setLayout(tab22Layout);
        tab22Layout.setHorizontalGroup(
            tab22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab22Layout.setVerticalGroup(
            tab22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab23.setBackground(new java.awt.Color(255, 255, 255));
        tab23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab23.setPreferredSize(new java.awt.Dimension(142, 92));

        tue5.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        tue5.setText("AME-1");

        javax.swing.GroupLayout tab23Layout = new javax.swing.GroupLayout(tab23);
        tab23.setLayout(tab23Layout);
        tab23Layout.setHorizontalGroup(
            tab23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab23Layout.setVerticalGroup(
            tab23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab24.setBackground(new java.awt.Color(255, 255, 255));
        tab24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab24.setPreferredSize(new java.awt.Dimension(142, 92));

        tue6.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        tue6.setText("-");

        javax.swing.GroupLayout tab24Layout = new javax.swing.GroupLayout(tab24);
        tab24.setLayout(tab24Layout);
        tab24Layout.setHorizontalGroup(
            tab24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue6, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab24Layout.setVerticalGroup(
            tab24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab25.setBackground(new java.awt.Color(255, 255, 255));
        tab25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab25.setPreferredSize(new java.awt.Dimension(132, 92));

        jLabel27.setText("WENESDAY");

        javax.swing.GroupLayout tab25Layout = new javax.swing.GroupLayout(tab25);
        tab25.setLayout(tab25Layout);
        tab25Layout.setHorizontalGroup(
            tab25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab25Layout.setVerticalGroup(
            tab25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab26.setBackground(new java.awt.Color(255, 255, 255));
        tab26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab26.setPreferredSize(new java.awt.Dimension(142, 92));

        wed1.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        wed1.setText("jLabel2");

        javax.swing.GroupLayout tab26Layout = new javax.swing.GroupLayout(tab26);
        tab26.setLayout(tab26Layout);
        tab26Layout.setHorizontalGroup(
            tab26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab26Layout.setVerticalGroup(
            tab26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab27.setBackground(new java.awt.Color(255, 255, 255));
        tab27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab27.setPreferredSize(new java.awt.Dimension(142, 92));

        wed2.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        wed2.setText("jLabel2");

        javax.swing.GroupLayout tab27Layout = new javax.swing.GroupLayout(tab27);
        tab27.setLayout(tab27Layout);
        tab27Layout.setHorizontalGroup(
            tab27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab27Layout.setVerticalGroup(
            tab27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab28.setBackground(new java.awt.Color(255, 255, 255));
        tab28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab28.setPreferredSize(new java.awt.Dimension(142, 92));

        wed3.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        wed3.setText("jLabel2");

        javax.swing.GroupLayout tab28Layout = new javax.swing.GroupLayout(tab28);
        tab28.setLayout(tab28Layout);
        tab28Layout.setHorizontalGroup(
            tab28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab28Layout.setVerticalGroup(
            tab28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab29.setBackground(new java.awt.Color(255, 255, 255));
        tab29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab29.setPreferredSize(new java.awt.Dimension(142, 92));

        wed4.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        wed4.setText("jLabel2");

        javax.swing.GroupLayout tab29Layout = new javax.swing.GroupLayout(tab29);
        tab29.setLayout(tab29Layout);
        tab29Layout.setHorizontalGroup(
            tab29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab29Layout.setVerticalGroup(
            tab29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab30.setBackground(new java.awt.Color(255, 255, 255));
        tab30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab30.setPreferredSize(new java.awt.Dimension(142, 92));

        wed5.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        wed5.setText("jLabel2");

        javax.swing.GroupLayout tab30Layout = new javax.swing.GroupLayout(tab30);
        tab30.setLayout(tab30Layout);
        tab30Layout.setHorizontalGroup(
            tab30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab30Layout.setVerticalGroup(
            tab30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab31.setBackground(new java.awt.Color(255, 255, 255));
        tab31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab31.setPreferredSize(new java.awt.Dimension(142, 92));

        wed6.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        wed6.setText("jLabel2");

        javax.swing.GroupLayout tab31Layout = new javax.swing.GroupLayout(tab31);
        tab31.setLayout(tab31Layout);
        tab31Layout.setHorizontalGroup(
            tab31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed6, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab31Layout.setVerticalGroup(
            tab31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab37.setBackground(new java.awt.Color(255, 255, 255));
        tab37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab37.setPreferredSize(new java.awt.Dimension(132, 92));

        jLabel39.setText("THURSDAY");

        javax.swing.GroupLayout tab37Layout = new javax.swing.GroupLayout(tab37);
        tab37.setLayout(tab37Layout);
        tab37Layout.setHorizontalGroup(
            tab37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab37Layout.setVerticalGroup(
            tab37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab38.setBackground(new java.awt.Color(255, 255, 255));
        tab38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab38.setPreferredSize(new java.awt.Dimension(142, 92));

        thu1.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        thu1.setText("jLabel2");

        javax.swing.GroupLayout tab38Layout = new javax.swing.GroupLayout(tab38);
        tab38.setLayout(tab38Layout);
        tab38Layout.setHorizontalGroup(
            tab38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab38Layout.setVerticalGroup(
            tab38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab39.setBackground(new java.awt.Color(255, 255, 255));
        tab39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab39.setPreferredSize(new java.awt.Dimension(142, 92));

        thu2.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        thu2.setText("jLabel2");

        javax.swing.GroupLayout tab39Layout = new javax.swing.GroupLayout(tab39);
        tab39.setLayout(tab39Layout);
        tab39Layout.setHorizontalGroup(
            tab39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab39Layout.setVerticalGroup(
            tab39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab40.setBackground(new java.awt.Color(255, 255, 255));
        tab40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab40.setPreferredSize(new java.awt.Dimension(142, 92));

        thu3.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        thu3.setText("jLabel2");

        javax.swing.GroupLayout tab40Layout = new javax.swing.GroupLayout(tab40);
        tab40.setLayout(tab40Layout);
        tab40Layout.setHorizontalGroup(
            tab40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab40Layout.setVerticalGroup(
            tab40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab41.setBackground(new java.awt.Color(255, 255, 255));
        tab41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab41.setPreferredSize(new java.awt.Dimension(142, 92));

        thu4.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        thu4.setText("jLabel2");

        javax.swing.GroupLayout tab41Layout = new javax.swing.GroupLayout(tab41);
        tab41.setLayout(tab41Layout);
        tab41Layout.setHorizontalGroup(
            tab41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab41Layout.setVerticalGroup(
            tab41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab42.setBackground(new java.awt.Color(255, 255, 255));
        tab42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab42.setPreferredSize(new java.awt.Dimension(142, 92));

        thu5.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        thu5.setText("jLabel2");

        javax.swing.GroupLayout tab42Layout = new javax.swing.GroupLayout(tab42);
        tab42.setLayout(tab42Layout);
        tab42Layout.setHorizontalGroup(
            tab42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab42Layout.setVerticalGroup(
            tab42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab43.setBackground(new java.awt.Color(255, 255, 255));
        tab43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab43.setPreferredSize(new java.awt.Dimension(142, 92));

        thu6.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        thu6.setText("jLabel2");

        javax.swing.GroupLayout tab43Layout = new javax.swing.GroupLayout(tab43);
        tab43.setLayout(tab43Layout);
        tab43Layout.setHorizontalGroup(
            tab43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu6, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab43Layout.setVerticalGroup(
            tab43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab44.setBackground(new java.awt.Color(255, 255, 255));
        tab44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab44.setPreferredSize(new java.awt.Dimension(132, 92));

        jLabel46.setText("FRIDAY");

        javax.swing.GroupLayout tab44Layout = new javax.swing.GroupLayout(tab44);
        tab44.setLayout(tab44Layout);
        tab44Layout.setHorizontalGroup(
            tab44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab44Layout.setVerticalGroup(
            tab44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab45.setBackground(new java.awt.Color(255, 255, 255));
        tab45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab45.setPreferredSize(new java.awt.Dimension(142, 92));

        fri1.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        fri1.setText("jLabel2");

        javax.swing.GroupLayout tab45Layout = new javax.swing.GroupLayout(tab45);
        tab45.setLayout(tab45Layout);
        tab45Layout.setHorizontalGroup(
            tab45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab45Layout.setVerticalGroup(
            tab45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab46.setBackground(new java.awt.Color(255, 255, 255));
        tab46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab46.setPreferredSize(new java.awt.Dimension(142, 92));

        fri6.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        fri6.setText("jLabel2");

        javax.swing.GroupLayout tab46Layout = new javax.swing.GroupLayout(tab46);
        tab46.setLayout(tab46Layout);
        tab46Layout.setHorizontalGroup(
            tab46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri6, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab46Layout.setVerticalGroup(
            tab46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab47.setBackground(new java.awt.Color(255, 255, 255));
        tab47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab47.setPreferredSize(new java.awt.Dimension(142, 92));

        fri2.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        fri2.setText("jLabel2");

        javax.swing.GroupLayout tab47Layout = new javax.swing.GroupLayout(tab47);
        tab47.setLayout(tab47Layout);
        tab47Layout.setHorizontalGroup(
            tab47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab47Layout.setVerticalGroup(
            tab47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab48.setBackground(new java.awt.Color(255, 255, 255));
        tab48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab48.setPreferredSize(new java.awt.Dimension(142, 92));

        fri3.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        fri3.setText("jLabel2");

        javax.swing.GroupLayout tab48Layout = new javax.swing.GroupLayout(tab48);
        tab48.setLayout(tab48Layout);
        tab48Layout.setHorizontalGroup(
            tab48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab48Layout.setVerticalGroup(
            tab48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab49.setBackground(new java.awt.Color(255, 255, 255));
        tab49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab49.setPreferredSize(new java.awt.Dimension(142, 92));

        fri4.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        fri4.setText("jLabel2");

        javax.swing.GroupLayout tab49Layout = new javax.swing.GroupLayout(tab49);
        tab49.setLayout(tab49Layout);
        tab49Layout.setHorizontalGroup(
            tab49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab49Layout.setVerticalGroup(
            tab49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab50.setBackground(new java.awt.Color(255, 255, 255));
        tab50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab50.setPreferredSize(new java.awt.Dimension(142, 92));

        fri5.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        fri5.setText("jLabel2");

        javax.swing.GroupLayout tab50Layout = new javax.swing.GroupLayout(tab50);
        tab50.setLayout(tab50Layout);
        tab50Layout.setHorizontalGroup(
            tab50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab50Layout.setVerticalGroup(
            tab50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab6.setBackground(new java.awt.Color(255, 255, 255));
        tab6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab6.setPreferredSize(new java.awt.Dimension(142, 41));

        jLabel8.setText("10:00 AM");

        javax.swing.GroupLayout tab6Layout = new javax.swing.GroupLayout(tab6);
        tab6.setLayout(tab6Layout);
        tab6Layout.setHorizontalGroup(
            tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab6Layout.setVerticalGroup(
            tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab7.setBackground(new java.awt.Color(255, 255, 255));
        tab7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("11:00 AM");

        javax.swing.GroupLayout tab7Layout = new javax.swing.GroupLayout(tab7);
        tab7.setLayout(tab7Layout);
        tab7Layout.setHorizontalGroup(
            tab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab7Layout.setVerticalGroup(
            tab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab53.setBackground(new java.awt.Color(255, 255, 255));
        tab53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab53.setPreferredSize(new java.awt.Dimension(132, 92));

        jLabel55.setText("SATURDAY");

        javax.swing.GroupLayout tab53Layout = new javax.swing.GroupLayout(tab53);
        tab53.setLayout(tab53Layout);
        tab53Layout.setHorizontalGroup(
            tab53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab53Layout.setVerticalGroup(
            tab53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab54.setBackground(new java.awt.Color(255, 255, 255));
        tab54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab54.setPreferredSize(new java.awt.Dimension(142, 92));

        sat1.setFont(new java.awt.Font("Trebuchet MS", 0, 12));

        javax.swing.GroupLayout tab54Layout = new javax.swing.GroupLayout(tab54);
        tab54.setLayout(tab54Layout);
        tab54Layout.setHorizontalGroup(
            tab54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab54Layout.setVerticalGroup(
            tab54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab55.setBackground(new java.awt.Color(255, 255, 255));
        tab55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab55.setPreferredSize(new java.awt.Dimension(142, 92));

        sat2.setFont(new java.awt.Font("Trebuchet MS", 0, 12));

        javax.swing.GroupLayout tab55Layout = new javax.swing.GroupLayout(tab55);
        tab55.setLayout(tab55Layout);
        tab55Layout.setHorizontalGroup(
            tab55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab55Layout.setVerticalGroup(
            tab55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab56.setBackground(new java.awt.Color(255, 255, 255));
        tab56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab56.setPreferredSize(new java.awt.Dimension(142, 92));

        sat3.setFont(new java.awt.Font("Trebuchet MS", 0, 12));

        javax.swing.GroupLayout tab56Layout = new javax.swing.GroupLayout(tab56);
        tab56.setLayout(tab56Layout);
        tab56Layout.setHorizontalGroup(
            tab56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab56Layout.setVerticalGroup(
            tab56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab57.setBackground(new java.awt.Color(255, 255, 255));
        tab57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab57.setPreferredSize(new java.awt.Dimension(142, 92));

        sat4.setFont(new java.awt.Font("Trebuchet MS", 0, 12));

        javax.swing.GroupLayout tab57Layout = new javax.swing.GroupLayout(tab57);
        tab57.setLayout(tab57Layout);
        tab57Layout.setHorizontalGroup(
            tab57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab57Layout.setVerticalGroup(
            tab57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab58.setBackground(new java.awt.Color(255, 255, 255));
        tab58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab58.setPreferredSize(new java.awt.Dimension(142, 92));

        sat5.setFont(new java.awt.Font("Trebuchet MS", 0, 12));

        javax.swing.GroupLayout tab58Layout = new javax.swing.GroupLayout(tab58);
        tab58.setLayout(tab58Layout);
        tab58Layout.setHorizontalGroup(
            tab58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab58Layout.setVerticalGroup(
            tab58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab59.setBackground(new java.awt.Color(255, 255, 255));
        tab59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab59.setPreferredSize(new java.awt.Dimension(142, 92));

        sat6.setFont(new java.awt.Font("Trebuchet MS", 0, 12));

        javax.swing.GroupLayout tab59Layout = new javax.swing.GroupLayout(tab59);
        tab59.setLayout(tab59Layout);
        tab59Layout.setHorizontalGroup(
            tab59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat6, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab59Layout.setVerticalGroup(
            tab59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab61.setBackground(new java.awt.Color(255, 255, 255));
        tab61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel63.setText("03:00 PM");

        javax.swing.GroupLayout tab61Layout = new javax.swing.GroupLayout(tab61);
        tab61.setLayout(tab61Layout);
        tab61Layout.setHorizontalGroup(
            tab61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab61Layout.setVerticalGroup(
            tab61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab62.setBackground(new java.awt.Color(255, 255, 255));
        tab62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab62.setPreferredSize(new java.awt.Dimension(142, 92));

        mon7.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        mon7.setText("jLabel2");

        javax.swing.GroupLayout tab62Layout = new javax.swing.GroupLayout(tab62);
        tab62.setLayout(tab62Layout);
        tab62Layout.setHorizontalGroup(
            tab62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab62Layout.setVerticalGroup(
            tab62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab65.setBackground(new java.awt.Color(255, 255, 255));
        tab65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab65.setPreferredSize(new java.awt.Dimension(142, 92));

        tue7.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        tue7.setText("jLabel2");

        javax.swing.GroupLayout tab65Layout = new javax.swing.GroupLayout(tab65);
        tab65.setLayout(tab65Layout);
        tab65Layout.setHorizontalGroup(
            tab65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab65Layout.setVerticalGroup(
            tab65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tue7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab66.setBackground(new java.awt.Color(255, 255, 255));
        tab66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab66.setPreferredSize(new java.awt.Dimension(142, 92));

        wed7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); 
        wed7.setText("jLabel2");

        javax.swing.GroupLayout tab66Layout = new javax.swing.GroupLayout(tab66);
        tab66.setLayout(tab66Layout);
        tab66Layout.setHorizontalGroup(
            tab66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab66Layout.setVerticalGroup(
            tab66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wed7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab67.setBackground(new java.awt.Color(255, 255, 255));
        tab67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab67.setPreferredSize(new java.awt.Dimension(142, 92));

        thu7.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        thu7.setText("jLabel2");

        javax.swing.GroupLayout tab67Layout = new javax.swing.GroupLayout(tab67);
        tab67.setLayout(tab67Layout);
        tab67Layout.setHorizontalGroup(
            tab67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab67Layout.setVerticalGroup(
            tab67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thu7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab68.setBackground(new java.awt.Color(255, 255, 255));
        tab68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab68.setPreferredSize(new java.awt.Dimension(142, 92));

        fri7.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        fri7.setText("-");

        javax.swing.GroupLayout tab68Layout = new javax.swing.GroupLayout(tab68);
        tab68.setLayout(tab68Layout);
        tab68Layout.setHorizontalGroup(
            tab68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab68Layout.setVerticalGroup(
            tab68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fri7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab69.setBackground(new java.awt.Color(255, 255, 255));
        tab69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab69.setPreferredSize(new java.awt.Dimension(142, 92));

        sat7.setFont(new java.awt.Font("Trebuchet MS", 0, 12));

        javax.swing.GroupLayout tab69Layout = new javax.swing.GroupLayout(tab69);
        tab69.setLayout(tab69Layout);
        tab69Layout.setHorizontalGroup(
            tab69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab69Layout.setVerticalGroup(
            tab69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sat7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tableLayout = new javax.swing.GroupLayout(table);
        table.setLayout(tableLayout);
        tableLayout.setHorizontalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tab53, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addComponent(tab44, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addComponent(tab37, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addComponent(tab25, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addComponent(tab18, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addComponent(tab11, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                    .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tableLayout.createSequentialGroup()
                        .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createSequentialGroup()
                            .addComponent(tab12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createSequentialGroup()
                            .addComponent(tab19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createSequentialGroup()
                            .addComponent(tab26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createSequentialGroup()
                            .addComponent(tab38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createSequentialGroup()
                            .addComponent(tab45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createSequentialGroup()
                            .addComponent(tab54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tab59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tab62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tableLayout.setVerticalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(tab6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(tab10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addGap(0, 581, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 1159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1200, 822));
        setLocationRelativeTo(null);
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTimeTable().setVisible(true);
            }
        });
    }

    public javax.swing.JButton backButton;
    private java.awt.Canvas canvas1;
    public javax.swing.JLabel fri1;
    public javax.swing.JLabel fri2;
    public javax.swing.JLabel fri3;
    public javax.swing.JLabel fri4;
    public javax.swing.JLabel fri5;
    public javax.swing.JLabel fri6;
    public javax.swing.JLabel fri7;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel mon1;
    public javax.swing.JLabel mon2;
    public javax.swing.JLabel mon3;
    public javax.swing.JLabel mon4;
    public javax.swing.JLabel mon5;
    public javax.swing.JLabel mon6;
    public javax.swing.JLabel mon7;
    public javax.swing.JLabel sat1;
    public javax.swing.JLabel sat2;
    public javax.swing.JLabel sat3;
    public javax.swing.JLabel sat4;
    public javax.swing.JLabel sat5;
    public javax.swing.JLabel sat6;
    public javax.swing.JLabel sat7;
    public javax.swing.JPanel tab;
    public javax.swing.JPanel tab1;
    public javax.swing.JPanel tab10;
    public javax.swing.JPanel tab11;
    public javax.swing.JPanel tab12;
    public javax.swing.JPanel tab13;
    public javax.swing.JPanel tab14;
    public javax.swing.JPanel tab15;
    public javax.swing.JPanel tab16;
    public javax.swing.JPanel tab17;
    public javax.swing.JPanel tab18;
    public javax.swing.JPanel tab19;
    public javax.swing.JPanel tab20;
    public javax.swing.JPanel tab21;
    public javax.swing.JPanel tab22;
    public javax.swing.JPanel tab23;
    public javax.swing.JPanel tab24;
    public javax.swing.JPanel tab25;
    public javax.swing.JPanel tab26;
    public javax.swing.JPanel tab27;
    public javax.swing.JPanel tab28;
    public javax.swing.JPanel tab29;
    public javax.swing.JPanel tab30;
    public javax.swing.JPanel tab31;
    public javax.swing.JPanel tab37;
    public javax.swing.JPanel tab38;
    public javax.swing.JPanel tab39;
    public javax.swing.JPanel tab40;
    public javax.swing.JPanel tab41;
    public javax.swing.JPanel tab42;
    public javax.swing.JPanel tab43;
    public javax.swing.JPanel tab44;
    public javax.swing.JPanel tab45;
    public javax.swing.JPanel tab46;
    public javax.swing.JPanel tab47;
    public javax.swing.JPanel tab48;
    public javax.swing.JPanel tab49;
    public javax.swing.JPanel tab50;
    public javax.swing.JPanel tab53;
    public javax.swing.JPanel tab54;
    public javax.swing.JPanel tab55;
    public javax.swing.JPanel tab56;
    public javax.swing.JPanel tab57;
    public javax.swing.JPanel tab58;
    public javax.swing.JPanel tab59;
    public javax.swing.JPanel tab6;
    public javax.swing.JPanel tab61;
    public javax.swing.JPanel tab62;
    public javax.swing.JPanel tab65;
    public javax.swing.JPanel tab66;
    public javax.swing.JPanel tab67;
    public javax.swing.JPanel tab68;
    public javax.swing.JPanel tab69;
    public javax.swing.JPanel tab7;
    public javax.swing.JPanel tab8;
    public javax.swing.JPanel tab9;
    public javax.swing.JPanel table;
    public javax.swing.JLabel thu1;
    public javax.swing.JLabel thu2;
    public javax.swing.JLabel thu3;
    public javax.swing.JLabel thu4;
    public javax.swing.JLabel thu5;
    public javax.swing.JLabel thu6;
    public javax.swing.JLabel thu7;
    public javax.swing.JLabel tue1;
    public javax.swing.JLabel tue2;
    public javax.swing.JLabel tue3;
    public javax.swing.JLabel tue4;
    public javax.swing.JLabel tue5;
    public javax.swing.JLabel tue6;
    public javax.swing.JLabel tue7;
    public javax.swing.JLabel wed1;
    public javax.swing.JLabel wed2;
    public javax.swing.JLabel wed3;
    public javax.swing.JLabel wed4;
    public javax.swing.JLabel wed5;
    public javax.swing.JLabel wed6;
    public javax.swing.JLabel wed7;
}