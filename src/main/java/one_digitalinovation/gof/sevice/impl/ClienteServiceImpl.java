package one_digitalinovation.gof.sevice.impl;

import one_digitalinovation.gof.model.Cliente;
import one_digitalinovation.gof.sevice.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Override
    public Iterable <Cliente> buscarTodos(){
        return null;
    }
    @Override
    public Cliente  buscarPorId(Long id){
        return null;
    }
    @Override
    public void inserir (Cliente cliente){

    }
    @Override
    public void atualizar (Long id, Cliente cliente){

    }

    @Override
    public void deletar (Long id){

    }
}
