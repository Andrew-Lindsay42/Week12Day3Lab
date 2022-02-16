package players;

import org.junit.Before;
import org.junit.Test;
import powers.Familiar;
import powers.Spell;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spell spell;
    Familiar familiar;

    @Before
    public void before(){
        spell = new Spell("Chill Touch", 20, 5);
        familiar = new Familiar("Iggy", "Iguana", 5, 10);
        wizard = new Wizard("Gandalf", 30, 100, spell, familiar);
    }

    @Test
    public void hasManaPool(){
        assertEquals(100, wizard.getManaPool());
    }

    @Test
    public void canDecreaseManaPool(){
        wizard.reduceManaPool(10);
        assertEquals(90, wizard.getManaPool());
    }

    @Test
    public void canIncreaseManaPool(){
        wizard.increaseManaPool(10);
        assertEquals(110, wizard.getManaPool());
    }

    @Test
    public void hasSpell() {
        assertEquals(spell, wizard.getSpell());
    }

    @Test
    public void canSwapSpell() {
        spell = new Spell("Frostbite", 30, 10);
        wizard.swap(spell);
        assertEquals(spell, wizard.getSpell());
    }

    @Test
    public void hasFamiliar() {
        assertEquals(familiar, wizard.getFamiliar());
    }

    @Test
    public void canSwapFamiliar() {
        familiar = new Familiar("Stolas", "Raven", 4, 2);
        wizard.swap(familiar);
        assertEquals(familiar, wizard.getFamiliar());
    }

    @Test
    public void canCastSpell(){
        assertEquals(20, wizard.cast());
        assertEquals(95, wizard.getManaPool());
    }
}
