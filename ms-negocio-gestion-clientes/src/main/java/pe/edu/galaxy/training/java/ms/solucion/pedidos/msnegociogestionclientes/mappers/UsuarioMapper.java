package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.mappers;

import java.util.List;

import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.dto.UsuarioDto;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.entity.UsuarioEntity;

public interface UsuarioMapper {
	
	UsuarioDto toDto(UsuarioEntity e);
	
	List<UsuarioDto> toDto(List<UsuarioEntity> lst);
	
}
