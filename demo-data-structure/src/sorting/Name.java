package sorting;

public enum Name {

  JOHN(1) ,
  ALEX (2),
  WOODY(3);

  private final int value;


  private Name (int value) {
    this.value = value;
}

public int getValue() {
  return this.value;
}
}