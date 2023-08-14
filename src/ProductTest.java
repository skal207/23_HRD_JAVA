
class TV {
	
}

class Car {
	
}

class Product <K, M>{
	private K kind;
	private M model;
	
	public K getKind() {
		return this.kind;
	}
	
	public M getModel() {
		return this.model;
	}
	
	public void setKind(K kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
	
}

public class ProductTest {
	
	public static void main(String[] args) {
		
		Product<TV, String> product1 = new Product();
		product1.setKind(new TV());
		product1.setModel("스마트 TV");
		
		System.out.println("제품정보: " + product1.getModel());

	}

}
