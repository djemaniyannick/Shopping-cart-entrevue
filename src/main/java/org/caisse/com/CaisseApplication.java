package org.caisse.com;
import org.caisse.com.dto.OrangeDto;
import org.caisse.com.dto.PommeDto;
import org.caisse.com.service.OrangeService;
import org.caisse.com.service.PanierService;
import org.caisse.com.service.PommeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaisseApplication implements CommandLineRunner{

	@Autowired
	private OrangeService oranges;
	@Autowired
	private PommeService pommes;
	@Autowired
	private PanierService panier;
	
	public static void main(String[] args) {
		SpringApplication.run(CaisseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//add pomme
		PommeDto p = pommes.save(new PommeDto(0.6, "red",3)); //100
		 System.err.println("pomme save : "+p);
		 
		OrangeDto o = oranges.save(new OrangeDto(1.25, "yellow",1)); //500
		System.err.println("orange save : "+o);
		
		System.err.println("list pommes");
		System.err.println(pommes.getAll());
		
		System.err.println("list oranges");
		System.err.println(oranges.getAll());
		
		System.err.println("Total");
		System.err.println(panier.calculTotal());
		
	}

	
}
