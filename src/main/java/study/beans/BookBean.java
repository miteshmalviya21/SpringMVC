package study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BookBean {
	
	private String name;
	private double cost;
	
	@Autowired
	private PublisherBean publisher;
	
	
	
	public PublisherBean getPublisher() {
		return publisher;
	}



	public void setPublisher(PublisherBean publisher) {
		this.publisher = publisher;
	}



	//CONTAINER will have to use this constructor to create BookBean
	//Container MUST pass parameter to the constructor i.e. PublisherBean
	//Container searches for another bean of type PublisherBean and injects it
	//@Autowired
	public BookBean(PublisherBean publisher) {
		super();
		this.name = "the goal";
		this.cost = 500;
		this.publisher = publisher;
		System.out.println("BookBean constructor with 1 parameter publisher bean ");
	}



	public BookBean() {
		setName("20 thousand leagues under the sea");
		setCost(300);
		System.out.println("Book Bean Default Constroctor");
	}
	
	
	//@Autowired  ---this cannot happen because the two parameter are not beans
	public BookBean(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
		System.out.println("Book Bean 2 Parameter Constroctor");
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
