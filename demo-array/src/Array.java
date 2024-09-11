import java.util.Arrays;

public class Array {
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
    String[] arr6 = new String[]{"def" , "def" , "ghi"};
    System.out.println("Testing for =" + arr6[0].equals(arr6[1]));
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

        // Example 9
        int [] arr11 = new int[] {100 , - 100, -4, 5, -2, 200 ,9};
        int tem;
        max = 0;
        for (int i =0; i < arr11.length - 1; i++){
            if (arr11[i] > arr11[i+1]) {
            tem = arr11[i];
            arr11[i] = arr11[i+1];
            arr11[i+1] = tem;
            max = arr11[i];
        }
        }
        System.out.println(Arrays.toString(arr11));

        // Example 10
        int sum = 0;
        int [] arr12 = new int [] {100, -100, -4, 5, -2, 200, 9};
        for (int i = 0; i < arr12.length; i++ ){
            sum += arr12[i];
        }   System.out.println(sum);

        // Example 11
        long temp2;
        long [] arr13 = new long[] {100, -100, -4, 5, -2, 200, 9};
        for (int i = 0; i < arr13.length - 1; i++){
            for (int j = 0; j < arr13.length -1; j++){
            if (arr13[j] > arr13[j+1]) {
            temp2 = arr13[j];
            arr13[j] = arr13[j+1];
            arr13[j+1] = temp2;
            } 
        }
    } System.out.println(Arrays.toString(arr13));

    // Default Value
    int[] arr14 = new int [4];
    System.out.println(Arrays.toString(arr14));

    // Default value for boolean
    boolean[] arr15 = new boolean [4];
    System.out.println(Arrays.toString(arr15));

    // Default Value for char
    char[] arr16 = new char [3];
    arr16[0] = ' ';
    arr16[1] = '\u0000';
    arr16[2] = ' ';
    System.out.println(Arrays.toString(arr16));

    if(arr16[0] == '\u0000') {
        System.out.println("hello");
    }

    // String [], length 3

    String[] s2 = new String[] {"abc" , "def" , "ghi"};
    s2 = new String[4];
    // Create String Array object (heap memory) [right side]
    // s2 -> Object reference (Variable, left side)
    s2[2] = "ijk";
    // Create String Object and assign String address to one of the addresses inside the array

    // 2D Array
    int[][] arr18 = new int[2][3]; // 2 row (0,1) , 3 column (0,1,2)
    arr18[1][1] = 100;
    arr18[1][2] = -99;
    arr18[0] [1] = 1;
    System.out.println(Arrays.deepToString(arr18)); // [[0, 1, 0], [0, 100, -99]]

    // for loop --> Access 2D array
    for (int i =0; i < arr18.length; i++){
        System.out.println("");
        for (int j =0; j <arr18[0].length; j++){
            System.out.print("[" + i+ "][" + j + "]=" + arr18[i][j]);
        }
    }
    // Example 12
    int cnt = 0;
    int[] arr19 = new int[] {9, 4, 2, 2, 3, 9, 3};
    // The number of 2 = 2
    for (int i = 0; i < arr19.length; i++ ){
        if(arr19[i] == 2){
            cnt++;
        }
    }
    System.out.println("The no. of 2 = "+ cnt);

     // Given int value: 10 <= x <= 99
     int[] arr20 = new int[] {99, 14, 12, 12, 10, 13, 99, 99, 13};
     // Find the Max. Count's value -> 99
 
     // value -> index
     int[] counts = new int[90]; // 0 - 89
     for (int i = 0; i < arr20.length; i++) {
       counts[arr20[i] - 10]++;
     }
     int max2 = 0;
     int target = -1;
     for (int i = 0; i < counts.length; i++) {
       if (counts[i] > max2) {
         max2 = counts[i];
         target = i + 10;
       }
     }
     System.out.println("Max. Count's value=" + target); // Max. Count's value=99

     // Arrays.copyof()
     // Problem
     // arr 4 -> object
     // int object value
     int[] arr4 = new int[] {1, 2, 3};
     arr4 = new int[] {2, 3, 4};

     // Example 1
     int[] arr21 = new int [] {1, 2, 3};
     int[] arr22 = arr21; // pass by reference but not value
     System.out.println(arr21[2]); //3
     System.out.println(arr22[2]); //3
     
     arr21[1] = 100;
     System.out.println(arr21[1]);
     System.out.println(arr22[1]);

     // Example 2
     int x1 = 10;
     int x4 = x1; // pass by value
     System.out.println(x4); // 10

     x1 = 100;
     System.out.println(x1); // 100
     System.out.println(x4); // 10

     // Example 3
     String s1 = "abc";
     String s3 = s1; // pass by value
     s1 = "def";
     System.out.println(s1); //def
     System.out.println(s1); //abc

        // Conclusion
        // 8 Primitives + 8 Wrapper Classes + String -> Pass by value
        // Other than that -> Pass by reference

        // How to backup an array
        // Arrays.copyOf
        // Heap memory -> Create another array
        int[] backupArray = Arrays.copyOf(arr21, arr21.length);
        System.out.println(Arrays.toString(backupArray));

        // Bubble Sort / Insertion Sort (Nested loop)
        int[] beforeSort = new int[] {30, -3, 100, -102};
        Arrays.sort(beforeSort); //Speed = nLogn
        System.out.println(Arrays.toString(beforeSort));

        } 
    }
