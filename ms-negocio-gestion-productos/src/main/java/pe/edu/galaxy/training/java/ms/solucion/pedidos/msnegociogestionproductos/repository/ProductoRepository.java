package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos.entity.ProductoEntity;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long>{
	
	//JPQL
	
	/*@Query("Select p from tbl_producto p where p.estado='1'")
	List<ProductoEntity> findAllCustom();
	
	@Query("Select p from tbl_producto p where upper(p.razonSocial) like upper(:razonSocial) and p.estado='1'")
	List<ProductoEntity> findByLikeRazonSocial(@Param("razonSocial") String razonSocial);

	//SQL
	
	@Modifying
	@Query(nativeQuery = true, value = "update tbl_producto set estado='0' where producto_id=:id")
	void deleteCustom(@Param("id") Long id);*/
	
	
	// Agregates(DTO, Optimizacion de consultas)

}
