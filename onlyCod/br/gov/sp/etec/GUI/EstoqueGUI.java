/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.sp.etec.GUI;

import br.gov.sp.etec.DAO.ProdutoDAO;
import br.gov.sp.etec.modelagem.MODTblProduto;
import br.gov.sp.etec.modelagem.Produto;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.table.*;

/**
 *
 * @author Tami
 */
public class EstoqueGUI extends javax.swing.JFrame {

    /**
     * Creates new form Modelo
     */
    public EstoqueGUI() {
        initComponents();
        busca();

        dispPainel(false);
    }

    public MODTblProduto model;
    public static boolean answerimset;

    private void busca() {
        //Preenchendo tabela;
        List<Produto> pdt = dao.preencher();/*Busca dados a partir do método preencher*/
        model = new MODTblProduto(pdt);
        jtableProduto.setModel(model);

        //Centralizar título das colunas;
        JTableHeader header = jtableProduto.getTableHeader();
        DefaultTableCellRenderer center = (DefaultTableCellRenderer) header.getDefaultRenderer();
        center.setHorizontalAlignment(SwingConstants.CENTER);
        jtableProduto.getColumnModel().getColumn(0).setPreferredWidth(35);
        jtableProduto.getColumnModel().getColumn(1).setPreferredWidth(385);

        buscaTipo();
    }

    public void buscaTipo() {
        //Preenchendo jComboBox;
        if (jComboBoxTipo.getItemCount() > 0) {
            jComboBoxTipo.removeAllItems();
            jComboBoxTipo.addItem("Selecionar");
        }
        for (Produto p : dao.tipo()) {
            jComboBoxTipo.addItem(String.valueOf(p));
        }

        //Centralizar título jComboBox.
        BasicComboBoxRenderer.UIResource attRecursos = new BasicComboBoxRenderer.UIResource();
        attRecursos.setHorizontalAlignment(SwingConstants.CENTER);
        jComboBoxTipo.setRenderer(attRecursos);
    }

    /*configurações da jtextField Buscar*/
    public void foradacaixa() {
        if (jtfBuscar.getText().equals("")) {
            jtfBuscar.setText("Pesquisar produto (Ex.: ID, Nome, etc...)");
            jtfBuscar.setHorizontalAlignment((int) CENTER_ALIGNMENT);
            jtfBuscar.setForeground(Color.GRAY);
        }
    }

    public void setOnJTxt() {
        int linha = jtableProduto.getSelectedRow();

        int convert = jtableProduto.convertRowIndexToModel(linha);

        System.err.println(convert);

        jTFNome.setText((String) model.getValueAt(convert, 1));
        jComboBoxTipo.setSelectedItem((String) model.getValueAt(convert, 2));
        jTFQuantidade.setText(model.getValueAt(convert, 3).toString());
        jTFCor.setText((String) model.getValueAt(convert, 4));
    }

    public void setOnBD() {
        p.setNome(jTFNome.getText());
        p.setTipo((String) jComboBoxTipo.getSelectedItem());
        dao.selectTipo(p);
        p.setQuantidade(Integer.parseInt(jTFQuantidade.getText()));
        p.setCor(jTFCor.getText());

    }

    public void limpar() {
        jTFNome.setText("");
        jTFQuantidade.setText("");
        jTFCor.setText("");
    }

    public void dispPainel(boolean oq) {
        jPanelEdiNew.setVisible(oq);
        ConfigIcone(1, 25, 24, 100);
        ConfigIcone(2, 15, 14, 100);
        ConfigIcone(3, 15, 14, 100);
    }

    public void DjbFutFromCad() {
        if (jButtonFutanari.getText().equals("Finalizar")) {
            if (jTFNome.getText().equals("")
                    || jTFQuantidade.getText().equals("")) {
                jButtonFutanari.setEnabled(false);
            } else {
                jButtonFutanari.setEnabled(true);
            }
        }
    }

    public void ConfigIcone(int escolha, int largura, int altura, int nsei) {
        switch (escolha) {
            case 1:
                /*Icone subir*/
                jLabelSobe.setText("");
                ImageIcon subir = new ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Suba.png"));
                subir.setImage(subir.getImage().getScaledInstance(largura, altura, nsei));
                jLabelSobe.setIcon(subir);
                break;
            case 2:
                /*Icone mais*/
                jLabelMais.setText("");
                ImageIcon mais = new ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/mais2.png"));
                mais.setImage(mais.getImage().getScaledInstance(largura, altura, nsei));
                jLabelMais.setIcon(mais);
                jLabelMais.setToolTipText("Adicionar novo tipo");
                break;
            case 3:
                jLabelMenos.setText("");
                ImageIcon menos = new ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/menos3.png"));
                menos.setImage(menos.getImage().getScaledInstance(largura, altura, nsei));
                jLabelMenos.setIcon(menos);
                jLabelMenos.setToolTipText("Excluir tipo");
                break;
        }
    }

