
public class TestBook {
	
	public static void main(String[] args){
		Author anAuthor = new Author("KC","KC@somewhere.com",'M');
		Book aBook = new Book("Java for Dummies", anAuthor, 19.95, 8);
		System.out.println(aBook.toString());
	}

}
