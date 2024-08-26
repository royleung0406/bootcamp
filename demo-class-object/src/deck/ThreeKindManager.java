package deck;

public class ThreeKindManager {
  private final Card[] cards;

  public ThreeKindManager(Card card1, Card card2, Card card3) {
    this.cards = new Card[] {card1, card2, card3};
  }

  public boolean isThreeKind() {
    return cards[0].getRank().equals(cards[1].getRank()) && cards[1].getRank().equals(cards[2].getRank());
}

}
