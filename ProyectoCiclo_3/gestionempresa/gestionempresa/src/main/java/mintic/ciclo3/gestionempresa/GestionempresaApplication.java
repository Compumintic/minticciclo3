package mintic.ciclo3.gestionempresa;

import mintic.ciclo3.gestionempresa.entity.Employee;
import mintic.ciclo3.gestionempresa.entity.Enterprise;
import mintic.ciclo3.gestionempresa.entity.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionempresaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionempresaApplication.class, args);
	}

	Employee employee = new Employee(12, "leolenis@gmail.com");
	Enterprise enterprise = new Enterprise(14, "Leonardo", "125646",
			"350644", "Cra 73");
	Transaction transaction = new Transaction(65, "Venta", 25025);

}
