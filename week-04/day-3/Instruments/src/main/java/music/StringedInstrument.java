package main.java.music;

public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;

  public abstract String sound();

  @Override
  public void play() {
  }
}
