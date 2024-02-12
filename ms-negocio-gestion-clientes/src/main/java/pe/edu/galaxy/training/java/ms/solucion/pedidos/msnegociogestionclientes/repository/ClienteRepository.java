package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionclientes.entity.UsuarioEntity;

@Repository
public interface ClienteRepository extends JpaRepository<UsuarioEntity, Long>{
	
	//JPQL
	
	/*@Query("Select p from tbl_usuario p where p.estado='Activo")
	List<UsuarioEntity> findAllCustom();
	
	@Query("Select p from Cliente p where upper(p.razonSocial) like upper(:razonSocial) and p.estado='1'")
	List<UsuarioEntity> findByLikeRazonSocial(@Param("razonSocial") String razonSocial);

	//SQL
	
	@Modifying
	@Query(nativeQuery = true, value = "update tbl_cliente set estado='0' where cliente_id=:id")
	void deleteCustom(@Param("id") Long id);*/
	
	
	// Agregates(DTO, Optimizacion de consultas)

}
