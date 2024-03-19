/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria_WS.Model;

import java.util.Date;



/**
 *
 * @author vwaz
 */
public class Livro {
    private int id;
    private String nmLivro;
    private int nrpagina;
    private Pessoa autor;
    private Pessoa editora;
    private Date dtLancamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmLivro() {
        return nmLivro;
    }

    public void setNmLivro(String nmLivro) {
        this.nmLivro = nmLivro;
    }

    public int getNrpagina() {
        return nrpagina;
    }

    public void setNrpagina(int nrpagina) {
        this.nrpagina = nrpagina;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public Pessoa getEditora() {
        return editora;
    }

    public void setEditora(Pessoa editora) {
        this.editora = editora;
    }

    public Date getDtLancamento() {
        return dtLancamento;
    }

    public void setDtLancamento(Date dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

    
    
}
