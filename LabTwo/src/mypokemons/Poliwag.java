package mypokemons;
import mymoves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwag extends Pokemon {
	public Poliwag(String name, int level) {
		super(name,level);
		super.setType(Type.WATER);
		super.setStats(40,50,40,40,40,90);
		super.setMove(new FocusPunch(), new ThunderWave());
	}
}
