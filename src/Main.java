
public class Main {

	public static void main(String[] args) {
Library library1 = new Library();
Book book1 = new Book();
Book book2 = new Book();
Book book3 = new Book();
Book book4 = new Book();
	book1.author = "Teodora Ivanova";
	book1.name = "How to Program";
	book1.year = 2012;
	book1.isbn = "1578954438";
	book1.publisher = "Izdatelska kushta Kozirog";
	
	book2.author = "Stephen King";
	book2.name = "IT";
	book2.year = 2002;
	book2.isbn = "1111111111";
	book2.publisher = "Izdatelska kushta SunRay";
	
	book3.author = "Adolf Hitler";
	book3.name = "Mein Kampf";
	book3.year = 1937;
	book3.isbn = "0000000000";
	book3.publisher = "Izdatelska kushta Germany";

	book4.author = "Dann Braun";
	book4.name = "The da Vinci Code";
	book4.year = 2003;
	book4.isbn = "9999999999";
	book4.publisher = "Izdatelska kushta Action";
	
	library1.AddBook(book1);
	library1.AddBook(book2);
	library1.AddBook(book3);
	library1.AddBook(book4);
	
	library1.PrintAllBooks();
	
	library1.Search("Stephen King");
	library1.Delete("Stephen King");
	
	library1.PrintAllBooks();
}
}