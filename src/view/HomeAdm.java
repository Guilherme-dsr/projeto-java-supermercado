
package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;

public class HomeAdm extends javax.swing.JFrame {

    /**
     * Creates new form homeAdm
     */
    public HomeAdm() {
        initComponents();
         Date da = new Date();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd / MM / YYYY"); 
        data.setText(formato.format(da));
        
        Timer t = new Timer(1000,new view.HomeAdm.hora());
        t.start();
        
        URL caminhoIcone = getClass().getResource("/img/Logo.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sair = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bemv = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Adiministrador ");
        getContentPane().setLayout(null);

        sair.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        sair.setText("  Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(140, 80, 70, 20);

        data.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(data);
        data.setBounds(670, 20, 100, 20);

        hora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(hora);
        hora.setBounds(560, 20, 90, 20);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Cadastro");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 390, 80, 20);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("    Funcionário");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 400, 110, 30);

        bemv.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        bemv.setText("  (Adiministrador)");
        getContentPane().add(bemv);
        bemv.setBounds(340, 100, 200, 50);

        jLabel5.setFont(new java.awt.Font("TlwgTypewriter", 1, 18)); // NOI18N
        jLabel5.setText("Vendas/Produtos");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(580, 160, 170, 27);

        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("Cadastro de Cliente");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 210, 140, 18);

        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("Cadastro de Fornecedor");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 250, 170, 18);

        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("Cadastro de Produto");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 290, 150, 18);

        jLabel9.setFont(new java.awt.Font("TlwgTypewriter", 1, 18)); // NOI18N
        jLabel9.setText("Cadastros");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 160, 110, 27);

        jLabel10.setFont(new java.awt.Font("TlwgTypewriter", 1, 18)); // NOI18N
        jLabel10.setText("Todas as Home");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(370, 160, 160, 27);

        jLabel12.setForeground(java.awt.Color.red);
        jLabel12.setText("Produtos");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(580, 290, 140, 18);

        jLabel13.setForeground(java.awt.Color.red);
        jLabel13.setText("Home Cliente");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(360, 250, 120, 18);

        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setText("Home Funcionário");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(360, 210, 140, 18);

        jLabel15.setForeground(java.awt.Color.red);
        jLabel15.setText("Vendas Funcionário");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15);
        jLabel15.setBounds(580, 210, 140, 18);

        jLabel16.setForeground(java.awt.Color.red);
        jLabel16.setText("Vendas Cliente");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16);
        jLabel16.setBounds(580, 250, 140, 18);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MenuAdmin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 840, 520);

        setSize(new java.awt.Dimension(790, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
    Login sair = new Login();
    sair.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_sairMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    CadastroFun cadastro= new CadastroFun();
    cadastro.setVisible(true);
    this.setVisible(false); 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    CadastroFun cadastro= new CadastroFun();
    cadastro.setVisible(true);
    this.setVisible(false); 
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    CadastroCli cadastro= new CadastroCli();
    cadastro.setVisible(true);
    
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    CadastroFor cadastro= new CadastroFor();
    cadastro.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    CadastroPro cadastro= new CadastroPro();
    cadastro.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
    HomeFun cadastro= new HomeFun();
    cadastro.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
    HomeCli cadastro= new HomeCli();
    cadastro.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
    Vendas cadastro= new Vendas();
    cadastro.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
    CompraCli cadastro= new CompraCli();
    cadastro.setVisible(true);
    
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
    Produtos cadastro= new Produtos();
    cadastro.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(HomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemv;
    private javax.swing.JLabel data;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel sair;
    // End of variables declaration//GEN-END:variables

  public class hora implements ActionListener{
    @Override
    public void actionPerformed (ActionEvent e){
        Calendar c = Calendar.getInstance();
         hora.setText(String.format("%1$tH:%1$tM:%1$tS", c)); {
        }
    }
    }}
