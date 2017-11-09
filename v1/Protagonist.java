/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 27 -- Ye Olde Role Playing Game
   2017-11-08 */

public class Protagonist{
    //instance variables:
    private String _name;
    private int _HP;
    private int _strength;
    private int _originalS;
    private int _originalD;
    private int _defense;
    private double _attack;
    

    //methods:
    public Protagonist(String name){
	//contructor to name protagonist and initialize all attributes
	_name = name;
	_HP = 125;
	_strength = 100;
	_defense = 40;
	_attack = 0.4;
    }

    public boolean isAlive(){
	//is living or dead
	return _HP > 0;
    }

    public int getDefense(){
	//returns value of defense
	return _defense;
    }

    public String getName(){
	//return name
	return _name;
    }

    public void lowerHP(int a){
	// decrease HP by a
	_HP = _HP - a;
    }

    public int attack(Monster m){
	//calculates damage(int) with damage = (strength * attack rating) - monster defense
	int damage =(int) (( _strength * _attack)- m.getDefense());
	m.lowerHP(damage);
	return damage;
    }

    public void specialize(){
	//prep for special attack, decrease defense, increase attack
	_attack = 1;
	_defense = 30;
    }

    public void normalize(){
	//prep for normal attack, resets defense and attack
	_attack = 0.4;
	_defense = 40;
    }
}
