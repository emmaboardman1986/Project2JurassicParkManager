package dinosaur_management;
import behaviours.*;

public class Dinosaur implements Enclosable{

  public NoiseBehaviour noiseBehaviour;
  public EatingBehaviour eatingBehaviour;
  // dinosaur doesn't care what noise is, just knows it's available to all it's subclasses 

  public String makeNoise(){
    return noiseBehaviour.noise();
  }

  public void setNoiseBehaviour(NoiseBehaviour newNoiseType){
    noiseBehaviour = newNoiseType;
  }
  // allows noise behaviour to be set dynamically 

  public String eatFood(){
     return eatingBehaviour.eat();
  }

  public void setEatingBehaviour(EatingBehaviour newEatingBehaviour){
    eatingBehaviour = newEatingBehaviour;
  }

  // String species;
  // EatingBehaviour eatingBehaviour;
  // NoiseBehaviour noiseBehaviour; 


  // public Dinosaur(String species) {
  //   this.species = species; 
  // }

  // public String getSpecies(){
  //   return this.species;
  // }

  // public void eatFood() {
  //   eatingBehaviour.eat();
  // }

  // public void makeNoise() {
  //   noiseBehaviour.noise();
  // }

  public String goToSleep() {
    return "ZzzzZZZZZZZ";
  }
  
}