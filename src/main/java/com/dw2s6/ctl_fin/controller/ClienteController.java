package com.dw2s6.ctl_fin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw2s6.ctl_fin.domain.model.Cliente;	

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar(){
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente c1 = new Cliente(1,"João","j_ao@gmail.com","+5516989472663");
		Cliente c2 = new Cliente(2,"Pedro","p_dro@gmail.com","+5516947284773");
		Cliente c3 = new Cliente(3,"Rafael","r_fael@gmail.com","+551693756372");
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		
		return clientes;
	}
	
}
