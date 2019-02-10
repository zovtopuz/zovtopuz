package printer_machine;

public class printer_machine {

	public static void main(String[] args) {
	
		machine samsung = new machine();
		samsung.name = "ім'я - EO1";
		samsung.printing_speed = "швидкодія друку - 5 (1 хв)";
		samsung.price = "ціна - 3000 (грн)" ;
		samsung.setColor("колр - червоний");
		samsung.setForma("форма - прямокутна");
		samsung.kupleno = "куплено - 1";
		samsung.max_kilkist = "максимальна кість за 1хв. - 5";
		machine.printStaticQuantity_sold();
		System.out.println(samsung.name);
		System.out.println(samsung.price);
		System.out.println(samsung.printing_speed);
		System.out.println(samsung.getColor ());
		System.out.println(samsung.getForma ());
		System.out.println(samsung.kupleno );
		System.out.println(samsung.max_kilkist);
		System.out.println("");
		
		
		machine bosh = new machine();
		bosh.name = "ім'я - T20";
		bosh.printing_speed = "швидкодія друку - 3 (1 хв)";
		bosh.price = "ціна - 2000 (грн)" ;
		bosh.setColor("колр - чорний");
		bosh.setForma("форма - кругла");
		bosh.kupleno = "куплено - 2";
		bosh.max_kilkist = "максимальна кість за 1хв. - 3";
		machine.printStaticQuantity_sold();
		System.out.println(bosh.name);
		System.out.println(bosh.price);
		System.out.println(bosh.printing_speed);
		System.out.println(bosh.getColor ());
		System.out.println(bosh.getForma ());
		System.out.println(bosh.kupleno );
		System.out.println(bosh.max_kilkist);
		System.out.println("");
		
		machine xiaomi = new machine();
		xiaomi.name = "ім'я - ATT";
		xiaomi.printing_speed = "швидкодія друку - 1 (1 хв)";
		xiaomi.price = "ціна - 5000 (грн)" ;
		xiaomi.setColor("колр - оранджевий");
		xiaomi.setForma("форма - прямокутна");
		xiaomi.kupleno = "куплено - 3";
		xiaomi.max_kilkist = "максимальна кість за 1хв. - 2";
		machine.printStaticQuantity_sold();
		System.out.println(xiaomi.name);
		System.out.println(xiaomi.price);
		System.out.println(xiaomi.printing_speed);
		System.out.println(xiaomi.getColor ());
		System.out.println(xiaomi.getForma ());
		System.out.println(xiaomi.kupleno );
		System.out.println(xiaomi.max_kilkist);
		
	}
}