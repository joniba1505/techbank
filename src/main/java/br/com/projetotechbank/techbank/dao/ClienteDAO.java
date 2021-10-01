package br.com.projetotechbank.techbank.dao;

import org.springframework.data.repository.CrudRepository;


import br.com.projetotechbank.techbank.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer>{

}
