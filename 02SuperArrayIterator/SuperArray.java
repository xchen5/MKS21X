public class SuperArray{
  private String[] data;
  private int size;

  //0
  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException();
    }
    data = new String[initialCapacity];
    size = 0;
  }

  public int size(){
    return size;
  }

  public String[] data() {
    return data;
  }

  public void setData(String[]data) {
    this.data = data;
  }

  public void setSize(int size) {
    this.size = size;
  }
  public void trimToSize(){
    String[]tmp = new String [size];
    for (int i = 0; i<size; i++) {
      tmp[i] = data[i];
    }
    data = tmp;
  }

  //1
  /**add the value n to the next available slot in the superArray.
  *this will change the size. This function should always work
  *And will resize the SuperArray if needed.*/

  public boolean add(String n){
    if (size + 1 > data.length) {
      grow();
    }
    size += 1;
    data[size() - 1] = n;
    return true;
  }

  //2
  /**Resize the data, by making a new array, then copying over elements, use this as your data.
  */

  public void grow(){
    String[]tmp;
    if (data.length == 0) {
      tmp = new String[1];
    }
    else {
      tmp = new String[data.length*2];
    }
    for(int i = 0; i < size(); i ++) {
      tmp[i] = data[i];
    }
    data = tmp;

  }

  //3
  /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5]
  *commas between... square bracket start/end and no comma at end.*/
  public String toString(){
    String sofar = "";
    for (int i = 0 ; i < size(); i++) {
      if (i == size() - 1) {
        sofar += data[i];
      }
      else {
        sofar += data[i] + ", ";
      }
    }
    return "[ " + sofar + ']';
  }

  //4
  /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]
  *(capacity is 10, but only 6 are used)
  *commas between... square bracket start/end and no comma at end.
  *unused slots should be printed as _ (underscores) */
  public String toStringDebug(){
    String sofar= "";
    for (int i = 0; i < data.length; i++) {
      if (i >= size()) {
        if (i == data.length - 1){
          sofar += "_";
        }
        else {
          sofar += "_, ";
        }
      }
      else {
        sofar += data[i] + ",";
      }
    }
    return "[ " + sofar + ']' ;
  }

  public String get(int index) {
    return data[index];
  }

  public void clear() {
    size = 0;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    else {
      return false;
    }
  }

  public String set(int index, String element) {
    if (index < 0 ||index >= size()) {
      throw new IndexOutOfBoundsException();
    }
    String x = data[index];
    data[index] = element;
    return x;
  }

  public void add(int index, String element) {
    if (index < 0 || index > size()) {
      throw new IndexOutOfBoundsException();
    }
    if (size() + 1 >= data.length ) {
    	    grow();
    }
    size += 1;
    String[]tmp = new String[data.length];
    for(int i = 0; i < size; i++ ) {
      if (i == index) {
        tmp[i] = element;
      }
      else if (i > index) {
        tmp[i] = data [i - 1];
      }
      else {
        tmp[i] = data[i];
      }
      }
    data = tmp;
    }

  public String remove(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException();
    }
    String x = data[index];
    String[]tmp = new String[data.length];
    for(int i = 0;i < size; i++) {
      if (index >= i) {
        tmp[i] = data[i+1];
      }
      else {
        tmp[i] = data[i];
      }
    }
    size -= 1;
    data = tmp;
    return x;
  }
  public String[] toArray() {
    String[]returnthis = new String[size];
    for(int i = 0;i < size; i ++) {
      returnthis[i] = data[size];
    }
    return returnthis;
  }

  public int indexOf(String i) {
    int s = -1;
    for (int index = 0 ; index < size ; index ++) {
        if (i.equals(data[index])) {
        s = index;
        return s;
        }
    }
    return s;
  }

  public int lastIndexOf(String i) {
    int s = -1;
    for (int index = size - 1 ; index > 0  ; index-= 1) {
        if (i.equals(data[index])) {
        s = index;
        return s;
        }
    }
    return s;

  }
}
