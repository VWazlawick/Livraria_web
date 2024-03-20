    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Livraria_WS.Repositores;

import Livraria_WS.Interfaces.PessoaWebInterface;
    import Livraria_WS.Model.Livro;
    import Livraria_WS.Model.Pessoa;
import Livraria_WS.Services.PessoaService;
import Livraria_WS.infrastructure.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
    import java.util.ArrayList;
    import java.util.Date;

    /**
     *
     * @author vwaz
     */
    public class LivroRepository {

    public LivroRepository() {
    }
    
    public ArrayList<Livro> findLivro(String nome) throws SQLException{
       Connection conn = null;
       PreparedStatement ps = null;
       ResultSet rs = null;
       ArrayList<Livro> lista = null;
       
       String query = "SELECT * FROM livro LIKE nmlivro='%" + nome+"%'";
       
        try {
            conn = new ConnectionFactory().getConnection();
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            rs = ps.executeQuery();
            
            while(rs.next()){
                lista = new ArrayList<>();
                Livro livro = new Livro();
                
                livro.setId(rs.getInt("idlivro"));
                livro.setNmLivro(rs.getString("nmlivro"));
                livro.setDtLancamento(rs.getDate("dtlancamento"));
                livro.setNrpagina(rs.getInt("nrpagina"));
                
                Pessoa autor = new Pessoa();
                PessoaService pss = new PessoaService();
                autor = pss.findById(rs.getInt("idautora"));
                livro.setAutor(autor);
                
                Pessoa editora = new Pessoa();
                editora = pss.findById(rs.getInt("ideditora"));
                livro.setEditora(editora);
                
                
                lista.add(livro);
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
    public ArrayList<Livro> listAll() throws SQLException{
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Livro> lista = null;
        
        String query = "SELECT * FROM livro";
        
        try {
            conn = new ConnectionFactory().getConnection();
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            rs = ps.executeQuery();
            while(rs.next()){
                lista = new ArrayList<>();
                Livro livro = new Livro();
                
                livro.setId(rs.getInt("idlivro"));
                livro.setNmLivro(rs.getString("nmlivro"));
                livro.setDtLancamento(rs.getDate("dtlancamento"));
                livro.setNrpagina(rs.getInt("nrpagina"));
                
                Pessoa autor = new Pessoa();
                PessoaService pss = new PessoaService();
                autor = pss.findById(rs.getInt("idautora"));
                livro.setAutor(autor);
                
                Pessoa editora = new Pessoa();
                editora = pss.findById(rs.getInt("ideditora"));
                livro.setEditora(editora);
                
                
                lista.add(livro);
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
    
    public Livro findById(int id) throws SQLException{
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Livro livro = null;
        
        String query = "SELECT * FROM livro WHERE idlivro = " + id;
        
        try {
            conn = new ConnectionFactory().getConnection();
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            rs = ps.executeQuery();
            
            if(rs.next()){
                livro = new Livro();
            
                livro.setId(rs.getInt("idlivro"));
                livro.setNmLivro(rs.getString("nmlivro"));
                livro.setDtLancamento(rs.getDate("dtlancamento"));
                livro.setNrpagina(rs.getInt("nrpagina"));

                Pessoa autor = new Pessoa();
                PessoaService pss = new PessoaService();
                autor = pss.findById(rs.getInt("idautora"));
                livro.setAutor(autor);

                Pessoa editora = new Pessoa();
                editora = pss.findById(rs.getInt("ideditora"));
                livro.setEditora(editora);
            }
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
        return livro;
    }

    public Livro insert(Livro livro) throws SQLException {
        String query = "INSERT INTO livro(nmlivro, dtlancamento, nrpagina, idautora, ideditora) VALUES"
                + "(?,?,?,?,?);";
        
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            conn = new ConnectionFactory().getConnection();
            
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, livro.getNmLivro());
            ps.setDate(2, new java.sql.Date(livro.getDtLancamento().getTime()));
            ps.setInt(3, livro.getNrpagina());
            ps.setInt(4, livro.getAutor().getId());
            ps.setInt(5, livro.getEditora().getId());
            
            ps.executeUpdate();
            
            rs = ps.getGeneratedKeys();
            
            rs.next();
            livro.setId(rs.getInt(1));
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
        return livro;
    }
}
