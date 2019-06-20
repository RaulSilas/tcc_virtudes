/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.sp.etec.GUI;

import br.gov.sp.etec.DAO.CadastroAlunoDAO;
import br.gov.sp.etec.DAO.CadastroResponsavelDAO;
import br.gov.sp.etec.DAO.TurmaDAO;
import java.sql.*;
import javax.swing.JPanel;
import br.gov.sp.etec.conectar.UtilDAO;
import br.gov.sp.etec.modelagem.CPF;
import br.gov.sp.etec.modelagem.CadastroAluno;
import br.gov.sp.etec.modelagem.CadastroResponsavel;
import br.gov.sp.etec.modelagem.Turma;
import com.sun.media.sound.InvalidDataException;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tami
 */
public class CadastroAlunoGUI extends javax.swing.JFrame {

    /**
     * Creates new form Modelo
     */
    public CadastroAlunoGUI() {
        initComponents();
        dispPainel(false);
    }

    boolean prossiga;
    boolean seleturma;
    public CadastroAluno a = new CadastroAluno();
    public CadastroAlunoDAO dao = new CadastroAlunoDAO();
    public CadastroResponsavel cR = new CadastroResponsavel();
    public CadastroResponsavelDAO daor = new CadastroResponsavelDAO();
    public Turma t = new Turma();
    public TurmaDAO daot = new TurmaDAO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        jPanelAlunos = new javax.swing.JPanel();
        jLabelAlunos = new javax.swing.JLabel();
        jPanelEstoque = new javax.swing.JPanel();
        jLabelEstoque = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelChamada = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jFormattedTextFieldDtNascimentoA = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefoneA = new javax.swing.JFormattedTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jPanelResp = new javax.swing.JPanel();
        jTextFieldRespNome = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jFormattedTextFieldRespTel = new javax.swing.JFormattedTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jFormattedTextFieldRespCPF = new javax.swing.JFormattedTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jButtonSalvarResp = new javax.swing.JButton();
        jLabelFechar = new javax.swing.JLabel();
        jLabelFechar5 = new javax.swing.JLabel();
        jLabelFechar6 = new javax.swing.JLabel();
        jTextFieldRespRg = new javax.swing.JTextField();
        jButtonResponsavel = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabelFechar1 = new javax.swing.JLabel();
        jLabelFechar2 = new javax.swing.JLabel();
        jLabelFechar3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldAlunoRg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel1.setLayout(null);

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
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Cadastro_32px.png"))); // NOI18N
        jLabel5.setText("Cadastro de Aluno");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 684, Short.MAX_VALUE)
                .addComponent(jLabelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(121, 1, 740, 100);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(130, 525));

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
        jLabelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        jPanelEstoque.setBackground(new java.awt.Color(102, 0, 0));
        jPanelEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelEstoque.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanelEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEstoqueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelEstoqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelEstoqueMouseExited(evt);
            }
        });

        jLabelEstoque.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Estoque_18px.png"))); // NOI18N
        jLabelEstoque.setText("Estoque");
        jLabelEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelEstoqueLayout = new javax.swing.GroupLayout(jPanelEstoque);
        jPanelEstoque.setLayout(jPanelEstoqueLayout);
        jPanelEstoqueLayout.setHorizontalGroup(
            jPanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEstoque)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanelEstoqueLayout.setVerticalGroup(
            jPanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelChamada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelChamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1, 1, 120, 590);

        jTextFieldNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jTextFieldNome);
        jTextFieldNome.setBounds(180, 150, 180, 25);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nome:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(180, 130, 60, 17);
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(500, 180, 180, 10);

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("RG:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(180, 200, 60, 17);

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Data de Nascimento:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(500, 200, 130, 17);

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Telefone:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(500, 130, 60, 17);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(500, 260, 180, 10);

        jFormattedTextFieldDtNascimentoA.setBorder(null);
        try {
            jFormattedTextFieldDtNascimentoA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDtNascimentoA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldDtNascimentoA.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(jFormattedTextFieldDtNascimentoA);
        jFormattedTextFieldDtNascimentoA.setBounds(500, 230, 180, 23);

        jFormattedTextFieldTelefoneA.setBorder(null);
        try {
            jFormattedTextFieldTelefoneA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefoneA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldTelefoneA.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(jFormattedTextFieldTelefoneA);
        jFormattedTextFieldTelefoneA.setBounds(500, 150, 180, 23);
        jPanel1.add(jSeparator10);
        jSeparator10.setBounds(180, 180, 180, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(180, 260, 180, 10);

        jTextFieldEndereco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEndereco.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jTextFieldEndereco);
        jTextFieldEndereco.setBounds(180, 310, 180, 25);

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Endereço:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(180, 290, 60, 17);
        jPanel1.add(jSeparator11);
        jSeparator11.setBounds(180, 340, 180, 10);

        jPanelResp.setBackground(new java.awt.Color(255, 255, 255));
        jPanelResp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldRespNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldRespNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRespNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Nome:");

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("RG:");

        jFormattedTextFieldRespTel.setBorder(null);
        try {
            jFormattedTextFieldRespTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRespTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldRespTel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Telefone:");

        jFormattedTextFieldRespCPF.setBorder(null);
        try {
            jFormattedTextFieldRespCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRespCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldRespCPF.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jFormattedTextFieldRespCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldRespCPFFocusLost(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CPF:");

        jButtonSalvarResp.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSalvarResp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalvarResp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarResp.setText("Salvar");
        jButtonSalvarResp.setToolTipText("Salvar dados do Responsável");
        jButtonSalvarResp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvarResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarRespActionPerformed(evt);
            }
        });
        jButtonSalvarResp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSalvarRespKeyPressed(evt);
            }
        });

        jLabelFechar.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabelFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechar.setText("Fechar");
        jLabelFechar.setToolTipText("Fechar Area do Responsável");
        jLabelFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFecharMouseClicked(evt);
            }
        });

        jLabelFechar5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelFechar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechar5.setText("*");
        jLabelFechar5.setToolTipText("Fechar Area do Responsável");
        jLabelFechar5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelFechar6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelFechar6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechar6.setText("*");
        jLabelFechar6.setToolTipText("Fechar Area do Responsável");
        jLabelFechar6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFieldRespRg.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldRespRg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRespRg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldRespRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespRgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRespLayout = new javax.swing.GroupLayout(jPanelResp);
        jPanelResp.setLayout(jPanelRespLayout);
        jPanelRespLayout.setHorizontalGroup(
            jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRespLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabelFechar5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRespLayout.createSequentialGroup()
                        .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 96, Short.MAX_VALUE))
                    .addGroup(jPanelRespLayout.createSequentialGroup()
                        .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRespLayout.createSequentialGroup()
                                .addComponent(jTextFieldRespNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(jLabelFechar6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRespLayout.createSequentialGroup()
                                .addComponent(jTextFieldRespRg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRespLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRespLayout.createSequentialGroup()
                        .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldRespTel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelRespLayout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldRespCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarResp, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelRespLayout.setVerticalGroup(
            jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRespLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRespLayout.createSequentialGroup()
                        .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRespLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(3, 3, 3)
                                .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldRespNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelFechar5))
                                .addGap(5, 5, 5)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRespLayout.createSequentialGroup()
                                .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabelFechar))
                                .addGap(3, 3, 3)
                                .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFormattedTextFieldRespTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelFechar6))
                                .addGap(7, 7, 7)
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel18))
                    .addGroup(jPanelRespLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldRespCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvarResp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRespRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(jPanelRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelResp);
        jPanelResp.setBounds(130, 390, 720, 190);

        jButtonResponsavel.setBackground(new java.awt.Color(102, 0, 0));
        jButtonResponsavel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonResponsavel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonResponsavel.setText("Cadastrar Responsável");
        jButtonResponsavel.setToolTipText("Habilitar campos para cadastrar responsável");
        jButtonResponsavel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResponsavelActionPerformed(evt);
            }
        });
        jButtonResponsavel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonResponsavelKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonResponsavel);
        jButtonResponsavel.setBounds(500, 310, 220, 40);

        jButtonSalvar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonSalvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salvar dados do aluno");
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jButtonSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSalvarKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonSalvar);
        jButtonSalvar.setBounds(750, 310, 90, 40);

        jLabelFechar1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelFechar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechar1.setText("*");
        jLabelFechar1.setToolTipText("Fechar Area do Responsável");
        jLabelFechar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabelFechar1);
        jLabelFechar1.setBounds(160, 230, 10, 17);

        jLabelFechar2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelFechar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechar2.setText("*");
        jLabelFechar2.setToolTipText("Fechar Area do Responsável");
        jLabelFechar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabelFechar2);
        jLabelFechar2.setBounds(160, 150, 10, 17);

        jLabelFechar3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelFechar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechar3.setText("*");
        jLabelFechar3.setToolTipText("Fechar Area do Responsável");
        jLabelFechar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabelFechar3);
        jLabelFechar3.setBounds(480, 230, 10, 17);

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Turma:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(750, 110, 80, 23);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Kids", "Juvenil - Adulto" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(730, 140, 120, 20);

        jTextFieldAlunoRg.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldAlunoRg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAlunoRg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jTextFieldAlunoRg);
        jTextFieldAlunoRg.setBounds(180, 220, 180, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(861, 591));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
