package mymoves;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class LightScreen extends StatusMove {
	public LightScreen() {
		super(Type.PSYCHIC,0,0);	
	}
	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect e = new Effect().chance(1).turns(5).stat(Stat.DEFENSE,2);
		p.addEffect(e);
	}
	@Override
    protected String describe(){
        return "ослепляет";
	}
}