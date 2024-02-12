package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.mappers;

import java.util.List;

import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.dto.ProductoDto;
import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.entity.ProductoEntity;

public interface ProductoMapper {
	
	ProductoDto toDto(ProductoEntity e);
	
	List<ProductoDto> toDto(List<ProductoEntity> lst);
	
}
