/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author midon7419
 */
public class SuperStringSoftwareForm extends javax.swing.JFrame {

    /**
     * Creates new form SuperStringSoftwareForm
     */
    public SuperStringSoftwareForm() {
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
        titlelbl = new javax.swing.JLabel();
        lengthtxt = new javax.swing.JTextField();
        lengthbtn = new javax.swing.JButton();
        lengthoutputlbl = new javax.swing.JLabel();
        lengthlbl = new javax.swing.JLabel();
        toUppertxt = new javax.swing.JTextField();
        toUpperbtn = new javax.swing.JButton();
        toUpperoutputlbl = new javax.swing.JLabel();
        toUpperlbl = new javax.swing.JLabel();
        charAttxt = new javax.swing.JTextField();
        charAtbtn = new javax.swing.JButton();
        charAtoutputlbl = new javax.swing.JLabel();
        charAtlbl = new javax.swing.JLabel();
        samelbl = new javax.swing.JLabel();
        sametxt1 = new javax.swing.JTextField();
        samebtn = new javax.swing.JButton();
        sameoutputlbl = new javax.swing.JLabel();
        sametxt2 = new javax.swing.JTextField();
        containslbl = new javax.swing.JLabel();
        containstxt1 = new javax.swing.JTextField();
        containsbtn = new javax.swing.JButton();
        containsoutputlbl = new javax.swing.JLabel();
        containstxt2 = new javax.swing.JTextField();
        charsAttxt = new javax.swing.JTextField();
        charsAtbtn = new javax.swing.JButton();
        charsAtoutputlbl = new javax.swing.JLabel();
        charsAtlbl = new javax.swing.JLabel();
        replacetxt = new javax.swing.JTextField();
        replacebtn = new javax.swing.JButton();
        replaceoutputlbl = new javax.swing.JLabel();
        replacelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlelbl.setFont(new java.awt.Font("Saved By Zero", 0, 24)); // NOI18N
        titlelbl.setText("Super String Software");

        lengthtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthtxtActionPerformed(evt);
            }
        });

        lengthbtn.setText("Calculate");
        lengthbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthbtnActionPerformed(evt);
            }
        });

        lengthoutputlbl.setText(" -- ");

        lengthlbl.setText("Enter a string. The program will output the number of characters in the string:");

        toUppertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toUppertxtActionPerformed(evt);
            }
        });

        toUpperbtn.setText("Calculate");
        toUpperbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toUpperbtnActionPerformed(evt);
            }
        });

        toUpperoutputlbl.setText(" -- ");

        toUpperlbl.setText("Enter a string using lowercase letters. The program will output the string in all capital letters: ");

        charAttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charAttxtActionPerformed(evt);
            }
        });

        charAtbtn.setText("Calculate");
        charAtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charAtbtnActionPerformed(evt);
            }
        });

        charAtoutputlbl.setText(" -- ");

        charAtlbl.setText("Enter a string. The program will output the character at the 4th spot: ");

        samelbl.setText("Enter two strings. The program will output whether or not they are identical:");

        sametxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sametxt1ActionPerformed(evt);
            }
        });

        samebtn.setText("Calculate");
        samebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samebtnActionPerformed(evt);
            }
        });

        sameoutputlbl.setText(" -- ");

        sametxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sametxt2ActionPerformed(evt);
            }
        });

        containslbl.setText("Enter a string and a letter. The program will output whether or not the letter is found in the string: ");

        containstxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                containstxt1ActionPerformed(evt);
            }
        });

        containsbtn.setText("Calculate");
        containsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                containsbtnActionPerformed(evt);
            }
        });

        containsoutputlbl.setText(" -- ");

        containstxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                containstxt2ActionPerformed(evt);
            }
        });

        charsAttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charsAttxtActionPerformed(evt);
            }
        });

        charsAtbtn.setText("Calculate");
        charsAtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charsAtbtnActionPerformed(evt);
            }
        });

        charsAtoutputlbl.setText(" -- ");

        charsAtlbl.setText("Enter a string that is at least 8 characters long. The program will output characters 4 to 6: ");

        replacetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replacetxtActionPerformed(evt);
            }
        });

        replacebtn.setText("Calculate");
        replacebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replacebtnActionPerformed(evt);
            }
        });

        replaceoutputlbl.setText(" -- ");

        replacelbl.setText("Enter a string that contains at least one a. The program will replace all concurrences of the letter a with x: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(replacelbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(replacetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(replacebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(replaceoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(charsAtlbl)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(charsAttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(charsAtbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(charsAtoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(containslbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(containstxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(containstxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(containsbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(containsoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(samelbl)
                                .addGap(156, 156, 156))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sametxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(sametxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(samebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sameoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(charAtlbl)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(charAttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(charAtbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(charAtoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lengthlbl)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lengthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(lengthbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lengthoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(titlelbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toUpperlbl)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(toUppertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(toUpperbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toUpperoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlelbl)
                .addGap(18, 18, 18)
                .addComponent(lengthlbl)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthbtn)
                    .addComponent(lengthoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toUpperlbl)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toUppertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toUpperbtn)
                    .addComponent(toUpperoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(charAtlbl)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(charAttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(charAtbtn)
                    .addComponent(charAtoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(samelbl)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sametxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(samebtn)
                    .addComponent(sameoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sametxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(containslbl)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(containstxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(containsbtn)
                    .addComponent(containsoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(containstxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(charsAtlbl)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(charsAttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(charsAtbtn)
                    .addComponent(charsAtoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(replacelbl)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(replacetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(replacebtn)
                    .addComponent(replaceoutputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lengthtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lengthtxtActionPerformed

    private void lengthbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthbtnActionPerformed
        //Length code
        
        //Input 
        String lengthInput;
        lengthInput = lengthtxt.getText();
        
        //String measurement
        lengthoutputlbl.setText(String.valueOf(lengthInput.length()));
    }//GEN-LAST:event_lengthbtnActionPerformed

    private void toUppertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toUppertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toUppertxtActionPerformed

    private void toUpperbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toUpperbtnActionPerformed
        //toUpper code
        //Input
        String toUpperInput;
        toUpperInput = toUppertxt.getText();
        
        toUpperoutputlbl.setText(toUpperInput.toUpperCase());
    }//GEN-LAST:event_toUpperbtnActionPerformed

    private void charAttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charAttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_charAttxtActionPerformed

    private void charAtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charAtbtnActionPerformed
        //charAt code
        //Input
        String charAtInput;
        charAtInput = charAttxt.getText();
        
        //Calculation
        char charAtResult = charAtInput.charAt(3);
        charAtoutputlbl.setText(String.valueOf(charAtResult));
        
    }//GEN-LAST:event_charAtbtnActionPerformed

    private void sametxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sametxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sametxt1ActionPerformed

    private void samebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samebtnActionPerformed
        //Same code
        //Variables
        String Input1;
        String Input2;
        Input1 = sametxt1.getText();
        Input2 = sametxt2.getText();
        
        if (Input1.equals(Input2)){
            sameoutputlbl.setText("They are the same");
        }
        else {
            sameoutputlbl.setText("Not the same");
        }
    }//GEN-LAST:event_samebtnActionPerformed

    private void sametxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sametxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sametxt2ActionPerformed

    private void containstxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_containstxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_containstxt1ActionPerformed

    private void containsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_containsbtnActionPerformed
        //contains code
        //inputs
        String Input1;
        String Input2;
        Input1 = containstxt1.getText();
        Input2 = containstxt2.getText();
        containsoutputlbl.setText(String.valueOf(Input1.contains(Input2)));
      
    }//GEN-LAST:event_containsbtnActionPerformed

    private void containstxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_containstxt2ActionPerformed
        
        
    }//GEN-LAST:event_containstxt2ActionPerformed

    private void charsAttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charsAttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_charsAttxtActionPerformed

    private void charsAtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charsAtbtnActionPerformed
       //charsAt code
       //Inputs
        String Input;
        Input = charsAttxt.getText();
        //Letters
        char letter3 = Input.charAt(3);
        char letter4 = Input.charAt(4);
        char letter5 = Input.charAt(5);
        //output
        String result = (String.valueOf(letter3) + String.valueOf(letter4) + String.valueOf(letter5));
        charsAtoutputlbl.setText(result);
    }//GEN-LAST:event_charsAtbtnActionPerformed

    private void replacetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replacetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_replacetxtActionPerformed

    private void replacebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replacebtnActionPerformed
        //Replace code
        //Input
        String Input;
        Input = replacetxt.getText();
        String result = Input.replace("a", "x");
        replaceoutputlbl.setText(result);
        
    }//GEN-LAST:event_replacebtnActionPerformed

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
            java.util.logging.Logger.getLogger(SuperStringSoftwareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperStringSoftwareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperStringSoftwareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperStringSoftwareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperStringSoftwareForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton charAtbtn;
    private javax.swing.JLabel charAtlbl;
    private javax.swing.JLabel charAtoutputlbl;
    private javax.swing.JTextField charAttxt;
    private javax.swing.JButton charsAtbtn;
    private javax.swing.JLabel charsAtlbl;
    private javax.swing.JLabel charsAtoutputlbl;
    private javax.swing.JTextField charsAttxt;
    private javax.swing.JButton containsbtn;
    private javax.swing.JLabel containslbl;
    private javax.swing.JLabel containsoutputlbl;
    private javax.swing.JTextField containstxt1;
    private javax.swing.JTextField containstxt2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lengthbtn;
    private javax.swing.JLabel lengthlbl;
    private javax.swing.JLabel lengthoutputlbl;
    private javax.swing.JTextField lengthtxt;
    private javax.swing.JButton replacebtn;
    private javax.swing.JLabel replacelbl;
    private javax.swing.JLabel replaceoutputlbl;
    private javax.swing.JTextField replacetxt;
    private javax.swing.JButton samebtn;
    private javax.swing.JLabel samelbl;
    private javax.swing.JLabel sameoutputlbl;
    private javax.swing.JTextField sametxt1;
    private javax.swing.JTextField sametxt2;
    private javax.swing.JLabel titlelbl;
    private javax.swing.JButton toUpperbtn;
    private javax.swing.JLabel toUpperlbl;
    private javax.swing.JLabel toUpperoutputlbl;
    private javax.swing.JTextField toUppertxt;
    // End of variables declaration//GEN-END:variables
}
