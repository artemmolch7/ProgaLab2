package mymoves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class PowderSnow extends SpecialMove {
	public PowderSnow() {
		super(Type.ICE,40,100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		double d = Math.random();
		if (d<0.1) {
			Effect.freeze(p);
		}
	}
	@Override
    protected String describe(){
        return "накрывает снегом";
	}
}
 