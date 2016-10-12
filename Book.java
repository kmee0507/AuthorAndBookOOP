
public class Book{
	String name;
	Author author;
	Double price;
	int qtyInStock;
	
	Book(String n, Author a, double p, int qty){
		name = n;
		author = a;
		price = p;
		qtyInStock = qty;
	}
	String getName(){
		return name;
	}
	Author getAuthor(){
		return author;
	}
	double getPrice(){
		return price;
	}
	void setPrice(double p){
		price = p;
	}
	int getQtyInStock(){
		return qtyInStock;
	}
	void setQtyInStock(int qty){
		qtyInStock = qty;
	}
	public String toString(){
		return "Name : " + getName() + "\nAuthor: " + getAuthor().getName() +
				"\nPrice: " + getPrice() + "\nQty in Stock: " + getQtyInStock(); 
	}

}
