package TimeTable;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManageTimeTable extends javax.swing.JFrame {
    DatabaseConnection db = new DatabaseConnection();

    public ManageTimeTable() {
        initComponents();
        initInput();      
    }
    
    public void initInput(){
        groupName.removeAllItems();
        ResultSet sg = db.executeQuery("SELECT * FROM StudentGroup");
        groupName.addItem("Select Group Name");
        try {
            while(sg.next()){
                groupName.addItem(sg.getString("GrpName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageGroups.class.getName()).log(Level.SEVERE, null, ex);
        }
        groupName.setSelectedIndex(0);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        viewTimeTable = new javax.swing.JButton();
        genTimeTable = new javax.swing.JButton();
        groupName = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Manage Time Table");

        backButton.setBackground(new java.awt.Color(204, 255, 255));
        backButton.setFont(new java.awt.Font("Dialog", 1, 48)); 
        backButton.setText("<-");
        backButton.setBorder(null);

        viewTimeTable.setBackground(new java.awt.Color(102, 153, 255));
        viewTimeTable.setFont(new java.awt.Font("Dialog", 1, 24));
        viewTimeTable.setForeground(new java.awt.Color(255, 255, 255));
        viewTimeTable.setText("View Time Table");
        viewTimeTable.setToolTipText("");
        viewTimeTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        viewTimeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTimeTableActionPerformed(evt);
            }
        });

        genTimeTable.setBackground(new java.awt.Color(102, 153, 255));
        genTimeTable.setFont(new java.awt.Font("Dialog", 1, 24));
        genTimeTable.setForeground(new java.awt.Color(255, 255, 255));
        genTimeTable.setText("Generate Time Table");
        genTimeTable.setToolTipText("");
        genTimeTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        genTimeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genTimeTableActionPerformed(evt);
            }
        });

        groupName.setBackground(new java.awt.Color(255, 255, 255));
        groupName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        groupName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(groupName, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(backButton)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backButton))
                .addGap(112, 112, 112)
                .addComponent(groupName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(genTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(viewTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1200, 822));
        setLocationRelativeTo(null);
    }

    private void viewTimeTableActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void genTimeTableActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void groupNameActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(ManageTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageTimeTable().setVisible(true);
            }
        });
    }

    public javax.swing.JButton backButton;
    public javax.swing.JButton genTimeTable;
    public javax.swing.JComboBox<String> groupName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton viewTimeTable;
}