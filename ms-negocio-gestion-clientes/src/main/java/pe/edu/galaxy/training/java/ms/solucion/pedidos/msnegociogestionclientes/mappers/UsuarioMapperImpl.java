package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.dto.UsuarioDto;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.entity.UsuarioEntity;

@Component
public class UsuarioMapperImpl implements UsuarioMapper {
	

	@Override
	public UsuarioDto toDto(UsuarioEntity e) {
		return UsuarioDto.builder().id(e.getId()).nombre(e.getNombre()).apellido(e.getApellido()).estado(e.getEstado())
				.idPerfil(e.getIdPerfil()).build();
	}

	@Override
	public List<UsuarioDto> toDto(List<UsuarioEntity> lst) {
		return lst.stream()
				.map(entity -> toDto(entity))
				.toList();
	}
}