    public void pesquisamediocre() {
        TableRowSorter<MODTblProduto> mtbp = new TableRowSorter<>(model);
        String procurar = jtfBuscar.getText();

//       Exemplo do que seria duas pesquisa. Pode ser útil algum dia! ;) 
//        List<RowFilter<Object,Object>> rfs = new ArrayList<RowFilter<Object,Object>>(2);;
//        rfs.add(RowFilter.regexFilter("(?i)^Zac$", 0));
//        rfs.add(RowFilter.regexFilter("(?i)^A$", 1));
//        RowFilter<Object,Object> af = RowFilter.andFilter(rfs);
        mtbp.setRowFilter(RowFilter.regexFilter("(?i)" + procurar));
        jtableProduto.setRowSorter(mtbp);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        jPanelAlunos = new javax.swing.JPanel();
        jLabelAlunos = new javax.swing.JLabel();
        jPanelEstoque = new javax.swing.JPanel();
        jLabelEstoque = new javax.swing.JLabel();
        jPanelChamada = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProduto = new javax.swing.JTable();
        jtfBuscar = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jPanelEdiNew = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTFCor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButtonReverter = new javax.swing.JButton();
        jButtonFutanari = new javax.swing.JButton();
        jLabelSobe = new javax.swing.JLabel();
        jLabelMais = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabelMenos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setMinimumSize(new java.awt.Dimension(740, 98));
        jPanel3.setPreferredSize(new java.awt.Dimension(740, 98));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

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
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Estoque_32px.png"))); // NOI18N
        jLabel5.setText("Estoque");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Virtudes");

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
                .addComponent(jLabel8)
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel5)
                        .addContainerGap(312, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMinimizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(121, 1, 730, 98);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(130, 525));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Voltar_18px.png"))); // NOI18N
        jLabel2.setText("Voltar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setDoubleBuffered(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Cabeçalho.png"))); // NOI18N

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(38, Short.MAX_VALUE))
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
                    .addComponent(jLabel2)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelChamada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1, 1, 120, 523);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jtableProduto.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jtableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableProdutoMouseClicked(evt);
            }
        });
        jtableProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtableProdutoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtableProduto);

        jtfBuscar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jtfBuscar.setForeground(new java.awt.Color(204, 204, 204));
        jtfBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfBuscar.setText("Pesquisar produto (Ex.: ID, Nome, etc...)");
        jtfBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfBuscarMouseClicked(evt);
            }
        });
        jtfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfBuscarKeyReleased(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseReleased(evt);
            }
        });
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCadastrar.setText("(+) Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonApagar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonApagar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1)
                    .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel4Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonApagar)
                .addGap(217, 217, 217))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonApagar)
                    .addComponent(jButtonCadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(120, 100, 730, 250);

        jPanelEdiNew.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEdiNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEdiNewMouseClicked(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setText("Nome:");

        jTFNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTFNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNomeKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setText("Tipo:");

        jTFQuantidade.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTFQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setText("Quantidade:");

        jTFCor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTFCor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCorKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setText("Cor:");

        jButtonReverter.setBackground(new java.awt.Color(102, 0, 0));
        jButtonReverter.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonReverter.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReverter.setText("ADOLLI");
        jButtonReverter.setToolTipText("ATENÇÃO: Isso irá reverter todas as alterações NÃO salvas!");
        jButtonReverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReverterActionPerformed(evt);
            }
        });

        jButtonFutanari.setBackground(new java.awt.Color(102, 0, 0));
        jButtonFutanari.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButtonFutanari.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFutanari.setText("Futanari");
        jButtonFutanari.setEnabled(false);
        jButtonFutanari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFutanariActionPerformed(evt);
            }
        });

        jLabelSobe.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelSobe.setText("    /\\");
            jLabelSobe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jLabelSobe.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabelSobeMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabelSobeMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabelSobeMouseExited(evt);
                }
            });

            jLabelMais.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
            jLabelMais.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jLabelMais.setText("+");
            jLabelMais.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            jLabelMais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jLabelMais.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabelMaisMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabelMaisMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabelMaisMouseExited(evt);
                }
            });

            jComboBoxTipo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
            jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
            jComboBoxTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            jComboBoxTipo.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    jComboBoxTipoItemStateChanged(evt);
                }
            });
            jComboBoxTipo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBoxTipoPopupMenuWillBecomeVisible(evt);
                }
            });
            jComboBoxTipo.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jComboBoxTipoMouseClicked(evt);
                }
            });

            jLabelMenos.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
            jLabelMenos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jLabelMenos.setText("-");
            jLabelMenos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            jLabelMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jLabelMenos.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabelMenosMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabelMenosMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabelMenosMouseExited(evt);
                }
            });

            javax.swing.GroupLayout jPanelEdiNewLayout = new javax.swing.GroupLayout(jPanelEdiNew);
            jPanelEdiNew.setLayout(jPanelEdiNewLayout);
            jPanelEdiNewLayout.setHorizontalGroup(
                jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator2)
                .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addGroup(jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                            .addGroup(jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelMais, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                                .addComponent(jLabelMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                    .addGroup(jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                            .addGroup(jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(jTFCor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                            .addGroup(jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jButtonReverter)
                                .addComponent(jButtonFutanari, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(79, 79, 79))
                        .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSobe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
            );
            jPanelEdiNewLayout.setVerticalGroup(
                jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14)
                    .addGroup(jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                            .addGroup(jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                                    .addGroup(jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanelEdiNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabelMais)
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabelMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26))))
                        .addGroup(jPanelEdiNewLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jButtonFutanari, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonReverter, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSobe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())))
            );

            jPanel1.add(jPanelEdiNew);
            jPanelEdiNew.setBounds(120, 350, 730, 160);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
            );

            setSize(new java.awt.Dimension(852, 513));
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new HomeGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jtfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfBuscarMouseClicked
        // TODO add your handling code here:
        jtfBuscar.setText("");
        jtfBuscar.setHorizontalAlignment(HEIGHT);
        jtfBuscar.setForeground(Color.black);
    }//GEN-LAST:event_jtfBuscarMouseClicked

    private void jtfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBuscarKeyPressed
        // TODO add your handling code here:
        if (jtfBuscar.getText().equals("Pesquisar produto (Ex.: ID, Nome, etc...)")) {
            jtfBuscar.setText("");
            jtfBuscar.setHorizontalAlignment(HEIGHT);
            jtfBuscar.setForeground(Color.black);
        }
    }//GEN-LAST:event_jtfBuscarKeyPressed

    private void jtfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBuscarKeyReleased
        pesquisamediocre();
    }//GEN-LAST:event_jtfBuscarKeyReleased

    private void jtableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableProdutoMouseClicked
        // TODO add your handling code here:
        foradacaixa();
        if (answerimset == true) {
            setOnJTxt();
        }
    }//GEN-LAST:event_jtableProdutoMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        foradacaixa();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        foradacaixa();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        foradacaixa();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        answerimset = false;
        jButtonEditar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setForeground(new java.awt.Color(0, 0, 0));

        jButtonApagar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonApagar.setForeground(new java.awt.Color(0, 0, 0));

        jButtonCadastrar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));

        jButtonFutanari.setText("Finalizar");
        jButtonFutanari.setEnabled(false);
        jButtonReverter.setVisible(false);
        limpar();
        jtableProduto.clearSelection();
        dispPainel(true);
        jLabelSobe.setToolTipText("Fechar painel de cadastro");
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        if (jtableProduto.getSelectedRow() != -1) {

            jButtonEditar.setBackground(new java.awt.Color(255, 255, 255));
            jButtonEditar.setForeground(new java.awt.Color(0, 0, 0));

            jButtonCadastrar.setBackground(new java.awt.Color(255, 255, 255));
            jButtonCadastrar.setForeground(new java.awt.Color(0, 0, 0));

            jButtonApagar.setBackground(new java.awt.Color(102, 0, 0));
            jButtonApagar.setForeground(new java.awt.Color(255, 255, 255));

            int linha = jtableProduto.getSelectedRow();
            int convert = jtableProduto.convertRowIndexToModel(linha);
            p.setId((int) model.getValueAt(convert, 0));

            int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir?", "AVISO", JOptionPane.YES_NO_OPTION, 3);
            if (resposta == 0) {
                model.removerLinha(convert);
                dao.delete(p);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione o produto que pretende excluir", "Aviso", 2);
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        if (jtableProduto.getSelectedRow() != -1) {
            jButtonCadastrar.setBackground(new java.awt.Color(255, 255, 255));
            jButtonCadastrar.setForeground(new java.awt.Color(0, 0, 0));

            jButtonApagar.setBackground(new java.awt.Color(255, 255, 255));
            jButtonApagar.setForeground(new java.awt.Color(0, 0, 0));

            jButtonEditar.setBackground(new java.awt.Color(102, 0, 0));
            jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));

            dispPainel(true);
            jButtonFutanari.setText("Concluir");
            jButtonFutanari.setEnabled(true);
            jButtonReverter.setVisible(true);
            jButtonReverter.setText("Reverter");
            setOnJTxt();
            answerimset = true;
            jLabelSobe.setToolTipText("Fechar painel de edição");

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um produto", "Aviso", 2);
        }

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        foradacaixa();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButtonEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseReleased

    }//GEN-LAST:event_jButtonEditarMouseReleased

    private void jtableProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtableProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_jtableProdutoKeyPressed

    private void jPanelEdiNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEdiNewMouseClicked
        foradacaixa();
    }//GEN-LAST:event_jPanelEdiNewMouseClicked

    private void jLabelSobeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSobeMouseExited
        ConfigIcone(1, 25, 24, 100);
    }//GEN-LAST:event_jLabelSobeMouseExited

    private void jLabelSobeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSobeMouseEntered
        ConfigIcone(1, 26, 27, 100);
    }//GEN-LAST:event_jLabelSobeMouseEntered

    private void jLabelSobeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSobeMouseClicked
        dispPainel(false);
        jButtonCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setForeground(new java.awt.Color(0, 0, 0));

        jButtonApagar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonApagar.setForeground(new java.awt.Color(0, 0, 0));

        jButtonEditar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabelSobeMouseClicked

    private void jButtonFutanariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFutanariActionPerformed
        if (jComboBoxTipo.getSelectedItem().equals("Selecionar")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios", "Aviso", 2);
        } else {
            if (jButtonFutanari.getText().equals("Finalizar")) {
                setOnBD();
                dao.insert(p);
                limpar();
                busca();
            } else {
                if (jtableProduto.getSelectedRow() != -1) {
                    int linha = jtableProduto.getSelectedRow();
                    int convert = jtableProduto.convertRowIndexToModel(linha);
                    setOnBD();
                    p.setId((int) model.getValueAt(convert, 0));
                    dao.update(p);
                    p.setId(0);
                    busca();
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível cadastrar um produto nessa tela!", "Aviso", 0);
                }
            }
        }
    }//GEN-LAST:event_jButtonFutanariActionPerformed

    private void jTFQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFQuantidadeKeyReleased
        DjbFutFromCad();
    }//GEN-LAST:event_jTFQuantidadeKeyReleased

    private void jTFNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomeKeyReleased
        DjbFutFromCad();
    }//GEN-LAST:event_jTFNomeKeyReleased

    private void jComboBoxTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTipoMouseClicked
        foradacaixa();
    }//GEN-LAST:event_jComboBoxTipoMouseClicked

    private void jComboBoxTipoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTipoPopupMenuWillBecomeVisible
        jComboBoxTipo.removeItem("Selecionar");
    }//GEN-LAST:event_jComboBoxTipoPopupMenuWillBecomeVisible

    private void jComboBoxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTipoItemStateChanged
        foradacaixa();
        DjbFutFromCad();
    }//GEN-LAST:event_jComboBoxTipoItemStateChanged

    private void jTFCorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCorKeyReleased

    }//GEN-LAST:event_jTFCorKeyReleased

    private void jLabelMaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMaisMouseExited
        ConfigIcone(2, 15, 14, 100);
    }//GEN-LAST:event_jLabelMaisMouseExited

    private void jLabelMaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMaisMouseEntered
        ImageIcon mais = new ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/Mais.png"));
        mais.setImage(mais.getImage().getScaledInstance(17, 16, 100));
        jLabelMais.setIcon(mais);
        jLabelMais.setToolTipText("Adicionar novo tipo!");
    }//GEN-LAST:event_jLabelMaisMouseEntered

    private void jLabelMaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMaisMouseClicked
        String msg = JOptionPane.showInputDialog(null, "Informe o nome do novo tipo:", "Adicionar novo", 1);
        try {
            if (msg.equals("")) {
                JOptionPane.showMessageDialog(null, "Descrição: Campo vazio! \nCódigo: INTP01", "Erro", 0);
            } else if (msg != null) {
                p.setTipo(msg);
                dao.insertTipo(p);
                buscaTipo();
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jLabelMaisMouseClicked

    private void jLabelMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenosMouseClicked
        String jcbTipo = (String) jComboBoxTipo.getSelectedItem();
        if (jcbTipo.equals("Selecionar")) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um tipo", "Atenção", 2);
        } else {
            int msg = JOptionPane.showConfirmDialog(null, "ATENÇÃO: Todos os produtos do tipo '" + jcbTipo + "' também serão excluidos."
                    + "\n\nDeseja continuar?", "AVISO IMPORTANTE", JOptionPane.YES_NO_OPTION, 3);
            if (msg == 0) {
                p.setTipo(jcbTipo);
                dao.selectTipo(p);
                dao.deleteTipo(p);
                busca();
                if (jButtonFutanari.getText().equals("Concluir")) {
                    limpar();
                }
            }
        }
    }//GEN-LAST:event_jLabelMenosMouseClicked

    private void jLabelMenosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenosMouseEntered
        ImageIcon menos = new ImageIcon(getClass().getResource("/br/gov/sp/etec/icons/menos2.png"));
        menos.setImage(menos.getImage().getScaledInstance(17, 16, 100));
        jLabelMenos.setIcon(menos);
        jLabelMenos.setToolTipText("Excluir tipo!");

    }//GEN-LAST:event_jLabelMenosMouseEntered

    private void jLabelMenosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenosMouseExited
        ConfigIcone(3, 15, 14, 100);
    }//GEN-LAST:event_jLabelMenosMouseExited

    private void jButtonReverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReverterActionPerformed
        if (jtableProduto.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Não há nenhum produto selecionado", "Aviso", 1);
        } else {
            setOnJTxt();
        }

    }//GEN-LAST:event_jButtonReverterActionPerformed

    private void jPanelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseClicked
        new HomeGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelHomeMouseClicked

    private void jPanelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseEntered
        setColor(jPanelHome);
    }//GEN-LAST:event_jPanelHomeMouseEntered

    private void jPanelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseExited
        resetColor(jPanelHome);
    }//GEN-LAST:event_jPanelHomeMouseExited

    private void jPanelAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosMouseClicked
        new GereAlunosGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelAlunosMouseClicked

    private void jPanelAlunosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosMouseEntered
        setColor(jPanelAlunos);
    }//GEN-LAST:event_jPanelAlunosMouseEntered

    private void jPanelAlunosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosMouseExited
        resetColor(jPanelAlunos);
    }//GEN-LAST:event_jPanelAlunosMouseExited

    private void jPanelEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstoqueMouseClicked
        new EstoqueGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelEstoqueMouseClicked

    private void jPanelEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstoqueMouseEntered
        setColor(jPanelEstoque);
    }//GEN-LAST:event_jPanelEstoqueMouseEntered

    private void jPanelEstoqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEstoqueMouseExited
        resetColor(jPanelEstoque);
    }//GEN-LAST:event_jPanelEstoqueMouseExited

    private void jPanelChamadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelChamadaMouseClicked
        new ListaPresençaGUI().setVisible(true);;
        this.dispose();
    }//GEN-LAST:event_jPanelChamadaMouseClicked

    private void jPanelChamadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelChamadaMouseEntered
        setColor(jPanelChamada);
    }//GEN-LAST:event_jPanelChamadaMouseEntered

    private void jPanelChamadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelChamadaMouseExited
        resetColor(jPanelChamada);
    }//GEN-LAST:event_jPanelChamadaMouseExited

    private void jPanelCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroMouseClicked
        new CadastroAlunoGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelCadastroMouseClicked

    private void jPanelCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroMouseEntered
        setColor(jPanelCadastro);
    }//GEN-LAST:event_jPanelCadastroMouseEntered

    private void jPanelCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroMouseExited
        resetColor(jPanelCadastro);
    }//GEN-LAST:event_jPanelCadastroMouseExited

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(255, 0, 0));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(102, 0, 0));
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
            java.util.logging.Logger.getLogger(EstoqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstoqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstoqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstoqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoqueGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonFutanari;
    private javax.swing.JButton jButtonReverter;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAlunos;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelMais;
    private javax.swing.JLabel jLabelMenos;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelSobe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAlunos;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelChamada;
    private javax.swing.JPanel jPanelEdiNew;
    private javax.swing.JPanel jPanelEstoque;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFCor;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFQuantidade;
    private javax.swing.JTable jtableProduto;
    private javax.swing.JTextField jtfBuscar;
    // End of variables declaration//GEN-END:variables
    public Produto p = new Produto();
    public ProdutoDAO dao = new ProdutoDAO();
    public String s;
}
