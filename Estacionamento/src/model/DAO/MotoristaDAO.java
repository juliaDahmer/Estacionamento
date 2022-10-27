package model.DAO;

import model.bean.Vaga;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class MotoristaDAO {
    
    public void create (Motorista m){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO motorista (idMotorista,nome,genero,RG,CPF,fone,email,senha)");
            stmt.setInt(1, m.getidMotorista());
            stmt.setString(2, m.getNome());
            stmt.setBoolean(3, m.getGenero());
            stmt.setInt(4, m.getCPF());
            stmt.setInt(5, m.getFone());
            stmt.setString(6, m.getEmail());
            stmt.setString(7, m.getSenha());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro de motorista feito com sucesso!");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro so cadastrar: " + e);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
    
}