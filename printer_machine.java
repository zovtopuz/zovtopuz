package printer_machine;

public class printer_machine {

	public static void main(String[] args) {
	
		machine samsung = new machine();
		samsung.name = "��'� - EO1";
		samsung.printing_speed = "�������� ����� - 5 (1 ��)";
		samsung.price = "���� - 3000 (���)" ;
		samsung.setColor("���� - ��������");
		samsung.setForma("����� - ����������");
		samsung.kupleno = "������� - 1";
		samsung.max_kilkist = "����������� ���� �� 1��. - 5";
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
		bosh.name = "��'� - T20";
		bosh.printing_speed = "�������� ����� - 3 (1 ��)";
		bosh.price = "���� - 2000 (���)" ;
		bosh.setColor("���� - ������");
		bosh.setForma("����� - ������");
		bosh.kupleno = "������� - 2";
		bosh.max_kilkist = "����������� ���� �� 1��. - 3";
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
		xiaomi.name = "��'� - ATT";
		xiaomi.printing_speed = "�������� ����� - 1 (1 ��)";
		xiaomi.price = "���� - 5000 (���)" ;
		xiaomi.setColor("���� - ����������");
		xiaomi.setForma("����� - ����������");
		xiaomi.kupleno = "������� - 3";
		xiaomi.max_kilkist = "����������� ���� �� 1��. - 2";
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