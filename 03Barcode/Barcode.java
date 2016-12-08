public class Barcode{
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      if (zip.length() != 5 && !zip.matches("[0-9]+")){
	  throw new RuntimeException();
      }
      else {
	  _zip = zip;
	  _checkDigit = sumDigits(Integer.parseInt(zip)) % 10;
      }
  }
  public int getDigit(){
      return  _checkDigit;
  }
  public String getZip(){
    return _zip;
  }

    private int sumDigits(int num){
	int sum = 0;
	while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
	return sum;
    }


    private String toConvert(String input){
	if (input.equals("0")){
	    return "||:::";
	}
	else if (input.equals("1")){
	    return ":::||";
	}
	else if (input.equals("2")){
	    return "::|:|";
	}
	else if (input.equals("3")){
	    return "::||:";
	}
	else if (input.equals("4")){
	    return ":|::|";
	}
	else if (input.equals("5")){
	    return ":|:|:";
	}
	else if (input.equals("6")){
	    return ":||::";
	}
	else if (input.equals("7")){
	    return "|:::|";
	}
	else if (input.equals("8")){
	    return "|::|:";
	}
	else {
	    return "|:|::";
	}
    }

// postcondition: Creates a copy of a bar code.
  public Barcode clone(){
      Barcode n = new Barcode(_zip);
      return n;
  }


// postcondition: computes and returns the check sum for _zip
//  private int checkSum(){}

//postcondition: format zip + check digit + Barcode
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"
  public String toString(){
    String xD = "";
    for(int i =0; i < _zip.length(); i++) {
      xD += toConvert(String.valueOf(_zip.charAt(i)));
    }
    return "||" + xD + toConvert(Integer.toString(_checkDigit)) + "||";
  }


// postcondition: compares the zip + checkdigit, in numerical order.
  public int compareTo(Barcode other){
    int current = Integer.parseInt(_zip + _checkDigit);
    int another = Integer.parseInt(other.getZip() + other.getDigit());
    if (current < another) {
      return -1;
    }
    else if (another < current){
      return 1;
    }
    else {
      return 0;
    }
  }

  public static void main(String[]args){
      Barcode a  = new Barcode("11547");
      System.out.println(a.getDigit());
      System.out.println(a.toString());
  }

}
