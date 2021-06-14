/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;

/**
 *
 * @author briananjune
 */
public class CDBCustomerUI extends javax.swing.JFrame {

    /**
     * Creates new form DBAdmin
     */
    Color DefaultColor,ClickedColor,HoverColor;
    public CDBCustomerUI() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultColor=new Color(240,240,240);
        ClickedColor=new Color(0,204,204);
        HoverColor=new Color(204,255,255);
        
        //Set default color to pan on run time
        CHome.setBackground(DefaultColor);
        COrderIns.setBackground(DefaultColor);
        COrderAcc.setBackground(DefaultColor);
        CRequestRJ.setBackground(DefaultColor);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CMenu = new javax.swing.JPanel();
        CHome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        COrderIns = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        COrderAcc = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CRequestRJ = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CLogo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        StatusBar = new javax.swing.JPanel();
        MusicMartTxt = new javax.swing.JLabel();
        MenuName = new javax.swing.JLabel();
        CDesktop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CMenu.setBackground(new java.awt.Color(102, 102, 102));

        CHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CHomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CHomeMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Home");

        javax.swing.GroupLayout CHomeLayout = new javax.swing.GroupLayout(CHome);
        CHome.setLayout(CHomeLayout);
        CHomeLayout.setHorizontalGroup(
            CHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CHomeLayout.setVerticalGroup(
            CHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        COrderIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COrderInsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                COrderInsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                COrderInsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                COrderInsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                COrderInsMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Order Instruments");

        javax.swing.GroupLayout COrderInsLayout = new javax.swing.GroupLayout(COrderIns);
        COrderIns.setLayout(COrderInsLayout);
        COrderInsLayout.setHorizontalGroup(
            COrderInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(COrderInsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        COrderInsLayout.setVerticalGroup(
            COrderInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        COrderAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COrderAccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                COrderAccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                COrderAccMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                COrderAccMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                COrderAccMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Order Accerssories");

        javax.swing.GroupLayout COrderAccLayout = new javax.swing.GroupLayout(COrderAcc);
        COrderAcc.setLayout(COrderAccLayout);
        COrderAccLayout.setHorizontalGroup(
            COrderAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(COrderAccLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        COrderAccLayout.setVerticalGroup(
            COrderAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        CRequestRJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CRequestRJMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CRequestRJMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CRequestRJMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CRequestRJMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CRequestRJMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Request Repair Job");

        javax.swing.GroupLayout CRequestRJLayout = new javax.swing.GroupLayout(CRequestRJ);
        CRequestRJ.setLayout(CRequestRJLayout);
        CRequestRJLayout.setHorizontalGroup(
            CRequestRJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRequestRJLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CRequestRJLayout.setVerticalGroup(
            CRequestRJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        CLogo.setPreferredSize(new java.awt.Dimension(171, 100));
        CLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        CLogo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 90));

        javax.swing.GroupLayout CMenuLayout = new javax.swing.GroupLayout(CMenu);
        CMenu.setLayout(CMenuLayout);
        CMenuLayout.setHorizontalGroup(
            CMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(COrderAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(COrderIns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CRequestRJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        CMenuLayout.setVerticalGroup(
            CMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CMenuLayout.createSequentialGroup()
                .addComponent(CLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(COrderIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(COrderAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CRequestRJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        getContentPane().add(CMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 540));

        StatusBar.setBackground(new java.awt.Color(0, 204, 204));

        MusicMartTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MusicMartTxt.setForeground(new java.awt.Color(255, 255, 255));
        MusicMartTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MusicMartTxt.setText("Music Mart");

        MenuName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MenuName.setForeground(new java.awt.Color(255, 255, 255));
        MenuName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuName.setText("Customer");

        javax.swing.GroupLayout StatusBarLayout = new javax.swing.GroupLayout(StatusBar);
        StatusBar.setLayout(StatusBarLayout);
        StatusBarLayout.setHorizontalGroup(
            StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatusBarLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StatusBarLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(MusicMartTxt))
                    .addComponent(MenuName, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );
        StatusBarLayout.setVerticalGroup(
            StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatusBarLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(MusicMartTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuName)
                .addGap(25, 25, 25))
        );

        getContentPane().add(StatusBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 650, -1));

        CDesktop.setBackground(new java.awt.Color(204, 204, 204));
        CDesktop.setPreferredSize(new java.awt.Dimension(650, 440));

        jLabel1.setPreferredSize(new java.awt.Dimension(650, 440));

        javax.swing.GroupLayout CDesktopLayout = new javax.swing.GroupLayout(CDesktop);
        CDesktop.setLayout(CDesktopLayout);
        CDesktopLayout.setHorizontalGroup(
            CDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(CDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CDesktopLayout.setVerticalGroup(
            CDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
            .addGroup(CDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CDesktopLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(CDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 650, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHomeMouseClicked
        CHome home = new CHome ();
        CDesktop.removeAll();
        CDesktop.add(home).setVisible(true);
    }//GEN-LAST:event_CHomeMouseClicked

    private void COrderInsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COrderInsMouseClicked
        // TODO add your handling code here:
        COrderInstruments Oi = new COrderInstruments();
        CDesktop.removeAll();
        CDesktop.add(Oi).setVisible(true);
               
    }//GEN-LAST:event_COrderInsMouseClicked

    private void COrderAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COrderAccMouseClicked
        
        COrderAccessories ac = new COrderAccessories();
        CDesktop.removeAll();
        CDesktop.add(ac).setVisible(true);
    }//GEN-LAST:event_COrderAccMouseClicked

    private void CRequestRJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRequestRJMouseClicked
        // TODO add your handling code here:
        CRequestRepairJob rj = new CRequestRepairJob();
        CDesktop.removeAll();
        CDesktop.add(rj).setVisible(true);
    }//GEN-LAST:event_CRequestRJMouseClicked

    private void CHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHomeMouseEntered
        // TODO add your handling code here:
        CHome.setBackground(HoverColor);
        
        COrderIns.setBackground(DefaultColor);
        COrderAcc.setBackground(DefaultColor);
        CRequestRJ.setBackground(DefaultColor);
    }//GEN-LAST:event_CHomeMouseEntered

    private void COrderInsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COrderInsMouseEntered
        // TODO add your handling code here:
        COrderIns.setBackground(HoverColor);
        
        CHome.setBackground(DefaultColor);
        COrderAcc.setBackground(DefaultColor);
        CRequestRJ.setBackground(DefaultColor);
    }//GEN-LAST:event_COrderInsMouseEntered

    private void COrderAccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COrderAccMouseEntered
        // TODO add your handling code here:
        COrderAcc.setBackground(HoverColor);
        
        CHome.setBackground(DefaultColor);
        COrderIns.setBackground(DefaultColor);
        CRequestRJ.setBackground(DefaultColor);
    }//GEN-LAST:event_COrderAccMouseEntered

    private void CRequestRJMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRequestRJMouseEntered
        // TODO add your handling code here:
        CRequestRJ.setBackground(HoverColor);
        
        CHome.setBackground(DefaultColor);
        COrderIns.setBackground(DefaultColor);
        COrderAcc.setBackground(DefaultColor);
    }//GEN-LAST:event_CRequestRJMouseEntered

    private void CHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHomeMouseExited
        // TODO add your handling code here:
        CHome.setBackground(DefaultColor);
    }//GEN-LAST:event_CHomeMouseExited

    private void COrderInsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COrderInsMouseExited
        // TODO add your handling code here:
        COrderIns.setBackground(DefaultColor);
    }//GEN-LAST:event_COrderInsMouseExited

    private void COrderAccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COrderAccMouseExited
        // TODO add your handling code here:
        COrderAcc.setBackground(DefaultColor);
    }//GEN-LAST:event_COrderAccMouseExited

    private void CRequestRJMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRequestRJMouseExited
        // TODO add your handling code here:
        CRequestRJ.setBackground(DefaultColor);
    }//GEN-LAST:event_CRequestRJMouseExited

    private void CHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHomeMousePressed
        // TODO add your handling code here:
        CHome.setBackground(ClickedColor);
        
        MenuName.setText("Home");
    }//GEN-LAST:event_CHomeMousePressed

    private void COrderInsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COrderInsMousePressed
        // TODO add your handling code here:
        COrderIns.setBackground(ClickedColor);
        
        MenuName.setText("Order Instruments");
    }//GEN-LAST:event_COrderInsMousePressed

    private void COrderAccMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COrderAccMousePressed
        // TODO add your handling code here:
        COrderAcc.setBackground(ClickedColor);
        
        MenuName.setText("Order Accersories");
    }//GEN-LAST:event_COrderAccMousePressed

    private void CRequestRJMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRequestRJMousePressed
        // TODO add your handling code here:
        CRequestRJ.setBackground(ClickedColor);
        
        MenuName.setText("Request Repair Job");
    }//GEN-LAST:event_CRequestRJMousePressed

    private void CHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHomeMouseReleased
        // TODO add your handling code here:
        CHome.setBackground(ClickedColor);
    }//GEN-LAST:event_CHomeMouseReleased

    private void COrderInsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COrderInsMouseReleased
        // TODO add your handling code here:
        COrderIns.setBackground(ClickedColor);
    }//GEN-LAST:event_COrderInsMouseReleased

    private void COrderAccMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COrderAccMouseReleased
        // TODO add your handling code here:
        COrderAcc.setBackground(ClickedColor);
    }//GEN-LAST:event_COrderAccMouseReleased

    private void CRequestRJMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRequestRJMouseReleased
        // TODO add your handling code here:
        CRequestRJ.setBackground(ClickedColor);
    }//GEN-LAST:event_CRequestRJMouseReleased

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
            java.util.logging.Logger.getLogger(CDBCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CDBCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CDBCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CDBCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CDBCustomerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CDesktop;
    private javax.swing.JPanel CHome;
    private javax.swing.JPanel CLogo;
    private javax.swing.JPanel CMenu;
    private javax.swing.JPanel COrderAcc;
    private javax.swing.JPanel COrderIns;
    private javax.swing.JPanel CRequestRJ;
    private javax.swing.JLabel MenuName;
    private javax.swing.JLabel MusicMartTxt;
    private javax.swing.JPanel StatusBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
