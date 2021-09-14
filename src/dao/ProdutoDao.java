package dao;

import bean.ProdutosBean;
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

public class ProdutoDao {

public void create(ProdutosBean p){ //Função para salvar os dados
        Connection con = ConnectionFactory.getConnection(); //Variável que irá receber a conexão
        PreparedStatement stmt = null; //Variável que irá guardar o comando SQL
        
        try {
            stmt = con.prepareStatement("INSERT INTO produto(cod,nome,preco,qtd,cat,forn,marca) VALUES (?,?,?,?,?,?,?)"); //Varável stmt irá receber os comando SQL
            stmt.setInt(1, p.getCodigo());
            stmt.setString(2, p.getNome()); //Enviar o nome do usuário para o banco
            stmt.setDouble(3, p.getPreco());
            stmt.setInt(4,p.getQtd()); //Enviar a descrição para o banco
            stmt.setString(5, p.getCat());
            stmt.setString(6, p.getForn());
            stmt.setString(7, p.getMarca());
            
            stmt.executeUpdate();//Executar o comando
            
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso!"); // Exibir mensagem caso tudo funcione
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
}

public void Update(ProdutosBean p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produto SET nome = ?,preco = ?,qtd = ?, cat = ?, forn = ?,marca = ? WHERE cod = ? ");
            stmt.setString(1, p.getNome()); //Enviar o nome do usuário para o banco
            stmt.setDouble(2, p.getPreco());
            stmt.setInt(3,p.getQtd()); //Enviar a descrição para o banco
            stmt.setString(4, p.getCat());
            stmt.setString(5, p.getForn());
            stmt.setString(6, p.getMarca());
            stmt.setInt(7, p.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}
public void delete(ProdutosBean p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE cod = ?");
            stmt.setInt(1, p.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

public void updateC(ProdutosBean p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET nome = ?,preco = ?,qtd = ?, cat = ?, forn = ?,marca = ?  WHERE cod = ?");
            stmt.setString(1, p.getNome()); //Enviar o nome do usuário para o banco
            stmt.setDouble(2, p.getPreco());
            stmt.setInt(3,p.getQtd()); //Enviar a descrição para o banco
            stmt.setString(4, p.getCat());
            stmt.setString(5, p.getForn());
            stmt.setString(6, p.getMarca());
            stmt.setInt(7, p.getCodigo());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Comprado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Comprar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

}
public void Busca(ProdutosBean p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("SELECT FROM produto WHERE cod = ?");
            stmt.setInt(1, p.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
public List<ProdutosBean> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ProdutosBean> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE nome LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            rs = stmt.executeQuery();
            while (rs.next()) {

                ProdutosBean produto = new ProdutosBean();

                produto.setCodigo(rs.getInt("cod"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setCat(rs.getString("cat"));
                produto.setForn(rs.getString("forn"));
                produto.setMarca(rs.getString("marca"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
public List<ProdutosBean> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ProdutosBean> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                ProdutosBean produto = new ProdutosBean();

                produto.setCodigo(rs.getInt("cod"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setCat(rs.getString("cat"));
                produto.setForn(rs.getString("forn"));
                produto.setMarca(rs.getString("marca"));
                
                
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
}
