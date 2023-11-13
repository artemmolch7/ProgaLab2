package mypokemons;
import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Glaceon extends Pokemon{
	public Glaceon(String name, int level) {
		super(name,level);
		super.setType(Type.ICE);
		super.setStats(65,60,110,130,95,65);
		super.setMove(new LightScreen(), new Endeavor(), new ShadowPunch());
	}

}
