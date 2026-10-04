package bbs515;

public class Exercise2 {

	public static void main(String[] args) {
		/*
		 Sırasıyla uzaklık, 100km başına yakıt tüketimi, litre başı yakıt tutarı, otoyol ücreti ve yolculuktaki
		 kişi sayıları set edilip; toplam yakıt tüketimi, toplam yakıt tutarı, toplam yolculuk tutarı ve kişi
		 başı tutarlar hesaplanmıştır.
		 */
	double distance = 450;
	double consumptionPer100Km = 7.5;
	double fuelPrice = 52;
	double highwayFee = 250;
	int numberOfPeople = 3;
	
	double totalFuelConsumption = distance*consumptionPer100Km/100;
	double fuelCost = totalFuelConsumption*fuelPrice;
	double totalTravelCost = fuelCost+highwayFee;
	double costPerPerson = totalTravelCost/numberOfPeople;
	
	System.out.println("Total Fuel Comsumption : "+ totalFuelConsumption + " Liter" );
	System.out.println("Fuel Cost : "+ fuelCost + " TL");
	System.out.println("Total Travel Cost : "+ totalTravelCost + " TL");
	System.out.println("Cost Per Person : "+ costPerPerson + " TL");
	
	}

}
