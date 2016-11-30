public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;
    public LibraryBook(String bookTitle, String auth, String number, String call) {
	setTitle(bookTitle);
	setAuthor(auth);
	setISBN(number);
	callNumber = call;
    }
    public String getCall(){
	return callNumber;
    }
    public void setCall(String call){
	callNumber = call;
    }
    
    public abstract void checkout(String patron, String due);
    public abstract void returned();
    public abstract String circulationStatus();
    public int compareTo(LibraryBook lib) {
	if (callNumber.compareTo(lib.getCall()) > 0) {
		return 1;
	    }
	else if (callNumber.compareTo(lib.getCall()) <  0){
	    return -1;
	}
	else {
	    return 0;
	}
    }
    public String toString() {
	super.toString() + ", " + circulationStatus() + ", " +  getCall();
    }
}
