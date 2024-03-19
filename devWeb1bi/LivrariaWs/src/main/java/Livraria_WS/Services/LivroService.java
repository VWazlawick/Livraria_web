/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria_WS.Services;

import Livraria_WS.Exceptions.ValidacaoException;
import Livraria_WS.Model.Livro;
import Livraria_WS.Repositores.LivroRepository;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vwaz
 */
public class LivroService {
    public ArrayList<Livro> listAll() throws SQLException{
        LivroRepository lr = new LivroRepository();
        return lr.listAll();
    }
    
    public ArrayList<Livro> findLivro(String nome) throws SQLException{
        LivroRepository livroRepository = new LivroRepository();
        return livroRepository.findLivro(nome);
    }
    
    public Livro findById(int id) throws SQLException{
        LivroRepository livroRepository = new LivroRepository();
        return livroRepository.findById(id);
    }
    
    public Livro insert(Livro livro)throws ValidacaoException, SQLException{
        if(livro.getNmLivro().length()<=3){
            throw new ValidacaoException("Nome do Livro deve conter mais de 3 caracteres!");
        }
        if(livro.getNmLivro().isEmpty() || livro.getNmLivro().isBlank()){
            throw new ValidacaoException("Informe um nome para o livro");
        }
        if(livro.getNrpagina()<=0){
            throw new ValidacaoException("Número de páginas no Livro deve ser maior que zero!");
        }
        if(livro.getAutor()==null){
            throw new ValidacaoException("Informe um Autor!");
        }
        
        LivroRepository livroRepository = new LivroRepository();
        return livroRepository.insert(livro);
       
    }
}
