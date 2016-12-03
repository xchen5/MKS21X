import java.util.*;
public class SuperArrayIterator implements Iterator<String> {
    private SuperArray ary;
    private int element;
    public SuperArrayIterator(SuperArray Super) {
	ary = Super;
	element = 0;
    }
    public boolean hasNext(){
	if (ary.get(element + 1) != null) {
	    return true;
	}
	else {
	    return false;
	}
    }
    public String next(){
	if (hasNext()) {
	    element += 1;
	    return ary.get(element - 1);
	}
	else {
	    throw new NoSuchElementException();
	}
    }
    public void remove(){
	throw new UnsupportedOperationException();
    }
}
