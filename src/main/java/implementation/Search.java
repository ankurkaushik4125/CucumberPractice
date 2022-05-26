package implementation;
public class Search {

	public String displayProduct(Product product) {
		if (product.getProductsList().contains(product.getProductName())) {
			return product.getProductName();
		}
		return null;

	}

}
