import java.util.ArrayList;

public class Library {
	public String name;
	public ArrayList<Book> booklist = new ArrayList<Book>();
	public void AddBook(Book book)
	{ 
		booklist.add(book);
	System.out.println("Book was added successfully!");
		}
	public void Search(String author) 
	{ int flag=0;
		for(Book element : booklist)
		{
			if(element.author == author) 
				{
				System.out.print("Name: "+ element.name + ", Author: " + element.author + ", Publisher: " + 
		element.publisher + ", Year: " + element.year + ", ISBN: "+ element.isbn);
				System.out.println();
				flag=1;
				}
			if(flag==0) { System.out.println("There are no books from this author!");}
			System.out.println();
}
	}
	public void Delete(String author)
	{
		int index=0;
		for(Book element : booklist)
	{
		if(element.author == author) index=booklist.indexOf(element);
	}
		booklist.remove(index);
	}
	public void PrintAllBooks()
	{for(Book element : booklist) {
		System.out.print("Name: "+ element.name + ", Author: " + element.author + ", Publisher: " + 
				element.publisher + ", Year: " + element.year + ", ISBN: "+ element.isbn);
		System.out.println();
	}
	}
}
