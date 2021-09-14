package view;


import bean.UsuarioBean;
import connection.ConnectionFactory;
import dao.UsuarioDao;
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

public class CadastroCli extends javax.swing.JFrame {
    public CadastroCli() {
        initComponents();
        
        URL caminhoIcone = getClass().getResource("/img/Logo.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        
        Date da = new Date();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd / MM / YYYY"); 
        data.setText(formato.format(da));
        
        Timer t = new Timer(1000,new view.CadastroCli.horas());
        t.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hora = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nomec = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        usuc = new javax.swing.JTextField();
        telc = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        bairroc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cidadec = new javax.swing.JComboBox<>();
        cod = new javax.swing.JLabel();
        idc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        senhac = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emailc = new javax.swing.JTextField();
        atualizar = new javax.swing.JLabel();
        deletar = new javax.swing.JLabel();
        pesquisar = new javax.swing.JLabel();
        cadastrar = new javax.swing.JLabel();
        voltar1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);
        getContentPane().setLayout(null);

        hora.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hora);
        hora.setBounds(590, 10, 80, 20);

        data.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(data);
        data.setBounds(680, 10, 90, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 130, 40, 15);
        getContentPane().add(nomec);
        nomec.setBounds(180, 150, 149, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 190, 60, 15);

        usuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usucActionPerformed(evt);
            }
        });
        getContentPane().add(usuc);
        usuc.setBounds(180, 210, 149, 30);

        try {
            telc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(telc);
        telc.setBounds(480, 280, 160, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Telefone:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 260, 58, 15);

        bairroc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairrocActionPerformed(evt);
            }
        });
        getContentPane().add(bairroc);
        bairroc.setBounds(480, 210, 160, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Bairro:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(480, 190, 41, 15);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Cidade:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(480, 320, 47, 15);

        cidadec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Caucaia", "Fortaleza", "Aquiraz", "Maracanaú" }));
        getContentPane().add(cidadec);
        cidadec.setBounds(480, 340, 130, 30);

        cod.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod.setText("ID:");
        getContentPane().add(cod);
        cod.setBounds(480, 130, 16, 15);
        getContentPane().add(idc);
        idc.setBounds(480, 150, 60, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Clique aqui para");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(320, 440, 120, 20);
        getContentPane().add(senhac);
        senhac.setBounds(180, 280, 149, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 260, 44, 15);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("E-mail:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 320, 41, 15);
        getContentPane().add(emailc);
        emailc.setBounds(180, 340, 149, 30);

        atualizar.setText("     Atualizar");
        atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizarMouseClicked(evt);
            }
        });
        getContentPane().add(atualizar);
        atualizar.setBounds(440, 390, 90, 30);

        deletar.setText("       Deletar");
        deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletarMouseClicked(evt);
            }
        });
        getContentPane().add(deletar);
        deletar.setBounds(550, 390, 90, 30);

        pesquisar.setText("      Pesquisar");
        pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisarMouseClicked(evt);
            }
        });
        getContentPane().add(pesquisar);
        pesquisar.setBounds(310, 390, 100, 30);

        cadastrar.setText("    Cadastrar   ");
        cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(190, 390, 90, 30);

        voltar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        voltar1.setForeground(new java.awt.Color(255, 0, 0));
        voltar1.setText("voltar");
        voltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltar1MouseClicked(evt);
            }
        });
        getContentPane().add(voltar1);
        voltar1.setBounds(430, 440, 50, 20);

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

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cadastro de cliente.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 830, 500);

        setSize(new java.awt.Dimension(790, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bairrocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairrocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairrocActionPerformed

    private void usucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usucActionPerformed

    private void atualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizarMouseClicked
        try{
        UsuarioBean cb = new UsuarioBean();
        UsuarioDao cd = new UsuarioDao();
        
        if(cidadec.getSelectedItem() == "Selecione" || idc.getText().trim().isEmpty() || nomec.getText().trim().isEmpty() || usuc.getText().trim().isEmpty() || emailc.getText().trim().isEmpty() || senhac.getText().trim().isEmpty()|| bairroc.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "Preencha todos os campos ou selecione todas as caixas de texto!");
        }
        else{
        
        cb.setId(Integer.parseInt(idc.getText()));
        cb.setNome(nomec.getText());
        cb.setUsuario(usuc.getText());
        cb.setEmail(emailc.getText());
        cb.setSenha(String.valueOf(senhac.getPassword()));
        cb.setBairro(bairroc.getText());
        cb.setTel(telc.getText());
        cb.setCidade((String)cidadec.getSelectedItem());   

        cd.Update(cb);
        
        idc.setText("");
        nomec.setText("");
        usuc.setText("");
        emailc.setText("");
        senhac.setText("");
        bairroc.setText("");
        telc.setText("");
        cidadec.setSelectedIndex(0);
    }
    }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos ou insira um ID valido!");
       }  
    }//GEN-LAST:event_atualizarMouseClicked

    private void deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletarMouseClicked
        try{
        UsuarioBean cb = new UsuarioBean();
        UsuarioDao cd = new UsuarioDao();
        
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ID para deletar seu cadastro:"));
        
        cb.setId(id);
        
        cd.delete(cb);
        
        idc.setText("");
        nomec.setText("");
        usuc.setText("");
        emailc.setText("");
        senhac.setText("");
        bairroc.setText("");
        telc.setText("");
        cidadec.setSelectedIndex(0);
        
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "ID invalido!");
       }
    }//GEN-LAST:event_deletarMouseClicked

    private void pesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarMouseClicked
        UsuarioBean cb = new UsuarioBean();
        UsuarioDao  cd = new UsuarioDao();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ID:"));
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE id = "+id);
            rs = stmt.executeQuery();
            while(rs.next()){
                
                idc.setText(String.valueOf(rs.getInt("id")));
                nomec.setText(rs.getString("nome"));
                usuc.setText(rs.getString("usuario"));
                senhac.setText(rs.getString("senha"));
                emailc.setText(rs.getString("email"));
                bairroc.setText(rs.getString("bairro"));
                telc.setText(rs.getString("tel"));
                cidadec.setSelectedItem(rs.getString("cidade"));
                
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ID não existente!!");
        }finally{
            connection.ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }//GEN-LAST:event_pesquisarMouseClicked

    private void cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseClicked
        try{
        UsuarioBean cb = new UsuarioBean();
        UsuarioDao cd = new UsuarioDao();
        
        if(cidadec.getSelectedItem() == "Selecione" || idc.getText().trim().isEmpty() || nomec.getText().trim().isEmpty() || usuc.getText().trim().isEmpty() || emailc.getText().trim().isEmpty() || senhac.getText().trim().isEmpty()|| bairroc.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "Preencha todos os campos ou selecione todas as caixas de texto!");
        }
        else{
        cb.setId(Integer.parseInt(idc.getText()));
        cb.setNome(nomec.getText());
        cb.setUsuario(usuc.getText());
        cb.setEmail(emailc.getText());
        cb.setSenha(String.valueOf(senhac.getPassword()));
        cb.setBairro(bairroc.getText());
        cb.setTel(telc.getText());
        cb.setCidade((String)cidadec.getSelectedItem());
        
        cd.create(cb);
        
        idc.setText("");
        nomec.setText("");
        usuc.setText("");
        emailc.setText("");
        senhac.setText("");
        bairroc.setText("");
        telc.setText("");
        cidadec.setSelectedIndex(0);
        }
    }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
       }
    }//GEN-LAST:event_cadastrarMouseClicked

    private void voltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar1MouseClicked
        // TODO add your handling code here:
        HomeFun tp = new HomeFun();
        dispose();
        tp.setVisible(true);
    }//GEN-LAST:event_voltar1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    dispose();
    }//GEN-LAST:event_jLabel4MouseClicked
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel atualizar;
    private javax.swing.JTextField bairroc;
    private javax.swing.JLabel cadastrar;
    private javax.swing.JComboBox<String> cidadec;
    private javax.swing.JLabel cod;
    private javax.swing.JLabel data;
    private javax.swing.JLabel deletar;
    private javax.swing.JTextField emailc;
    private javax.swing.JLabel hora;
    private javax.swing.JTextField idc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomec;
    private javax.swing.JLabel pesquisar;
    private javax.swing.JPasswordField senhac;
    private javax.swing.JFormattedTextField telc;
    private javax.swing.JTextField usuc;
    private javax.swing.JLabel voltar1;
    // End of variables declaration//GEN-END:variables
 public class horas implements ActionListener{
    @Override
    public void actionPerformed (ActionEvent e){
        Calendar c = Calendar.getInstance();
        hora.setText(String.format("%1$tH:%1$tM:%1$tS", c));
    }
    }

}
