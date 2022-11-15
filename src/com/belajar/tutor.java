package com.belajar;
//thanks to 'Kelas Terbuka' on YouTube

class Pokedex{
  String pokemon;
  String skill;
  String HP;
  String Mana;

  //belajar constructor
  Pokedex(String pokemon, String skill, String HP, String Mana){
      this.pokemon = pokemon;
      this.skill = skill;
      this.HP = HP;
      this.Mana = Mana;
      
  }

  //belajar method
  void show(){
      System.out.println("Your Pokemon is " + this.pokemon);
      System.out.println(this.pokemon + "'s skill is " + this.skill);
      System.out.println("HP : " + this.HP);
      System.out.println("Mana : " + this.Mana);
      System.out.println("------------------------------");

  }
}


public class tutor{
  public static void main(String[] args) throws Exception {
    
    Pokedex Pokedex1 = new Pokedex("Pikachu","Tailwhip","150","300");
    Pokedex Pokedex2 = new Pokedex("Charizard","Dragons Breath","170","200");
    //method show
    Pokedex1.show();
    Pokedex2.show();
  }

}