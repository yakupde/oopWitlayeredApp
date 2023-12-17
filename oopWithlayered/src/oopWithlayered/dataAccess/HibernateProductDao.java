package oopWithlayered.dataAccess;

import oopWithlayered.entities.Product;

public class HibernateProductDao implements ProductDao{


	public void add(Product product) {
		// TODO Auto-generated method stub
		
		System.out.println("hibernate ile veritabanına eklendi");
	}
	
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println("veriler hiberate ile silindi");
	}
	

	}

