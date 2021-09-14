package view;

import UTIL.ManipularImagem;
import bean.Exemplo;
import bean.ProdutosBean;
import dao.ProdutoDao;
import connection.ConnectionFactory;
import dao.ExemploDAO;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroPro extends javax.swing.JFrame {
    public CadastroPro() {
        initComponents();
        
        URL caminhoIcone = getClass().getResource("/img/Logo.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        
        Date da = new Date();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd / MM / YYYY"); 
        data.setText(formato.format(da));
        
        Timer t = new Timer(1000,new view.CadastroPro.horas());
        t.start();
        
    }
    public void recebendo(String recebe1, String recebe2, String recebe3){
    fornp.setText(recebe1);
    marcap.setText(recebe2);
    catp.setSelectedItem(recebe3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hora = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        codp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        precop = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        quantp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        marcap = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fornp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        catp = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JLabel();
        pesquisar = new javax.swing.JLabel();
        atualizar = new javax.swing.JLabel();
        deletar = new javax.swing.JLabel();
        voltar = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setResizable(false);
        getContentPane().setLayout(null);

        hora.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hora);
        hora.setBounds(590, 10, 80, 20);

        data.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(data);
        data.setBounds(680, 10, 90, 20);

        codp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codpActionPerformed(evt);
            }
        });
        getContentPane().add(codp);
        codp.setBounds(160, 140, 100, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Código de barras:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(160, 120, 120, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Nome do Produto:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 180, 120, 20);
        getContentPane().add(nomep);
        nomep.setBounds(160, 200, 140, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Preço:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 240, 40, 20);
        getContentPane().add(precop);
        precop.setBounds(160, 260, 100, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Quantidade:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(160, 300, 77, 20);
        getContentPane().add(quantp);
        quantp.setBounds(160, 320, 100, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Clique aqui para");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(330, 440, 120, 20);
        getContentPane().add(marcap);
        marcap.setBounds(540, 300, 160, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Marca:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(540, 280, 42, 20);
        getContentPane().add(fornp);
        fornp.setBounds(540, 230, 160, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Fornecedor:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(540, 200, 76, 20);

        catp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Limpeza", "Alimentos" }));
        getContentPane().add(catp);
        catp.setBounds(540, 150, 130, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Categoria:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(540, 130, 65, 20);

        cadastrar.setText("    Cadastrar   ");
        cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(190, 390, 90, 30);

        pesquisar.setText("      Pesquisar");
        pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisarMouseClicked(evt);
            }
        });
        getContentPane().add(pesquisar);
        pesquisar.setBounds(310, 390, 100, 30);

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

        voltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        voltar.setForeground(new java.awt.Color(255, 0, 0));
        voltar.setText("voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(440, 440, 50, 20);
        getContentPane().add(lblImg);
        lblImg.setBounds(330, 190, 170, 90);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Busc.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(710, 230, 40, 30);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("x");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 0, 20, 30);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cadastro de produto.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, -20, 840, 540);

        setSize(new java.awt.Dimension(800, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codpActionPerformed

    private void cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseClicked
        try{
            ProdutosBean pb = new ProdutosBean();
            ProdutoDao pd = new ProdutoDao();
        if(catp.getSelectedItem() == "Selecione" || nomep.getText().trim().isEmpty() || precop.getText().trim().isEmpty() || quantp.getText().trim().isEmpty() || fornp.getText().trim().isEmpty() || marcap.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "Preencha todos os campos ou selecione todas as caixas de texto!");
        }
        else{
        pb.setCodigo(Integer.parseInt(codp.getText()));
        pb.setNome(nomep.getText());
	pb.setPreco(Double.parseDouble(precop.getText()));	
        pb.setQtd(Integer.parseInt(quantp.getText()));
        pb.setCat((String)catp.getSelectedItem());
	pb.setForn(fornp.getText());
        pb.setMarca(marcap.getText());
        
	
       
        pd.create(pb);
        
        codp.setText("");
        nomep.setText("");
        precop.setText("");
        quantp.setText("");
        catp.setSelectedIndex(0);
        fornp.setText("");
        marcap.setText("");
        
        EnviarImagem tp = new EnviarImagem();
        dispose();
        tp.setVisible(true);
        
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_cadastrarMouseClicked

    private void pesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarMouseClicked
       
        ProdutosBean pb = new ProdutosBean();
        ProdutoDao  pd = new ProdutoDao();
        int co = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        
        ExemploDAO dao = new ExemploDAO();
        Exemplo exe = dao.buscar(co);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), lblImg);
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE cod = "+co);
            rs = stmt.executeQuery();
            while(rs.next()){
                
        pb.setCodigo(rs.getInt("cod"));     
	pb.setNome(rs.getString("nome"));
        pb.setPreco(rs.getDouble("preco"));
	pb.setQtd(rs.getInt("qtd"));
        catp.setSelectedItem(rs.getString("cat"));
	pb.setForn(rs.getString("forn"));
        pb.setMarca(rs.getString("marca"));
	        
        
       

        codp.setText(String.valueOf(pb.getCodigo()));
        nomep.setText(pb.getNome());
        precop.setText(String.valueOf(pb.getPreco()));
        quantp.setText(String.valueOf(pb.getQtd()));
        catp.setSelectedItem(String.valueOf(pb.getCat())); 
        fornp.setText(pb.getForn());
        marcap.setText(pb.getMarca());
        
               
        }
        } catch (SQLException ex) {
            System.out.println("Codigo não existente!!");
        }finally{
            connection.ConnectionFactory.closeConnection(con, stmt, rs);
        }
        nomep.setText(pb.getNome());
        precop.setText(String.valueOf(pb.getPreco()));
        quantp.setText(String.valueOf(pb.getQtd()));
        catp.setSelectedItem(String.valueOf(pb.getCat()));
        fornp.setText(pb.getForn());
        marcap.setText(pb.getMarca());
        
	
    }//GEN-LAST:event_pesquisarMouseClicked

    private void atualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizarMouseClicked
        try{
        ProdutosBean pb = new ProdutosBean();
        ProdutoDao  pd = new ProdutoDao();
        
        int co = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do produto: "));
        if(catp.getSelectedItem() == "Selecione" || nomep.getText().trim().isEmpty() || precop.getText().trim().isEmpty() || quantp.getText().trim().isEmpty() || fornp.getText().trim().isEmpty() || marcap.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "Preencha todos os campos ou selecione todas as caixas de texto!");
        }
        else{
        pb.setCodigo(Integer.parseInt(codp.getText()));
        pb.setNome(nomep.getText());
	pb.setPreco(Double.parseDouble(precop.getText()));	
        pb.setQtd(Integer.parseInt(quantp.getText()));
        pb.setCat((String)catp.getSelectedItem());
	pb.setForn(fornp.getText());
        pb.setMarca(marcap.getText());
        
        pd.Update(pb);
        
        codp.setText("");
        nomep.setText("");
        precop.setText("");
        quantp.setText("");
        catp.setSelectedIndex(0);
        fornp.setText("");
        marcap.setText("");
        
        EnviarImagem tp = new EnviarImagem();
        dispose();
        tp.setVisible(true);
        }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos ou insira um código valido!");
    }
    }//GEN-LAST:event_atualizarMouseClicked

    private void deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletarMouseClicked
        ProdutosBean pb = new ProdutosBean();
        ProdutoDao  pd = new ProdutoDao();
        
        int co = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
        
        pb.setCodigo(co);
        
        pd.delete(pb);
        
        codp.setText("");
        nomep.setText("");
        precop.setText("");
        quantp.setText("");
        catp.setSelectedIndex(0);
        fornp.setText("");
        marcap.setText("");
    }//GEN-LAST:event_deletarMouseClicked

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        // TODO add your handling code here:
        HomeFun tp = new HomeFun();
        dispose();
        tp.setVisible(true);
    }//GEN-LAST:event_voltarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Fornecedor tp = new Fornecedor();
        tp.setVisible(true);
        dispose();
        fornp.setText("");
        marcap.setText("");
        catp.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel atualizar;
    private javax.swing.JLabel cadastrar;
    private javax.swing.JComboBox<String> catp;
    private javax.swing.JTextField codp;
    private javax.swing.JLabel data;
    private javax.swing.JLabel deletar;
    private javax.swing.JTextField fornp;
    private javax.swing.JLabel hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTextField marcap;
    private javax.swing.JTextField nomep;
    private javax.swing.JLabel pesquisar;
    private javax.swing.JTextField precop;
    private javax.swing.JTextField quantp;
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
