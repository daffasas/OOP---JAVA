package com.belajar;


class Pokedex{
  String pokemon;
  String skill;
  String HP;
  String Mana;

  Pokedex(String inputpokemon, String inputskill, String inputHP, String inputMana){
      pokemon = inputpokemon;
      skill = inputskill;
      HP = inputHP;
      Mana = inputMana;

      System.out.println(pokemon);
      System.out.println(skill);
      System.out.println(HP);
      System.out.println(Mana);

  }
}


public class tutor{
  public static void main(String[] args) throws Exception {
    
    Pokedex Pokedex1 = new Pokedex("Pikachu","Tailwhip","150","300");
    Pokedex Pokedex2 = new Pokedex("Charizard","Dragons Breath","170","200");
  }

}