package br.edu.ifpr.dao.object;

import java.util.List;

public interface ObjectDAO {
    void inserir(Object object);
    List<Object> listar();
    Object buscarPorId(int id);
    void remover(int id);
}
