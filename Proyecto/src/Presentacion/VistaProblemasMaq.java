/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author joan
 */
public class VistaProblemasMaq extends javax.swing.JFrame {
    
    private int difBlanco = 0;  //1 -> FACIL, 2 -> DIFICIL
    private int difNegro = 0;  
    private CtrlPresentacionUsuarios u = new CtrlPresentacionUsuarios();
    public VistaProblemasMaq(CtrlPresentacionUsuarios u) {
        this.u = u;
        DefaultListModel<String> listModel = new DefaultListModel<>();
        CtrlPresentacionCtrlProblemas cp = new CtrlPresentacionCtrlProblemas();
        for (int i = 0; i < cp.getAllProblemasJuegoSize(); ++i) {
            listModel.addElement("Problema "+cp.getId(i)+". Movimientos: "+cp.getnumMov(i));
        }
        
        initComponents();
        setSize(800,800);
        setTitle("Competición entre máquinas");
        this.setLocationRelativeTo(null);
        JLista.setModel(listModel);
        JLista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        setResizable(false);
        
        DificultadNegro.add(FacilNegro);
        DificultadNegro.add(DificilNegro);
        DificultadBlanco.add(FacilBlanco);
        DificultadBlanco.add(DificilBlanco);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DificultadNegro = new javax.swing.ButtonGroup();
        DificultadBlanco = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLista = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Competicion = new javax.swing.JButton();
        FacilNegro = new javax.swing.JRadioButton();
        FacilBlanco = new javax.swing.JRadioButton();
        DificilBlanco = new javax.swing.JRadioButton();
        DificilNegro = new javax.swing.JRadioButton();
        Ranking = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel1.setText("COMPETICIÓN ENTRE MÁQUINAS");

        JLista.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        JLista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JLista);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/WHITE.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/BLACK.png"))); // NOI18N

        Competicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/CROSSEDSWORDS.png"))); // NOI18N
        Competicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompeticionActionPerformed(evt);
            }
        });

        FacilNegro.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        FacilNegro.setText("Facil");
        FacilNegro.setActionCommand("FacilNegro");
        FacilNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacilNegroActionPerformed(evt);
            }
        });

        FacilBlanco.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        FacilBlanco.setText("Facil");
        FacilBlanco.setActionCommand("FacilBlanco");
        FacilBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacilBlancoActionPerformed(evt);
            }
        });

        DificilBlanco.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        DificilBlanco.setText("Dificil");
        DificilBlanco.setActionCommand("DificilBlanco");
        DificilBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DificilBlancoActionPerformed(evt);
            }
        });

        DificilNegro.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        DificilNegro.setText("Dificil");
        DificilNegro.setActionCommand("DificilNegro");
        DificilNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DificilNegroActionPerformed(evt);
            }
        });

        Ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/ranking.png"))); // NOI18N
        Ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingActionPerformed(evt);
            }
        });

        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/back (2).png"))); // NOI18N
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/ojo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cancel)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ranking)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DificilBlanco)
                                    .addComponent(FacilBlanco)))
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addComponent(Competicion)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DificilNegro)
                                    .addComponent(FacilNegro))))))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ranking)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FacilBlanco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DificilBlanco))
                            .addComponent(Competicion))
                        .addGap(53, 53, 53)
                        .addComponent(Cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FacilNegro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DificilNegro)))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FacilNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacilNegroActionPerformed
        difNegro = 1;
    }//GEN-LAST:event_FacilNegroActionPerformed

    private void FacilBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacilBlancoActionPerformed
        difBlanco = 1;
    }//GEN-LAST:event_FacilBlancoActionPerformed

    private void DificilBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DificilBlancoActionPerformed
        difBlanco = 2;
    }//GEN-LAST:event_DificilBlancoActionPerformed

    private void DificilNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DificilNegroActionPerformed
        difNegro = 2;
    }//GEN-LAST:event_DificilNegroActionPerformed

    private void RankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingActionPerformed
        if (selectProblems().length == 1) { 
            VistaRanking r = new VistaRanking(u, selectProblem()+1, "PM");
            setVisible(false);
            r.setVisible(true);
        }
        else {
            JLabel label2 = new JLabel("Escoge un solo problema para ver el ranking");
            label2.setFont(new Font("Dialog", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, label2, "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_RankingActionPerformed

    private void CompeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompeticionActionPerformed
        if (difBlanco != 0 && difNegro != 0 && selectProblems().length > 0) {
            int res[] = selectProblems();
            CtrlPresentacionJugarMaq ctrlJ = new CtrlPresentacionJugarMaq(difBlanco,difNegro,res[0]+1); //inicializo la partida en dominio
            ctrlJ.playNProblemas(res);
            JLabel label2 = new JLabel("Puntuación blanca: "+ ctrlJ.getPuntuacionM1()+" Puntuación negra: "+ ctrlJ.getPuntuacionM2());
            label2.setFont(new Font("Dialog", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, label2, "Resultados", JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null,"Puntuación blanca: "+ ctrlJ.getPuntuacionM1()+" Puntuación negra: "+ ctrlJ.getPuntuacionM2());
            if (ctrlJ.getPuntuacionM1() > ctrlJ.getPuntuacionM2()) {
                JLabel label1 = new JLabel("Gana la blanca");
                label1.setFont(new Font("Dialog", Font.PLAIN, 18));
                JOptionPane.showMessageDialog(null, label1, "Resultados", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(ctrlJ.getPuntuacionM1() < ctrlJ.getPuntuacionM2()) {
                JLabel label1 = new JLabel("Gana la negra");
                label1.setFont(new Font("Dialog", Font.PLAIN, 18));
                JOptionPane.showMessageDialog(null, label1, "Resultados", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JLabel label1 = new JLabel("Empate");
                label1.setFont(new Font("Dialog", Font.PLAIN, 18));
                JOptionPane.showMessageDialog(null, label1, "Resultados", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            JLabel label1 = new JLabel("Escoja los parametros correctamente");
            label1.setFont(new Font("Dialog", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, label1, "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_CompeticionActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        VistaMenu m = new VistaMenu(u);
        setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_CancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (selectProblems().length == 1) {
            VistaPreview r = new VistaPreview(selectProblem()+1, u);
            r.setVisible(true);
        }
        else {
            JLabel label2 = new JLabel("Escoge un problema para ver su vista previa");
            label2.setFont(new Font("Dialog", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, label2, "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public int selectProblem() {
        return JLista.getSelectedIndex();
    }
    public int[] selectProblems() {
        return JLista.getSelectedIndices();
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
            java.util.logging.Logger.getLogger(VistaProblemasMaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProblemasMaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProblemasMaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProblemasMaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VistaProblemasMaq().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Competicion;
    private javax.swing.JRadioButton DificilBlanco;
    private javax.swing.JRadioButton DificilNegro;
    private javax.swing.ButtonGroup DificultadBlanco;
    private javax.swing.ButtonGroup DificultadNegro;
    private javax.swing.JRadioButton FacilBlanco;
    private javax.swing.JRadioButton FacilNegro;
    private javax.swing.JList JLista;
    private javax.swing.JButton Ranking;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}