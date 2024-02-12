package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.dto.UsuarioDto;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.mappers.UsuarioMapper;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.repository.ClienteRepository;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.service.ClienteService;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.service.ServiceException;

@RequiredArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService {
	
	
	private final ClienteRepository clienteRepository;
	private final UsuarioMapper clienteMapper;

	@Override
	public List<UsuarioDto> findAll() throws ServiceException {
		
		return this.clienteMapper.toDto(this.clienteRepository.findAll());
	}

	@Override
	public List<UsuarioDto> findByLikeObject(UsuarioDto t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDto save(UsuarioDto t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDto update(UsuarioDto t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<UsuarioDto> findById(Long id) throws ServiceException {
		return clienteRepository.findById(id)
				.map(user -> clienteMapper.toDto(user));
	}

}
