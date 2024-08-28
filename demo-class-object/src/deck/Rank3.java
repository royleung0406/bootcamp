package deck;

public enum Rank3 {
  ACE('A'), TWO('2'), THREE('3'), FOUR('4'), FIVE('5'), SIX('6'), SEVEN('7'), EIGHT('8'), 
  NINE('9'), TEN('T'), JACK('J'), QUEEN('Q'), KING('K');

private char value;

private Rank3(char value) {
  this.value = value;
}
public char getValue() {
  return this.value;
}

public int compare(Rank3 rank) {
  if (this == rank)
    return 0;
  return this.value > rank.getValue() ? 1 : -1;
}


}
