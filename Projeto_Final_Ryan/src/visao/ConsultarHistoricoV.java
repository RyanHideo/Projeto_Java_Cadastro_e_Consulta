/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import Controle.consultaC;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ryan
 */
public class ConsultarHistoricoV extends javax.swing.JFrame {
    
     DefaultTableModel campotabela = new DefaultTableModel();
    ResultSet resposta = null;
    consultaC consultaC = new consultaC();

    /**
     * Creates new form ConsultarHistoricoV
     */
    public ConsultarHistoricoV() {
        initComponents();
        campotabela.addColumn("AUDITORIA");
        campotabela.addColumn("CODIGO");
        campotabela.addColumn("NOME DO MEDICO");
        campotabela.addColumn("CPF DO MEDICO");
        campotabela.addColumn("TELEFONE DO MEDICO");
        campotabela.addColumn("NOME DO PACIENTE");
        campotabela.addColumn("CPF DO PACIENTE");
        campotabela.addColumn("TELEFONE DO PACIENTE");
        campotabela.addColumn("OBS");
        campotabela.addColumn("data finalizada");
        campotabela.addColumn("Usuario que finalizou");
        jTable1.setModel(campotabela);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        JTFCpf = new javax.swing.JTextField();
        JBConsultaPorCpf = new javax.swing.JButton();
        JBConsulltaGeral = new javax.swing.JButton();
        JBLimpar = new javax.swing.JButton();
        JCBEscolha = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JTFCpf.setText("Insira o cpf");
        JTFCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFCpfFocusGained(evt);
            }
        });
        JTFCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCpfActionPerformed(evt);
            }
        });

        JBConsultaPorCpf.setText("Consultar por cpf");
        JBConsultaPorCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConsultaPorCpfActionPerformed(evt);
            }
        });

        JBConsulltaGeral.setText("Consulta geral");
        JBConsulltaGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConsulltaGeralActionPerformed(evt);
            }
        });

        JBLimpar.setText("Limpar");
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        JCBEscolha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "paciente", "medico" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCBEscolha, 0, 87, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBConsultaPorCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBConsulltaGeral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBConsultaPorCpf)
                    .addComponent(JBConsulltaGeral)
                    .addComponent(JBLimpar)
                    .addComponent(JCBEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCpfActionPerformed

    private void JTFCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFCpfFocusGained
        JTFCpf.setText("");                // TODO add your handling code here:
    }//GEN-LAST:event_JTFCpfFocusGained

    private void JBConsulltaGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConsulltaGeralActionPerformed
       try{
            resposta=consultaC.consultarAuditoria();
            int linha=0;
            //Percorre todas as linhas do ResultSet
            while(resposta.next()){
                //campotabela.setNumRows(linha+1);
                campotabela.setRowCount(linha+1);
                //Laço para percorrer as COLUNAS DA TABELA Registro
                for(int i=1;i<=11;i++){
                    if(i==1){
                        jTable1.setValueAt(resposta.getArray(i), linha, i-1);
                    }
                    /* 
                    if(i==2){
                        jtableRA.setValueAt(resposta.getInt(i), linha, i-1);
                    }
                    if(i==3){
                        jtableRA.setValueAt(resposta.getInt(i), linha, i-1);
                    }
                    */
                    else
                        jTable1.setValueAt(resposta.getString(i), linha, i-1);
                }
                linha++;
            }
        }catch(Exception erro){
            erro.printStackTrace();
        }  // TODO add your handling code here:
    }//GEN-LAST:event_JBConsulltaGeralActionPerformed

    private void JBConsultaPorCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConsultaPorCpfActionPerformed
                if (JCBEscolha.getSelectedItem().toString() == "paciente") {
            String cpfPaciente = JTFCpf.getText();
            try {
                resposta = consultaC.consultarAuditoriaPorCpfPaciente(cpfPaciente);
                int linha = 0;
                //Percorre todas as linhas do ResultSet
                while (resposta.next()) {
                    //campotabela.setNumRows(linha+1);
                    campotabela.setRowCount(linha + 1);
                    //Laço para percorrer as COLUNAS DA TABELA Registro
                    for (int i = 1; i <= 12; i++) {
                        if (i == 1) {
                            jTable1.setValueAt(resposta.getArray(i), linha, i - 1);
                        } /* 
                    if(i==2){
                        jtableRA.setValueAt(resposta.getInt(i), linha, i-1);
                    }
                    if(i==3){
                        jtableRA.setValueAt(resposta.getInt(i), linha, i-1);
                    }
                         */ else {
                            jTable1.setValueAt(resposta.getString(i), linha, i - 1);
                        }
                    }
                    linha++;
                }
            } catch (Exception erro) {
                erro.printStackTrace();
            }
        } else {
            String cpfMedico = JTFCpf.getText();
            try {
                resposta = consultaC.consultarAuditoriaPorCpfMedico(cpfMedico);
                int linha = 0;
                //Percorre todas as linhas do ResultSet
                while (resposta.next()) {
                    //campotabela.setNumRows(linha+1);
                    campotabela.setRowCount(linha + 1);
                    //Laço para percorrer as COLUNAS DA TABELA Registro
                    for (int i = 1; i <= 12; i++) {
                        if (i == 1) {
                            jTable1.setValueAt(resposta.getArray(i), linha, i - 1);
                        } /* 
                    if(i==2){
                        jtableRA.setValueAt(resposta.getInt(i), linha, i-1);
                    }
                    if(i==3){
                        jtableRA.setValueAt(resposta.getInt(i), linha, i-1);
                    }
                         */ else {
                            jTable1.setValueAt(resposta.getString(i), linha, i - 1);
                        }
                    }
                    linha++;
                }
            } catch (Exception erro) {
                erro.printStackTrace();
            }
        }                  // TODO add your handling code here:
    }//GEN-LAST:event_JBConsultaPorCpfActionPerformed

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimparActionPerformed
        JTFCpf.setText("Insira o cpf");
        campotabela.setRowCount(0);        // TODO add your handling code here:
    }//GEN-LAST:event_JBLimparActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarHistoricoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarHistoricoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarHistoricoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarHistoricoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarHistoricoV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBConsulltaGeral;
    private javax.swing.JButton JBConsultaPorCpf;
    private javax.swing.JButton JBLimpar;
    private javax.swing.JComboBox<String> JCBEscolha;
    private javax.swing.JTextField JTFCpf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
