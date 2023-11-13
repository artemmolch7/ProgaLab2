package mymoves;

import ru.ifmo.se.pokemon.*;

public class Attract extends StatusMove {
	public Attract() {
		super(Type.NORMAL,0,100);
	}
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		double d = Math.random();
		if (d<0.5) {
			Effect.confuse(p);
		}
	}
	@Override
    protected String describe(){
        return "привлекает";
	}
}
