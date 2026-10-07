package ch08;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class ProductService {
	Map<String, Product> products = new HashMap<>();
	
	public ProductService() {
		Product p = new Product("101","애플사과폰 12", "애플 전자", 120000,"2020.12.12");
		products.put("101", p);
		p = new Product("102","엘스듀얼폰 12", "엘스 전자", 150000,"2021.02.02");
		products.put("102", p);
		p = new Product("103","삼전우주폰 12", "삼전 전자", 130000,"2021.03.02");
		products.put("103", p);
		p = new Product("104","메가폰 12", "소음 전자", 10000,"2001.11.11");
		products.put("104", p);
		p = new Product("105","그리폰 12", "버드 전자", 1230000,"2024.12.16");
		products.put("105", p);
	}
	
	public List<Product> findAll(){
		return new ArrayList<>(products.values());
	}
	
	public Product find(String id) {
		return products.get(id);
	}
}
