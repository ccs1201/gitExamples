package com.ccs.gitexamples.biblioteca;

public class Livro {

    private String title;
    private String numPagina;
    private String autor;

    public void emprestar() {
        System.out.println("emprestou");
    }

    public void devolver() {
        System.out.println("devolveu");
    }

}
