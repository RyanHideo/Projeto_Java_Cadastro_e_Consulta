/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import Controle.DadosPessoaisC;
import Controle.codPacC;
import Modelo.DadosPessoaisM;
import Modelo.codPacM;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ra194399
 */
public class DadosPessoaisV extends javax.swing.JFrame {

    /**
     * Creates new form DadosPessoaisV
     */
    public DadosPessoaisV() {
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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JRegistroNome = new javax.swing.JTextField();
        JRegistrarCPF = new javax.swing.JTextField();
        JRegistrarRG = new javax.swing.JTextField();
        JRegistrarSexo = new javax.swing.JTextField();
        JRegistrarDataNasc = new javax.swing.JTextField();
        JRegistrarEmail = new javax.swing.JTextField();
        JRegistrarFone1 = new javax.swing.JTextField();
        JRegistrarFone2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JRegistrarCodigo = new javax.swing.JTextField();
        JCBTipo = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO");
        jLabel1.setToolTipText("");

        jLabel2.setText("NOME");

        jLabel3.setText("CPF");

        jLabel4.setText("RG");

        jLabel5.setText("SEXO");

        jLabel6.setText("DATA DE NASCIMENTO");

        jLabel7.setText("EMAIL");

        jLabel8.setText("FONE 1");

        jLabel9.setText("FONE 2");

        JSalvar.setText("SALVAR");
        JSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JSalvarMouseClicked(evt);
            }
        });
        JSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSalvarActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(JSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSalvar)
                    .addComponent(jButton2))
                .addGap(15, 15, 15))
        );

        JRegistroNome.setText("Insira o nome");
        JRegistroNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JRegistroNomeFocusGained(evt);
            }
        });
        JRegistroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRegistroNomeActionPerformed(evt);
            }
        });

        JRegistrarCPF.setText("Insira o cpf");
        JRegistrarCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JRegistrarCPFFocusGained(evt);
            }
        });

        JRegistrarRG.setText("Insira o RG");
        JRegistrarRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JRegistrarRGFocusGained(evt);
            }
        });

        JRegistrarSexo.setText("Insira o Sexo");
        JRegistrarSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JRegistrarSexoFocusGained(evt);
            }
        });

        JRegistrarDataNasc.setText("Insira a data de nascimento");
        JRegistrarDataNasc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JRegistrarDataNascFocusGained(evt);
            }
        });

        JRegistrarEmail.setText("Insira o Email");
        JRegistrarEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JRegistrarEmailFocusGained(evt);
            }
        });

        JRegistrarFone1.setText("Insira o Telefone");
        JRegistrarFone1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JRegistrarFone1FocusGained(evt);
            }
        });

        JRegistrarFone2.setText("Insira o Telefone");
        JRegistrarFone2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JRegistrarFone2FocusGained(evt);
            }
        });

        jLabel10.setText("CODIGO");

        jLabel11.setText("TIPO DE CADASTRO");

        JRegistrarCodigo.setText("Insira o codigo");
        JRegistrarCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JRegistrarCodigoFocusGained(evt);
            }
        });
        JRegistrarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRegistrarCodigoActionPerformed(evt);
            }
        });

        JCBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "paciente", "medico" }));
        JCBTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRegistroNome)
                            .addComponent(JRegistrarCPF)
                            .addComponent(JRegistrarRG)
                            .addComponent(JRegistrarSexo)
                            .addComponent(JRegistrarDataNasc)
                            .addComponent(JRegistrarEmail)
                            .addComponent(JRegistrarFone1)
                            .addComponent(JRegistrarFone2)
                            .addComponent(JRegistrarCodigo)
                            .addComponent(JCBTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JRegistroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JRegistrarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JRegistrarRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JRegistrarSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRegistrarDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRegistrarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRegistrarFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRegistrarFone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JRegistrarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSalvarMouseClicked
       //Capturando DAdo da INTERFACE Grafica e inserindo em var String
      
    }//GEN-LAST:event_JSalvarMouseClicked

    private void JSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSalvarActionPerformed
        String codigo=JRegistrarCodigo.getText();
        String Nome=JRegistroNome.getText();
        String cpf=JRegistrarCPF.getText();
        String rg=JRegistrarRG.getText();
	String sexo=JRegistrarSexo.getText();
	String nascimento=JRegistrarDataNasc.getText();
	String email=JRegistrarEmail.getText();
        String fone1=JRegistrarFone1.getText();
        String fone2=JRegistrarFone2.getText();

        //Convertedo String para inteiro
        
        DadosPessoaisM registrom=new DadosPessoaisM(codigo,Nome,cpf,rg,sexo,nascimento,email,fone1,fone2);
	
        DadosPessoaisC controle=new DadosPessoaisC();
        String resp=controle.CadastroPessoa(registrom);
        JSalvar.setText(resp);
        
        if(JCBTipo.getSelectedItem().toString()=="paciente"){
            codPacM registro=new codPacM(codigo,cpf);
            
            codPacC controlle=new codPacC();
            String Rep=controlle.cadastroPaciente(registro);
         JSalvar.setText(Rep);        
        }
        else{
        codPacM registro=new codPacM(codigo,cpf);
            
            codPacC controlle=new codPacC();
            String Rep=controlle.cadastroMedico(registro);
         JSalvar.setText(Rep);
        }
    }//GEN-LAST:event_JSalvarActionPerformed

    private void JLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLimparActionPerformed
        JRegistroNome.setText("Insira o nome");

        JRegistrarCPF.setText("Insira o cpf");

        JRegistrarRG.setText("Insira o RG");

        JRegistrarSexo.setText("Insira o Sexo");

        JRegistrarDataNasc.setText("Insira a data de nascimento");

        JRegistrarEmail.setText("Insira o Email");

        JRegistrarFone1.setText("Insira o Telefone");

        JRegistrarFone2.setText("Insira o Telefone");
        
        JRegistrarCodigo.setText("Insira o Codigo");
        
    }//GEN-LAST:event_JLimparActionPerformed

    private void JRegistroNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRegistroNomeFocusGained
        JRegistroNome.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_JRegistroNomeFocusGained

    private void JRegistrarCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRegistrarCPFFocusGained
        JRegistrarCPF.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_JRegistrarCPFFocusGained

    private void JRegistrarRGFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRegistrarRGFocusGained
        JRegistrarRG.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_JRegistrarRGFocusGained

    private void JRegistrarSexoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRegistrarSexoFocusGained
        JRegistrarSexo.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_JRegistrarSexoFocusGained

    private void JRegistrarDataNascFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRegistrarDataNascFocusGained
        JRegistrarDataNasc.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_JRegistrarDataNascFocusGained

    private void JRegistrarEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRegistrarEmailFocusGained
       JRegistrarEmail.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_JRegistrarEmailFocusGained

    private void JRegistrarFone1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRegistrarFone1FocusGained
        JRegistrarFone1.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_JRegistrarFone1FocusGained

    private void JRegistrarFone2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRegistrarFone2FocusGained
        JRegistrarFone2.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_JRegistrarFone2FocusGained

    private void JRegistrarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRegistrarCodigoActionPerformed
        JRegistrarCodigo.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_JRegistrarCodigoActionPerformed

    private void JRegistroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRegistroNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRegistroNomeActionPerformed

    private void JCBTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBTipoActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
                // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void JRegistrarCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRegistrarCodigoFocusGained
        JRegistrarCodigo.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_JRegistrarCodigoFocusGained
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
            java.util.logging.Logger.getLogger(DadosPessoaisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosPessoaisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosPessoaisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosPessoaisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosPessoaisV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBTipo;
    private javax.swing.JTextField JRegistrarCPF;
    private javax.swing.JTextField JRegistrarCodigo;
    private javax.swing.JTextField JRegistrarDataNasc;
    private javax.swing.JTextField JRegistrarEmail;
    private javax.swing.JTextField JRegistrarFone1;
    private javax.swing.JTextField JRegistrarFone2;
    private javax.swing.JTextField JRegistrarRG;
    private javax.swing.JTextField JRegistrarSexo;
    private javax.swing.JTextField JRegistroNome;
    private javax.swing.JButton JSalvar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}