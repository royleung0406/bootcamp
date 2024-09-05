import java.util.Deque;
import java.util.LinkedList;

public class TexrEditor {
  private String text;
  private Deque<String> undoStack;
  private Deque<String> redoStack;

  public TexrEditor() {
    this.text = "";
    this.redoStack = new LinkedList<>();
    this.undoStack = new LinkedList<>();
  }

  public void append(String newText) {
    this.undoStack.push(this.text); // "", HELLO, World
    // System.out.println("Check for UndoStack " + undoStack);
    this.text += newText; // "" , "HELLO", WORLD
    // this.redoStack.clear(); // Clear redo stack
    // this.redoStack.push(this.text);//"" , "HELLO", WORLD !
    // System.out.println("Check for RedoStack " + redoStack);
  }

  public void undo() {
    if (!(undoStack.isEmpty())) {
      this.redoStack.push(this.text);
      this.text = undoStack.pop();
    } else {
      System.out.println("Nothing to undo");
    }
  }

  public void redo() {
    if (!(this.redoStack.isEmpty())) {
      this.undoStack.push(this.text);
      this.text = redoStack.pop();
    } else {
      System.out.println("Nothing redo");

    }
  }

  @Override
  public String toString() {
    return this.text;
  }

  public static void main(String[] args) {
    TexrEditor editor = new TexrEditor();
    editor.append("Hello");
    editor.append(" World");
    editor.append(" !");

    System.out.println(editor); // Hello World !
    editor.undo();
    //System.out.println(editor); // Hello World
    editor.undo();
    //System.out.println(editor); // Hello
    editor.undo();
    //System.out.println(editor); // ""
    editor.undo();
    System.out.println(editor); // "Nothing to undo"
                                // ""
    //editor.undo();
    //System.out.println(editor); // "Nothing to undo"
                                // ""
     editor.redo();
     // System.out.println(editor); // Hello
     editor.redo();
    // System.out.println(editor); // Hello World
     editor.redo();
    // System.out.println(editor); // Hello World !
     editor.redo();
     System.out.println(editor); // "Nothing to redo"
    // // "Heelo World"
    // editor.redo();
    // System.out.println(editor); //Nothing redo
    // //Hello World !
  }
}
