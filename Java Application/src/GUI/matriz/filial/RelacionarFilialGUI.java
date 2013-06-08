/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.matriz.filial;

import controller.CategoriaController;
import controller.FilialController;
import controller.ProdutoController;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jpa.Categoria;
import jpa.Filial;
import jpa.Produto;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class RelacionarFilialGUI extends javax.swing.JFrame {
    
    private FilialController        filialController    = null;
    private CategoriaController     categoriaController = null;
    private ProdutoController       produtoController   = null;
    private Collection<Produto>     produtosIncluir;
    private Collection<Produto>     produtosFilial;
    private Collection<Categoria>   categorias;
    private Collection<Filial>      filiais;
    private Categoria               categoria;
    private Produto                 produtoIncluir;
    private Produto                 produtoRetirar;
    private Filial                  filial;

    
    /**
     * Creates new form ContatoGUI
     */
    public RelacionarFilialGUI() {
        initComponents();
        setComboFiliais(comboFiliais);
        setComboProdutoFilial(comboProdutoFilial);
        setComboCategoria(comboCategoria);
        updateTable();
    }
    
    public void setControllers() {
        
        try {
            filialController = new FilialController();
            categoriaController = new CategoriaController();
            produtoController = new ProdutoController();
        } catch (Exception ex) {
            botaoIncluirProduto.setEnabled(false);
            botaoRetirarProduto.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor...");
            Logger.getLogger(RelacionarFilialGUI.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        itsolution_logo = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        panelIncluir = new javax.swing.JPanel();
        botaoIncluirProduto = new javax.swing.JButton();
        nomeCategoria = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox();
        nomeProduto = new javax.swing.JLabel();
        comboProduto = new javax.swing.JComboBox();
        panelRetirar = new javax.swing.JPanel();
        botaoRetirarProduto = new javax.swing.JButton();
        nomeProdutoRetirar = new javax.swing.JLabel();
        comboProdutoFilial = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        nomeFilial = new javax.swing.JLabel();
        comboFiliais = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contatos");

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Produto x Filial");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        itsolution_logo.setText("ITSolution");

        botaoVoltar.setText("Voltar");
        botaoVoltar.setToolTipText("");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        panelIncluir.setBorder(javax.swing.BorderFactory.createTitledBorder("Incluir"));

        botaoIncluirProduto.setText("Incluir");
        botaoIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirProdutoActionPerformed(evt);
            }
        });

        nomeCategoria.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoria.setText("Categoria:");

        comboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCategoriaItemStateChanged(evt);
            }
        });

        nomeProduto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeProduto.setText("Produto:");

        comboProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProdutoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelIncluirLayout = new javax.swing.GroupLayout(panelIncluir);
        panelIncluir.setLayout(panelIncluirLayout);
        panelIncluirLayout.setHorizontalGroup(
            panelIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIncluirLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoIncluirProduto))
                    .addGroup(panelIncluirLayout.createSequentialGroup()
                        .addComponent(nomeCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelIncluirLayout.createSequentialGroup()
                        .addComponent(nomeProduto)
                        .addGap(18, 18, 18)
                        .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelIncluirLayout.setVerticalGroup(
            panelIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIncluirLayout.createSequentialGroup()
                .addGroup(panelIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCategoria)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeProduto)
                    .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoIncluirProduto)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panelRetirar.setBorder(javax.swing.BorderFactory.createTitledBorder("Retirar"));

        botaoRetirarProduto.setText("Retirar");
        botaoRetirarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRetirarProdutoActionPerformed(evt);
            }
        });

        nomeProdutoRetirar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeProdutoRetirar.setText("Produto:");

        comboProdutoFilial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProdutoFilialItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelRetirarLayout = new javax.swing.GroupLayout(panelRetirar);
        panelRetirar.setLayout(panelRetirarLayout);
        panelRetirarLayout.setHorizontalGroup(
            panelRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRetirarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRetirarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoRetirarProduto))
                    .addGroup(panelRetirarLayout.createSequentialGroup()
                        .addComponent(nomeProdutoRetirar)
                        .addGap(27, 27, 27)
                        .addComponent(comboProdutoFilial, 0, 230, Short.MAX_VALUE))))
        );
        panelRetirarLayout.setVerticalGroup(
            panelRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRetirarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProdutoFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeProdutoRetirar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoRetirarProduto)
                .addGap(17, 17, 17))
        );

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nome", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tabelaProdutos);

        nomeFilial.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeFilial.setText("Filial:");

        comboFiliais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFiliaisItemStateChanged(evt);
            }
        });
        comboFiliais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiliaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(itsolution_logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(panelIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panelRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nomeFilial)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(comboFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itsolution_logo)
                    .addComponent(title))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFilial)
                    .addComponent(comboFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoVoltar)
                .addGap(279, 279, 279))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-706)/2, (screenSize.height-538)/2, 706, 538);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
        new GUI.matriz.MatrizInicial().setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void comboProdutoFilialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProdutoFilialItemStateChanged
        setControllers();
        if ( this.filial != null  ) {
            this.produtosFilial = filial.getProdutos();
            if ( this.produtosFilial != null && !this.produtosFilial.isEmpty() ) {
                for ( Produto p: this.produtosFilial ) {
                    if ( p.getNome().equals( this.comboProdutoFilial.getSelectedItem() ) ) {
                        produtoRetirar = p;
                    }
                }
            }
        }
    }//GEN-LAST:event_comboProdutoFilialItemStateChanged

    private void comboFiliaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiliaisItemStateChanged

        setControllers();
        this.filiais = filialController.findAll();
        
        if (this.filiais != null && !this.filiais.isEmpty()) {
            for (Filial f : this.filiais) {
                if (f.getNome().equals(this.comboFiliais.getSelectedItem().toString())) {
                    this.filial = f;
                }
            }
        }
        setComboProdutoFilial(this.comboProdutoFilial);
        updateTable();
    }//GEN-LAST:event_comboFiliaisItemStateChanged

    private void comboProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProdutoItemStateChanged

        //selecionar o produto na variável produtoRetirar
        if( filial != null ) {
            produtosFilial = filial.getProdutos();
            if ( produtosFilial != null && !produtosFilial.isEmpty() ) {
                if ( comboProdutoFilial != null ) {
                    for ( Produto p: produtosFilial ) {
                        if ( p.getNome().equals( comboProdutoFilial.getSelectedItem().toString() ) ) {
                            produtoIncluir = p;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_comboProdutoItemStateChanged

    private void comboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoriaItemStateChanged
        
        setControllers();
        this.categorias = categoriaController.findAll();
        if ( this.categorias != null && !this.categorias.isEmpty() ) {
            for ( Categoria c: this.categorias ) {
                if ( c.getNome().equals(comboCategoria.getSelectedItem().toString()) ) {
                    categoria = c;
                    setComboProduto( this.comboProduto );
                }
            }
        } 
    }//GEN-LAST:event_comboCategoriaItemStateChanged

    private void comboFiliaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiliaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiliaisActionPerformed

    private void botaoIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirProdutoActionPerformed
        setControllers();
        if ( filial != null ) {
            if ( categoria != null ) {
                if ( produtoIncluir != null ) {
                    if ( produtosFilial != null ) {
                        produtoIncluir.setFilial(filial);
                        produtosFilial.add(produtoIncluir);
                        
                        try{
                            filial.setProdutos(produtosFilial);
                        } catch(Exception e) {
                            System.err.println(e.getMessage());
                        }

                        filialController.edit(filial);
                        Produto novoProdutoFilial = new Produto();
                        novoProdutoFilial.setNome(produtoIncluir.getNome());
                        novoProdutoFilial.setPreco(produtoIncluir.getPreco());
                        novoProdutoFilial.setDescricao(produtoIncluir.getDescricao());
                        novoProdutoFilial.setQuantidade(produtoIncluir.getQuantidade());
                        novoProdutoFilial.setFilial(produtoIncluir.getFilial());
                        produtoController.create(novoProdutoFilial);
                        
                        setComboProdutoFilial(comboProdutoFilial);
                        setComboProduto(comboProduto);
                        updateTable();
                        //JOptionPane.showMessageDialog(null, "Produto " + produtoIncluir.getNome() + " foi relacionado a filial " + filial.getNome() + " com sucesso!" );
                       
                    } else { JOptionPane.showMessageDialog(null, "ERRO 001." ); } //produtosFilial == null
                } else { JOptionPane.showMessageDialog(null, "Erro 002. Não há produto selecionado para relacionar."); }
            } else { JOptionPane.showMessageDialog(null, "Erro 003. Não há uma categoria selecionada."); }
        }
    }//GEN-LAST:event_botaoIncluirProdutoActionPerformed

    private void botaoRetirarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRetirarProdutoActionPerformed
        if ( filial != null ) {
            if( produtoRetirar != null ) {
                filial.getProdutos().remove(produtoRetirar);
                filialController.edit(filial);
                setComboProdutoFilial(comboProdutoFilial);
                setComboProduto(comboProduto);
                updateTable();
            }
            
        }
    }//GEN-LAST:event_botaoRetirarProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoIncluirProduto;
    private javax.swing.JButton botaoRetirarProduto;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox comboCategoria;
    private javax.swing.JComboBox comboFiliais;
    private javax.swing.JComboBox comboProduto;
    private javax.swing.JComboBox comboProdutoFilial;
    private javax.swing.JLabel itsolution_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeCategoria;
    private javax.swing.JLabel nomeFilial;
    private javax.swing.JLabel nomeProduto;
    private javax.swing.JLabel nomeProdutoRetirar;
    private javax.swing.JPanel panelIncluir;
    private javax.swing.JPanel panelRetirar;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    
    public javax.swing.JComboBox getComboFiliais() {
        return comboFiliais;
    }

    
    public void setComboFiliais(javax.swing.JComboBox comboFiliais) {
        setControllers();
        filiais = filialController.findAll();
        
        if ( !filiais.isEmpty() ) {
            for ( Filial f: filiais ) {
                comboFiliais.addItem(f.getNome());
            }
            for ( Filial f: filiais ) {
                if ( f.getNome().equals( comboFiliais.getSelectedItem().toString() ) ) {
                    filial = f;
                }
            }
        }
        this.comboFiliais = comboFiliais;
    }
    
    public javax.swing.JComboBox getComboCategoria() {
        return comboCategoria;
    }

    public void setComboCategoria(javax.swing.JComboBox comboCategoria) {

        setControllers();

        categorias = categoriaController.findAll();
        comboCategoria.removeAllItems();
        
        if (categorias != null && !categorias.isEmpty()) {
            for (Categoria categ : categorias) {
                comboCategoria.addItem(categ.getNome());
            }
            for (Categoria categ : categorias) {
                if (categ.getNome().equals(comboCategoria.getSelectedItem())) {
                    categoria = categ;
                }
            }
        }

        this.comboCategoria = comboCategoria;
    }

    /**
     * @return the comboProduto
     */
    public javax.swing.JComboBox getComboProduto() {
        return comboProduto;
    }

    /**
     * @param comboProduto the comboProduto to set
     */
    public void setComboProduto(javax.swing.JComboBox comboProduto) {
 
        if ( this.categorias != null && !this.categorias.isEmpty() ) {
            for ( Categoria categ : categorias ) {
                if ( categ.getNome().equals( comboCategoria.getSelectedItem() ) ) {
                    categoria = categ;
                }
            }
            produtosIncluir = categoria.getProdutos();
            produtosFilial = filial.getProdutos();
            comboProduto.removeAllItems();
            for (Produto prod : produtosIncluir) {
                if ( !produtosFilial.contains(prod) ) {
                    comboProduto.addItem(prod.getNome());
                }
            }
            for (Produto p: produtosIncluir) {
                if ( comboProduto.getSelectedItem() != null && comboProduto.getSelectedItem().equals( p.getNome() ) ) {
                    produtoIncluir = p;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há categorias cadastradas.");
        }
        this.comboProduto = comboProduto;
    }

    /**
     * @return the comboProdutoFilial
     */
    public javax.swing.JComboBox getComboProdutoFilial() {
        return comboProdutoFilial;
    }

    /**
     * @param comboProdutoFilial the comboProdutoFilial to set
     */
    public void setComboProdutoFilial(javax.swing.JComboBox comboProdutoFilial) {
        setControllers();
        if ( filial != null ) {
            produtosFilial = filial.getProdutos();
            if ( this.produtosFilial != null && !produtosFilial.isEmpty() ) {
                comboProdutoFilial.removeAllItems();
                for ( Produto p: this.produtosFilial ) {
                    comboProdutoFilial.addItem(p.getNome());
                }
                updateTable();
            } else {
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Não há filiais cadastradas.");
        }
        this.comboProdutoFilial = comboProdutoFilial;
    }
    
    private void updateTable() {
        setControllers();
        if ( filial != null ) {
            Produto[] produtos = filial.getProdutos().toArray(new Produto[0]);
            Object[][] objects = new Object[produtos.length][2];
            for (int i = 0; i < produtos.length; i++) {
                objects[i][0] = produtos[i].getNome();
                objects[i][1] = produtos[i].getQuantidade();
            }
            this.tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
                objects,
                new String[]{ "Produto", "Qtd" }));
        }
    }
}
