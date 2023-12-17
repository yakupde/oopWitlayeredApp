package oopWithlayered;

import java.lang.System.Logger;
import java.util.List;

import oopWithlayered.business.ProductManager;
import oopWithlayered.coreLoging.DataBaseLoger;
import oopWithlayered.coreLoging.FileLogger;
import oopWithlayered.coreLoging.MailLogger;
import oopWithlayered.dataAccess.HibernateProductDao;
import oopWithlayered.dataAccess.JdbcProductDao;
import oopWithlayered.entities.Product;


public class Main {


	private static final oopWithlayered.coreLoging.Logger[] loggers = null;

	public static void main(String[] args) throws Exception {
		
		
		Product product2=new Product(26,"çay makinesi",3500);
		
		Product product1=new Product(25,"kahve makinesi", 2500);
		

		
		
		ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
		
		productManager.add(product1);
		productManager.add(product2);
	
		
	}

}