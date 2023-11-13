package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FuryAttack extends PhysicalMove{
	public FuryAttack() {
		super(Type.NORMAL,15,85);
	}
	@Override
    protected String describe(){
        return "яростно атакует";
	}
}
