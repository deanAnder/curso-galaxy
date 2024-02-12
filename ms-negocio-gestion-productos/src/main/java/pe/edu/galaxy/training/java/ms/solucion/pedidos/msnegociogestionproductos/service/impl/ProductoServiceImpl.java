package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.dto.ProductoDto;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.mappers.ProductoMapper;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.repository.ProductoRepository;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.service.ProductoService;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.service.ServiceException;

@RequiredArgsConstructor
@Service
public class ProductoServiceImpl implements ProductoService {
	
	
	private final ProductoRepository productoRepository;
	private final ProductoMapper productoMapper;
	

	@Override
	public List<ProductoDto> findAll() throws ServiceException {
		
		return this.productoMapper.toDto(this.productoRepository.findAll());
	}

	@Override
	public List<ProductoDto> findByLikeObject(ProductoDto t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDto save(ProductoDto t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDto update(ProductoDto t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ProductoDto> findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
