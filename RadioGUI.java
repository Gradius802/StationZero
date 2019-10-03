/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.awt.event.ActionEvent;

/**
 *
 * @author cim111
 */
public class RadioGUI extends javax.swing.JPanel {

    /**
     * Creates new form RadioGUI
     */
    public RadioGUI() {
        initComponents();
    }
    
private void power(ActionEvent event) {                          
    //when button is pressed power button turns on or off
    display.setText("");
    display.setEnabled(false);
    
}                         

private void bandSwitch(ActionEvent event)
{
    
}
    
private void forward(ActionEvent event)
{
    
}

private void back(ActionEvent event)
{
    
}

private void setFavorite(ActionEvent event)
{
    
}

private void favoriteOne(ActionEvent event)
{
    
}

private void favoriteTwo(ActionEvent event)
{
    
}

private void favoriteThree(ActionEvent event)
{
    
}

private void favoriteFour(ActionEvent event)
{
    
}

private void favoriteFive(ActionEvent event)
{
    
}

private void favoriteSix(ActionEvent event)
{
    
}


public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : 
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RadioGUI().setVisible(true);
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

        power = new javax.swing.JToggleButton();
        bandSwitch = new javax.swing.JToggleButton();
        favoriteOne = new javax.swing.JButton();
        favoriteTwo = new javax.swing.JButton();
        favoriteThree = new javax.swing.JButton();
        favoriteFour = new javax.swing.JButton();
        favoriteFive = new javax.swing.JButton();
        favoriteSix = new javax.swing.JButton();
        setFavorite = new javax.swing.JButton();
        back = new javax.swing.JButton();
        forward = new javax.swing.JButton();
        display = new javax.swing.JTextField();

        power.setText("On");
        power.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bandSwitch.setText("AM");
        bandSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandSwitchActionPerformed(evt);
            }
        });

        favoriteOne.setText("1");

        favoriteTwo.setText("2");

        favoriteThree.setText("3");

        favoriteFour.setText("4");

        favoriteFive.setText("5");

        favoriteSix.setText("6");

        setFavorite.setText("Set");

        back.setText("<<");

        forward.setText(">>");

        display.setFont(display.getFont().deriveFont(display.getFont().getStyle() | java.awt.Font.BOLD, 30));
        display.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(power)
                            .addComponent(bandSwitch))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(setFavorite)
                                .addGap(18, 18, 18)
                                .addComponent(forward))
                            .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(favoriteOne)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(favoriteTwo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(favoriteThree)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(favoriteFour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(favoriteFive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(favoriteSix)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(power)
                        .addGap(18, 18, 18)
                        .addComponent(bandSwitch))
                    .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(forward)
                    .addComponent(setFavorite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favoriteTwo)
                    .addComponent(favoriteOne)
                    .addComponent(favoriteThree)
                    .addComponent(favoriteFour)
                    .addComponent(favoriteFive)
                    .addComponent(favoriteSix))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        power.addActionListener((ActionEvent event) -> {
            power(event);
        });
        favoriteOne.addActionListener((ActionEvent event) -> {
            favoriteOne(event);
        });
        favoriteTwo.addActionListener((ActionEvent event) -> {
            favoriteTwo(event);
        });
        favoriteThree.addActionListener((ActionEvent event) -> {
            favoriteThree(event);
        });
        favoriteFour.addActionListener((ActionEvent event) -> {
            favoriteFour(event);
        });
        favoriteFive.addActionListener((ActionEvent event) -> {
            favoriteFive(event);
        });
        favoriteSix.addActionListener((ActionEvent event) -> {
            favoriteSix(event);
        });
        setFavorite.addActionListener((ActionEvent event) -> {
            setFavorite(event);
        });
        back.addActionListener((ActionEvent event) -> {
            back(event);
        });
        forward.addActionListener((ActionEvent event) -> {
            forward(event);
        });
    }// </editor-fold>//GEN-END:initComponents

    private void bandSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandSwitchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bandSwitchActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JToggleButton bandSwitch;
    private javax.swing.JTextField display;
    private javax.swing.JButton favoriteFive;
    private javax.swing.JButton favoriteFour;
    private javax.swing.JButton favoriteOne;
    private javax.swing.JButton favoriteSix;
    private javax.swing.JButton favoriteThree;
    private javax.swing.JButton favoriteTwo;
    private javax.swing.JButton forward;
    private javax.swing.JToggleButton power;
    private javax.swing.JButton setFavorite;
    // End of variables declaration//GEN-END:variables
}
