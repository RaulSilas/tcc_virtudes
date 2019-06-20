package br.gov.sp.etec.GUI;

import br.gov.sp.etec.DAO.UsuarioDAO;
import br.gov.sp.etec.conectar.UtilDAO;
import br.gov.sp.etec.modelagem.Usuario;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class GereUsuarios extends javax.swing.JFrame {

    public GereUsuarios() {
        initComponents();
        loadSampleData();
    }

    UsuarioDAO dao = new UsuarioDAO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        jPanelAlunos = new javax.swing.JPanel();
        jLabelAlunos = new javax.swing.JLabel();
        jPanelMensalidade = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelChamada = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(861, 591));
        jPanel1.setMinimumSize(new java.awt.Dimension(861, 591));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(861, 591));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setToolTipText("Fechar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(30, 30));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Alunos_20px_1.png"))); // NOI18N
        jLabel5.setText("Gerenciamento de Usuários");

        jLabelMinimizar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMinimizar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimizar.setText("_");
        jLabelMinimizar.setToolTipText("Minimizar");
        jLabelMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel5)
                .addContainerGap(273, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMinimizar))
                .addGap(1, 1, 1)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(121, 1, 760, 101);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(130, 525));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Voltar_18px.png"))); // NOI18N
        jLabel2.setText("Voltar");
        jLabel2.setToolTipText("Voltar para tela Home");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setDoubleBuffered(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jPanelHome.setBackground(new java.awt.Color(102, 0, 0));
        jPanelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelHome.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseExited(evt);
            }
        });

        jLabelHome.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHome.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Home_18px.png"))); // NOI18N
        jLabelHome.setText("Home");
        jLabelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAlunos.setBackground(new java.awt.Color(102, 0, 0));
        jPanelAlunos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAlunos.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanelAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAlunosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAlunosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAlunosMouseExited(evt);
            }
        });

        jLabelAlunos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAlunos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAlunos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Alunos_18px.png"))); // NOI18N
        jLabelAlunos.setText("Alunos");

        javax.swing.GroupLayout jPanelAlunosLayout = new javax.swing.GroupLayout(jPanelAlunos);
        jPanelAlunos.setLayout(jPanelAlunosLayout);
        jPanelAlunosLayout.setHorizontalGroup(
            jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAlunos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAlunosLayout.setVerticalGroup(
            jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelMensalidade.setBackground(new java.awt.Color(102, 0, 0));
        jPanelMensalidade.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanelMensalidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMensalidadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelMensalidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMensalidadeMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Estoque_18px.png"))); // NOI18N
        jLabel3.setText("Estoque");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelMensalidadeLayout = new javax.swing.GroupLayout(jPanelMensalidade);
        jPanelMensalidade.setLayout(jPanelMensalidadeLayout);
        jPanelMensalidadeLayout.setHorizontalGroup(
            jPanelMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMensalidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanelMensalidadeLayout.setVerticalGroup(
            jPanelMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMensalidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Cabeçalho.png"))); // NOI18N

        jPanelChamada.setBackground(new java.awt.Color(102, 0, 0));
        jPanelChamada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelChamada.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanelChamada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelChamadaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelChamadaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelChamadaMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Chamada_18px_1.png"))); // NOI18N
        jLabel7.setText("Chamada");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelChamadaLayout = new javax.swing.GroupLayout(jPanelChamada);
        jPanelChamada.setLayout(jPanelChamadaLayout);
        jPanelChamadaLayout.setHorizontalGroup(
            jPanelChamadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChamadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanelChamadaLayout.setVerticalGroup(
            jPanelChamadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChamadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCadastro.setBackground(new java.awt.Color(102, 0, 0));
        jPanelCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelCadastro.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanelCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCadastroMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Cadastro_18px_3.png"))); // NOI18N
        jLabel9.setText("Cadastro");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelChamada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelChamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(1, 1, 120, 590);

        jTableUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "CPF", "Telefone", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);
        if (jTableUsuarios.getColumnModel().getColumnCount() > 0) {
            jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(10);
            jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(14);
            jTableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(130, 110, 720, 170);

        jButtonDelete.setBackground(new java.awt.Color(102, 0, 0));
        jButtonDelete.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Apagar");
        jButtonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jButtonDelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonDeleteKeyPressed(evt);
            }
        });
        jPanel2.add(jButtonDelete);
        jButtonDelete.setBounds(710, 430, 110, 40);

        jButtonAtualizar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonAtualizar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        jButtonAtualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAtualizarKeyPressed(evt);
            }
        });
        jPanel2.add(jButtonAtualizar);
        jButtonAtualizar.setBounds(710, 350, 110, 40);

        jTextFieldUsuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(150, 370, 180, 25);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Usuário:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(150, 350, 60, 17);

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CPF:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(150, 440, 70, 17);
        jPanel2.add(jSeparator11);
        jSeparator11.setBounds(460, 490, 180, 10);

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Telefone:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(470, 440, 60, 17);

        jTextFieldEndereco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEndereco.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jTextFieldEndereco);
        jTextFieldEndereco.setBounds(460, 370, 180, 25);

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Endereço");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(460, 350, 70, 17);
        jPanel2.add(jSeparator10);
        jSeparator10.setBounds(460, 400, 180, 10);
        jPanel2.add(jSeparator9);
        jSeparator9.setBounds(150, 400, 180, 10);
        jPanel2.add(jSeparator13);
        jSeparator13.setBounds(150, 490, 180, 10);

        jFormattedTextFieldCpf.setEditable(false);
        jFormattedTextFieldCpf.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextFieldCpf.setBorder(null);
        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCpf.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel2.add(jFormattedTextFieldCpf);
        jFormattedTextFieldCpf.setBounds(150, 460, 180, 23);

        jFormattedTextFieldTelefone.setBorder(null);
        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldTelefone.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel2.add(jFormattedTextFieldTelefone);
        jFormattedTextFieldTelefone.setBounds(460, 460, 180, 23);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
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

        setSize(new java.awt.Dimension(861, 591));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // Botão Update:
        dao.update(lerPagina());
        DefaultTableModel model = (DefaultTableModel) jTableUsuarios.getModel();
        model.setRowCount(0);
        loadSampleData();
        limpa();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // Botão delete:
        dao.delete(lerPagina());
        //        Alunos a = new Alunos();
        //        a.setId(Integer.parseInt(jTextFieldId.getText()));
        //        dao.delete(a);
        DefaultTableModel model = (DefaultTableModel) jTableUsuarios.getModel();
        model.setRowCount(0);
        loadSampleData();
        limpa();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        //Mostra os dados da linha selecionada nos campos de texto
        int i = jTableUsuarios.getSelectedRow();
        TableModel model = jTableUsuarios.getModel();
        jTextFieldUsuario.setText(model.getValueAt(i, 0).toString());
        jFormattedTextFieldCpf.setText(model.getValueAt(i, 1).toString());
        jFormattedTextFieldTelefone.setText(model.getValueAt(i, 2).toString());
        jTextFieldEndereco.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    private void jPanelCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroMouseExited
        resetColor(jPanelCadastro);
    }//GEN-LAST:event_jPanelCadastroMouseExited

    private void jPanelCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroMouseEntered
        setColor(jPanelCadastro);
    }//GEN-LAST:event_jPanelCadastroMouseEntered

    private void jPanelCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroMouseClicked
        new CadastroAlunoGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelCadastroMouseClicked

    private void jPanelChamadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelChamadaMouseExited
        resetColor(jPanelChamada);
    }//GEN-LAST:event_jPanelChamadaMouseExited

    private void jPanelChamadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelChamadaMouseEntered
        setColor(jPanelChamada);
    }//GEN-LAST:event_jPanelChamadaMouseEntered

    private void jPanelChamadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelChamadaMouseClicked
        new ListaPresençaGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelChamadaMouseClicked

    private void jPanelMensalidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMensalidadeMouseExited
        resetColor(jPanelMensalidade);
    }//GEN-LAST:event_jPanelMensalidadeMouseExited

    private void jPanelMensalidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMensalidadeMouseEntered
        setColor(jPanelMensalidade);
    }//GEN-LAST:event_jPanelMensalidadeMouseEntered

    private void jPanelMensalidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMensalidadeMouseClicked
        new EstoqueGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelMensalidadeMouseClicked

    private void jPanelAlunosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosMouseExited
        resetColor(jPanelAlunos);
    }//GEN-LAST:event_jPanelAlunosMouseExited

    private void jPanelAlunosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosMouseEntered
        setColor(jPanelAlunos);
    }//GEN-LAST:event_jPanelAlunosMouseEntered

    private void jPanelAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosMouseClicked
        new GereAlunosGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelAlunosMouseClicked

    private void jPanelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseExited
        resetColor(jPanelHome);
    }//GEN-LAST:event_jPanelHomeMouseExited

    private void jPanelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseEntered
        setColor(jPanelHome);
    }//GEN-LAST:event_jPanelHomeMouseEntered

    private void jPanelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseClicked
        new HomeGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelHomeMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new HomeGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jButtonAtualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAtualizarKeyPressed
       if (evt.getKeyCode()== evt.VK_ENTER){
      getRootPane().setDefaultButton(jButtonAtualizar);
     }
    }//GEN-LAST:event_jButtonAtualizarKeyPressed

    private void jButtonDeleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonDeleteKeyPressed
          if (evt.getKeyCode()== evt.VK_ENTER){
      getRootPane().setDefaultButton(jButtonDelete);
     }
    }//GEN-LAST:event_jButtonDeleteKeyPressed

    void loadSampleData() {
        
        /* Centralizar os título das colunas */
        JTableHeader header = jTableUsuarios.getTableHeader();
        DefaultTableCellRenderer center = (DefaultTableCellRenderer) header.getDefaultRenderer();
        center.setHorizontalAlignment(SwingConstants.CENTER);

        /* Centralizar e alinhar a esquerda o id e o nome na tabela*/
        DefaultTableCellRenderer left = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        left.setHorizontalAlignment(SwingConstants.LEFT);
        jTableUsuarios.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        jTableUsuarios.getColumnModel().getColumn(1).setCellRenderer(left);
        jTableUsuarios.getColumnModel().getColumn(2).setCellRenderer(left);
        jTableUsuarios.getColumnModel().getColumn(3).setCellRenderer(left);
        
        // Método para pegar os dados do banco de dados
        try {
            Connection con = null;
            PreparedStatement ps = null;
            String sql = "SELECT USUARIO, CPF, TELEFONE, ENDERECO FROM USUARIO";

            con = UtilDAO.conectar();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (jTableUsuarios.getRowCount() > 0) {
                ((DefaultTableModel) jTableUsuarios.getModel()).removeRow(0);
            }
            int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] rows = new Object[col];
                for (int i = 1; i <= col; i++) {

                    rows[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) jTableUsuarios.getModel()).insertRow(rs.getRow() - 1, rows);
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {

        }

    }

    private Usuario lerPagina() {
        Usuario u = new Usuario();
        String usuario = jTextFieldUsuario.getText();
        u.setUsuario(usuario);
        String cpf = jFormattedTextFieldCpf.getText();
        u.setCpf(cpf);
        String telefone = jFormattedTextFieldTelefone.getText();
        u.setTelefone(telefone);
        String endereco = jTextFieldEndereco.getText();
        u.setEndereco(endereco);

        return u;
    }

    private void limpa() {
        jTextFieldUsuario.setText(null);
        jFormattedTextFieldCpf.setText(null);
        jFormattedTextFieldTelefone.setText(null);
        jTextFieldEndereco.setText(null);
    }

    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(255, 0, 0));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(102, 0, 0));
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
            java.util.logging.Logger.getLogger(GereUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GereUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GereUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GereUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GereUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAlunos;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAlunos;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelChamada;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelMensalidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
