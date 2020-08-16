package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.Cliente;
import com.service.ClienteRepository;
import com.service.ResourceNotFoundException;

@RestController
@RequestMapping("/api/v1")
public class ClienteController 
{
	@Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable(value = "id_cliente") Long clienteId)
        throws ResourceNotFoundException {
        Cliente cliente = clienteRepository.findById(clienteId)
          .orElseThrow(() -> new ResourceNotFoundException("Cliente not found for this id :: " + clienteId));
        return ResponseEntity.ok().body(cliente);
    }
    
    @GetMapping("/greeting")
	public String greeting(){
		return "hello";
	}
    
    @GetMapping("/saludo")
	public String saludo(){
		return "saludo";
	}
}
