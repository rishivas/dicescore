package dicescore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {

	private static final Map<String, Integer> scoresMap;
	static {
		scoresMap = new HashMap<String, Integer>();
		scoresMap.put("1", 20);
		scoresMap.put("6", 30);
		scoresMap.put("31", 800);
		scoresMap.put("32", 200);
		scoresMap.put("33", 300);
		scoresMap.put("34", 400);
		scoresMap.put("35", 500);
		scoresMap.put("36", 1000);
	}
	public static void main(String[] args) {
		System.out.println(calculate(args));
	}
	
	public static int calculate(String[] args) {
		Arrays.sort(args);
		List<String> diceList = Arrays.asList(args);
		if(diceList.get(0).equals(diceList.get(1)) && diceList.get(0).equals(diceList.get(2))) {
			return new Integer(scoresMap.get("3"+diceList.get(0))) + (scoresMap.get(diceList.get(3)) != null ? new Integer(scoresMap.get(diceList.get(3))) : 0);
		}
		else if(diceList.get(1).equals(diceList.get(2)) && diceList.get(1).equals(diceList.get(3))) {
			return new Integer(scoresMap.get("3"+diceList.get(1))) + (scoresMap.get(diceList.get(0)) != null ? new Integer(scoresMap.get(diceList.get(0))) : 0);
		} 
		else {
			int total = 0;
			for(String i : diceList) {
				total += scoresMap.get(i) != null ? new Integer(scoresMap.get(i)) : 0;
			}
			return total;
		}
	}
}