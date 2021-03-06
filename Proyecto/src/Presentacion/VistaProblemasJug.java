package Presentacion;

import Dominio.CtrlProblemas;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author joan
 */
public class VistaProblemasJug extends javax.swing.JFrame {
    private CtrlPresentacionUsuarios u = new CtrlPresentacionUsuarios();
    private int dificultad = 0;
    
    public VistaProblemasJug(CtrlPresentacionUsuarios u) {
        this.u = u;
        DefaultListModel<String> listModel = new DefaultListModel<>();
        CtrlProblemas cp = new CtrlProblemas();
        for (int i = 0; i < cp.getAllProblemasJuegoSize(); ++i) {
            listModel.addElement("Problema "+cp.getId(i)+". Movimientos: "+cp.getnumMov(i));
        }
        
        initComponents();
        setSize(800,800);
        setTitle("Jugar contra la máquina");
        this.setLocationRelativeTo(null);
        setResizable(false);
        JLista.setModel(listModel);
        JLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setResizable(false);
        
        Dificultad.add(Facil);
        Dificultad.add(Dificil);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dificultad = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLista = new javax.swing.JList<String>();
        jLabel1 = new javax.swing.JLabel();
        Dificil = new javax.swing.JRadioButton();
        Facil = new javax.swing.JRadioButton();
        Cancel = new javax.swing.JButton();
        Play = new javax.swing.JButton();
        Ranking = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLista.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        JLista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        JLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JLista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(JLista);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jLabel1.setText("JUGAR CONTRA LA MÁQUINA");

        Dificil.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        Dificil.setText("Dificil");
        Dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DificilActionPerformed(evt);
            }
        });

        Facil.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        Facil.setText("Facil");
        Facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacilActionPerformed(evt);
            }
        });

        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/back (2).png"))); // NOI18N
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/play.png"))); // NOI18N
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });

        Ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/ranking.png"))); // NOI18N
        Ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(Cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Facil)
                                    .addComponent(Dificil)))
                            .addComponent(Play)
                            .addComponent(Ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Play)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Facil)
                        .addGap(9, 9, 9)
                        .addComponent(Dificil)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(Cancel)
                        .addGap(33, 33, 33))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DificilActionPerformed
        dificultad = 2; //dificil
    }//GEN-LAST:event_DificilActionPerformed
    
    private void FacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacilActionPerformed
        dificultad = 1;
    }//GEN-LAST:event_FacilActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        VistaMenu m = new VistaMenu(u);
        setVisible(false);
        m.setVisible(true); 
    }//GEN-LAST:event_CancelActionPerformed

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        if (dificultad != 0 && selectProblem() > -1) {
            int id = selectProblem()+1;
            VistaPartida vj = new VistaPartida(id,u,"PJ",dificultad);
            setVisible(false);
            vj.setVisible(true); 
        }
        else {
            JLabel label2 = new JLabel("Escoja los parametros correctamente");
            label2.setFont(new Font("Dialog", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, label2, "Error", JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_PlayActionPerformed

    private void RankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingActionPerformed
        if (selectProblem() > -1) {
            VistaRanking r = new VistaRanking(u, selectProblem()+1, "PJ");
            setVisible(false);
            r.setVisible(true); 
        }
        else {
            JLabel label2 = new JLabel("Escoge un problema para ver el ranking");
            label2.setFont(new Font("Dialog", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, label2, "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_RankingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (selectProblem() > -1) {
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
            java.util.logging.Logger.getLogger(VistaProblemasJug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProblemasJug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProblemasJug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProblemasJug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VistaProblemasJug().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JRadioButton Dificil;
    private javax.swing.ButtonGroup Dificultad;
    private javax.swing.JRadioButton Facil;
    private javax.swing.JList<String> JLista;
    private javax.swing.JButton Play;
    private javax.swing.JButton Ranking;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
