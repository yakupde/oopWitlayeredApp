package oopWithlayered.dataAccess;

import oopWithlayered.entities.Product;

public class JdbcProductDao implements ProductDao {

	public void add(Product product) {
		
		// bu katmana sadece db (database) erişim kodları buraya yazılır.SQL
		
	
		System.out.println("JDBC ile veri tabanına eklendi.");
		
	}
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println("veriler hibernate ile silindi");
	}
	
}
