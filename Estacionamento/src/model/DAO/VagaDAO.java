package model.DAO;

import model.bean.Vaga;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class VagaDAO {
    
    public void create (Vaga v){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO vaga (numero,vaga,obliqua)");
            stmt.setInt(1, v.getNumero());
            stmt.setString(2, v.getRua());
            stmt.setBoolean(3, v.isObliqua());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vaga salva com sucesso!");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro so salvar: " + e);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
    
}
