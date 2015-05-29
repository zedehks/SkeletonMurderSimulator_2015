/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waldonavas
 */
import java.util.Random;
import javax.swing.ImageIcon;
public class FightingGameGUI extends javax.swing.JFrame 
{
    Random rng_jesus = new Random();
    

    /**
     * Creates new form FightingGameGUI
     */
    public FightingGameGUI() 
    {
        initComponents();
        SkeleDed.setVisible(false);
        RangerDed.setVisible(false);
        again.setVisible(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RangerSprite = new javax.swing.JLabel();
        SpookySprite = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        slash = new javax.swing.JButton();
        stab = new javax.swing.JButton();
        heal = new javax.swing.JButton();
        heals = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spooky_health = new javax.swing.JLabel();
        player_health = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        spookyheal = new javax.swing.JLabel();
        RangerDed = new javax.swing.JLabel();
        again = new javax.swing.JButton();
        SkeleDed = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Skeleton Murder Simulator 2015");
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RangerSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Ranger.png"))); // NOI18N
        getContentPane().add(RangerSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 220, -1));

        SpookySprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Agitation.png"))); // NOI18N
        getContentPane().add(SpookySprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 290, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ranger"));
        jPanel1.setToolTipText("Ranger");
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 150));

        slash.setText("Hack");
        slash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slashActionPerformed(evt);
            }
        });

        stab.setText("Chop");
        stab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stabActionPerformed(evt);
            }
        });

        heal.setText("Heal");
        heal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healActionPerformed(evt);
            }
        });

        heals.setText("3");

        jLabel1.setText("left");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(slash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(heal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(heals)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {slash, stab});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stab)
                .addGap(2, 2, 2)
                .addComponent(slash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heal)
                    .addComponent(heals)
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 150));

        spooky_health.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
        spooky_health.setText("100");
        getContentPane().add(spooky_health, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        player_health.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
        player_health.setText("100");
        getContentPane().add(player_health, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        console.setEditable(false);
        console.setColumns(20);
        console.setRows(5);
        jScrollPane1.setViewportView(console);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 460, 140));

        jLabel2.setText("Heals:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        spookyheal.setText("3");
        getContentPane().add(spookyheal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        RangerDed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Rangerded.png"))); // NOI18N
        getContentPane().add(RangerDed, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        again.setText("Again?");
        again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                againActionPerformed(evt);
            }
        });
        getContentPane().add(again, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        SkeleDed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Skeleded.png"))); // NOI18N
        getContentPane().add(SkeleDed, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slashActionPerformed
        
        int spookyhealth = Integer.parseInt(spooky_health.getText());
        int playerhealth = Integer.parseInt(player_health.getText());
        int milk4bones = Integer.parseInt(spookyheal.getText());
        //String console_output = String.getText(console);
        
        int player_slash = rng_jesus.nextInt(26);
        int spooky_slash = (rng_jesus.nextInt(14)+5);
        int spooky_stab = (rng_jesus.nextInt(14)+5);
        int spooky_attack = rng_jesus.nextInt(3)+1;
        
        console.append("\nPlayer hacks at Skeleton for "+player_slash+" damage."); 
        
        
        switch (spooky_attack)
        {
            case 1://spooky slash
                playerhealth -= spooky_slash;
                console.append("\nSkeleton pummels Player for "+spooky_slash+" damage.\n"); 
                break;
            case 2://spooky stab
                playerhealth -= spooky_stab;
                console.append("\nSkeleton stabs Player for "+spooky_slash+" damage.\n"); 
                break;
            case 3://spooky heal
                if (milk4bones > 0)
                {
                milk4bones--;
                spookyhealth += 25;
                console.append("\nSkeleton drinks milk, healing 25 hp.\n");
                spookyheal.setText(String.valueOf(milk4bones));
                }
                else
                {
                    player_slash = 0;
                    console.append("\nDistraught at the lack of milk, Skeleton cries tears of pure calcium, \nsomehow protecting him of all damage.\n");
                }
        }
        
        spookyhealth -= player_slash;
       // playerhealth -= spooky_attackstrength;
        
        spooky_health.setText(String.valueOf(spookyhealth));
        player_health.setText(String.valueOf(playerhealth));
        if (playerhealth < 1 || spookyhealth < 1)
        {
            stab.setEnabled(false);
            slash.setEnabled(false);
            heal.setEnabled(false);
            if(playerhealth < 1 && spookyhealth < 1)
            {
                RangerSprite.setVisible(false);
                SpookySprite.setVisible(false);
                SkeleDed.setVisible(true);
                RangerDed.setVisible(true);
                
                console.append("\n\nThe battle was so intense both of you killed yourselves simultaneously. \nIdiots. ");
            }
            else if(playerhealth < spookyhealth)
            {
                RangerSprite.setVisible(false);
                RangerDed.setVisible(true);
                console.append("\n\nGame over. The skeleton has vanquished you.");
            }
            else if(playerhealth > spookyhealth)
            {
                SpookySprite.setVisible(false);
                SkeleDed.setVisible(true);
                console.append("\n\nThus we see the superiority of flesh and blood over calcium. \nCongratulations.");
            }
            again.setVisible(true);
            
        }
        
        
        
    }//GEN-LAST:event_slashActionPerformed

    private void stabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stabActionPerformed
        
        int spookyhealth = Integer.parseInt(spooky_health.getText());
        int playerhealth = Integer.parseInt(player_health.getText());
        int milk4bones = Integer.parseInt(spookyheal.getText());
        
        int player_stab = (rng_jesus.nextInt(5)+8);
        int spooky_slash = (rng_jesus.nextInt(14)+5);
        int spooky_stab = (rng_jesus.nextInt(14)+5);
        int spooky_attack = rng_jesus.nextInt(3)+1;
        console.append("\nPlayer chops Skeleton for "+player_stab+" damage."); 
        
        switch (spooky_attack)
        {
            case 1://spooky slash
                playerhealth -= spooky_slash;
                console.append("\nSkeleton pummels Player for "+spooky_slash+" damage.\n"); 
                break;
            case 2://spooky stab
                playerhealth -= spooky_stab;
                console.append("\nSkeleton stabs Player for "+spooky_slash+" damage.\n"); 
                break;
            case 3://spooky heal
                if (milk4bones > 0)
                {
                milk4bones--;
                spookyhealth += 25;
                console.append("\nSkeleton drinks milk, healing 25 hp.\n");
                spookyheal.setText(String.valueOf(milk4bones));
                }
                else
                {
                    player_stab = 0;
                    console.append("\nDistraught at the lack of milk, Skeleton cries tears of pure calcium, \nsomehow protecting him of all damage.\n");
                }
                
        }
        
        
        spookyhealth -= player_stab;
       // playerhealth -= spooky_attackstrength;
        
        spooky_health.setText(String.valueOf(spookyhealth));
        
        player_health.setText(String.valueOf(playerhealth));
        if (playerhealth < 1 || spookyhealth < 1)
        {
            stab.setEnabled(false);
            slash.setEnabled(false);
            heal.setEnabled(false);
            if(playerhealth < 1 && spookyhealth < 1)
            {
                RangerSprite.setVisible(false);
                SpookySprite.setVisible(false);
                SkeleDed.setVisible(true);
                RangerDed.setVisible(true);
                
                console.append("\n\nThe battle was so intense both of you killed yourselves simultaneously. \nIdiots. ");
            }
            else if(playerhealth < spookyhealth)
            {
                RangerSprite.setVisible(false);
                RangerDed.setVisible(true);
                console.append("\n\nGame over. The skeleton has vanquished you.");
            }
            else if(playerhealth > spookyhealth)
            {
                SpookySprite.setVisible(false);
                SkeleDed.setVisible(true);
                console.append("\n\nThus we see the superiority of flesh and blood over calcium. \nCongratulations.");
            }
            again.setVisible(true);
            
        }
    }//GEN-LAST:event_stabActionPerformed

    private void healActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healActionPerformed
        int player_heals = Integer.parseInt(heals.getText());
        int spookyhealth = Integer.parseInt(spooky_health.getText());
        int milk4bones = Integer.parseInt(spookyheal.getText());
        
        int playerhealth = Integer.parseInt(player_health.getText());
        int spooky_slash = (rng_jesus.nextInt(14)+5);
        int spooky_stab = (rng_jesus.nextInt(14)+5);
        int spooky_attack = rng_jesus.nextInt(3)+1;
        
        
        if (player_heals > 0)
	{
            playerhealth += 25;
             player_heals--;
             if (player_heals == 0)
                 heal.setEnabled(false);
	}
        /*else 
            heal.setEnabled(false);*/
        console.append("\nPlayer heals 25 hp.");
        
        switch (spooky_attack)
        {
            case 1://spooky slash
                playerhealth -= spooky_slash;
                console.append("\nSkeleton pummels Player for "+spooky_slash+" damage.\n"); 
                break;
            case 2://spooky stab
                playerhealth -= spooky_stab;
                console.append("\nSkeleton stabs Player for "+spooky_slash+" damage.\n"); 
                break;
            case 3://spooky heal
                if (milk4bones > 0)
                {
                milk4bones--;
                spookyhealth += 25;
                console.append("\nSkeleton drinks milk, healing 25 hp.\n");
                spookyheal.setText(String.valueOf(milk4bones));
                }
                else
                {
                    //player_slash = 0;
                    console.append("\nDistraught at the lack of milk, Skeleton cries tears of pure calcium, \nsomehow protecting him of all damage.\n");
                }
        }
                
    
        //playerhealth -= spooky_attackstrength;
        player_health.setText(String.valueOf(playerhealth));
        heals.setText(String.valueOf(player_heals));
        //playerhealth -= spooky_attackstrength;
        if (playerhealth < 1 || spookyhealth < 1)
        {
            stab.setEnabled(false);
            slash.setEnabled(false);
            heal.setEnabled(false);
            if(playerhealth < 1 && spookyhealth < 1)
            {
                RangerSprite.setVisible(false);
                SpookySprite.setVisible(false);
                SkeleDed.setVisible(true);
                RangerDed.setVisible(true);
                
                console.append("\n\nThe battle was so intense both of you killed yourselves simultaneously. \nIdiots. ");
            }
            else if(playerhealth < spookyhealth)
            {
                RangerSprite.setVisible(false);
                RangerDed.setVisible(true);
                console.append("\n\nGame over. The skeleton has vanquished you.");
            }
            else if(playerhealth > spookyhealth)
            {
                SpookySprite.setVisible(false);
                SkeleDed.setVisible(true);
                console.append("\n\nThus we see the superiority of flesh and blood over calcium. \nCongratulations.");
            }
            again.setVisible(true);
            
        }
        
    }//GEN-LAST:event_healActionPerformed

    private void againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_againActionPerformed
        RangerSprite.setVisible(true);
        SpookySprite.setVisible(true);
        SkeleDed.setVisible(false);
        RangerDed.setVisible(false);
        
        spooky_health.setText(String.valueOf("100"));
        spookyheal.setText(String.valueOf("3"));
        player_health.setText(String.valueOf("100"));
        heals.setText(String.valueOf("3"));
        again.setVisible(false);
        stab.setEnabled(true);
            slash.setEnabled(true);
            heal.setEnabled(true);
        int taunt = rng_jesus.nextInt(12);
        switch (taunt)
        {
            case 0:
                console.setText("\"They never learn…\"\n");
                break;
            case 1:
                console.setText("\"Another fresh victim for the evergrowing\narmy of the undead!\"\n");
                break;
            case 2:
                console.setText("\"…Crafty goddamn murder mutants!\"\n");
                break;
            case 3:
                console.setText("\"Shazbot!\"\n");
                break;
            case 4:
                console.setText("\"Look behind you.\"\n");
                break;
            case 5:
                console.setText("Skeleton: \"AAAAAAAAAAAAAAAAAAAAAAAAAA-\"\n");
                break;
            case 6:
                console.setText("\"When will it end?\"\n");
                break;
            case 7:
                console.setText("\"Un autre?! Merde.\"\n");
                break;
            case 8:
                console.setText("\"Ein anderes?! Nein, nein, nein, nein,\nnein, nein, nein!\"\n");
                break;
            case 9:
                console.setText("\"¡¿Ótro?! Por la grandisima-\"\n");
                break;
            case 10:
                console.setText("\"Bo-nee sheetuh-assu,  go hoh-mu pureesu! \"\n");
                break;
            case 11:
                console.setText("\"I should really go to bed.\"\n");
                break;
        }
        
        
        
        
    }//GEN-LAST:event_againActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(FightingGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FightingGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FightingGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FightingGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new FightingGameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RangerDed;
    private javax.swing.JLabel RangerSprite;
    private javax.swing.JLabel SkeleDed;
    private javax.swing.JLabel SpookySprite;
    private javax.swing.JButton again;
    private javax.swing.JTextArea console;
    private javax.swing.JButton heal;
    private javax.swing.JLabel heals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel player_health;
    private javax.swing.JButton slash;
    private javax.swing.JLabel spooky_health;
    private javax.swing.JLabel spookyheal;
    private javax.swing.JButton stab;
    // End of variables declaration//GEN-END:variables
}
