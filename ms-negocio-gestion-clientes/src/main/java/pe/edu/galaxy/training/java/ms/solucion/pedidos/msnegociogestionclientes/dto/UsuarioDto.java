package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDto {
	
	private Long id;
	
	private Integer idPerfil;
	
	private String nombre;
	
	private String apellido;
	
	private String estado;
}
