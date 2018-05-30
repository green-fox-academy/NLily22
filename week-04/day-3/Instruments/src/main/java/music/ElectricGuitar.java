package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar (){
    this.name = "Electric Guitar";
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings){
    this.name = "Electric guitar";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    String sound = "Twangg";
    return sound;
  }
}
