package one_digitalinovation.gof.sevice;

import one_digitalinovation.gof.model.Cliente;



public interface ClienteService {

    Iterable <Cliente> buscarTodos();
    Cliente buscarPorId(Long Id);
    void inserir (Cliente cliente);
    void atualizar (Long id, Cliente cliente);
    void deletar(Long id);
}
