public class DemoForEachLoop {
  public static void main(String[] args) {

    // Main Different betwwen for loop and for each loop
    // for loop -> able to access all elements during each iteration
    // for eac loop -> easy to read/use, because you cannot have index
    int[] arr = new int[]{2, 9, 10, -3};

    // i -> array index
    for(int i = 0; i < arr.length; i++){
        System.out.println( arr[i]);
    }
    // for-each loop
    // i -> element
    int sum =0;
    for (int i : arr) {
      sum += i;
      System.out.println(sum);
      //System.out.println(i);
    }
    // primt out element

    String[] fruits = new String[] {"apple", "orange", "banana"};
    for(String i : fruits){
      if (i.equals("apple")){
        System.out.println("You have bought the one I need");
      }
    }

    //default value -- Wrapper class /String...
    Integer x = null;
    System.out.println(x); // null
    // x.intValue(); //error

    String s = null;
    System.out.println(s); // null
    // x.intValue(); //error
  }
}
