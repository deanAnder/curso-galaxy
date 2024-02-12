package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.dto.ProductoDto;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.service.ProductoService;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.service.ServiceException;

@RestController
@RequestMapping("api/v1/productos")
public class ProductoController {
	
	private final ProductoService clienteService;

	public ProductoController(final ProductoService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public List<ProductoDto> findAll() throws ServiceException {
		return clienteService.findAll();
	}

}
