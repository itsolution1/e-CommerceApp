/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.matriz.produto;

import GUI.matriz.MatrizInicial;
import controller.CategoriaController;
import controller.ProdutoController;
import java.util.List;
import javax.swing.JOptionPane;
import jpa.Categoria;
import jpa.Produto;


/**
 *
 * @author GPinzegher
 */
public class InserirProdutoGUI extends javax.swing.JFrame {
    
    private CategoriaController categoriaController = null;
    private ProdutoController produtoController = null;
    private List<Categoria> categorias;
    private Categoria categoria;
    
    /**
     * Creates new form ContatoGUI
     */
    
    public InserirProdutoGUI() {
        initComponents();
        //setCategorias();
        setComboCategoria(comboCategoria);
    }
    
    //tabela com as categorias
 

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
        nomeCategoriaText3 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox();
        botaoCadastrar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contatos");

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Incluir Produto");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        itsolution_logo.setText("ITSolution");

        panelIncluirCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        nomeCategoriaText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText.setText("Nome:");

        nomeCategoriaText1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText1.setText("Descrição:");

        nomeCategoriaText2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText2.setText("Preço:");

        nomeCategoriaText3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText3.setText("Categoria:");

        comboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCategoriaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelIncluirCategoriaLayout = new javax.swing.GroupLayout(panelIncluirCategoria);
        panelIncluirCategoria.setLayout(panelIncluirCategoriaLayout);
        panelIncluirCategoriaLayout.setHorizontalGroup(
            panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncluirCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIncluirCategoriaLayout.createSequentialGroup()
                        .addComponent(nomeCategoriaText3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelIncluirCategoriaLayout.createSequentialGroup()
                        .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCategoriaText1)
                            .addComponent(nomeCategoriaText)
                            .addComponent(nomeCategoriaText2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIncluirCategoriaLayout.createSequentialGroup()
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 324, Short.MAX_VALUE))
                            .addComponent(txtNome)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelIncluirCategoriaLayout.setVerticalGroup(
            panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncluirCategoriaLayout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCategoriaText3)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(itsolution_logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelIncluirCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itsolution_logo)
                    .addComponent(title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(panelIncluirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.setToolTipText("");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 451, Short.MAX_VALUE)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCadastrar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoVoltar)))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-650)/2, (screenSize.height-402)/2, 650, 402);
    }// </editor-fold>//GEN-END:initComponents
    
    
        
    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed

        Produto produto = null;
        try {
            if (produtoController == null) {
                produtoController = new ProdutoController();
            } if ( categoriaController == null) {
                categoriaController = new CategoriaController();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar com o servidor...");
            return;
        }
        produto = new Produto(txtNome.getText(), txtDescricao.getText(), txtPreco.getText());

        try {
            categoria.getProdutos().add(produto);
            categoriaController.edit(categoria);
            JOptionPane.showMessageDialog(null, "Produto " + produto.getNome() + " cadastrado com sucesso.");
            new MatrizInicial().setVisible(true);
            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao gravar produto: " + produto.getNome());
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
        new GUI.matriz.MatrizInicial().setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void comboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoriaItemStateChanged
        for(Categoria categ: categorias){
            if(categ.getNome().equals(comboCategoria.getSelectedItem())) {
                categoria = categ;
            }
        }
    }//GEN-LAST:event_comboCategoriaItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox comboCategoria;
    private javax.swing.JLabel itsolution_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeCategoriaText;
    private javax.swing.JLabel nomeCategoriaText1;
    private javax.swing.JLabel nomeCategoriaText2;
    private javax.swing.JLabel nomeCategoriaText3;
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
            if(categ.getNome().equals(comboCategoria.getSelectedItem())) {
                categoria = categ;
            }
        }
    }
    
//    public void setCategorias(){
//       categorias = categoriaController.findAll(); 
//    }
    

}
