import java.util.Arrays;
public class Sorts{
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name(){
      return "10.Chen.Xavier";
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
      for(int i = 0; i < data.length; i++){
	  for (int n = i + 1; n<data.length; n ++ ){
	      if (data[n]<data[i]) {
		  int tempI = data[i];
		  int tempN = data[n];
		  data[n] = tempI;
		  data[i] = tempN;
	      }
	  }
  }
  }
    
    public static void insertionSort(int[] data){
	for(int i = 0; i<data.length; i++){
	    if (i < i 
	}
	
    }


    public static void main(String[]args) {
	int[]a = {11,10,9,3,512,123,5123,53,42,23,2};
	selectionSort(a);
	System.out.println(Arrays.toString(a));
    }
}
