/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.filial.vendas;

import GUI.matriz.filial.*;
import controller.CategoriaController;
import controller.FilialController;
import controller.ProdutoController;
import java.util.List;
import javax.swing.JOptionPane;
import jpa.Categoria;
import jpa.Pedido;
import jpa.Produto;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class VendasInicialGUI extends javax.swing.JFrame {
    
    private FilialController    filialController    = null;
    private CategoriaController categoriaController = null;
    private ProdutoController   produtoController   = null;
    private List<ItemCarrinho>        filiaisProduto;
    private List<ItemCarrinho>        filiaisIncluir;
    private List<Produto>       produtos;
    private List<Categoria>     categorias;
    private Categoria           categoria;
    private Produto             produto;
    private ItemCarrinho              filialProduto;
    private ItemCarrinho              filialIncluir;
    private Carrinho            carrinho;
    private List<ItemCarrinho> listaCarrinho;

    
    /**
     * Creates new form ContatoGUI
     */
//    public VendasInicialGUI(ItemCarrinho filialEscolhida) {
//        initComponents();
//        setComboCategoria(comboCategoriaIncluir);
//        setComboProduto(comboProdutoIncluir);
//        updateTable();
//        carrinho = new Carrinho(filialEscolhida);
//    }
//    
//    //tabela com as categorias
//    private void updateTable() {
//        try {
//            if (filialController == null) {
//                filialController = new FilialController();
//            }
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, "Erro ao conectar com o servidor...");
//            botaoIncluirProduto.setEnabled(false);
//            return;
//        }
//        
//        listaCarrinho = carrinho.getItems();
//        if ( listaCarrinho !=null ) {
//            //filiaisProduto = (List)produto.getFiliais();
//            ItemCarrinho[] vetorItemCarinho = produto.getFiliais().toArray(new ItemCarrinho[0]);
//            Object[][] objects = new Object[vetorItemCarinho.length][2];
//            
//            for (int i = 0; i < vetorItemCarinho.length; i++) {
//                objects[i][0] = vetorItemCarinho[i].getProduto().getNome();
//                objects[i][1] = vetorItemCarinho[i].getQuantidade();
//        }
//        tblFiliais.setModel(new javax.swing.table.DefaultTableModel(
//                objects,
//                new String[]{ "Produto", "Quantidade" }));
//        } else return;
//        
//        //txtNome.setText("");
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        itsolution_logo = new javax.swing.JLabel();
        panelIncluirCategoria1 = new javax.swing.JPanel();
        nomeCategoriaText3 = new javax.swing.JLabel();
        comboCategoriaIncluir = new javax.swing.JComboBox();
        comboProdutoIncluir = new javax.swing.JComboBox();
        nomeCategoriaText4 = new javax.swing.JLabel();
        contadorIncluir = new javax.swing.JSpinner();
        botaoIncluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFiliais = new javax.swing.JTable();
        panelIncluirCategoria2 = new javax.swing.JPanel();
        comboProdutoRetirar = new javax.swing.JComboBox();
        nomeCategoriaText6 = new javax.swing.JLabel();
        botaoRetirarProduto = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        botaoFinalizar = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contatos");

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Vendas");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        itsolution_logo.setText("ITSolution");

        panelIncluirCategoria1.setBorder(javax.swing.BorderFactory.createTitledBorder("Incluir"));

        nomeCategoriaText3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText3.setText("Categoria:");

        comboCategoriaIncluir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCategoriaIncluirItemStateChanged(evt);
            }
        });
        comboCategoriaIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaIncluirActionPerformed(evt);
            }
        });

        comboProdutoIncluir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProdutoIncluirItemStateChanged(evt);
            }
        });
        comboProdutoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdutoIncluirActionPerformed(evt);
            }
        });

        nomeCategoriaText4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText4.setText("Produto:");

        botaoIncluirProduto.setText("Incluir");
        botaoIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIncluirCategoria1Layout = new javax.swing.GroupLayout(panelIncluirCategoria1);
        panelIncluirCategoria1.setLayout(panelIncluirCategoria1Layout);
        panelIncluirCategoria1Layout.setHorizontalGroup(
            panelIncluirCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncluirCategoria1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIncluirCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIncluirCategoria1Layout.createSequentialGroup()
                        .addComponent(nomeCategoriaText3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCategoriaIncluir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelIncluirCategoria1Layout.createSequentialGroup()
                        .addComponent(nomeCategoriaText4)
                        .addGap(18, 18, 18)
                        .addComponent(comboProdutoIncluir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contadorIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(botaoIncluirProduto)
                .addContainerGap())
        );
        panelIncluirCategoria1Layout.setVerticalGroup(
            panelIncluirCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIncluirCategoria1Layout.createSequentialGroup()
                .addGroup(panelIncluirCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoIncluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelIncluirCategoria1Layout.createSequentialGroup()
                        .addGroup(panelIncluirCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeCategoriaText3)
                            .addComponent(comboCategoriaIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIncluirCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contadorIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboProdutoIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeCategoriaText4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);

        tblFiliais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nome", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tblFiliais);

        panelIncluirCategoria2.setBorder(javax.swing.BorderFactory.createTitledBorder("Retirar"));

        comboProdutoRetirar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProdutoRetirarItemStateChanged(evt);
            }
        });
        comboProdutoRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdutoRetirarActionPerformed(evt);
            }
        });

        nomeCategoriaText6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText6.setText("Produto:");

        botaoRetirarProduto.setText("Atualizar");
        botaoRetirarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRetirarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIncluirCategoria2Layout = new javax.swing.GroupLayout(panelIncluirCategoria2);
        panelIncluirCategoria2.setLayout(panelIncluirCategoria2Layout);
        panelIncluirCategoria2Layout.setHorizontalGroup(
            panelIncluirCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncluirCategoria2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeCategoriaText6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboProdutoRetirar, 0, 302, Short.MAX_VALUE)
                .addGap(98, 98, 98)
                .addComponent(botaoRetirarProduto)
                .addContainerGap())
        );
        panelIncluirCategoria2Layout.setVerticalGroup(
            panelIncluirCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncluirCategoria2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIncluirCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIncluirCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeCategoriaText6)
                        .addComponent(comboProdutoRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoRetirarProduto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoVoltar.setText("Cancelar");
        botaoVoltar.setToolTipText("");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoFinalizar.setText("Finalizar");
        botaoFinalizar.setToolTipText("");
        botaoFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoFinalizarMouseReleased(evt);
            }
        });
        botaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(380, 380, 380)
                        .addComponent(itsolution_logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelIncluirCategoria2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelIncluirCategoria1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(itsolution_logo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelIncluirCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelIncluirCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoFinalizar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-616)/2, (screenSize.height-534)/2, 616, 534);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
        new GUI.matriz.MatrizInicial().setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void comboProdutoIncluirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProdutoIncluirItemStateChanged
