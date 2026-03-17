package br.edu.ifpr.dao;

import java.util.List;

public interface ProdutoDAO {
    void inserir(Produto produto);
    List<Produto> listar();
    Produto buscarPorId(int id);
    void remover(int id);
}
