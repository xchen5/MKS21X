public class Book {
    private String author;
    private String title;
    private String ISBN;
    public Book() {
	author = "Author";
	title = "Title";
	ISBN = "ISBN";
    }
    public Book(String booktitle ,String auth,String number) {
	author = auth;
	title = booktitle;
	ISBN = number;
    }
    
    public String getAuthor (){
	return author;
    }

    public String getTitle() {
	return title;
    }
    public String getISBN(){
	return ISBN;
    }
    public void setAuthor(String auth){
	author = auth;
    }
    public void setTitle (String booktitle) {
	title = booktitle;
    }
    public void setISBN(String number) {
	ISBN = number;
    }
    public String toString(){
	return getTitle() + ", " +  getAuthor() + ", " + getISBN();
    }

    public static void main (String[]args){
	Book a = new Book();
	System.out.println(a.toString());
    }
}