//        if ( produto == null || produto != comboProdutoIncluir.getSelectedItem()) {
//            produtos = (List)categoria.getProdutos();
//            produto = (Produto)comboProdutoIncluir.getSelectedItem();
//        }
//        if(produto != null ){
//            updateTable();
//            //setComboFilialRetirar
//        }
    }//GEN-LAST:event_comboProdutoIncluirItemStateChanged

    private void comboProdutoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdutoIncluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProdutoIncluirActionPerformed

    private void comboCategoriaIncluirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoriaIncluirItemStateChanged
//        for(Categoria categ: categorias){
//            if(categ.getNome().equals(comboCategoriaIncluir.getSelectedItem())) {
//                categoria = categ;
//                setComboProduto(comboProdutoIncluir);
//            }
//        }
    }//GEN-LAST:event_comboCategoriaIncluirItemStateChanged

    private void botaoIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirProdutoActionPerformed
//        ItemCarrinho ic = new ItemCarrinho(produto, (short)contadorIncluir.getValue());
//        
//        if ( carrinho.getItems().contains(ic) ) {
//            JOptionPane.showMessageDialog(null, "O produto " + produto.getNome() + " já está no carrinho.");
//        } else {
//            carrinho.adicionarItem(ic);
//            updateTable();
//        }

    }//GEN-LAST:event_botaoIncluirProdutoActionPerformed

    private void comboProdutoRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdutoRetirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProdutoRetirarActionPerformed

    private void comboProdutoRetirarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProdutoRetirarItemStateChanged
