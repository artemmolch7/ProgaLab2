package mypokemons;
import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Lombre extends Pokemon {
	public Lombre(String name, int level) {
		super(name,level);    
		super.setType(Type.WATER, Type.GRASS);
		super.setStats(60,50,50,60,70,50);
		super.setMove(new Pound(), new PowderSnow(), new FeintAttack(), new LightScreen());
	}
}
