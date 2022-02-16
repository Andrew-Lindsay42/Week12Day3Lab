import battleField.BattleField;
import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Knight;
import players.Player;
import players.Wizard;
import powers.Familiar;
import powers.Heal;
import powers.Spell;
import powers.Weapon;

import static org.junit.Assert.assertEquals;

public class BattleFieldTest {

    BattleField battleField;
    Knight knight;
    Wizard wizard;
    Cleric cleric;
    Weapon weapon;
    Spell spell;
    Familiar familiar;
    Heal heal;
    Enemy enemy;


    @Before
    public void before(){
        weapon = new Weapon("Sword", 10);
        knight = new Knight("Gawain",50,weapon,10);
        spell = new Spell("Fire Ball",30,10);
        familiar = new Familiar("Salem","Cat",10,5);
        wizard = new Wizard("Radagast",45,20,spell,familiar);
        heal = new Heal("Love Potion",15);
        cleric = new Cleric("Casandra",60,heal);
        enemy = new Enemy("Dragon",200,20,10,500);
        battleField = new BattleField();
    }

    @Test
    public void checkIfFighterCanAttack(){
        battleField.playerAttacks(knight,enemy);
        assertEquals(190,enemy.getHealthPoints());
    }
    
}
