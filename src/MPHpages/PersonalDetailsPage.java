
package MPHpages;



public class PersonalDetailsPage extends javax.swing.JFrame {

     private String employeeID; // Add a field to store the employee ID
     
    /**
     * Creates new form PersonalDetailsPage
     */
    public PersonalDetailsPage() {
        initComponents();
        
        backbuttondetailsPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttondetailsPBActionPerformed(evt);
               
                }
        });
        
        
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsmainPNL = new javax.swing.JPanel();
        detailsheaderPNL = new javax.swing.JPanel();
        detailsheaderLBL = new javax.swing.JLabel();
        backbuttondetailsPB = new javax.swing.JButton();
        infoboxPNL = new javax.swing.JPanel();
        dtfirstnameLBL = new javax.swing.JLabel();
        dtlastnameLBL = new javax.swing.JLabel();
        dtbdayLBL = new javax.swing.JLabel();
        dtphonenumLBL = new javax.swing.JLabel();
        dtstatusLBL = new javax.swing.JLabel();
        dtpositionLBL = new javax.swing.JLabel();
        dtsupervisorLBL = new javax.swing.JLabel();
        inputfirstnameLBL = new javax.swing.JLabel();
        inputlastnameLBL = new javax.swing.JLabel();
        inputbdayLBL = new javax.swing.JLabel();
        inputphonenumLBL = new javax.swing.JLabel();
        inputstatusLBL = new javax.swing.JLabel();
        inputpositionLBL = new javax.swing.JLabel();
        inputsupervisorLBL = new javax.swing.JLabel();
        dtemployeeidLBL = new javax.swing.JLabel();
        inputempidLBL = new javax.swing.JLabel();
        dtaddressLBL = new javax.swing.JLabel();
        inputaddressLBL = new javax.swing.JLabel();
        detailsiconPNL = new javax.swing.JPanel();
        icondetailsLBL = new javax.swing.JLabel();
        notedetailsLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        detailsmainPNL.setBackground(new java.awt.Color(204, 204, 204));

        detailsheaderPNL.setBackground(new java.awt.Color(102, 102, 102));

        detailsheaderLBL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        detailsheaderLBL.setText("Employee's Personal Details");

        backbuttondetailsPB.setBackground(new java.awt.Color(204, 0, 0));
        backbuttondetailsPB.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        backbuttondetailsPB.setText("Back");
        backbuttondetailsPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttondetailsPBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailsheaderPNLLayout = new javax.swing.GroupLayout(detailsheaderPNL);
        detailsheaderPNL.setLayout(detailsheaderPNLLayout);
        detailsheaderPNLLayout.setHorizontalGroup(
            detailsheaderPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsheaderPNLLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(backbuttondetailsPB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(detailsheaderLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailsheaderPNLLayout.setVerticalGroup(
            detailsheaderPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsheaderPNLLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(detailsheaderPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsheaderLBL)
                    .addComponent(backbuttondetailsPB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        infoboxPNL.setBackground(new java.awt.Color(102, 102, 102));
        infoboxPNL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        dtfirstnameLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dtfirstnameLBL.setText("First Name:");

        dtlastnameLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dtlastnameLBL.setText("Last Name:");

        dtbdayLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dtbdayLBL.setText("Birthday");

        dtphonenumLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dtphonenumLBL.setText("Phone Number:");

        dtstatusLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dtstatusLBL.setText("Status:");

        dtpositionLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dtpositionLBL.setText("Position:");

        dtsupervisorLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dtsupervisorLBL.setText("Immediate Supervisor:");

        inputfirstnameLBL.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        inputfirstnameLBL.setText(". . .");

        inputlastnameLBL.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        inputlastnameLBL.setText(". . .");

        inputbdayLBL.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        inputbdayLBL.setText(". . .");

        inputphonenumLBL.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        inputphonenumLBL.setText(". . .");

        inputstatusLBL.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        inputstatusLBL.setText(". . .");

        inputpositionLBL.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        inputpositionLBL.setText(". . .");

        inputsupervisorLBL.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        inputsupervisorLBL.setText(". . .");

        dtemployeeidLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dtemployeeidLBL.setText("Employee ID:");

        inputempidLBL.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        inputempidLBL.setText(". . .");

        dtaddressLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dtaddressLBL.setText("Address");

        inputaddressLBL.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        inputaddressLBL.setText(". . .");

        javax.swing.GroupLayout infoboxPNLLayout = new javax.swing.GroupLayout(infoboxPNL);
        infoboxPNL.setLayout(infoboxPNLLayout);
        infoboxPNLLayout.setHorizontalGroup(
            infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoboxPNLLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoboxPNLLayout.createSequentialGroup()
                        .addComponent(dtsupervisorLBL)
                        .addGap(18, 18, 18)
                        .addComponent(inputsupervisorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoboxPNLLayout.createSequentialGroup()
                        .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtfirstnameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtlastnameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtbdayLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtphonenumLBL)
                            .addComponent(dtstatusLBL)
                            .addComponent(dtpositionLBL)
                            .addComponent(dtemployeeidLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtaddressLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputaddressLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputempidLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputpositionLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputstatusLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputphonenumLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputbdayLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputlastnameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputfirstnameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        infoboxPNLLayout.setVerticalGroup(
            infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoboxPNLLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtemployeeidLBL)
                    .addComponent(inputempidLBL))
                .addGap(18, 18, 18)
                .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtfirstnameLBL)
                    .addComponent(inputfirstnameLBL))
                .addGap(18, 18, 18)
                .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtlastnameLBL)
                    .addComponent(inputlastnameLBL))
                .addGap(18, 18, 18)
                .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtbdayLBL)
                    .addComponent(inputbdayLBL))
                .addGap(18, 18, 18)
                .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtaddressLBL)
                    .addComponent(inputaddressLBL))
                .addGap(18, 18, 18)
                .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtphonenumLBL)
                    .addComponent(inputphonenumLBL))
                .addGap(18, 18, 18)
                .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtstatusLBL)
                    .addComponent(inputstatusLBL))
                .addGap(18, 18, 18)
                .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtpositionLBL)
                    .addComponent(inputpositionLBL))
                .addGap(18, 18, 18)
                .addGroup(infoboxPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtsupervisorLBL)
                    .addComponent(inputsupervisorLBL))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        detailsiconPNL.setBackground(new java.awt.Color(102, 102, 102));

        icondetailsLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/USER 128 X 128.png"))); // NOI18N

        javax.swing.GroupLayout detailsiconPNLLayout = new javax.swing.GroupLayout(detailsiconPNL);
        detailsiconPNL.setLayout(detailsiconPNLLayout);
        detailsiconPNLLayout.setHorizontalGroup(
            detailsiconPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsiconPNLLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(icondetailsLBL)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        detailsiconPNLLayout.setVerticalGroup(
            detailsiconPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsiconPNLLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(icondetailsLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        notedetailsLBL.setFont(new java.awt.Font("Helvetica", 3, 12)); // NOI18N
        notedetailsLBL.setForeground(new java.awt.Color(51, 51, 51));
        notedetailsLBL.setText("Please contact HR for any revisions.");

        javax.swing.GroupLayout detailsmainPNLLayout = new javax.swing.GroupLayout(detailsmainPNL);
        detailsmainPNL.setLayout(detailsmainPNLLayout);
        detailsmainPNLLayout.setHorizontalGroup(
            detailsmainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detailsheaderPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsmainPNLLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(detailsmainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(detailsiconPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notedetailsLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(infoboxPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        detailsmainPNLLayout.setVerticalGroup(
            detailsmainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsmainPNLLayout.createSequentialGroup()
                .addComponent(detailsheaderPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(detailsmainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsmainPNLLayout.createSequentialGroup()
                        .addComponent(infoboxPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(detailsmainPNLLayout.createSequentialGroup()
                        .addComponent(detailsiconPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(notedetailsLBL)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detailsmainPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detailsmainPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttondetailsPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttondetailsPBActionPerformed

        // Create an instance of EmployeePage
        EmployeePage employeePage = new EmployeePage();
        // Center the EmployeePage
        employeePage.setLocationRelativeTo(null);
        // Make the EmployeePage visible
        employeePage.setVisible(true);
        // Close the current AboutPage
        this.dispose();
    }//GEN-LAST:event_backbuttondetailsPBActionPerformed

    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonalDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalDetailsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbuttondetailsPB;
    private javax.swing.JLabel detailsheaderLBL;
    private javax.swing.JPanel detailsheaderPNL;
    private javax.swing.JPanel detailsiconPNL;
    private javax.swing.JPanel detailsmainPNL;
    private javax.swing.JLabel dtaddressLBL;
    private javax.swing.JLabel dtbdayLBL;
    private javax.swing.JLabel dtemployeeidLBL;
    private javax.swing.JLabel dtfirstnameLBL;
    private javax.swing.JLabel dtlastnameLBL;
    private javax.swing.JLabel dtphonenumLBL;
    private javax.swing.JLabel dtpositionLBL;
    private javax.swing.JLabel dtstatusLBL;
    private javax.swing.JLabel dtsupervisorLBL;
    private javax.swing.JLabel icondetailsLBL;
    private javax.swing.JPanel infoboxPNL;
    private javax.swing.JLabel inputaddressLBL;
    private javax.swing.JLabel inputbdayLBL;
    private javax.swing.JLabel inputempidLBL;
    private javax.swing.JLabel inputfirstnameLBL;
    private javax.swing.JLabel inputlastnameLBL;
    private javax.swing.JLabel inputphonenumLBL;
    private javax.swing.JLabel inputpositionLBL;
    private javax.swing.JLabel inputstatusLBL;
    private javax.swing.JLabel inputsupervisorLBL;
    private javax.swing.JLabel notedetailsLBL;
    // End of variables declaration//GEN-END:variables
}
