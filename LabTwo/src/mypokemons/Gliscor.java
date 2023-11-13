package mypokemons;
import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Gliscor extends Pokemon {
	public Gliscor(String name, int level) {
		super(name,level);
		super.setType(Type.GROUND, Type.FLYING);
		super.setStats(75,95,125,45,75,95);
		super.setMove(new LightScreen(), new Endeavor(), new ShadowPunch(), new Attract());
	}
}
