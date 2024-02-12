package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.dto.UsuarioDto;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.service.ClienteService;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.service.ServiceException;

@RestController
@RequestMapping("api/v1/personas")
public class ClienteController {
	
	private final ClienteService clienteService;

	public ClienteController(final ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public List<UsuarioDto> findAll() throws ServiceException {
		return clienteService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public UsuarioDto findById(@PathVariable Long id)  throws ServiceException {
		return clienteService.findById(id).get();
	}

}
