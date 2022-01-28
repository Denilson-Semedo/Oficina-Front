/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuContents;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Denilson
 */
public class Mecanicos extends javax.swing.JPanel {

    /**
     * Creates new form Perfil
     */
    
    /*public boolean preencherTabela() {

        boolean msg = false;

        listaMecanicos = Mecanicos_request.getMecanicos();

        if (!listaMecanicos.isEmpty()) {
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.getDataVector().removeAllElements();
            listaMecanicos.forEach((valor) -> {

                //model.addRow(new Object[]{valor.getNome(), valor.getQuantidade(), valor.getCoordenador().getNome()});

            });
            msg = true;
        } else {
            msg = false;
        }
        return msg;
    }*/
    
    /*public void preencherTabela(){
        String colunas[] = {"Nome","Morada","Salário","INPS","NIF","Data início","Data Fim","Estado"};
        Object dados[][] = {
            {"Jardel Moreno","Ponta d'agua","15000","875644","8976543","-","-","efetivo"}
        };
        
        DefaultTableModel model = new DefaultTableModel (dados,colunas);
        jTable3.setModel(model);
    }*/
    
    public void preencherTabela(){
        
    }
    
    public Mecanicos() {
        initComponents();
        preencherTabela();
        jTable3.getTableHeader().setFont(new Font("Quicksand Medium", 0, 15));
        jTable3.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // do some actions here, for example
                // print first column value from selected row
                //System.out.println(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString());
                new Mecanico_Desc().setVisible(true);
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 251, 251));
        setMaximumSize(new java.awt.Dimension(1110, 1024));
        setMinimumSize(new java.awt.Dimension(1110, 1024));
        setPreferredSize(new java.awt.Dimension(1110, 1024));

        jSeparator1.setForeground(new java.awt.Color(196, 196, 196));

        jLabel12.setFont(new java.awt.Font("Quicksand Medium", 0, 24)); // NOI18N
        jLabel12.setText("Mecânicos");

        jTable3.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "Email", "Telemóvel", "Morada", "Salário", "INPS", "NIF", "Data inicio", "Data fim", "Estado"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton4.setBackground(new java.awt.Color(8, 32, 50));
        jButton4.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Novo Mecânico");
        jButton4.setBorder(null);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(920, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new PopUp_NovoMecanico().setVisible(true);
        //new PopUp_NovaPeca().setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
