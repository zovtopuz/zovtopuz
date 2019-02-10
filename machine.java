package printer_machine;

public class machine {
//- назва
//- швидкодія друку (в сторінках за хвилину)
//- ціна (в гривнях)

String name;
 String printing_speed; // за хвилину
 String price; 
private String color;
private String forma;
protected  String kupleno;
protected  String max_kilkist;
static int quantity_sold=0;

public machine () {
	quantity_sold++;
}

 String getColor() {
	return color;
}

 void setColor(String color) {
	this.color = color;
}

 String getForma() {
	return forma;
}
 void setForma(String forma) {
	this.forma = forma;
}
 public machine(String name, String printing_speed, String price, String color ) {
	 this.name = name;
	 this.printing_speed = printing_speed;
	 this.price = price;
	 this.color = color;
}
public machine (String name,  String printing_speed,  String price, String color, String forma,  String kupleno,  String max_kilkist) {
	this(name,printing_speed,price, color);
	this.forma = forma;
	this.kupleno = kupleno;
	this.max_kilkist = max_kilkist;
	}
public static void printStaticQuantity_sold() {
	System.out.println(quantity_sold + "sold_print");
}
public void printQuantity_sold () {
	System.out.println(quantity_sold + "sold_print");
}
public String toString (){
	 String information = "\nInformation about machine:\n";
	 information += "name"+ name + "/n";
	 information += "printing_speed"+ printing_speed + "/n";
	 information += "price"+ price + "/n";
	 information += "color"+ color + "/n";
	 information += "forma"+ forma + "/n";
	 information += "kupleno"+ kupleno + "/n";
	 information += "max_kilkist"+ max_kilkist + "/n";
	 return information;
}
public void resetValues (String name, String printing_speed, String price,String color,String forma, String kupleno, String max_kilkist) {
this.name = name;
this.printing_speed = printing_speed;
this.price = price;
this.color = color;
this.forma = forma;
this.kupleno = kupleno;
this.max_kilkist = max_kilkist;
}
}