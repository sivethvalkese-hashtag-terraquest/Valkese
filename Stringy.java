import java.util.*;
import graphics.StringType;

public class Stringy {
  static Stack stk= new Stack(1000);
  static ArrayList<StringType> document= new ArrayList<>();
  public static void main(String[] args) {
    //begins document example
    document.add(new StringType());
    //programming keyboard input occurs past this point. note merging StringType class together for memory optimization
   
  }
  static int enlargeDocument(int byHowMuch) {
    int output;
    Stack newstack= new Stack((output= byHowMuch+stk.readStack().length));
    newstack.insertStack(stk.readStack());
    return output;
  }
}
