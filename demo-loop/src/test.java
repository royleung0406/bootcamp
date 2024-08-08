public class test {
  public static void main(String[] args) {
    String s6 = "abcdefghijk";
    String substring = "def";
    String str = ""; 

      for (int j =0; j < s6.length(); j++){
        if(s6.charAt(j) == substring.charAt(0) && s6.charAt(j+1) == substring.charAt(1) && s6.charAt(j+2) == substring.charAt(2)){
          str = "";
          str += s6.charAt(j);
          str += s6.charAt(j+1);
          str += s6.charAt(j+2);
          System.out.println(str);
            if(str == substring){
            System.out.println("Found");
            break;
        }
      } 
      }
    }
  }