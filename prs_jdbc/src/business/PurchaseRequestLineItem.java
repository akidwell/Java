package business;

public class PurchaseRequestLineItem {
	
	private int id;
	private String purchaseRequestID;
	private String productID;
	private int quantity;
	
	public PurchaseRequestLineItem() {
		super();
	}

	public PurchaseRequestLineItem(int id, String purchaseRequestID, String productID, int quantity) {
		super();
		this.id = id;
		this.purchaseRequestID = purchaseRequestID;
		this.productID = productID;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPurchaseRequestID() {
		return purchaseRequestID;
	}

	public void setPurchaseRequestID(String purchaseRequestID) {
		this.purchaseRequestID = purchaseRequestID;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "PurchaseRequestLineItem: id=" + id + ", purchaseRequestID=" + purchaseRequestID + ", productID="
				+ productID + ", quantity=" + quantity;
	}

}
