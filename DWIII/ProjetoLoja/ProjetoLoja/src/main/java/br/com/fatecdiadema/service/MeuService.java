package br.com.fatecdiadema.service;

import org.springframework.stereotype.Service;
import br.com.fatecdiadema.model.Cliente;
import br.com.fatecdiadema.repository.MeuRepository;

@Service
public class MeuService{
    //Lógica e plano de negocio vai aqui

    private MeuRepository repository;

    public MeuService(MeuRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
//        MeuRepository meuRepository = new MeuRepository();
//        meuRepository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente){
        //aplicar validação
    }
}