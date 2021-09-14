package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import bean.Exemplo;
import connection.ConnectionFactory;
import java.sql.Connection;

public class ExemploDAO {
    
    public Boolean inserir(Exemplo exemplo)
    {
        Boolean retorno = false;
        String sql = "UPDATE produto SET imagem = ? WHERE cod = ? ";
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);
        
        
        try
        {
            pst.setBytes(1, exemplo.getImagem());
            pst.setInt(2, exemplo.getCod());
            pst.executeUpdate();
            retorno = true;
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        return retorno;
    
    }
    
    public Exemplo buscar(Integer cod)
    {
        Exemplo retorno = null;
        String sql = "SELECT cod,imagem from produto where cod=?";
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);
        
        try {
            pst.setInt(1, cod);
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                retorno = new Exemplo();
                retorno.setCod(rs.getInt("cod"));
                retorno.setImagem(rs.getBytes("imagem"));
            
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            retorno = null;
        }
        
        return retorno;
    
    }
    
}
