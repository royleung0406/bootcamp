public class DemoMath {
  public static void main(String[] args) {
    // min
    System.out.println(Math.min(7, 3)); // 3
    System.out.println(Math.min(2, 8)); // 2
    System.out.println(Math.min(5, 5)); // 5

    // max
    System.out.println(Math.min(7, 3)); // 7
    System.out.println(Math.min(2, 8)); // 8
    System.out.println(Math.min(5, 5)); // 5

    //Find Max
    int[] arr = new int[] {3, 6, - 100, 4};
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++){
      max = Math.max(max, arr[i]);
    }
    System.out.println(max);

    // Find min
    int min = Integer.MAX_VALUE;
    for (int i = 0; i< arr.length; i++){
      min = Math.min(min, arr[i]);
    }
    System.out.println(min);

    //ABS

    int[] arr2 = new int[]{};


    // sqrt()
    int x = 81;
    System.out.println(Math.sqrt(x));


  }
}
