/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria_WS.Repositores;

import Livraria_WS.Model.Livro;
import Livraria_WS.Model.Pessoa;
import Livraria_WS.infrastructure.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author vwaz
 */
public class PessoaRepository {

    public PessoaRepository() {
    }
    
    
    public ArrayList<Pessoa> listAll() throws SQLException{
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Pessoa> lista = null;
        
        String query = "SELECT * FROM pessoa";
        
        try {
            conn = new ConnectionFactory().getConnection();
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            rs = ps.executeQuery();
            while(rs.next()){
                lista = new ArrayList<>();
                Pessoa pessoa = new Pessoa();
                
                pessoa.setId(rs.getInt("idpessoa"));
                pessoa.setNmPessoa(rs.getString("nmpessoa"));
                
                lista.add(pessoa);
            }
        } finally {
            if(rs!=null){
                rs.close();
            }
            if(ps!=null){
                ps.close();
            }
            if(rs!=null){
                rs.close();
            }
        }
        return lista;
    }
    
    public Pessoa findById(int id) throws SQLException{
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Pessoa pessoa = null;
        
        String query = "SELECT * FROM livro WHERE idpessoa = " + id;
        
        try {
            conn = new ConnectionFactory().getConnection();
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            rs = ps.executeQuery();
            
            pessoa = new Pessoa();
            
            pessoa.setId(rs.getInt("idpessoa"));
            pessoa.setNmPessoa(rs.getString("nmpessoa"));
            
        } finally {
            if(rs!=null){
                rs.close();
            }
            if(ps!=null){
                ps.close();
            }
            if(rs!=null){
                rs.close();
            }
        }
        return pessoa;
    }

    public Pessoa    insert(Pessoa pessoa) throws SQLException {
        String query = "INSERT INTO pessoa(nmpessoa) VALUES (?);";
        
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            conn = new ConnectionFactory().getConnection();
            
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pessoa.getNmPessoa());
            
            ps.executeUpdate();
            
            rs = ps.getGeneratedKeys();
            
            rs.next();
            pessoa.setId(rs.getInt(1));
        } finally {
            if(rs!=null){
                rs.close();
            }
            if(ps!=null){
                ps.close();
            }
            if(conn!=null){
                conn.close();
            }
        }
        return pessoa;
    }
}
