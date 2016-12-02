public class CirculatingBook extends LibraryBook {
  private String currentHolder;
  private String dueDate;
  public CirculatingBook (String bookTitle, String auth, String number, String call) {
     super(bookTitle, auth, number, call);
     currentHolder = null;
     dueDate = null;
  }
  public String getHolder() {
    return currentHolder;
  }
  public String getDate () {
    return dueDate;
  }
  public void setHolder(String hold){
    currentHolder = hold;

  }
  public void setDate(String date) {
    dueDate = date;
  }

  public void checkout(String patron, String due) {
    setHolder(patron);
    setDate(due);
  }

  public String circulationStatus() {
    if (getHolder() != null) {
      return getHolder() + ", " + getDate();
    }
    else {
      return "book available on shelves";
    }
  }
  public void returned(){
    setHolder(null);
    setDate(null);
  }
    public String toString() {
      return super.toString() + ", " + circulationStatus();
    }
}