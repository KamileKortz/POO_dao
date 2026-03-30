package br.edu.ifpr.dao.generics;

import java.util.ArrayList;
import java.util.List;

public class DAOLista<T> implements GenericDAO<T> {
    private List<T> lista;

    public DAOLista() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void inserir(T object) {
        lista.add(object);
    }

    @Override
    public List<T> listar() {
        return lista;
    }

    @Override
    public T buscarPorId(int id) {
        for (T obj : lista) {
            try {
                java.lang.reflect.Method metodoGetId = obj.getClass().getMethod("getId");
                int idDoObjeto = (int) metodoGetId.invoke(obj);

                if (idDoObjeto == id) {
                    return obj;
                }
            } catch (Exception e) {
                System.out
                        .println("A classe " + obj.getClass().getSimpleName() + " não possui um método getId().");
            }
        }
        return null; 
    }

    @Override
    public void remover(int id) {
        T objParaRemover = buscarPorId(id);

        if (objParaRemover != null) {
            lista.remove(objParaRemover);
            System.out.println("Objeto genérico com ID " + id + " removido com sucesso!");
        } else {
            System.out.println("ID " + id + " não encontrado.");
        }
    }
}
