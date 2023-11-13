package mypokemons;
import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwrath extends Pokemon {
	public Poliwrath(String name, int level) {
		super(name,level);
		super.setType(Type.WATER, Type.FIGHTING);
		super.setStats(90,95,95,70,90,70);
		super.setMove(new FocusPunch(), new ThunderWave(), new FuryAttack(), new Substitute());
	}
}
