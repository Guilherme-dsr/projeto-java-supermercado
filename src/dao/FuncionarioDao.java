package dao;

import bean.FuncionarioBean;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FuncionarioDao {
    public void create(FuncionarioBean b){ //Função para salvar os dados
        Connection con = ConnectionFactory.getConnection(); //Variável que irá receber a conexão
        PreparedStatement stmt = null; //Variável que irá guardar o comando SQL
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionarios(id,nome,email,endereco,uf,username,senha,cpf,cargo) VALUES (?,?,?,?,?,?,?,?,?)"); //Varável stmt irá receber os comando SQL
            stmt.setInt(1, b.getId());
            stmt.setString(2, b.getNome()); //Enviar o nome do usuário para o banco
            stmt.setString(3,b.getEmail()); //Enviar a descrição para o banco
            stmt.setString(4, b.getEndereco()); //Enviar...
            stmt.setString(5, b.getUf());//Enviar...
            stmt.setString(6, b.getUsername());
            stmt.setString(7, b.getSenha());
            stmt.setString(8, b.getCpf());
            stmt.setString(9, b.getCargo());
            
            stmt.executeUpdate();//Executar o comando
            
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso!"); // Exibir mensagem caso tudo funcione
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
}
    
    
public void Update(FuncionarioBean b){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE funcionarios SET nome = ?,email = ?,endereco = ?,uf = ?,username = ?,senha = ?,cpf = ?,cargo = ? WHERE id = ? ");
            
            stmt.setString(1, b.getNome()); //Enviar o nome do usuário para o banco
            stmt.setString(2,b.getEmail()); //Enviar a descrição para o banco
            stmt.setString(3, b.getEndereco()); //Enviar...
            stmt.setString(4, b.getUf());//Enviar...
            stmt.setString(5, b.getUsername());
            stmt.setString(6, b.getSenha());
            stmt.setString(7, b.getCpf());
            stmt.setString(8, b.getCargo());
            stmt.setInt(9, b.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}

public void delete(FuncionarioBean b){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM funcionarios WHERE id = ?");
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
