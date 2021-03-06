/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import GUI.matriz.categoria.*;
import controller.CategoriaController;
import javax.swing.JOptionPane;
import jpa.Categoria;


/**
 *
 * @author Calebe de Paula Bianchini
 */
public class ExcluirCategoriaGUI extends javax.swing.JFrame {
    
    private CategoriaController categoriaController = null;
    private Categoria[] categorias;
    
    /**
     * Creates new form ContatoGUI
     */
    
    public ExcluirCategoriaGUI() {
        initComponents();
        JOptionPane.showMessageDialog(null, "TESTE");
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
        nomeCategoriaText3 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contatos");

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Excluir Categoria");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        itsolution_logo.setText("ITSolution");

        panelIncluirCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        nomeCategoriaText3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText3.setText("Categoria:");

        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIncluirCategoriaLayout = new javax.swing.GroupLayout(panelIncluirCategoria);
        panelIncluirCategoria.setLayout(panelIncluirCategoriaLayout);
        panelIncluirCategoriaLayout.setHorizontalGroup(
            panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncluirCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeCategoriaText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboCategoria, 0, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelIncluirCategoriaLayout.setVerticalGroup(
            panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncluirCategoriaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCategoriaText3)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnCadastrar.setText("Excluir");
        btnCadastrar.setToolTipText("");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
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
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelIncluirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCadastrar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itsolution_logo)
                    .addComponent(title))
                .addGap(18, 18, 18)
                .addComponent(panelIncluirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-483)/2, (screenSize.height-215)/2, 483, 215);
    }// </editor-fold>//GEN-END:initComponents
    
    
        
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        for (int i = 0; i<categorias.length; i++) {
            if (comboCategoria.getSelectedItem().equals(categorias[i])) {
                categoriaController.remove((Categoria)categorias[i]);
            }
        }
        //categoriaController.remove((Categoria)comboCategoria.getSelectedItem());
        setComboCategoria(comboCategoria);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox comboCategoria;
    private javax.swing.JLabel itsolution_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeCategoriaText3;
    private javax.swing.JPanel panelIncluirCategoria;
    private javax.swing.JLabel title;
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
        try {
            if (categoriaController == null) {
                categoriaController = new CategoriaController();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar com o servidor...");
            return;
        }
        categorias = categoriaController.findAll().toArray(new Categoria[0]);
        String[] itens = new String[categorias.length];
        for (int i = 0; i<categorias.length; i++) {
            itens[i] = categorias[i].getNome();
            comboCategoria.addItem(itens[i]);
        }
        //comboCategoria.setModel(new javax.swing.DefaultComboBoxModel(categorias));
        //comboCategoria.addItem(categoriaController.findAll());
        
        
    }

    /**
     * @param comboCategoria comboCategoria to set
     */
    

}
