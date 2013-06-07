/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.matriz.relatorios;

import GUI.matriz.filial.*;
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
    private Collection<Produto>     produtosIncluir;
    private Collection<Produto>     produtosFilial;
    private Collection<Categoria>   categorias;
    private Collection<Filial>      filiais;
    private Filial                  filial;

    
    /**
     * Creates new form ContatoGUI
     */
    public RelacionarFilialGUI() {
        initComponents();
        setComboFiliais(comboFiliais);
        updateTable();
    }
    
    public void setControllers() {
        
        try {
            filialController = new FilialController();
            
        } catch (Exception ex) {
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
                                    .addComponent(nomeFilial)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(comboFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoVoltar)
                .addGap(106, 106, 106))
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

    private void comboFiliaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiliaisItemStateChanged

        setControllers();
        this.filiais = filialController.findAll();
        
        if (this.filiais != null && !this.filiais.isEmpty()) {
            for (Filial f : this.filiais) {
                if (f.getNome().equals(this.comboFiliais.getSelectedItem().toString())) {
                    this.filial = f;
                    updateTable();
                }
            }
        }
    }//GEN-LAST:event_comboFiliaisItemStateChanged

    private void comboFiliaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiliaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiliaisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox comboFiliais;
    private javax.swing.JLabel itsolution_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeFilial;
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

    /**
     * @param comboProdutoFilial the comboProdutoFilial to set
     */
    
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
                new String[]{ "Produto", "Quantidade" }));
        }
    }
}
