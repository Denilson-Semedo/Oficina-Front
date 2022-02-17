/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;

import HttpRequests.UtilizadorRequest;
import java.awt.Cursor;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.AuthData;
import models.Constant;
import models.Tipo_Utilizador;
import models.Utilizador;

/**
 *
 * @author Denilson
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */

    public void ajustar_logo(){
        ImageIcon icon = new ImageIcon("./imagens/carLogo2.png");
        Image img = icon.getImage();
        Image foto = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon foto_ajustada = new ImageIcon(foto);
        jLabel5.setIcon(foto_ajustada);
    }
    static List<Tipo_Utilizador> getTipo_uti = new ArrayList();
    static Tipo_Utilizador tipo_uti = new Tipo_Utilizador();
    static Utilizador uti_atual = null;
    private UtilizadorRequest utilizador_request = new UtilizadorRequest();

    public TelaLogin() {
        initComponents();
        ajustar_logo();
    }

    public static List<Tipo_Utilizador> getGetTipo_uti() {
        return getTipo_uti;
    }

    public static void setGetTipo_uti(List<Tipo_Utilizador> getTipo_uti) {
        TelaLogin.getTipo_uti = getTipo_uti;
    }

    public static Tipo_Utilizador getTipo_uti() {
        return tipo_uti;
    }

    public static void setTipo_uti(Tipo_Utilizador tipo_uti) {
        TelaLogin.tipo_uti = tipo_uti;
    }

    public static Utilizador getUti_atual() {
        return uti_atual;
    }

    public static void setUti_atual(Utilizador uti_atual) {
        TelaLogin.uti_atual = uti_atual;
    }

    public boolean validacaoDeCampos() {

        boolean msg = false;

        String senha = String.valueOf(passwordTxt.getText());

        if (usernameTxt.getText().equals("") && senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos!!");
            msg = false;
        } else if (usernameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo username vazio!!");
            msg = false;
        } else if (senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo password vazio!!");
            msg = false;
        } else {
            msg = true;
        }
        return msg;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usernameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Logar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        passwordTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(829, 421));

        jPanel2.setBackground(new java.awt.Color(250, 251, 251));

        jLabel6.setFont(new java.awt.Font("Quicksand Medium", 2, 18)); // NOI18N
        jLabel6.setText("Comprometido com a qualidade.  ");

        jLabel7.setFont(new java.awt.Font("Quicksand Medium", 2, 18)); // NOI18N
        jLabel7.setText("Comprometido com você.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel7))))
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(8, 32, 50));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bem-Vindo");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 213, 290, 10));

        usernameTxt.setBackground(new java.awt.Color(8, 32, 50));
        usernameTxt.setForeground(new java.awt.Color(255, 255, 255));
        usernameTxt.setBorder(null);
        usernameTxt.setCaretColor(new java.awt.Color(255, 255, 255));
        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });
        jPanel3.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 290, 30));

        jLabel3.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Palavra-Passe");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome utilizador");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        Logar.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        Logar.setForeground(new java.awt.Color(8, 32, 50));
        Logar.setText("Entrar");
        Logar.setBorder(null);
        Logar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogarMouseClicked(evt);
            }
        });
        Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogarActionPerformed(evt);
            }
        });
        jPanel3.add(Logar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 100, 42));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oficina/imagens/undraw_towing_6yy4.png"))); // NOI18N
        jLabel1.setText("Imagen ILUSTRATIVA");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 256, 1040, 560));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 290, 10));

        passwordTxt.setBackground(new java.awt.Color(8, 32, 50));
        passwordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxt.setBorder(null);
        passwordTxt.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        jPanel3.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 290, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void LogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LogarMouseClicked

    private void LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogarActionPerformed
        // TODO add your handling code here:
        /*if (validacaoDeCampos()) {
            setCursor(Cursor.WAIT_CURSOR);

            String senha = String.valueOf(passwordTxt.getText());
            
            String token = utilizador_request.loginUti(usernameTxt.getText(), senha);
//            String token = utilizador_request.loginUti("Joananita6574", "na6574");
            AuthData.token = token;

            uti_atual = utilizador_request.GetUser(usernameTxt.getText());

            if (uti_atual != null) {

//                getTipo_uti = utilizador_request.getTipoUti(usernameTxt.getText());
                AuthData.user = uti_atual;
                
                getTipo_uti = uti_atual.getTipo_utilizador();

                if (getTipo_uti != null) {

                    if (getTipo_uti.get(0).getNome().equals(Constant.UserTypes.MECANICO)) {

                        tipo_uti = new Tipo_Utilizador(getTipo_uti.get(0).getId_tipo_utilizador(), getTipo_uti.get(0).getNome());
                        
                        new TelaPrincipalMecanico().setVisible(true);
                        this.setVisible(false);
//                        setCursor(Cursor.DEFAULT_CURSOR);

                    } else if (getTipo_uti.get(0).getNome().equals(Constant.UserTypes.COORDENADOR)) {

                        tipo_uti = new Tipo_Utilizador(getTipo_uti.get(0).getId_tipo_utilizador(), getTipo_uti.get(0).getNome());
                        
                        new TelaPrincipal().setVisible(true);
                        this.setVisible(false);
//                        setCursor(Cursor.DEFAULT_CURSOR);

                    } else {
                        JOptionPane.showMessageDialog(null, "Esse perfil de uti não pertence ao coordenador e nem ao mecanico!!");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "erro login!!");
            }
        }*/
    }//GEN-LAST:event_LogarActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    public void setCursor (int type){
        Cursor cursor = new Cursor(type);
        this.setCursor(cursor);
        this.setVisible(true);
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
