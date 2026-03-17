package br.edu.ifpr.dao.generics;

import java.util.List;

public interface GenericDAO<T> {
    void inserir(T object);
    List<T> listar();
    T buscarPorId(int id);
    void remover(int id);

}
