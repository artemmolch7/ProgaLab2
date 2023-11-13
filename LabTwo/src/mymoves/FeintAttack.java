package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FeintAttack extends PhysicalMove {
	public FeintAttack() {
		super(Type.DARK,60, Double.POSITIVE_INFINITY);
		
	}
	@Override
    protected String describe(){
        return "производит ложную атаку";
	}
}
