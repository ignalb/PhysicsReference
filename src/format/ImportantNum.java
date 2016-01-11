package format;

import java.util.ArrayList;

public abstract class ImportantNum {
	
	public final String name;
	public final Symbol symbol;
	public final ArrayList<Unit> units;
	
	ImportantNum(Symbol symbol, String name, Unit unit){
		this(symbol, name, new ArrayList<Unit>());
	}
	ImportantNum(Symbol symbol, String name, ArrayList<Unit> units){
		this.name = name;
		this.symbol = symbol;
		this.units = units;
	}
	
	public String getName(){
		return name;
	}
	public Symbol getSymbol(){
		return symbol;
	}
	public ArrayList<Unit> getUnits(){
		return units;
	}
	
}
