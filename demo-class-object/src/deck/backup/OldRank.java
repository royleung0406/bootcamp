package deck.backup;

public class OldRank {
  // !!! make sure you understand the difference between them
  // 1. static final
  // 2. static
  // 3. final (belongs to object)
  // 4. instance variable (non-static, non final)

  // Constant (static final) -> should be public
  public static final char ACE = 'A';
  public static final char TWO = '2';
  public static final char THREE = '3';
  public static final char FOUR = '4';
  public static final char FIVE = '5';
  public static final char SIX = '6';
  public static final char SEVEN = '7';
  public static final char EIGHT = '8';
  public static final char NINE = '9';
  public static final char TEN = 'T';
  public static final char JACK = 'J';
  public static final char QUEEN = 'Q';
  public static final char KING = 'K';

  // final instance variable
  // private final String name = "ABC"; // every Rank Object has name attribute

  private char value;

  private OldRank(char value) {
    this.value = value;
  }

  // Rank.ofACE
  public static OldRank ofACE() {
    return new OldRank(ACE);
  }

  public static OldRank ofTWO() {
    return new OldRank(TWO);
  }

  public static OldRank ofTHREE() {
    return new OldRank(THREE);
  }

  public static OldRank ofFOUR() {
    return new OldRank(FOUR);
  }

  public static OldRank ofFIVE() {
    return new OldRank(FIVE);
  }

  public static OldRank ofSIX() {
    return new OldRank(SIX);
  }

  public static OldRank ofSEVEN() {
    return new OldRank(SEVEN);
  }

  public static OldRank ofEIGHT() {
    return new OldRank(EIGHT);
  }

  public static OldRank ofNINE() {
    return new OldRank(NINE);
  }

  public static OldRank ofTEN() {
    return new OldRank(TEN);
  }

  public static OldRank ofJACK() {
    return new OldRank(JACK);
  }

  public static OldRank ofQUEEN() {
    return new OldRank(QUEEN);
  }

  public static OldRank ofKING() {
    return new OldRank(KING);
  }

  public char getValue() {
    return this.value;
  }

  public boolean equals(OldRank rank) {
    return this.value == rank.getValue();
  }

  public int compareTo(OldRank rank) {
    // Early return
    if (this.value != rank.getValue()) {
      if (this.value == TWO)
        return 1;
      if (rank.getValue() == TWO)
        return -1;
      if (this.value == ACE)
        return 1;
      if (rank.getValue() == ACE)
        return -1;
      if (this.value == KING)
        return 1;
      if (rank.getValue() == KING)
        return -1;
      if (this.value == QUEEN)
        return 1;
      if (rank.getValue() == QUEEN)
        return -1;
      if (this.value == JACK)
        return 1;
      if (rank.getValue() == JACK)
        return -1;
      if (this.value == TEN)
        return 1;
      if (rank.getValue() == TEN)
        return -1;
      return this.value > rank.getValue() ? 1 : -1; // 3 - 9
    }
    return 0;
  }

  public String toString() {
    return "Rank(" //
        + "value=" + this.value //
        + ")";
  }
}