public class ReferenceBook extends LibraryBook {
    private String collection;
    public ReferenceBook(String bookTitle, String auth, String number, String call, String col){
	     super(bookTitle, auth, number, call);
       collection = col;
    }
    public String getCollection(){
      return collection;
    }
    public void setCollection(String col) {
      collection = col;
    }
    public void checkout(String patron, String due){
      System.out.println("cannot check out a reference book");
    }
    public void returned(){
      System.out.println("reference book could not have been checked out -- return impossible");
    }
    public String circulationStatus(){
      return "non-circulating reference book";
    }
    public String toString(){
      return super.toString() + ", " + getCollection();
    }

}
