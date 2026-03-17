package br.edu.ifpr.dao;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Troque aqui a implementação sem alterar o restante do sistema:
       // ProdutoDAO dao = new ProdutoDAOLista();
         ProdutoDAO dao = new ProdutoDAOJDBC();

        dao.inserir(new Produto(1, "Notebook", 3500.00));
        dao.inserir(new Produto(2, "Mouse", 80.00));
        dao.inserir(new Produto(3, "Teclado", 150.00));

        System.out.println("=== LISTA DE PRODUTOS ===");
        List<Produto> produtos = dao.listar();
        for (Produto p : produtos) {
            System.out.println(p);
        }

        System.out.println("\n=== BUSCAR PRODUTO ID 2 ===");
        Produto encontrado = dao.buscarPorId(2);
        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Produto não encontrado.");
        }

        System.out.println("\n=== REMOVER PRODUTO ID 1 ===");
        dao.remover(1);

        System.out.println("\n=== LISTA APÓS REMOÇÃO ===");
        for (Produto p : dao.listar()) {
            System.out.println(p);
        }
    }
}