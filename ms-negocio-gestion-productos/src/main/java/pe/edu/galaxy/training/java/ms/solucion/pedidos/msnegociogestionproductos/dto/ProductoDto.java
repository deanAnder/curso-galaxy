package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductoDto {
	
	private Long id;
	
	private String nombre;
	
	private BigDecimal precio;
	
	private Integer stock;
	
	private String estado;

}
