package br.gov.sp.etec.GUI;

import br.gov.sp.etec.DAO.UsuarioDAO;
import br.gov.sp.etec.modelagem.CPF;
import br.gov.sp.etec.modelagem.Usuario;
import com.sun.media.sound.InvalidDataException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CadastrosUsuarioGUI extends javax.swing.JFrame {

    public CadastrosUsuarioGUI() {
        initComponents();
        getRootPane().setDefaultButton(jButtonEntrar);
    }

    Usuario cu = new Usuario();
    UsuarioDAO dao = new UsuarioDAO();

    public Usuario lerPagina() throws InvalidDataException {
        
        cu.setUsuario(UtilGUI.validaDados(jTextFieldCUUsuario.getText()));
        cu.setCpf(UtilGUI.validaDados(jFormattedTextFieldCpf.getText()));
        cu.setTelefone(UtilGUI.validaDados(jFormattedTextField1.getText()));
        cu.setEndereco(UtilGUI.validaDados(jTextFieldCUEndereco.getText()));
        cu.setSenha(UtilGUI.validaDados(new String (jPasswordFieldCUSenha.getPassword())));

        limpar();
        return cu;

    }
    
    public void limpar() {
        jTextFieldCUUsuario.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextField1.setText("");
        jTextFieldCUEndereco.setText("");
        jPasswordFieldCUConfirmarSenha.setText("");
        jPasswordFieldCUSenha.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCUUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordFieldCUSenha = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldCUConfirmarSenha = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonEntrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCUEndereco = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CadastroUsuario");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Virtudes");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/TelaLogin.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Voltar_18px.png"))); // NOI18N
        jLabel9.setText("Voltar");
        jLabel9.setToolTipText("Voltar para tela Home");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(39, 39, 39))
        );

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cadastro de Usuário");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuário:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Senha:");

        jTextFieldCUUsuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldCUUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCUUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPasswordFieldCUSenha.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPasswordFieldCUSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldCUSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirmar Senha:");

        jPasswordFieldCUConfirmarSenha.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPasswordFieldCUConfirmarSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldCUConfirmarSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CPF:");

        jButtonEntrar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEntrar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("Salvar e Continuar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Celular:");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Endereço:");

        jTextFieldCUEndereco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldCUEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCUEndereco.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jFormattedTextField1.setBorder(null);
        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(30, 30));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabelMinimizar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMinimizar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimizar.setText("_");
        jLabelMinimizar.setToolTipText("Minimizar");
        jLabelMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizar.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabelMinimizar.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabelMinimizar.setOpaque(true);
        jLabelMinimizar.setPreferredSize(new java.awt.Dimension(30, 30));
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });

        jFormattedTextFieldCpf.setBorder(null);
        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCpf.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jFormattedTextFieldCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldCpfFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jSeparator1)
                                                    .addComponent(jTextFieldCUUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                                    .addComponent(jSeparator4))
                                                .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(35, 35, 35)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldCUEndereco)
                                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPasswordFieldCUSenha)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel4)
                                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(35, 35, 35)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel10)
                                                .addComponent(jSeparator3)
                                                .addComponent(jPasswordFieldCUConfirmarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jButtonEntrar)))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCUUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCUEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldCUSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldCUConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(700, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        //VOLTAR PARA TELA DE LOGIN.
        new HomeGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        try {
            dao.cadastrarUsuario(checkCadastro());
        } catch (InvalidDataException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar ler os dados:" + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //FECHAR.
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jFormattedTextFieldCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfFocusLost
        verificaCpf();
    }//GEN-LAST:event_jFormattedTextFieldCpfFocusLost

    private void verificaCpf() {
        String cpf = jFormattedTextFieldCpf.getText();
        CPF vcpf = new CPF(cpf);

        if (vcpf.isCPF()) {

        } else {
            JOptionPane.showMessageDialog(null, "CPF Inválido!", "ERRO", 0);
        }
    }

    public Usuario checkCadastro() throws InvalidDataException {
        String senha = new String(jPasswordFieldCUSenha.getPassword());
        String confirmarSenha = new String(jPasswordFieldCUConfirmarSenha.getPassword());
        if (senha.equals(confirmarSenha)) {
            lerPagina();
        } else {
            JOptionPane.showMessageDialog(null, "As senhas não são iguais");
        }
        limpar();
       return cu;
    }

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
            java.util.logging.Logger.getLogger(CadastrosUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrosUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrosUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrosUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrosUsuarioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
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
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldCUConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldCUSenha;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextFieldCUEndereco;
    private javax.swing.JTextField jTextFieldCUUsuario;
    // End of variables declaration//GEN-END:variables
}
