package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.dto.ProductoDto;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.entity.ProductoEntity;

@Component
public class ProductoMapperImpl implements ProductoMapper {
	

	@Override
	public ProductoDto toDto(ProductoEntity e) {
		return ProductoDto.builder().id(e.getId()).nombre(e.getNombre()).stock(e.getStock())
				.estado(e.getEstado()).build();
	}

	@Override
	public List<ProductoDto> toDto(List<ProductoEntity> lst) {
		return lst.stream()
				.map(entity -> toDto(entity))
				.toList();
	}
}
