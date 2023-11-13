package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ShadowPunch extends PhysicalMove {
	public ShadowPunch() {
		super(Type.GHOST,60, Double.POSITIVE_INFINITY);
	}
	@Override
    protected String describe(){
        return "наносит теневой удар";
	}
}
