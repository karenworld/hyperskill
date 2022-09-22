package OOP;

//You decide to recall the happy days of your childhood and play Heroes. 
//Of course, you need the army.
//
//Your task is to create objects: 5 Unit, 3 Knight, 1 General, 1 Doctor.
//
//Don't forget to give them names!
public class Army {

	public static void main(String[] args) {
		createArmy();
		System.out.println(Unit.countUnit);
		System.out.println(Knight.countKnight);
		System.out.println(General.countGeneral);
		System.out.println(Doctor.countDoctor);
	}

	public static void createArmy() {
		// Create all objects here
		//		 String FirstnameUnit = "AcquaMan";

		//int Namecount = 0;
		//Unit firstUnit = 
		new Unit("A");
		//Unit secondUnit = 
		new Unit("B");		
		new Unit("C");		 
		new Unit("D");
		new Unit("E");		
//		Namecount++; // how to do a for-loop ?
		//Knight knight1 = 
		new Knight("Arthur");
		new Knight("William");	 
		new Knight("Skywalker");	
		new General("g1");
		new Doctor("d1");
	}
	// Don't change the code below
	static class Unit {
		static String nameUnit;
		static int countUnit;

		public Unit(String name) {
			countUnit++;
			nameUnit = name;

		}
	}

	static class Knight {
		static String nameKnight;
		static int countKnight;

		public Knight(String name) {
			countKnight++;
			nameKnight = name;

		}
	}

	static class General {
		static String nameGeneral;
		static int countGeneral;

		public General(String name) {
			countGeneral++;
			nameGeneral = name;

		}
	}

	static class Doctor {
		static String nameDoctor;
		static int countDoctor;

		public Doctor(String name) {
			countDoctor++;
			nameDoctor = name;

		}
	}
}