//        for(ItemCarrinho f: filiaisProduto){
//            if(f.getProduto().getNome().equals(comboProdutoRetirar.getSelectedItem())) {
//                filialProduto = f;
//            }
//        }
    }//GEN-LAST:event_comboProdutoRetirarItemStateChanged

    private void botaoRetirarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRetirarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRetirarProdutoActionPerformed

    private void botaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarActionPerformed
        //Pedido ped = new Pedido();
    }//GEN-LAST:event_botaoFinalizarActionPerformed

    private void comboCategoriaIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaIncluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaIncluirActionPerformed

    private void botaoFinalizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFinalizarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFinalizarMouseReleased

//    public javax.swing.JComboBox getComboCategoria() {
//        return comboCategoriaIncluir;
//    }
//    /**
//     * @param comboCategoria the comboCategoria to set
//     */
//    public void setComboCategoria(javax.swing.JComboBox comboCategoria) {
//        this.comboCategoriaIncluir = comboCategoria;
//        try {
//            if (categoriaController == null) {
//                categoriaController = new CategoriaController();
//            }
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, "Erro ao conectar com o servidor...");
//            return;
//        }
//        categorias = categoriaController.findAll();
//        comboCategoria.removeAllItems();
//
//        for(Categoria categ: categorias){
//            comboCategoria.addItem(categ.getNome());
//        }
//        for(Categoria categ: categorias){
//            if(categoria.getNome().equals(comboCategoria.getSelectedItem())) {
//                categoria = categ;
//            }
//        }
//    }
//    /**
//     * @return the comboProduto
//     */
//    public javax.swing.JComboBox getComboProduto() {
//        return comboProdutoIncluir;
//    }
//
//    /**
//     * @param comboProduto the comboProduto to set
//     */
//    
//    public void setComboProduto(javax.swing.JComboBox comboProduto) {
//        this.comboProdutoIncluir = comboProduto;
//        try {
//            if (produtoController == null) {
//                produtoController = new ProdutoController();
//            }
//            if (categoriaController == null){
//                categoriaController = new CategoriaController();
//            }
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, "Erro ao conectar com o servidor...");
//            return;
//        }
//        for(Categoria categ: categorias){
//            if(categ.getNome().equals(comboCategoriaIncluir.getSelectedItem())){
//                categoria = categ;
//            }
//        }
//        produtos = (List)categoria.getProdutos();
//        comboProduto.removeAllItems();
//        for(Produto prod: produtos){
//            comboProduto.addItem(prod);
//        }
//    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JButton botaoIncluirProduto;
    private javax.swing.JButton botaoRetirarProduto;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox comboCategoriaIncluir;
    private javax.swing.JComboBox comboProdutoIncluir;
    private javax.swing.JComboBox comboProdutoRetirar;
    private javax.swing.JSpinner contadorIncluir;
    private javax.swing.JLabel itsolution_logo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeCategoriaText3;
    private javax.swing.JLabel nomeCategoriaText4;
    private javax.swing.JLabel nomeCategoriaText6;
    private javax.swing.JPanel panelIncluirCategoria1;
    private javax.swing.JPanel panelIncluirCategoria2;
    private javax.swing.JTable tblFiliais;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
