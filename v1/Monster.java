/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 27 -- Ye Olde Role Playing Game
   2017-11-08 */

public class Monster{
    //attributes:
    private int _HP;
    private int _strength;
    private int _defense;
    private double _attack;

    //methods
    public Monster(){
	//constructor to initialize all attributes, sets strength to random number [20,65) and life:150 defense:20 and attack:1
	_strength = (int)(Math.random() * 45) + 20;
	_HP = 150;
	_defense = 20;
	_attack = 1;
    }

    public boolean isAlive(){
	//return is alive or dead
	return _HP > 0;
    }

    public int getDefense(){
	//returns value of defense
	return _defense;
    }
    /*
    public String getName(){
	//returns value of name
    }
    */
    public void lowerHP(int a){
	//lowers HP by a
	_HP = _HP - a;
    }
    public int attack(Protagonist p){
	//calculates damage(an int) with damage = (strength * attack rating) - warrior defense
	int damage = (int)((_strength * _attack) - p.getDefense());
	p.lowerHP(damage);
	return damage;
    }
	    
}
       
