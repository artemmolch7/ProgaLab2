package mymoves;

import ru.ifmo.se.pokemon.*;

public class Endeavor extends PhysicalMove {
	public Endeavor() {
		super(Type.NORMAL,0,100);
	} 
	
	@Override
    protected String describe(){
        return "сравнивает здоровье";
	}
}
