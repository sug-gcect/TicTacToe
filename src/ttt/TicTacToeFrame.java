/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class TicTacToeFrame extends javax.swing.JFrame {

    private String WhoseTurn="X";
    private String avi;
    private String PlayerOne="Player One";
    private String PlayerTwo="Player Two";
    private int PlayerOneCount=0;
    private int PlayerTwoCount=0;
    private String PlayerName;
    
    public TicTacToeFrame() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        option();
    }
    private void tie_game(){
        String one=jButton1.getText();
        String two=jButton2.getText();
        String three=jButton3.getText();
        String four=jButton4.getText();
        String five=jButton5.getText();
        String six=jButton6.getText();
        String seven=jButton7.getText();
        String eight=jButton8.getText();
        String nine=jButton9.getText();
        if(one !="" && two !="" && three !="" && four !="" &&  five !="" && six !="" && seven !="" && eight !="" && nine !=""){
        JOptionPane.showMessageDialog(this, "Game Is Drawn", "DRAW", JOptionPane.INFORMATION_MESSAGE);
        reset_game();
    }
    }
    private void set_score(){
        jLabel_score.setText(PlayerOne+"'s score is :"+String.valueOf(PlayerOneCount)+"     "+"this is "+PlayerName+"'s move"+"      "+PlayerTwo+"'s score is :"+String.valueOf(PlayerTwoCount));
    }
    private void set_player_name(){
        if(WhoseTurn.equalsIgnoreCase("X")){
            PlayerName=PlayerOne;
        }
        else{
            PlayerName=PlayerTwo;
        }
        jLabel_score.setText(PlayerOne+"'s score is :"+String.valueOf(PlayerOneCount)+"     "+"this is "+PlayerName+"'s move"+"      "+PlayerTwo+"'s score is :"+String.valueOf(PlayerTwoCount));
    }
    private void get_player_name(){
        PlayerOne=JOptionPane.showInputDialog(this,"Player One Name:","Player Name",JOptionPane.INFORMATION_MESSAGE);
        PlayerTwo=JOptionPane.showInputDialog(this,"Player Two Name:","Player Name",JOptionPane.INFORMATION_MESSAGE);
        if(PlayerOne.equals("")){
            PlayerOne="Player One";
        }
        if(PlayerTwo.equals("")){
            PlayerTwo="Player Two";
        }
    }
    private void option(){
        avi=JOptionPane.showInputDialog(this,"One Player or Two Player:","Write Choice",JOptionPane.INFORMATION_MESSAGE);
        if(avi.equals("one player")){
            
        }
        if(avi.equals("two player")){
             get_player_name();
             set_player_name();
             set_score();
        }
    }
    private void determineWhoseTurn(){
        if(WhoseTurn.equalsIgnoreCase("X")){
            WhoseTurn = "O";
        }
        else{
            WhoseTurn = "X";
        }
    }
    private void Xwins(){
        JOptionPane.showMessageDialog(this, PlayerOne+" wins the game", "WINNER", JOptionPane.INFORMATION_MESSAGE);
        PlayerOneCount++;
        reset_game();
    }
    private void Owins(){
        JOptionPane.showMessageDialog(this, PlayerTwo+" wins the game", "WINNER", JOptionPane.INFORMATION_MESSAGE);
        PlayerTwoCount++;
        reset_game();
    }
    private void reset_game(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText(""); 
        set_score();
    }
    private void determineifwin(){
        String one=jButton1.getText();
        String two=jButton2.getText();
        String three=jButton3.getText();
        String four=jButton4.getText();
        String five=jButton5.getText();
        String six=jButton6.getText();
        String seven=jButton7.getText();
        String eight=jButton8.getText();
        String nine=jButton9.getText();
        //xwins
        if(one=="X" && two=="X" && three=="X"){
            Xwins();
        }
        if(one=="X" && five=="X" && nine=="X"){
            Xwins();
        }
        if(one=="X" && four=="X" && seven=="X"){
            Xwins();
        }
        if(two=="X" && five=="X" && eight=="X"){
            Xwins();
        }
        if(three=="X" && six=="X" && nine=="X"){
            Xwins();
        }
        if(four=="X" && five=="X" && six=="X"){
            Xwins();
        }
        if(seven=="X" && eight=="X" && nine=="X"){
            Xwins();
        }
        if(three=="X" && five=="X" && seven=="X"){
            Xwins();
        }
        //owins
        if(one=="O" && two=="O" && three=="O"){
            Owins();
        }
        if(one=="O" && five=="O" && nine=="O"){
            Owins();
        }
        if(one=="O" && four=="O" && seven=="O"){
            Owins();
        }
        if(two=="O" && five=="O" && eight=="O"){
            Owins();
        }
        if(three=="O" && six=="O" && nine=="O"){
            Owins();
        }
        if(four=="O" && five=="O" && six=="O"){
            Owins();
        }
        if(seven=="O" && eight=="O" && nine=="O"){
            Owins();
        }
        if(three=="O" && five=="O" && seven=="O"){
            Owins();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_score = new javax.swing.JLabel();
        jPanel_GridHolder = new javax.swing.JPanel();
        jPanel_1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel_2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel_3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel_4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel_5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel_6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel_7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel_8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel_9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel_score.setBackground(new java.awt.Color(153, 0, 153));
        jLabel_score.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_score.setText("Place Holder For Scores");
        jPanel1.add(jLabel_score, java.awt.BorderLayout.PAGE_END);

        jPanel_GridHolder.setBackground(new java.awt.Color(102, 255, 255));
        jPanel_GridHolder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel_1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_1);

        jPanel_2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_2);

        jPanel_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_3.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_3);

        jPanel_4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_4.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_4);

        jPanel_5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_5.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_5);

        jPanel_6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_6.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_6);

        jPanel_7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel_7.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_7);

        jPanel_8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_8.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_8);

        jPanel_9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_9.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_9);

        jPanel1.add(jPanel_GridHolder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(WhoseTurn);
        if(WhoseTurn.equalsIgnoreCase("X")){
        jButton2.setForeground(Color.red);
    }
        else{
            jButton2.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineifwin();
        tie_game();
        set_player_name();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(WhoseTurn);
        if(WhoseTurn.equalsIgnoreCase("X")){
        jButton1.setForeground(Color.red);
    }
        else{
            jButton1.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineifwin();
         tie_game();
         set_player_name();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(WhoseTurn);
        if(WhoseTurn.equalsIgnoreCase("X")){
        jButton3.setForeground(Color.red);
    }
        else{
            jButton3.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineifwin();
         tie_game();
         set_player_name();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(WhoseTurn);
        if(WhoseTurn.equalsIgnoreCase("X")){
        jButton4.setForeground(Color.red);
    }
        else{
            jButton4.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineifwin();
         tie_game();
         set_player_name();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(WhoseTurn);
        if(WhoseTurn.equalsIgnoreCase("X")){
        jButton5.setForeground(Color.red);
    }
        else{
            jButton5.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineifwin();
         tie_game();
         set_player_name();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(WhoseTurn);
        if(WhoseTurn.equalsIgnoreCase("X")){
        jButton6.setForeground(Color.red);
    }
        else{
            jButton6.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineifwin();
         tie_game();
         set_player_name();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       jButton7.setText(WhoseTurn);
       if(WhoseTurn.equalsIgnoreCase("X")){
        jButton7.setForeground(Color.red);
    }
        else{
            jButton7.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineifwin();
         tie_game();
         set_player_name();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       jButton8.setText(WhoseTurn);
       if(WhoseTurn.equalsIgnoreCase("X")){
        jButton8.setForeground(Color.red);
    }
        else{
            jButton8.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineifwin();
         tie_game();
         set_player_name();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(WhoseTurn);
        if(WhoseTurn.equalsIgnoreCase("X")){
        jButton9.setForeground(Color.red);
    }
        else{
            jButton9.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineifwin();
         tie_game();
         set_player_name();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel_score;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_6;
    private javax.swing.JPanel jPanel_7;
    private javax.swing.JPanel jPanel_8;
    private javax.swing.JPanel jPanel_9;
    private javax.swing.JPanel jPanel_GridHolder;
    // End of variables declaration//GEN-END:variables
}
