package br.com.projetotechbank.techbank.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetotechbank.techbank.dao.ContaDAO;
import br.com.projetotechbank.techbank.model.Conta;

@RestController
public class ContaController {

	@Autowired
	
	private ContaDAO dao;
	@GetMapping("/contas")
public ArrayList<Conta> recuperarContas() {
		return (ArrayList<Conta>)dao.findAll();
	}

@GetMapping("/contas/{numero}")
public ResponseEntity<Conta> recuperarContaPorNumero(@PathVariable int numero) {

Conta resultado = dao.findById(numero).orElse(null);
if (resultado != null) {
	return ResponseEntity.ok(resultado);
	}
return ResponseEntity.notFound().build();
}


}
