public class Stack {
  int[] destinations;
  int location=0;
  public Stack(int depth){
    destinations= new int[depth];
  }
  public void insertStack(int[] dest) {
    destinations= dest;
    
    for(int a=0;a<destinations.length;a++) {
      destinations[a]= dest[a];
    }
  }
  public boolean travel(boolean back,int destination) {
    if(back){
      location= destinations[location];
      return true;
    }else {
      destinations[destination]= location;
      location= destination;
      return true;
    }
  }
  public int[] readStack() {return destinations;}
  public int indexOfStack() {return location;}
  public int sizeOfStack(){
    int a=0,b=0;
    while(destinations[a]!=0) {
      a= destinations[b];
      b++;
    }
    return b;
  }
}
