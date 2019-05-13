package business;

import java.time.LocalDate;

public class PurchaseRequest {

	private int id;
	private int userID;
	private String justification;
	private LocalDate dateNeeded;
	private String deliveryMode;
	private String status;
	private double total;
	private LocalDate submittedDate;
	private String reasonForRejection;
	
	public PurchaseRequest() {
		super();
	}
	
	public PurchaseRequest(int id, int userID, String justification, LocalDate dateNeeded, String deliveryMode,
			String status, double total, LocalDate submittedDate, String reasonForRejection) {
		super();
		this.id = id;
		this.userID = userID;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public LocalDate getDateNeeded() {
		return dateNeeded;
	}

	public void setDateNeeded(LocalDate dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDate getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(LocalDate submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	@Override
	public String toString() {
		return "PurchaseRequest: ID=" + id + ", userID=" + userID + ", justification=" + justification + ", dateNeeded="
				+ dateNeeded + ", deliveryMode=" + deliveryMode + ", status=" + status + ", total=" + total
				+ ", submittedDate=" + submittedDate + ", reasonForRejection=" + reasonForRejection;
	}

	
	
}
