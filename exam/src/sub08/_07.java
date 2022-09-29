package sub08;

import java.util.ArrayList;
import java.util.List;

class Products{
	List<Product> list = new ArrayList<>();

	public void SetProduct(String item, int price) {
		Product product = new Product();
		product.setItem(this, item, price);
	}
	public void showList() {
		for(Product p : list) {
			System.out.printf("상품 %s, 가격%,d\n",p.getItem(), p.getPrice());
		}
	}
	
	private class product{
		private String item;
		private int price;
		
		public void setItem(Products outer, String item, int price) {
			this.item=item;
			this.price=price;
			
			outer.list.add(this);
		}
		public String getItem() {
			return item;
		}
		public int getPrice() {
			return price;
		}
	}
}

public class _07 {

	public static void main(String[] args) {
		Products products = new Products();
		//Products.SetProduct("신발",30000);
		Products.showList();
	}
}
