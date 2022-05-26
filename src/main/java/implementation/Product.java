package implementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	
	private String ProductName;
	private int Price;
	public Product(String productName, int price) {
		
		ProductName = productName;
		Price = price;
	}
	
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	public List<String> getProductsList()
	{
		List<String> productslist = new ArrayList<>();
		productslist.add("Apple Macbook Pro");
		productslist.add("Apple Macbook Air");
		productslist.add("Apple iphone 12");
		return productslist;
		
	}
}
