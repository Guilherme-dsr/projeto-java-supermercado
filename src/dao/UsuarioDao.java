package dao;


import bean.UsuarioBean;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDao {
        public void create(UsuarioBean b){ //Função para salvar os dados
        Connection con = ConnectionFactory.getConnection(); //Variável que irá receber a conexão
        PreparedStatement stmt = null; //Variável que irá guardar o comando SQL
        
        try {
            stmt = con.prepareStatement("INSERT INTO clientes(id,nome,usuario,senha,email,bairro,tel,cidade) VALUES (?,?,?,?,?,?,?,?)"); //Varável stmt irá receber os comando SQL
            stmt.setInt(1, b.getId());
            stmt.setString(2, b.getNome()); //Enviar o nome do usuário para o banco
            stmt.setString(3,b.getUsuario()); //Enviar a descrição para o banco
            stmt.setString(4, b.getSenha()); //Enviar...
            stmt.setString(5, b.getEmail());//Enviar...
            stmt.setString(6, b.getBairro());
            stmt.setString(7, b.getTel());
            stmt.setString(8, b.getCidade());
            
            stmt.executeUpdate();//Executar o comando
            
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso!"); // Exibir mensagem caso tudo funcione
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
        
        public void Update(UsuarioBean b){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE clientes SET nome = ?, usuario = ?,senha = ?,email = ?,bairro = ?,tel = ?, cidade = ? WHERE id = ? ");
            stmt.setString(1, b.getNome()); //Enviar o nome do usuário para o banco
            stmt.setString(2,b.getUsuario()); //Enviar a descrição para o banco
            stmt.setString(3, b.getSenha()); //Enviar...
            stmt.setString(4, b.getEmail());//Enviar...
            stmt.setString(5, b.getBairro());
            stmt.setString(6, b.getTel());
            stmt.setString(7, b.getCidade());
            stmt.setInt(8, b.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}
        
        
        public void delete(UsuarioBean b){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM clientes WHERE id = ?");
            stmt.setInt(1, b.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
