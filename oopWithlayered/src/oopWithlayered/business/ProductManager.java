package oopWithlayered.business;

import java.util.ArrayList;
import java.util.List;

import oopWithlayered.coreLoging.DataBaseLoger;
import oopWithlayered.coreLoging.FileLogger;
import oopWithlayered.coreLoging.Logger;
import oopWithlayered.dataAccess.HibernateProductDao;
import oopWithlayered.dataAccess.JdbcProductDao;
import oopWithlayered.dataAccess.ProductDao;
import oopWithlayered.entities.Product;

public class ProductManager {

	private ProductDao productDao;

	private Logger[] loggers;

	public ProductManager(ProductDao productDao,Logger[] loggers) {

		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {

		if (product.getUnitPrice() < 10) {
			throw new Exception("ürün fiyatı 10 dan kucuk olamaz");

		}
		productDao.add(product);
		productDao.delete(product);
		
		Logger[]loggers= {new DataBaseLoger(),new FileLogger()};
		for (Logger logger : loggers) {
			logger.log(product.getName());
			
			logger.log(product.getUnitPrice());
		}

	}
}
