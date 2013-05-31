/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.matriz.filial;

import controller.FilialController;
import javax.swing.JOptionPane;
import jpa.Filial;


/**
 *
 * @author GPinzegher
 */
public class ExcluirFilialGUI extends javax.swing.JFrame {
    
    private FilialController filialController = null;
    private Filial[] filiais;
    
    /**
     * Creates new form ContatoGUI
     */
    
    public ExcluirFilialGUI() {
        initComponents();
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
        botaoExcluirCategoria = new javax.swing.JButton();
        botaoVoltarExcluirCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contatos");

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Excluir Filial");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        itsolution_logo.setText("ITSolution");

        panelIncluirCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        nomeCategoriaText3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeCategoriaText3.setText("Filial:");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoExcluirCategoria.setText("Excluir");
        botaoExcluirCategoria.setToolTipText("");
        botaoExcluirCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirCategoriaActionPerformed(evt);
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
                                .addGap(0, 73, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoVoltarExcluirCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoExcluirCategoria)))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluirCategoria)
                    .addComponent(botaoVoltarExcluirCategoria))
                .addContainerGap(26, Short.MAX_VALUE))
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
        setBounds((screenSize.width-521)/2, (screenSize.height-224)/2, 521, 224);
    }// </editor-fold>//GEN-END:initComponents
    
    
        
    private void botaoExcluirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirCategoriaActionPerformed
        //categoriaController.remove((Categoria)comboCategoria.getSelectedItem());
        for (int i = 0; i<filiais.length; i++) {
            
            if (comboCategoria.getSelectedItem().toString().equals(filiais[i].getNome())) {
                filialController.remove(filiais[i]);
                JOptionPane.showMessageDialog(null, "Filial '" + filiais[i].getNome() + "' removida com sucesso.");
            }
        }
        setComboCategoria(comboCategoria);
    }//GEN-LAST:event_botaoExcluirCategoriaActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void botaoVoltarExcluirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarExcluirCategoriaActionPerformed
        new GUI.matriz.MatrizInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarExcluirCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluirCategoria;
    private javax.swing.JButton botaoVoltarExcluirCategoria;
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
            if (filialController == null) {
                filialController = new FilialController();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar com o servidor...");
            return;
        }
        System.out.println("Criando array de categorias");
        filiais = filialController.findAll().toArray(new Filial[0]);
        System.out.println("Removendo itens da lista");
        comboCategoria.removeAllItems();
        
        System.out.println("Criando array");
        String[] itens = new String[filiais.length];
        for (int i = 0; i<filiais.length; i++) {
            System.out.println(filiais[i].getNome());
            itens[i] = filiais[i].getNome();
            comboCategoria.addItem(itens[i]);
        }
        //comboCategoria.setModel(new javax.swing.DefaultComboBoxModel(categorias));
    }

    /**
     * @param comboCategoria comboCategoria to set
     */
    

}
