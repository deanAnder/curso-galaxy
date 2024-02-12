package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Producto")
@Table(name = "tbl_producto")
public class ProductoEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private BigDecimal precio;
	
	@Column(name = "stock")
	private Integer stock;
	
	@Column(name = "estado")
	private String estado;

}
