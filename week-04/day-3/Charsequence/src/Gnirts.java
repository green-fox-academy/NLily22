public class Gnirts implements CharSequence {

  String expression;

  public Gnirts (String expression){
    this.expression = expression;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return expression.charAt(expression.length() - (index + 1));
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
