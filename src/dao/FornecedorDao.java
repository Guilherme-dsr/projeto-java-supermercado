package dao;

import bean.FornecedorBean;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FornecedorDao {
    public void create(FornecedorBean b){ //Função para salvar os dados
        Connection con = ConnectionFactory.getConnection(); //Variável que irá receber a conexão
        PreparedStatement stmt = null; //Variável que irá guardar o comando SQL
        
        try {
            stmt = con.prepareStatement("INSERT INTO fornecedor(id,nome,marca,categoria) VALUES (0,?,?,?)"); //Varável stmt irá receber os comando SQL
            stmt.setString(1, b.getNome()); //Enviar o nome do usuário para o banco
            stmt.setString(2,b.getMarca()); //Enviar a descrição para o banco
            stmt.setString(3, b.getCat()); //Enviar...

            
            stmt.executeUpdate();//Executar o comando
            
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso!"); // Exibir mensagem caso tudo funcione
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
}
    
    
public void Update(FornecedorBean b){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE fornecedor SET nome = ?,marca = ?,categoria = ? WHERE id = ? ");
            
            stmt.setString(1, b.getNome()); //Enviar o nome do usuário para o banco
            stmt.setString(2,b.getMarca()); //Enviar a descrição para o banco
            stmt.setString(3, b.getCat()); //Enviar...
            stmt.setInt(4, b.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}

public void delete(FornecedorBean b){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM fornecedor WHERE id = ?");
            stmt.setInt(1, b.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
}

public void updateC(FornecedorBean b) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE fornecedor SET nome = ?,marca = ?, categoria = ? WHERE id = ?");
            stmt.setString(1, b.getNome()); //Enviar o nome do usuário para o banco //Enviar a descrição para o banco
            stmt.setString(6, b.getMarca());
            stmt.setString(4, b.getCat());            
            stmt.setInt(7, b.getId());
            

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor adicionado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

}
public void Busca(FornecedorBean b){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("SELECT FROM fornecedor WHERE id = ?");
            stmt.setInt(1, b.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
public List<FornecedorBean> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<FornecedorBean> fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE nome LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            rs = stmt.executeQuery();
            while (rs.next()) {

                FornecedorBean fornecedor = new FornecedorBean();

                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setMarca(rs.getString("marca"));
                fornecedor.setCat(rs.getString("categoria"));
                
                
                
                fornecedores.add(fornecedor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return fornecedores;

    }
public List<FornecedorBean> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<FornecedorBean> fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM fornecedor");
            rs = stmt.executeQuery();

            while (rs.next()) {

                FornecedorBean fornecedor = new FornecedorBean();

                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setMarca(rs.getString("marca"));
                fornecedor.setCat(rs.getString("categoria"));
                
                
                
                fornecedores.add(fornecedor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return fornecedores;

    }
}
