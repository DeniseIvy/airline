/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAHIRAM!
 */
public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CheckIn
     */
    public CheckIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        refnum_lbl = new javax.swing.JLabel();
        name_lbl = new javax.swing.JLabel();
        refnum_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        checkin_b = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHING CHONG AIRWAYS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 20, 530, 70);

        refnum_lbl.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        refnum_lbl.setForeground(new java.awt.Color(255, 255, 255));
        refnum_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refnum_lbl.setText("Reference Number");
        jPanel1.add(refnum_lbl);
        refnum_lbl.setBounds(90, 180, 210, 40);

        name_lbl.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        name_lbl.setForeground(new java.awt.Color(255, 255, 255));
        name_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_lbl.setText("Name");
        jPanel1.add(name_lbl);
        name_lbl.setBounds(420, 190, 160, 31);
        jPanel1.add(refnum_txt);
        refnum_txt.setBounds(130, 230, 260, 60);
        jPanel1.add(name_txt);
        name_txt.setBounds(470, 230, 270, 60);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BOOKING REFERENCE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 90, 360, 29);

        checkin_b.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        checkin_b.setForeground(new java.awt.Color(51, 51, 51));
        checkin_b.setText("CHECK IN");
        jPanel1.add(checkin_b);
        checkin_b.setBounds(320, 350, 180, 60);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 800, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton checkin_b;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField name_txt;
    private javax.swing.JLabel refnum_lbl;
    private javax.swing.JTextField refnum_txt;
    // End of variables declaration//GEN-END:variables
}
