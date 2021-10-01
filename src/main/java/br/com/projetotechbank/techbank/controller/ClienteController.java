package br.com.projetotechbank.techbank.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetotechbank.techbank.dao.ClienteDAO;
import br.com.projetotechbank.techbank.model.Cliente;

@RestController
public class ClienteController {

	@Autowired
	
	
	private ClienteDAO dao; 
	@GetMapping("/clientes")
public ArrayList<Cliente> recuperarClientes() {
return (ArrayList<Cliente>) dao.findAll();
	}
}
