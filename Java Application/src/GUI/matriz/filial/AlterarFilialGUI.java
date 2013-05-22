/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.matriz.filial;

import controller.FilialController;
import javax.swing.JOptionPane;
import jpa.ItemCarrinho;

/**
 *
 * @author GPinzegher
 */
public class AlterarFilialGUI extends javax.swing.JFrame {

    private FilialController filialController = null;
    private ItemCarrinho[] filiais;
    //private String categoriaAtual;

    /**
     * Creates new form ContatoGUI
     */
    public AlterarFilialGUI() {
        initComponents();
        setComboFilial(comboFilial);
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
        comboFilial = new javax.swing.JComboBox();
        nomeCategoriaText4 = new javax.swing.JLabel();
        textNovoNomeCategoria = new javax.swing.JTextField();
        botaoAlterarCategoria = new javax.swing.JButton();
        botaoVoltarExcluirCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contatos");

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Alterar Filial");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        itsolution_logo.setText("ITSolution");

        panelIncluirCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        nomeCategoriaText3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText3.setText("Filial:");

        comboFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFilialActionPerformed(evt);
            }
        });

        nomeCategoriaText4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText4.setText("Novo Nome:");

        textNovoNomeCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNovoNomeCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIncluirCategoriaLayout = new javax.swing.GroupLayout(panelIncluirCategoria);
        panelIncluirCategoria.setLayout(panelIncluirCategoriaLayout);
        panelIncluirCategoriaLayout.setHorizontalGroup(
            panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncluirCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeCategoriaText3)
                    .addComponent(nomeCategoriaText4))
                .addGap(18, 18, 18)
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboFilial, 0, 354, Short.MAX_VALUE)
                    .addComponent(textNovoNomeCategoria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIncluirCategoriaLayout.setVerticalGroup(
            panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIncluirCategoriaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCategoriaText3)
                    .addComponent(comboFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIncluirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCategoriaText4)
                    .addComponent(textNovoNomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        botaoAlterarCategoria.setText("Alterar");
        botaoAlterarCategoria.setToolTipText("");
        botaoAlterarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarCategoriaActionPerformed(evt);
            }
        });

        botaoVoltarExcluirCategoria.setText("Voltar");
        botaoVoltarExcluirCategoria.setToolTipText("");
        botaoVoltarExcluirCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarExcluirCategoriaActionPerformed(evt);
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
                                .addComponent(botaoVoltarExcluirCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoAlterarCategoria)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAlterarCategoria)
                    .addComponent(botaoVoltarExcluirCategoria))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-499)/2, (screenSize.height-241)/2, 499, 241);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAlterarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarCategoriaActionPerformed
        
        for (int i = 0; i < filiais.length; i++) {
            if (filiais[i].getNome().equals(comboFilial.getSelectedItem().toString())) {
                if (!filiais[i].getNome().equals(textNovoNomeCategoria.getText())) {
                    dispose();
                    JOptionPane.showMessageDialog(null, "Filial '" + filiais[i].getNome()
                            + "' alterado para '" + textNovoNomeCategoria.getText() + "' com sucesso.");
                    filiais[i].setNome(textNovoNomeCategoria.getText());
                    filialController.edit(filiais[i]);

                    new AlterarFilialGUI().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Filial não alterada.");
                }

            }
        }
        setComboFilial(comboFilial);
    }//GEN-LAST:event_botaoAlterarCategoriaActionPerformed

    private void comboFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFilialActionPerformed
        //categoriaAtual = comboCategoria.getSelectedItem().toString();
    }//GEN-LAST:event_comboFilialActionPerformed

    private void botaoVoltarExcluirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarExcluirCategoriaActionPerformed
        new GUI.matriz.MatrizInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarExcluirCategoriaActionPerformed

    private void textNovoNomeCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNovoNomeCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNovoNomeCategoriaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterarCategoria;
    private javax.swing.JButton botaoVoltarExcluirCategoria;
    private javax.swing.JComboBox comboFilial;
    private javax.swing.JLabel itsolution_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeCategoriaText3;
    private javax.swing.JLabel nomeCategoriaText4;
    private javax.swing.JPanel panelIncluirCategoria;
    private javax.swing.JTextField textNovoNomeCategoria;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the comboCategoria
     */
    public javax.swing.JComboBox getComboCategoria() {
        return comboFilial;
    }

    /**
     * @param comboFilial the comboCategoria to set
     */
    public void setComboFilial(javax.swing.JComboBox comboFilial) {
        try {
            if (filialController == null) {
                filialController = new FilialController();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar com o servidor...");
            return;
        }
        System.out.println("Criando array de categorias");
        filiais = filialController.findAll().toArray(new ItemCarrinho[0]);
        System.out.println("Removendo itens da lista");
        comboFilial.removeAllItems();

        System.out.println("Criando array");
        String[] itens = new String[filiais.length];
        for (int i = 0; i < filiais.length; i++) {
            itens[i] = filiais[i].getNome();
            comboFilial.addItem(itens[i]);
        }
        //comboCategoria.setModel(new javax.swing.DefaultComboBoxModel(categorias));
    }
    /**
     * @param comboCategoria comboCategoria to set
     */
}