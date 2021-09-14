
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


public class HomeFun extends javax.swing.JFrame {

    public HomeFun() {
        initComponents();
         
        Date da = new Date();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd / MM / YYYY"); 
        data.setText(formato.format(da));
        
        Timer t = new Timer(1000,new view.HomeFun.hora());
        t.start();
        
        
        URL caminhoIcone = getClass().getResource("/img/Logo.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sair = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        Venda = new javax.swing.JLabel();
        cadproduto = new javax.swing.JLabel();
        CadastroPro = new javax.swing.JLabel();
        bemv = new javax.swing.JLabel();
        bemv1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Cadastro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Funcionário");
        getContentPane().setLayout(null);

        sair.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        sair.setText("     Sair");
        sair.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sairAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(120, 70, 90, 40);

        hora.setFont(new java.awt.Font("Garuda", 1, 12)); // NOI18N
        getContentPane().add(hora);
        hora.setBounds(550, 10, 100, 40);

        data.setFont(new java.awt.Font("Garuda", 1, 12)); // NOI18N
        getContentPane().add(data);
        data.setBounds(670, 10, 110, 40);

        Venda.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Venda.setText("   Vendas");
        Venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VendaMouseClicked(evt);
            }
        });
        getContentPane().add(Venda);
        Venda.setBounds(120, 390, 90, 40);

        cadproduto.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cadproduto.setText("  Cadastro");
        cadproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadprodutoMouseClicked(evt);
            }
        });
        getContentPane().add(cadproduto);
        cadproduto.setBounds(220, 390, 90, 20);

        CadastroPro.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        CadastroPro.setText("  Produto");
        CadastroPro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CadastroProMouseMoved(evt);
            }
        });
        CadastroPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastroProMouseClicked(evt);
            }
        });
        getContentPane().add(CadastroPro);
        CadastroPro.setBounds(220, 400, 90, 30);

        bemv.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        bemv.setText("Seja Bem Vindo(a) a rede de supermercados super fortal!");
        getContentPane().add(bemv);
        bemv.setBounds(150, 220, 590, 70);

        bemv1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        bemv1.setText("(Funcionário)");
        getContentPane().add(bemv1);
        bemv1.setBounds(350, 170, 140, 70);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("Cadastre um fornecedor");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 290, 210, 21);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("x");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 0, 13, 29);

        Cadastro.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Cadastro.setForeground(new java.awt.Color(255, 0, 0));
        Cadastro.setText("Cadastre um cliente");
        Cadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastroMouseClicked(evt);
            }
        });
        getContentPane().add(Cadastro);
        Cadastro.setBounds(150, 330, 180, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MenuFuncio.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 820, 540);

        setSize(new java.awt.Dimension(790, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sairAncestorAdded
       
    }//GEN-LAST:event_sairAncestorAdded

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
    Login x = new Login();
    x.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_sairMouseClicked

    private void VendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VendaMouseClicked
    Vendas vendas = new Vendas();
    vendas.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_VendaMouseClicked
    private void CadastroProMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroProMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroProMouseMoved

    private void CadastroProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroProMouseClicked
    CadastroPro cadastro = new CadastroPro();
    cadastro.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_CadastroProMouseClicked

    private void cadprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadprodutoMouseClicked
    CadastroPro Produto = new CadastroPro();
    Produto.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_cadprodutoMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    CadastroFor cadastro = new CadastroFor();
    cadastro.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void CadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroMouseClicked
        CadastroCli tp = new CadastroCli();
        dispose();
        tp.setVisible(true);
    }//GEN-LAST:event_CadastroMouseClicked

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
            java.util.logging.Logger.getLogger(HomeFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastro;
    private javax.swing.JLabel CadastroPro;
    private javax.swing.JLabel Venda;
    private javax.swing.JLabel bemv;
    private javax.swing.JLabel bemv1;
    private javax.swing.JLabel cadproduto;
    private javax.swing.JLabel data;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel sair;
    // End of variables declaration//GEN-END:variables

    public class hora implements ActionListener{
    @Override
    public void actionPerformed (ActionEvent e){
        Calendar c = Calendar.getInstance();
        hora.setText(String.format("%1$tH:%1$tM:%1$tS", c)); {
        }
    }
    }
}
