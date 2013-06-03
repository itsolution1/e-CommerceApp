/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.matriz.produto;

import GUI.matriz.MatrizInicial;
import controller.CategoriaController;
import controller.ProdutoController;
import java.util.Collection;
import java.util.List;
import javax.swing.JOptionPane;
import jpa.Categoria;
import jpa.Produto;


/**
 *
 * @author Calebe de Paula Bianchini
 */
public class AlterarProdutoGUI extends javax.swing.JFrame {
    
    private CategoriaController categoriaController = null;
    private ProdutoController produtoController = null;
    private List<Produto> produtos;
    private Collection<Categoria> categorias;
    private Categoria categoria;
    private Produto produto;
    
    
    /**
     * Creates new form ContatoGUI
     */
    
    public AlterarProdutoGUI() {
        initComponents();
        setComboCategoria(comboCategoria);
        setComboProduto(comboProduto);
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
        title = new javax.swing.JLabel();
        itsolution_logo = new javax.swing.JLabel();
        panelIncluirCategoria = new javax.swing.JPanel();
        nomeCategoriaText = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        nomeCategoriaText1 = new javax.swing.JLabel();
        txtDescricao = new java.awt.TextArea();
        nomeCategoriaText2 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        nomeCategoriaText4 = new javax.swing.JLabel();
        comboProduto = new javax.swing.JComboBox();
        botaoVoltar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        nomeCategoriaText3 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contatos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Alterar Produto");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        itsolution_logo.setText("ITSolution");

        panelIncluirCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        nomeCategoriaText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText.setText("Nome:");

        nomeCategoriaText1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText1.setText("Descrição:");

        nomeCategoriaText2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText2.setText("Preço:");

        javax.swing.GroupLayout panelIncluirCategoriaLayout = new javax.swing.GroupLayout(panelIncluirCategoria);
        panelIncluirCategoria.setLayout(panelIncluirCategoriaLayout);
        panelIncluirCategoriaLayout.setHorizontalGroup(
            panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIncluirCategoriaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeCategoriaText1)
                    .addComponent(nomeCategoriaText)
                    .addComponent(nomeCategoriaText2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelIncluirCategoriaLayout.createSequentialGroup()
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 302, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
        );
        panelIncluirCategoriaLayout.setVerticalGroup(
            panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIncluirCategoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCategoriaText)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeCategoriaText1)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCategoriaText2)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        nomeCategoriaText4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText4.setText("Produto:");

        comboProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProdutoItemStateChanged(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.setToolTipText("");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        nomeCategoriaText3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText3.setText("Categoria:");

        comboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCategoriaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addComponent(itsolution_logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelIncluirCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nomeCategoriaText3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nomeCategoriaText4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itsolution_logo)
                    .addComponent(title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeCategoriaText3)
                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeCategoriaText4)
                        .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelIncluirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-650)/2, (screenSize.height-402)/2, 650, 402);
    }// </editor-fold>//GEN-END:initComponents
    
        
    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed

        //Categoria categoria = (Categoria)comboCategoria.getSelectedItem();
        //Produto produto = (Produto)comboProduto.getSelectedItem();
        try {
            if (produtoController == null) {
                produtoController = new ProdutoController();
            }
            if (categoriaController == null) {
                produtoController = new ProdutoController();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar com o servidor...");
            return;
        }
        
        
        try {
            produto.setDescricao(txtDescricao.getText());
            produto.setNome(txtNome.getText());
            produto.setPreco(txtPreco.getText());
            
            produtoController.edit(produto);
            JOptionPane.showMessageDialog(null, "Produto " + produto.getNome() + " alterado com sucesso.");
            new MatrizInicial().setVisible(true);
            dispose();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar produto: " + produto.getNome());
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
        new GUI.matriz.MatrizInicial().setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void comboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoriaItemStateChanged
        for(Categoria categ: categorias){
            if(categ.getNome().equals(comboCategoria.getSelectedItem())) {
                categoria = categ;
                setComboProduto(comboProduto);
            }
        }
    }//GEN-LAST:event_comboCategoriaItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            if (categoriaController == null) {
                categoriaController = new CategoriaController();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar com o servidor...");
            return;
        }
        categorias = categoriaController.findAll();
        comboCategoria.removeAllItems();

        for(Categoria categ: categorias){
            comboCategoria.addItem(categ.getNome());
        }
    }//GEN-LAST:event_formWindowOpened

    private void comboProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProdutoItemStateChanged
        if ( produto == null || produto != comboProduto.getSelectedItem()) {
            produtos = (List)categoria.getProdutos();
            produto = (Produto)comboProduto.getSelectedItem();
        }
        if(produto != null ){
            txtNome.setText(produto.getNome());
            txtDescricao.setText(produto.getDescricao());
            txtPreco.setText(produto.getPreco());
        }
    }//GEN-LAST:event_comboProdutoItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox comboCategoria;
    private javax.swing.JComboBox comboProduto;
    private javax.swing.JLabel itsolution_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeCategoriaText;
    private javax.swing.JLabel nomeCategoriaText1;
    private javax.swing.JLabel nomeCategoriaText2;
    private javax.swing.JLabel nomeCategoriaText3;
    private javax.swing.JLabel nomeCategoriaText4;
    private javax.swing.JPanel panelIncluirCategoria;
    private javax.swing.JLabel title;
    private java.awt.TextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the comboCategoria
     */
    public javax.swing.JComboBox getComboCategoria() {
        return comboCategoria;
    }
    /**
     * @param comboCategoria the comboCategoria to set
     */
    public void setComboCategoria(javax.swing.JComboBox comboCategoria) {
        this.comboCategoria = comboCategoria;
        try {
            if (categoriaController == null) {
                categoriaController = new CategoriaController();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar com o servidor...");
            return;
        }
        categorias = categoriaController.findAll();
        comboCategoria.removeAllItems();

        for(Categoria categ: categorias){
            comboCategoria.addItem(categ.getNome());
        }
        for(Categoria categ: categorias){
            if(categoria.getNome().equals(comboCategoria.getSelectedItem())) {
                categoria = categ;
            }
        }
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
        this.comboProduto = comboProduto;
        try {
            if (produtoController == null) {
                produtoController = new ProdutoController();
            }
            if (categoriaController == null){
                categoriaController = new CategoriaController();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar com o servidor...");
            return;
        }
        for(Categoria categ: categorias){
            if(categ.getNome().equals(comboCategoria.getSelectedItem())){
                categoria = categ;
            }
        }
        produtos = (List)categoria.getProdutos();
        comboProduto.removeAllItems();
        for(Produto prod: produtos){
            comboProduto.addItem(prod);
        }
    }
    
    

    /**
     * @param comboCategoria comboCategoria to set
     */
    

}
