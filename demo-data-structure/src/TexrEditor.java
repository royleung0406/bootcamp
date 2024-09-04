import java.util.Deque;
import java.util.LinkedList;

public class TexrEditor {
  private String text;
  private Deque<String> undoStack;
  private Deque<String> redoStack;

  public TexrEditor(){
    this.text = "";
    this.redoStack = new LinkedList<>();
    this.undoStack = new LinkedList<>();
  }

  public void append(String newText){
    this.undoStack.push(this.text); // "", HELLO
    System.out.println("Check for UndoStack " + undoStack);
    this.text +=  newText; //"" , "HELLO", WORLD
    this.redoStack.push(this.text);//"" , "HELLO", WORLD
    System.out.println("Check for RedoStack " + redoStack);
  }

  public void undo(){
    //if(undoStack != null){
    redoStack.push(this.text);
    this.text = undoStack.pop();}
    //else{
     // System.out.println("The String is empty, you cannot redo");
    //} 

  public void redo(){
    //if(redoStack != null){
   //   System.out.println(redoStack);
    undoStack.push(this.text);
    this.text = redoStack.pop();
    }
    //else{
     // System.out.println("Yeah");

  @Override
  public String toString(){
    return this.text;
  }
  public static void main(String[] args) {
    TexrEditor editor = new TexrEditor();
    editor.append("Hello");
    editor.append(" World");
    editor.append(" !");

    System.out.println(editor);// Hello World !
    editor.undo();
    System.out.println(editor);// Hello World
    editor.undo();
    System.out.println(editor);//HELLIO
    editor.undo();
    System.out.println(editor);//""
    editor.undo();
    System.out.println(editor);// "The String is empty, you cannot redo"
    editor.redo(); 
    System.out.println(editor); // HELLO WORLD
    editor.redo();
    System.out.println(editor); //HELLOW WORLD!
    editor.redo();
    System.out.println();
  }
}
