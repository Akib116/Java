
public class Product {
	
	
	String code;
	double price;
	String distription;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDistription() {
		return distription;
	}
	public void setDistription(String distription) {
		this.distription = distription;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", price=" + price + ", distription=" + distription + "]";
	}
	public Product(String code, double price, String distription) {
		super();
		this.code = code;
		this.price = price;
		this.distription = distription;
	}

}
