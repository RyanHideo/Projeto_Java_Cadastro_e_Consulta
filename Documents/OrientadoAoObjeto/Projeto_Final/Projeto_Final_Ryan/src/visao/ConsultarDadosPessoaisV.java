/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import Controle.DadosPessoaisC;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ra194399
 */
public class ConsultarDadosPessoaisV extends javax.swing.JFrame {
        DefaultTableModel campotabela=new DefaultTableModel();
        ResultSet resposta=null;
        DadosPessoaisC dadospessoaisc=new DadosPessoaisC();
    /**
     * Creates new form ConsultarDadosPessoaisGeralV
     */
    public ConsultarDadosPessoaisV() {
        initComponents();
        campotabela.addColumn("NOME");
        campotabela.addColumn("CPF");
        campotabela.addColumn("RG");
        campotabela.addColumn("SEXO");
        campotabela.addColumn("DATA DE NASCIMENTO");
        campotabela.addColumn("EMAIL");
        campotabela.addColumn("FONE 1");
        campotabela.addColumn("FONE 2");
        jTablePessoas.setModel(campotabela);
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
        jLabel1 = new javax.swing.JLabel();
        JInserirCPF = new javax.swing.JTextField();
        JBuscarPorCPF = new javax.swing.JButton();
        JBuscaGeral = new javax.swing.JButton();
        JLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePessoas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRO DE PESSOAS");

        JInserirCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JInserirCPF.setText("Numero CPF");
        JInserirCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JInserirCPFFocusGained(evt);
            }
        });
        JInserirCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JInserirCPFActionPerformed(evt);
            }
        });

        JBuscarPorCPF.setText("Buscar por cpf");
        JBuscarPorCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBuscarPorCPFActionPerformed(evt);
            }
        });

        JBuscaGeral.setText("Busca Geral");
        JBuscaGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBuscaGeralActionPerformed(evt);
            }
        });

        JLimpar.setText("Limpar");
        JLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JInserirCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBuscarPorCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(JBuscaGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JInserirCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBuscarPorCPF)
                        .addComponent(JBuscaGeral)
                        .addComponent(JLimpar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTablePessoas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablePessoas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JInserirCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JInserirCPFActionPerformed

    }//GEN-LAST:event_JInserirCPFActionPerformed

    private void JBuscaGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBuscaGeralActionPerformed
        try{
            resposta=dadospessoaisc.ConsultaGeral();
            int linha=0;
            //Percorre todas as linhas do ResultSet
            while(resposta.next()){
                //campotabela.setNumRows(linha+1);
                campotabela.setRowCount(linha+1);
                //Laço para percorrer as COLUNAS DA TABELA Registro
                for(int i=1;i<=8;i++){
                    if(i==1){
                        jTablePessoas.setValueAt(resposta.getArray(i), linha, i-1);
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
                        jTablePessoas.setValueAt(resposta.getString(i), linha, i-1);
                }
                linha++;
            }
        }catch(Exception erro){
            erro.printStackTrace();
        } 
    }//GEN-LAST:event_JBuscaGeralActionPerformed

    private void JBuscarPorCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBuscarPorCPFActionPerformed
        try{
            String cpf = JInserirCPF.getText() ;
            resposta=dadospessoaisc.ConsultaPorCPF(cpf);
            int linha=0;
            //Percorre todas as linhas do ResultSet
            while(resposta.next()){
                //campotabela.setNumRows(linha+1);
                campotabela.setRowCount(linha+1);
                //Laço para percorrer as COLUNAS DA TABELA Registro
                for(int i=1;i<=8;i++){
                    if(i==1){
                        jTablePessoas.setValueAt(resposta.getArray(i), linha, i-1);
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
                        jTablePessoas.setValueAt(resposta.getString(i), linha, i-1);
                }
                linha++;
            }
        }catch(Exception erro){
            erro.printStackTrace();
        } 
    }//GEN-LAST:event_JBuscarPorCPFActionPerformed

    private void JInserirCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JInserirCPFFocusGained
        JInserirCPF.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_JInserirCPFFocusGained

    private void JLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLimparActionPerformed
        JInserirCPF.setText("Insira o cpf");        
        campotabela.setRowCount(0);     // TODO add your handling code here:
    }//GEN-LAST:event_JLimparActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarDadosPessoaisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarDadosPessoaisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarDadosPessoaisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarDadosPessoaisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarDadosPessoaisV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBuscaGeral;
    private javax.swing.JButton JBuscarPorCPF;
    private javax.swing.JTextField JInserirCPF;
    private javax.swing.JButton JLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePessoas;
    // End of variables declaration//GEN-END:variables
}