package br.edu.ifpr.dao.generics;

import br.edu.ifpr.dao.Cliente;
import br.edu.ifpr.dao.Produto;

public class Main {
public static void main(String[] args) {
    //Produto
    DAOLista<Produto> produtoDAO = new DAOLista<>();

    produtoDAO.inserir(new Produto(1, "Notebook", 3500.00));
    produtoDAO.inserir(new Produto(2, "Mouse", 80.00));
    produtoDAO.inserir(new Produto(3, "Teclado", 150.00));

    for (Produto p : produtoDAO.listar()) {
        System.out.println(p);
    }

    //Cliente
    DAOLista<Cliente> clienteDAO = new DAOLista<>();

    clienteDAO.inserir(new Cliente(1, "Luke", "luke@gmail.com"));
    clienteDAO.inserir(new Cliente(2, "Darth", "darth@gmail.com"));

    for(Cliente c: clienteDAO.listar()){
        System.out.println(c.getNome());
    }
}
}
