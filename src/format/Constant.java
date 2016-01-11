package format;

import java.util.ArrayList;

public abstract class Constant extends ImportantNum{

	public final double value;
	
	public Constant(Symbol symbol, String name, ArrayList<Unit> units, double value){
		super(symbol, name, units);
		this.value = value;
	}
	
	public double getValue(){
		return value;
	}
	
}