//        a.calculaIdade(jFormattedTextFieldDtNascimentoA.getText().toString());
        if (verificarTurma() == true) {
            int result = JOptionPane.showConfirmDialog(null, "Deseja salvar as alterações?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                try {
                    dao.insert(lerPagina());
                    t.setNome_turma(jComboBox1.getSelectedItem().toString());
                daot.insert(t);
                  JOptionPane.showMessageDialog(null, "Dados salvos!", "Sucesso", 1);
                limpa();
                } catch (InvalidDataException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao tentar ler os dados:" + ex.getMessage());
                }
                

                
              
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada!", "ERRO", 0);
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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

    private void jPanelEstoqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstoqueMouseExited
        resetColor(jPanelEstoque);
    }//GEN-LAST:event_jPanelEstoqueMouseExited

    private void jPanelEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstoqueMouseEntered
        setColor(jPanelEstoque);
    }//GEN-LAST:event_jPanelEstoqueMouseEntered

    private void jPanelEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstoqueMouseClicked
        new EstoqueGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelEstoqueMouseClicked

    private void jPanelAlunosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosMouseExited
        resetColor(jPanelAlunos);
        /*Retorna a cor inicial ao retirar o mouse*/
    }//GEN-LAST:event_jPanelAlunosMouseExited

    private void jPanelAlunosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosMouseEntered
        setColor(jPanelAlunos);
        /* Muda a cor ao passar o mouse*/
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

    private void jButtonResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResponsavelActionPerformed
        dispPainel(true);
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setVisible(false);
        jButtonResponsavel.setEnabled(false);
        jButtonResponsavel.setVisible(false);
    }//GEN-LAST:event_jButtonResponsavelActionPerformed

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jLabelFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFecharMouseClicked
        dispPainel(false);
        jButtonSalvar.setEnabled(true);
        jButtonSalvar.setVisible(true);
        jButtonResponsavel.setEnabled(true);
        jButtonResponsavel.setVisible(true);
        limpaResponsa();
    }//GEN-LAST:event_jLabelFecharMouseClicked

    private void jButtonSalvarRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarRespActionPerformed
        if (verificarTurma() == true) {
            int result1 = JOptionPane.showConfirmDialog(null, "Deseja salvar?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION);
            if (result1 == JOptionPane.YES_OPTION) {
                try {
                    dao.insert(lerPagina());
                    t.setNome_turma(jComboBox1.getSelectedItem().toString());
                daot.insert(t);
                  daor.insert(lerResponsavel());
                JOptionPane.showMessageDialog(null, "Dados salvos!", "Sucesso", 1);
                limpaResponsa();limpa();
                } catch (InvalidDataException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar ler os dados:" + ex.getMessage());
                }
                                                                        
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada!", "ERRO", 0);
            }
        }

    }//GEN-LAST:event_jButtonSalvarRespActionPerformed

    private void jButtonResponsavelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonResponsavelKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            getRootPane().setDefaultButton(jButtonResponsavel);
        }
    }//GEN-LAST:event_jButtonResponsavelKeyPressed

    private void jButtonSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSalvarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            getRootPane().setDefaultButton(jButtonSalvar);
        }
    }//GEN-LAST:event_jButtonSalvarKeyPressed

    private void jButtonSalvarRespKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSalvarRespKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            getRootPane().setDefaultButton(jButtonSalvarResp);
        }
    }//GEN-LAST:event_jButtonSalvarRespKeyPressed

    private void jFormattedTextFieldRespCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldRespCPFFocusLost
        verificaCpf();
    }//GEN-LAST:event_jFormattedTextFieldRespCPFFocusLost

    private void jTextFieldRespRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespRgActionPerformed

    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(255, 0, 0));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(102, 0, 0));
    }

    public void dispPainel(boolean oq) {
        jPanelResp.setVisible(oq);
    }

    private CadastroAluno lerPagina() throws InvalidDataException {
        a.setNome(UtilGUI.validaDados(jTextFieldNome.getText()));
        a.setRg(UtilGUI.validaDados(jTextFieldAlunoRg.getText()));
        a.setTelefone(UtilGUI.validaDados(jFormattedTextFieldTelefoneA.getText()));
        a.setEndereco(UtilGUI.validaDados(jTextFieldEndereco.getText()));
        a.setDtNasc(UtilGUI.validaDados(jFormattedTextFieldDtNascimentoA.getText()));

        return a;
    }

    private void limpa() {
        jTextFieldNome.setText(null);
        jTextFieldAlunoRg.setText(null);
        jFormattedTextFieldTelefoneA.setText(null);
        jTextFieldEndereco.setText(null);
        jFormattedTextFieldDtNascimentoA.setText(null);
        jComboBox1.setSelectedIndex(0);
    }

    private void limpaResponsa() {
        jTextFieldRespNome.setText(null);
        jTextFieldRespRg.setText(null);
        jFormattedTextFieldRespCPF.setText(null);
        jFormattedTextFieldRespTel.setText(null);
    }

    private boolean verificarTurma() {
        String turma = jComboBox1.getSelectedItem().toString();
        if (turma.equalsIgnoreCase("Selecione")) {
            JOptionPane.showMessageDialog(null, "Selecione uma turma!", "ERRO", 0);
            seleturma = false;
        } else {
            seleturma = true;
        }

        return seleturma;
    }

    private CadastroResponsavel lerResponsavel() throws InvalidDataException {
        cR.setNome(UtilGUI.validaDados(jTextFieldRespNome.getText()));
        cR.setRg(UtilGUI.validaDados(jTextFieldRespRg.getText()));
        cR.setCpf(UtilGUI.validaDados(jFormattedTextFieldRespCPF.getText()));
        cR.setTelefone(UtilGUI.validaDados(jFormattedTextFieldRespTel.getText()));
        cR.setNome_aluno(UtilGUI.validaDados(jTextFieldNome.getText()));

        return cR;
    }

    private void verificaCpf() {
        String cpf = jFormattedTextFieldRespCPF.getText();
        CPF vcpf = new CPF(cpf);

        if (vcpf.isCPF()) {

        } else {
            JOptionPane.showMessageDialog(null, "CPF Inválido!", "ERRO", 0);
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlunoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonResponsavel;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSalvarResp;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtNascimentoA;
    private javax.swing.JFormattedTextField jFormattedTextFieldRespCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldRespTel;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAlunos;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelFechar;
    private javax.swing.JLabel jLabelFechar1;
    private javax.swing.JLabel jLabelFechar2;
    private javax.swing.JLabel jLabelFechar3;
    private javax.swing.JLabel jLabelFechar5;
    private javax.swing.JLabel jLabelFechar6;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAlunos;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelChamada;
    private javax.swing.JPanel jPanelEstoque;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelResp;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextFieldAlunoRg;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRespNome;
    private javax.swing.JTextField jTextFieldRespRg;
    // End of variables declaration//GEN-END:variables
}
