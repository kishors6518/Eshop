package eshop;

import java.util.ArrayList;
import java.util.List;

public class EshopBussinessLogic {

	private List<String> mobiles;
	private List<String> laptops;
	private List<String> tvs;
	
	public List<String> getMobiles()
	{
		mobiles=new ArrayList<String>();
		
		mobiles.add("Samsung");
		mobiles.add("Vivo");
		mobiles.add("Realme");
		mobiles.add("Redmi");
		mobiles.add("Nokia");
		mobiles.add("Jio");
		mobiles.add("IPhone");
		mobiles.add("Motorolla");
		
		return mobiles;
	}
	
	public List<String> getLaptops() {
		
		laptops=new ArrayList<String>();
		
		laptops.add("HP");
		laptops.add("ASUS");
		laptops.add("DELL");
		laptops.add("SAMSUNG");
		laptops.add("MAC BOOK");
		laptops.add("LENOVO");
		laptops.add("ACER");
		laptops.add("VIVO");
		
		return laptops;
		
	}
	
	public List<String> getTVs() {
		
		tvs=new ArrayList<String>();
		
		tvs.add("Onida");
		tvs.add("Samsung");
		tvs.add("Sony");
		tvs.add("TCL");
		tvs.add("LG");
		tvs.add("BPL");
		
		return tvs;
	}
}
