import java.util.Arrays;

public class StringBox {
  private char[] characters;

  //new String
  public StringBox(String s){
    // s -> char[]
    this.characters = new char[s.length()]; // !!!!!!!!!!!1
    for (int i = 0 ; i < s.length(); i++){
      this.characters[i] = s.charAt(i);

    }
  }

  public void setCharAt (int index, char c){
    this.characters[index] = c;
  }

  public char charAt(int index){
    return this.characters[index];
  }
  public int length(){
    return this.characters.length;
  }

  public int indexOf(char c){
    for (int i : this.characters){
    if (this.characters[i] == c){
    return i;
  }
} return -1;
  }
  public String replaceOf (char old, char update){
    char [] newCharacters = new char [this.characters.length];
    System.arraycopy(this.characters, 0, newCharacters, 0, this.characters.length-1);
      for (int i : this.characters){
        newCharacters[i] = this.characters[i] == old ? update : this.characters[i];

      }
      return String.valueOf(newCharacters);
  }

  public String subString (int startLetter , int endLetter){
    
    char [] newCharacters = new char [this.characters.length];
    for (int i = startLetter; i < endLetter; i++){
        newCharacters [i] = this.characters[i];
      }
     return String.valueOf(newCharacters);
      }


  public String tostring(){
    return String.valueOf(this.characters);
  }

  // new String
}
