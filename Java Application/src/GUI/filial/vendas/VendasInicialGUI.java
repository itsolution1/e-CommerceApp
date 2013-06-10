/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.filial.vendas;

import GUI.matriz.filial.*;
import controller.FilialController;
import controller.ProdutoController;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import jpa.Filial;
import jpa.ItemPedido;
import jpa.Produto;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class VendasInicialGUI extends javax.swing.JFrame {
    
    private Carrinho            carrinho = null;
    private Collection<ItemCarrinho> itensCarrinho = null;
    private Filial filial = null;
    private Produto produtoFilialEscolhido = null;
    private ItemCarrinho itemCarrinhoIncluir = null;
    private ItemCarrinho itemCarrinhoExcluir = null;
    private Collection<Produto> produtosFilial = null;
    

    /**
     * Creates new form ContatoGUI
     */
    public VendasInicialGUI(Filial filial) {
        this.filial = filial;
        initComponents();
        botaoIncluirProduto.setEnabled(false);
        botaoRetirarItemCarrinho.setEnabled(false);
        botaoFinalizar.setEnabled(false);
        carrinho = new Carrinho();
        title.setText("Filial " + this.filial.getNome());
        setComboProdutoFilial(comboProdutoFilial);
        updateTable();
        
        
    }
    
    
    //tabela com as categorias
    private void updateTable() {
        setControllers();
        
        this.itensCarrinho = (Collection)this.carrinho.getItensCarrinho();
        if ( this.itensCarrinho !=null ) {
            
            ItemCarrinho[] vetorItemCarinho = this.itensCarrinho.toArray(new ItemCarrinho[0]);
            Object[][] objects = new Object[vetorItemCarinho.length][2];
            
            for (int i = 0; i < vetorItemCarinho.length; i++) {
                objects[i][0] = vetorItemCarinho[i].getProduto().getNome();
                objects[i][1] = vetorItemCarinho[i].getQuantidade();
        }
        this.tblFiliais.setModel(new javax.swing.table.DefaultTableModel(
                objects,
                new String[]{ "Produto", "Quantidade" }));
        } else return;
        
    }

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
        comboProdutoFilial = new javax.swing.JComboBox();
        nomeCategoriaText4 = new javax.swing.JLabel();
        contadorIncluir = new javax.swing.JSpinner();
        botaoIncluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFiliais = new javax.swing.JTable();
        panelIncluirCategoria2 = new javax.swing.JPanel();
        comboProdutoRetirar = new javax.swing.JComboBox();
        nomeCategoriaText6 = new javax.swing.JLabel();
        botaoRetirarItemCarrinho = new javax.swing.JButton();
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

        comboProdutoFilial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProdutoFilialItemStateChanged(evt);
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
                .addComponent(nomeCategoriaText4)
                .addGap(18, 18, 18)
                .addComponent(comboProdutoFilial, 0, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contadorIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoIncluirProduto)
                .addGap(20, 20, 20))
        );
        panelIncluirCategoria1Layout.setVerticalGroup(
            panelIncluirCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncluirCategoria1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelIncluirCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contadorIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboProdutoFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeCategoriaText4)
                    .addComponent(botaoIncluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        nomeCategoriaText6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText6.setText("Produto:");

        botaoRetirarItemCarrinho.setText("Atualizar");
        botaoRetirarItemCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRetirarItemCarrinhoActionPerformed(evt);
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
                .addComponent(comboProdutoRetirar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoRetirarItemCarrinho)
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
                    .addComponent(botaoRetirarItemCarrinho))
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(380, 380, 380)
                        .addComponent(itsolution_logo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelIncluirCategoria2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelIncluirCategoria1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botaoFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelIncluirCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoFinalizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-657)/2, (screenSize.height-581)/2, 657, 581);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
        new GUI.filial.InicioGUI(this.filial).setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void comboProdutoFilialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProdutoFilialItemStateChanged
        if ( this.filial != null ) {
            
            produtosFilial = filial.getProdutos();
            
            if ( this.produtosFilial != null && !this.produtosFilial.isEmpty() ) {
                for (Produto p : produtosFilial) {
                    if ( getComboProdutoFilial().getSelectedItem() != null && getComboProdutoFilial().getSelectedItem().equals(p.getNome()) ) {
                        this.produtoFilialEscolhido = p;
                        SpinnerModel sm = new SpinnerNumberModel(0, 0, this.produtoFilialEscolhido.getQuantidade(), 1);
                        this.contadorIncluir.setModel(sm);
                    }
                }
            }
        }
    }//GEN-LAST:event_comboProdutoFilialItemStateChanged

    private void botaoIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirProdutoActionPerformed
        if ( produtoFilialEscolhido != null ) {
            ItemCarrinho novoItem = new ItemCarrinho(produtoFilialEscolhido,Short.parseShort(contadorIncluir.getValue().toString()));
            carrinho.adicionarItem(novoItem);
            updateTable();
            setComboProdutoRetirar(comboProdutoRetirar);
            botaoRetirarItemCarrinho.setEnabled(true);
            botaoFinalizar.setEnabled(true);
        }
        setComboProdutoRetirar(comboProdutoRetirar);

    }//GEN-LAST:event_botaoIncluirProdutoActionPerformed

    private void comboProdutoRetirarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProdutoRetirarItemStateChanged
        
            if ( carrinho.getNumeroDeItens() > 0 ) {
                itensCarrinho = carrinho.getItensCarrinho();
                if (itensCarrinho != null && !itensCarrinho.isEmpty()) {
                    
                    if ( comboProdutoRetirar != null ) {
                        comboProdutoRetirar.removeAllItems();
                    }
                    
                    for (ItemCarrinho ic : itensCarrinho) {

                        comboProdutoRetirar.addItem(ic.getProduto().getNome());
                    }

                    for (ItemCarrinho ic : itensCarrinho) {
                        if (comboProdutoRetirar.getSelectedItem().equals(ic.getProduto().getNome())) {
                            itemCarrinhoExcluir = ic;
                        }
                    }
                }
                
            }
            
        
    }//GEN-LAST:event_comboProdutoRetirarItemStateChanged

    private void botaoRetirarItemCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRetirarItemCarrinhoActionPerformed
        if ( itemCarrinhoExcluir != null ) {
            carrinho.deletarItem(itemCarrinhoExcluir);
            updateTable();
            if ( carrinho.getNumeroDeItens() == 0 ) {
                botaoFinalizar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_botaoRetirarItemCarrinhoActionPerformed

    private void botaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarActionPerformed
        //Pedido ped = new Pedido();
    }//GEN-LAST:event_botaoFinalizarActionPerformed

    private void botaoFinalizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFinalizarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFinalizarMouseReleased

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JButton botaoIncluirProduto;
    private javax.swing.JButton botaoRetirarItemCarrinho;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox comboProdutoFilial;
    private javax.swing.JComboBox comboProdutoRetirar;
    private javax.swing.JSpinner contadorIncluir;
    private javax.swing.JLabel itsolution_logo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeCategoriaText4;
    private javax.swing.JLabel nomeCategoriaText6;
    private javax.swing.JPanel panelIncluirCategoria1;
    private javax.swing.JPanel panelIncluirCategoria2;
    private javax.swing.JTable tblFiliais;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the carrinho
     */
    public Carrinho getCarrinho() {
        return carrinho;
    }

    /**
     * @param carrinho the carrinho to set
     */
    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public javax.swing.JComboBox getComboProdutoFilial() {
        return comboProdutoFilial;
    }

    /**
     * @param comboProdutoFilial the comboProdutoFilial to set
     */
   
    public void setControllers() {
        
        try {
            //filialController = new FilialController();
            //produtoController = new ProdutoController();
        } catch (Exception ex) {
            botaoIncluirProduto.setEnabled(false);
            getBotaoRetirarProduto().setEnabled(false);
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor...");
            Logger.getLogger(RelacionarFilialGUI.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
    }

    /**
     * @param comboProdutoFilial the comboProdutoFilial to set
     */
    public void setComboProdutoFilial(javax.swing.JComboBox comboProdutoFilial) {
        if ( filial != null ) {
            comboProdutoFilial.removeAllItems();
            produtosFilial = this.filial.getProdutos();
            if ( produtosFilial != null && !produtosFilial.isEmpty() ) {
                botaoIncluirProduto.setEnabled(true);
                for ( Produto p: produtosFilial ) {
                    comboProdutoFilial.addItem(p.getNome());
                }
                
            }
        }
        this.comboProdutoFilial = comboProdutoFilial;
    }

    /**
     * @return the contadorIncluir
     */
    public javax.swing.JSpinner getContadorIncluir() {
        return contadorIncluir;
    }

    /**
     * @param contadorIncluir the contadorIncluir to set
     */
    public void setContadorIncluir(javax.swing.JSpinner contadorIncluir) {
        SpinnerModel sm = new SpinnerNumberModel(0, -50, 100, 2);
        JSpinner spinner = new JSpinner(sm);
        this.contadorIncluir = spinner;
    }

    /**
     * @return the botaoRetirarProduto
     */
    public javax.swing.JButton getBotaoRetirarProduto() {
        return botaoRetirarItemCarrinho;
    }

    /**
     * @param botaoRetirarProduto the botaoRetirarProduto to set
     */
    public void setBotaoRetirarProduto(javax.swing.JButton botaoRetirarProduto) {
        
        this.botaoRetirarItemCarrinho = botaoRetirarProduto;
    }

    /**
     * @return the comboProdutoRetirar
     */
    public javax.swing.JComboBox getComboProdutoRetirar() {
        return comboProdutoRetirar;
    }

    /**
     * @param comboProdutoRetirar the comboProdutoRetirar to set
     */
    public void setComboProdutoRetirar(javax.swing.JComboBox comboProdutoRetirar) {
        if ( !carrinho.getItensCarrinho().isEmpty() ) {
            comboProdutoRetirar.removeAllItems();
            itensCarrinho = carrinho.getItensCarrinho();
            for ( ItemCarrinho ic: itensCarrinho ) {
                comboProdutoRetirar.addItem(ic.getProduto().getNome());
            }
            for ( ItemCarrinho ic: itensCarrinho ) {
                if ( comboProdutoRetirar.getSelectedItem().equals(ic.getProduto().getNome()) ) {
                    itemCarrinhoExcluir = ic;
                    botaoRetirarItemCarrinho.setEnabled(true);
                    botaoFinalizar.setEnabled(true);
                }
            }
        }
        if ( carrinho.getNumeroDeItens() > 0 ) {
            botaoFinalizar.setEnabled(true);
        }
        this.comboProdutoRetirar = comboProdutoRetirar;
    }
    
}
