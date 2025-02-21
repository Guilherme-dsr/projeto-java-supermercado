/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FornecedorBean;
import connection.ConnectionFactory;
import dao.FornecedorDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author guilherme
 */
public class CadastroFor extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFor
     */
    public CadastroFor() {
        initComponents();
            URL caminhoIcone = getClass().getResource("/img/Logo.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        
        Date da = new Date();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd / MM / YYYY"); 
        data.setText(formato.format(da));
        
        Timer t = new Timer(1000,new view.CadastroFor.horas());
        t.start();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        data = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        nomefo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        marcafo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        catfo = new javax.swing.JComboBox<>();
        cadastrar = new javax.swing.JLabel();
        pesquisar = new javax.swing.JLabel();
        atualizar = new javax.swing.JLabel();
        deletar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        voltar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        data.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(data);
        data.setBounds(680, 10, 90, 20);

        hora.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hora);
        hora.setBounds(590, 10, 80, 20);
        getContentPane().add(nomefo);
        nomefo.setBounds(330, 160, 149, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 140, 40, 15);
        getContentPane().add(marcafo);
        marcafo.setBounds(330, 230, 149, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Marca:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 210, 42, 15);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Categoria:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 280, 70, 15);

        catfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Limpeza", "Alimentos" }));
        getContentPane().add(catfo);
        catfo.setBounds(330, 300, 130, 30);

        cadastrar.setText("    Cadastrar   ");
        cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(190, 380, 90, 40);

        pesquisar.setText("      Pesquisar");
        pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisarMouseClicked(evt);
            }
        });
        getContentPane().add(pesquisar);
        pesquisar.setBounds(310, 380, 100, 40);

        atualizar.setText("     Atualizar");
        atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizarMouseClicked(evt);
            }
        });
        getContentPane().add(atualizar);
        atualizar.setBounds(440, 380, 90, 40);

        deletar.setText("       Deletar");
        deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletarMouseClicked(evt);
            }
        });
        getContentPane().add(deletar);
        deletar.setBounds(550, 380, 90, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Clique aqui para");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(330, 430, 120, 20);

        voltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        voltar.setForeground(new java.awt.Color(255, 0, 0));
        voltar.setText("voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(440, 430, 50, 20);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("x");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 0, 20, 30);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cadastro Imagem de Fornecedor.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 790, 490);

        setSize(new java.awt.Dimension(790, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseClicked
        
        try{
 
            FornecedorBean fb = new FornecedorBean();
            FornecedorDao fd = new FornecedorDao();
            
            if(catfo.getSelectedItem() == "Selecione"|| nomefo.getText().trim().isEmpty() || marcafo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos ou selecione todas as caixas de texto!");
            }
            else{
            fb.setNome(nomefo.getText());
            fb.setMarca(marcafo.getText());
            fb.setCat((String)catfo.getSelectedItem());
            

            fd.create(fb);

            nomefo.setText("");
            marcafo.setText("");
            catfo.setSelectedIndex(0);
            
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_cadastrarMouseClicked

    private void pesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarMouseClicked
        FornecedorDao fd = new FornecedorDao();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ID:"));
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE id = "+id);
            rs = stmt.executeQuery();
            while(rs.next()){

                
                nomefo.setText(rs.getString("nome"));
                marcafo.setText(rs.getString("marca"));
                catfo.setSelectedItem(rs.getString("categoria"));

            }
        }catch (SQLException ex ) {
            JOptionPane.showMessageDialog(null,"ID não existente!!");
        } 
        finally{
            connection.ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }//GEN-LAST:event_pesquisarMouseClicked

    private void atualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizarMouseClicked
        try{
            FornecedorBean fb = new FornecedorBean();
            FornecedorDao fd = new FornecedorDao();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um ID valido para seu fornecedor:"));
            
            if(catfo.getSelectedItem() == "Selecione"|| nomefo.getText().trim().isEmpty() || marcafo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos ou selecione todas as caixas de texto!");
            }
            else{
            fb.setId(id);
            fb.setNome(nomefo.getText());
            fb.setMarca(marcafo.getText());
            fb.setCat((String)catfo.getSelectedItem());
            

            fd.Update(fb);

            nomefo.setText("");
            marcafo.setText("");
            catfo.setSelectedIndex(0);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos ou insira um ID valido!");
        }
    }//GEN-LAST:event_atualizarMouseClicked

    private void deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletarMouseClicked
        try{   
  
            FornecedorBean fb = new FornecedorBean();
            FornecedorDao fd = new FornecedorDao();

            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ID para deletar o cadastro do seu fornecedor:"));

            fb.setId(id);

            fd.delete(fb);

            nomefo.setText("");
            marcafo.setText("");
            catfo.setSelectedIndex(0);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ID invalido!");
        }
          
    }//GEN-LAST:event_deletarMouseClicked

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        HomeFun tp = new HomeFun();
        dispose();
        tp.setVisible(true);
    }//GEN-LAST:event_voltarMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(CadastroFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel atualizar;
    private javax.swing.JLabel cadastrar;
    private javax.swing.JComboBox<String> catfo;
    private javax.swing.JLabel data;
    private javax.swing.JLabel deletar;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField marcafo;
    private javax.swing.JTextField nomefo;
    private javax.swing.JLabel pesquisar;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
 public class horas implements ActionListener{
    @Override
    public void actionPerformed (ActionEvent e){
        Calendar c = Calendar.getInstance();
        hora.setText(String.format("%1$tH:%1$tM:%1$tS", c));
    }
    }
}
