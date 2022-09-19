package study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageBean {

	private String message;
	private String senderName;
	private AddressBean reciverAddress;
	
	
	public AddressBean getReciverAddress() {
		return reciverAddress;
	}

	@Autowired
	public void setReiciverAddress(AddressBean reciverAddress) {
		this.reciverAddress = reciverAddress;
	}
	
	public MessageBean(AddressBean reciverAddress) {
		System.out.println("Message Bean constructor with 1 parameter");
		setMessage("Have a good day");
		setSenderName("Naman");
		this.reciverAddress = reciverAddress;
	}
	
	// default constructor
	public MessageBean() {
		System.out.println("Message bean default constructor called --- that means instance is created");
	}
	
	// parameter constructor
	public MessageBean(String message, String senderName, AddressBean reciverAddress) {
		
		super();
		System.out.println("constructor with 3 parameters");
		this.message = message;
		this.senderName = senderName;
		this.reciverAddress = reciverAddress;
	}

	public String getMessage() {
		//System.out.println("Entering in getMessage getter");
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Entering in setMessage setter");
		this.message = message;
	}

	public String getSenderName() {
		//System.out.println("Entering in getSenderName getter");
		return senderName;
	}

	public void setSenderName(String senderName) {
		System.out.println("Entering in setSenderName setter");
		this.senderName = senderName;
	}
	
}
