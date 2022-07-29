import java.util.HashSet;
import java.util.Objects;

public class HashSetTest {
	public static void main(String[] args) {

		Book book1 = new Book(1,"Java","Flamingo","2nd",264,150);
		Book book2 = new Book(5,"The Hobbit","Flamingo","4nd",564,375);
		Book book3 = new Book(9,"A passage to India:","E.M.Forster","1st",324,400);
		Book book4 = new Book(3,"Adventures of Sherlock Holmes"," Arthur Conan Doyle","3rd",479,540);
		Book book5 = new Book(9,"A passage to India:","E.M.Forster","1st",324,400);
		System.out.println("book1 : "+book1);
		System.out.println("book2 : "+book2);
		System.out.println("book3 : "+book3);
		System.out.println("book4 : "+book4);
		System.out.println("book5 : "+book5);
		
		System.out.println("----");
		
		System.out.println("book1 : "+book1.hashCode());
		System.out.println("book2 : "+book2.hashCode());
		System.out.println("book3 : "+book3.hashCode());
		System.out.println("book4 : "+book4.hashCode());
		System.out.println("book4 : "+book5.hashCode());
		
		HashSet<Book> bookShelf = new HashSet<Book>();
		
		System.out.println("Adding book1 ");
		bookShelf.add(book1);
		
		System.out.println("Adding book2 ");
		bookShelf.add(book2);

		System.out.println("Adding book3 ");
		bookShelf.add(book3);
			
		System.out.println("Adding book4 ");
		bookShelf.add(book4);
		
		System.out.println("Adding book5 ");
		bookShelf.add(book5);
		
		for (Book book : bookShelf) {
			System.out.println("The Book : "+book);
		}
	}
}

class Book
{
	int bookNumber;
	String title;
	String bookAuthor;
	String edition;
	int numberOfPages;
	int bookPrice;
	

	
	public Book(int bookNumber, String title, String bookAuthor, String edition, int numberOfPages, int bookPrice) {
		super();
		this.bookNumber = bookNumber;
		this.title = title;
		this.bookAuthor = bookAuthor;
		this.edition = edition;
		this.numberOfPages = numberOfPages;
		this.bookPrice = bookPrice;
	}

	

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", title=" + title + ", bookAuthor=" + bookAuthor + ", edition="
				+ edition + ", numberOfPages=" + numberOfPages + ", bookPrice=" + bookPrice + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookNumber, bookPrice, edition, numberOfPages, title);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookAuthor, other.bookAuthor) && bookNumber == other.bookNumber
				&& bookPrice == other.bookPrice && Objects.equals(edition, other.edition)
				&& numberOfPages == other.numberOfPages && Objects.equals(title, other.title);
	}

	
	
}