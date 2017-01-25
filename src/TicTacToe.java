
import java.awt.Button;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 13mse0370
 */
public class TicTacToe extends javax.swing.JFrame {
int i=1,j=0;
    int b00=0,b01=0,b02=0,b10=0,b11=0,b12=0,b20=0,b21=0,b22=0;
    public TicTacToe() {
        initComponents();
      p1.setBackground(Color.GREEN);
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(260, 110, 50, 50);

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(310, 110, 50, 50);

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(210, 110, 50, 50);

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(260, 160, 50, 50);

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(310, 160, 50, 50);

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(210, 160, 50, 50);

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(260, 210, 50, 50);

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(310, 210, 50, 50);

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(210, 210, 50, 50);

        jLabel1.setFont(new java.awt.Font("PMingLiU", 1, 18)); // NOI18N
        jLabel1.setText("Tic Tac Toe");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 50, 120, 30);

        l1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        getContentPane().add(l1);
        l1.setBounds(220, 300, 150, 30);

        jButton1.setText("Restart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 10, 71, 23);

        p1.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        p1.setText("Player 1");
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1);
        p1.setBounds(480, 110, 73, 23);

        p2.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        p2.setText("Player 2");
        getContentPane().add(p2);
        p2.setBounds(480, 140, 73, 23);

        setBounds(0, 0, 584, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        l1.setText("");
        if(b00==0){
        i++;
        if(i%2==0){
             
     
            b1.setBackground(Color.blue);
            p1.setBackground(Color.WHITE);
            p2.setBackground(Color.GREEN);
            b00=1;    
        }else{
            
             b1.setBackground(Color.red);
             
               p1.setBackground(Color.GREEN);
            p2.setBackground(Color.WHITE);
            b00=2;
        }
        check();
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       l1.setText("");
        if(b01==0){
        i++;
        if(i%2==0){
            b2.setBackground(Color.blue);
             p1.setBackground(Color.WHITE);
            p2.setBackground(Color.GREEN);
            b01=1;    
        }else{
            p1.setBackground(Color.GREEN);
            p2.setBackground(Color.WHITE);
             b2.setBackground(Color.red);
            b01=2;
        }
        check();
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        l1.setText("");
        if(b02==0){
        i++;
        if(i%2==0){
            b3.setBackground(Color.blue);
             p1.setBackground(Color.WHITE);
            p2.setBackground(Color.GREEN);
            b02=1;    
        }else{
             b3.setBackground(Color.red);
             p1.setBackground(Color.GREEN);
            p2.setBackground(Color.WHITE);
            b02=2;
        }
        check();
        }
        
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        l1.setText("");
        l1.setText("");
        if(b10==0){
        i++;
        if(i%2==0){
            b4.setBackground(Color.blue);
              p1.setBackground(Color.WHITE);
            p2.setBackground(Color.GREEN);
            b10=1;    
        }else{
             b4.setBackground(Color.red);
              p1.setBackground(Color.GREEN);
            p2.setBackground(Color.WHITE);
            b10=2;
        }
        check();
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        l1.setText("");
        if(b11==0){
        i++;
        if(i%2==0){
            b5.setBackground(Color.blue);
            p1.setBackground(Color.WHITE);
            p2.setBackground(Color.GREEN);
            b11=1;    
        }else{
             b5.setBackground(Color.red);
              p1.setBackground(Color.GREEN);
            p2.setBackground(Color.WHITE);
            b11=2;
        }
        check();
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
      l1.setText("");
        if(b12==0){
        i++;
        if(i%2==0){
            b6.setBackground(Color.blue);
             p1.setBackground(Color.WHITE);
            p2.setBackground(Color.GREEN);
            b12=1;    
        }else{
             b6.setBackground(Color.red);
            b12=2;
             p1.setBackground(Color.GREEN);
            p2.setBackground(Color.WHITE);
        }
        check();
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        l1.setText("");
        if(b20==0){
        i++;
        if(i%2==0){
            b7.setBackground(Color.blue);
             p1.setBackground(Color.WHITE);
            p2.setBackground(Color.GREEN);
            b20=1;    
        }else{
             b7.setBackground(Color.red);
             p1.setBackground(Color.GREEN);
            p2.setBackground(Color.WHITE);
            b20=2;
        }
        check();
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        l1.setText("");
        if(b21==0){
        i++;
        if(i%2==0){
            b8.setBackground(Color.blue);
             p1.setBackground(Color.WHITE);
            p2.setBackground(Color.GREEN);
            b21=1;    
        }else{
             b8.setBackground(Color.red);
               p1.setBackground(Color.GREEN);
            p2.setBackground(Color.WHITE);
            b21=2;
        }
        check();
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        l1.setText("");
        if(b22==0){
        i++;
        if(i%2==0){
            b9.setBackground(Color.blue);
            p1.setBackground(Color.WHITE);
            p2.setBackground(Color.GREEN);
            b22=1;    
        }else{
             b9.setBackground(Color.red);
             p1.setBackground(Color.GREEN);
            p2.setBackground(Color.WHITE);
            b22=2;
        }
        check();
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      finish();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed
public void finish(){
     p1.setBackground(Color.GREEN);
            p2.setBackground(Color.WHITE);
  b00=0;b01=0;b02=0;b10=0;b11=0;b12=0;b20=0;b21=0;b22=0;
       b1.setBackground(Color.WHITE);
         b2.setBackground(Color.WHITE);
           b3.setBackground(Color.WHITE);
             b4.setBackground(Color.WHITE);
               b5.setBackground(Color.WHITE); 
              b6.setBackground(Color.WHITE);
                b7.setBackground(Color.WHITE); 
                b8.setBackground(Color.WHITE);
                  b9.setBackground(Color.WHITE);
}
    public void check(){
    if(b00==1 && b01==1 && b02==1){
            l1.setText("Blue won the game");
            finish();
    }else if(b10==1 && b11==1 && b12==1){
    l1.setText("Blue won the game"); finish();
    }else if(b20==1 && b21==1 && b22==1){
    l1.setText("Blue won the game"); finish();
    }else if(b00==1 && b10==1 && b20==1){
    l1.setText("Blue won the game"); finish();
    }else if(b02==1 && b12==1 && b22==1){
               l1.setText("Blue won the game"); finish();
    }else if(b00==1 && b11==1 && b22==1){
    l1.setText("Blue won the game"); finish();
    }
    else if(b00==2 && b01==2 && b02==2){
    l1.setText("Red won the game"); finish();
    }else if(b10==2 && b11==2 && b12==2){
    l1.setText("Red won the game"); finish();
    }else if(b20==2 && b21==2 && b22==2){
    l1.setText("Red won the game"); finish();
    }else if(b00==2 && b10==2 && b20==2){
    l1.setText("Red won the game"); finish();
    }else if(b02==2 && b12==2 && b22==2){
               l1.setText("Red won the game"); finish();
    }else if(b00==2 && b11==2 && b22==2){
    l1.setText("Red won the game"); finish();
    }
    else if(b02==2 && b11==2 && b20==2){
    l1.setText("Red won the game"); finish();
    }
     else if(b02==1 && b11==1 && b20==1){
    l1.setText("Blue won the game"); finish();
    }
}
    
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l1;
    private javax.swing.JButton p1;
    private javax.swing.JButton p2;
    // End of variables declaration//GEN-END:variables
}
