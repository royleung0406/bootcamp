package sorting;

public enum Color2 {
  RED(1),
  YELLOW(2),
  GREEN(3);

  private final int value;

  private Color2(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
}
}