package mypokemons;
import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwhirl extends Pokemon {
	public Poliwhirl(String name, int level) {
		super(name,level);
		super.setType(Type.WATER);
		super.setStats(65,65,65,50,50,90);
		super.setMove(new FocusPunch(), new ThunderWave(), new FuryAttack());
	}
}
