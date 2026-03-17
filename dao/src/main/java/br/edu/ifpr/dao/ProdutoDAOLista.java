package br.edu.ifpr.dao;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOLista implements ProdutoDAO {
    private List<Produto> produtos;

    public ProdutoDAOLista() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void inserir(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public List<Produto> listar() {
        return produtos;
    }

    @Override
    public Produto buscarPorId(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void remover(int id) {
        Produto produto = buscarPorId(id);
        if (produto != null) {
            produtos.remove(produto);
        }
    }
}