package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FocusPunch extends PhysicalMove {
	public FocusPunch() {
		super(Type.FIGHTING, 150,100);
		
	}
	@Override
    protected String describe(){
        return "наносит точечный удар";
	}
}
