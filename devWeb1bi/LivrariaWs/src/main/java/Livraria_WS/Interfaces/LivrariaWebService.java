
package Livraria_WS.Interfaces;

import Livraria_WS.Exceptions.AutorizacaoException;
import Livraria_WS.Exceptions.ValidacaoException;
import Livraria_WS.Model.Livro;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;


@WebService
public interface LivrariaWebService {
    @WebMethod
    ArrayList<Livro> findLivro(String nome)throws SQLException;
    
    @WebMethod
    ArrayList<Livro> listAll()throws SQLException;
    
    @WebMethod
    Livro findById(int id)throws SQLException;
    
    @WebMethod
    String logar(@WebParam(header = true)String login,
            @WebParam(header = true) String senha);
    
    @WebMethod
    Livro insert(Livro livro) throws ValidacaoException, SQLException;
    
    @WebMethod
    Livro update(Livro livro);
    
    void delete(int id);
}
