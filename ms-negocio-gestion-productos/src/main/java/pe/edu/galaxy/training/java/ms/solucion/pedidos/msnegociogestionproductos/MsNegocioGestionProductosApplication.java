package pe.edu.galaxy.training.java.ms.solucion.pedidos.msnegociogestionproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsNegocioGestionProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNegocioGestionProductosApplication.class, args);
	}

}
