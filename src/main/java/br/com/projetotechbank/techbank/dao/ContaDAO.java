package br.com.projetotechbank.techbank.dao;

import org.springframework.data.repository.CrudRepository;


import br.com.projetotechbank.techbank.model.Conta;

public interface ContaDAO extends CrudRepository<Conta, Integer>{

}
