import java.util.Arrays;

public class App {
    public static void main(String[] args){
        // 8 primitive
        int x =3;
        int x2= 6;
        int x3 =-4;
        int max;
        if (x > x2){
            if (x > x3){
                max =x;
        }else {max = x3;
        } 
        } else {
            if (x2 > x3) {
                max = x2;
            
        }else{
            max = x3;
        }
    }
        System.out.println("max is = " +max);

        // How about 10??
        // You have to define the length of array before you use iy
        int[] arr = new int[3]; //3 means the length of array
        arr[0] = 3;
        arr[1] = 6;
        arr[2] = -4;
        // print out all number from the array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr.length);

        // for loop -> print the value in array
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        // declare the array for double
        // for loop
        double[] arr1 = new double[5];
        arr1[0] = 3;
        arr1[1] = 6;
        arr1[2] = -4;
        arr1[3] = 7;
        arr1[4] = 5;
        for (int i = 0; i < arr1.length; i++ ){
            System.out.println(arr1[i]);
        }
        // Example 1
        int[] arr3 = new int[3];
        arr3[0] =12;
        arr3[1] =6;
        arr3[2] =11;int maxNo = -10000;

         
        for (int i = 0; i < arr3.length; i++){
            if (arr3[i] > maxNo) {
                maxNo = arr3[i];
            }
        }System.out.println(maxNo);

        // Find the min number
        int  minNo = 100000000;
        for (int i = 0; i < arr3.length; i++){
            if (arr3[i] < minNo){
                minNo = arr3[i];
            }
        } System.out.println(minNo);
    // Example 3
    String[] strings = new String[3];
    strings[0] = "abcdef";
    strings[1] = "Cisco Unit";
    strings[2] = "Cisco Unit111111111@";
    String loopStrings ="";
    int maxLength = -1;

    for(int i = 0; i < strings.length; i++){
        if (strings[i].length() > loopStrings.length()){
            loopStrings = strings[i];
        }
    }System.out.println(loopStrings);

    // Example 4
    double[] price = new double[4];
    price[0] = 10.3;
    price[1] =7.7;
    price[2] = 1.5;
    price[3] = 2.3;
    int[] quantity = new int[4];
    quantity[0] = 10;
    quantity[1] = 2;
    quantity[2] = 5;
    quantity[3] = 4;


    double totalAmount = 0.0;
    for (int i = 0; i < price.length; i++){
        totalAmount += (price[i] * quantity[i]); 
    }System.out.println(totalAmount);
    // Example 5
    // Average
    int[] scores = new int[5];
    scores[0] = 79;
    scores[1] = 70;
    scores[2] = 50;
    scores[3] = 100;
    scores[4] = 90;
    double totalScore = 0;
    double Average;
    for (int i =0; i < scores.length; i++){
        totalScore += scores[i];
    } Average = totalScore / scores.length;
    System.out.println("The Average score will be " + Average);

    // declare and initialize an array
    // Approach 1
    String[] arr5 = new String[3];
    //Approach 2
    String[] arr6 = new String[]{"def" , "abc" , "ghi"};
    // Approach 3
    String[] arr7 = {"abc" , "def" , "ghi"};

    // Exxample 6
    int[] arr8 = new int []{100, -20, 40 ,33 ,90, 44, 66};
    int[] answers = new int [7];
    int idx =0;
        for (int i = 0; i < arr8.length; i++){
            if (arr8[i] > 40 && arr8[i] % 3 ==0) {
                answers[idx++] = arr8[i];
            }
        }// Print out array
        System.out.println(Arrays.toString(answers));
        
        // Example 7
        char[] arr9 = new char[2];
        arr9[0] = 'h';
        arr9[1] = 'a';
        char temp;
        //swap
            temp = arr9[0];
            arr9[0] = arr9[1];
            arr9[1] = temp;
            System.out.println(arr9[0]);
            System.out.println(arr9[1]);

        // Example 8
        // Loop and swap
        char[] arr10 = new char[]{'9' , '4' ,'3' , '2', '1', '0'};
        // Swap
        for (int i = 0; i < arr10.length - 1; i++){
            temp = arr10[i];
            arr10[i] = arr10[i+1]; 
            arr10[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr10));
  }
}
