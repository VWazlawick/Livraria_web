package Livraria_WS;

import Livraria_WS.Exceptions.ValidacaoException;
import Livraria_WS.Model.Livro;
import Livraria_WS.Services.LivroService;
import jakarta.jws.WebService;
import java.util.ArrayList;
import Livraria_WS.Interfaces.LivrariaWebService;
import java.sql.SQLException;

@WebService(endpointInterface = "Livraria_WS.Interfaces.LivrariaWebService")
public class LivrariaWebServiceImp implements Livraria_WS.Interfaces.LivrariaWebService{

    @Override
    public ArrayList<Livro> findLivro(String nome)throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Livro> listAll()throws SQLException {
        LivroService livrariaService = new LivroService();
        return livrariaService.listAll();
    }

    @Override
    public Livro findById(int id) throws SQLException{
        LivroService ls = new LivroService();
        return ls.findById(id);
    }

    @Override
    public String logar(String login, String senha) {
        if(login.equals("admin") && senha.equals("admin")){
            return "Usuário Logado";
        }
        return "Usuário ou senha incorreta";
    }

    @Override
    public Livro insert(Livro livro) throws SQLException, ValidacaoException{
        LivroService livroService = new LivroService();
        return livroService.insert(livro);
    }

    @Override
    public Livro update(Livro livro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
