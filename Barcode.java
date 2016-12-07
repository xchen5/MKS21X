
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
      if (zip.length() != 5){
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

    private int sumDigits(int num){
	int sum = 0;
	while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
	return sum;
    }
	    
    private String toConvert(String input){
	if (input.equalsTo("0")){
	    return "||:::";
	}
	else if (input.equalsTo("1")){
	    return ":::||";
	}
	else if (input.equalsTo("2")){
	    return ":::||";
	}
	else if (input.equalsTo("3")){
	    return ":::||";
	}
	else if (input.equalsTo("4")){
	    return ":::||";
	}
	else if (input.equalsTo("5")){
	    return ":::||";
	}
	else if (input.equalsTo("6")){
	    return ":::||";
	}
	else if (input.equalsTo("7")){
	    return ":::||";
	}
	else if (input.equalsTo("8")){
	    return ":::||";
	}
	else {
	    return "|:|::";
	}
    }

// postcondition: Creates a copy of a bar code.
//  public Barcode clone(){}


// postcondition: computes and returns the check sum for _zip
//  private int checkSum(){}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
//  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
//  public int compareTo(Barcode other){}
     
  public static void main(String[]args){
      Barcode a  = new Barcode("11547");
      System.out.println(a.getDigit());
  }

}
