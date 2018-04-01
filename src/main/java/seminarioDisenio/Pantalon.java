package seminarioDisenio;

public class Pantalon {
	  String nombre;
	  Integer talle;

	 public Pantalon(String nombre,Integer talle) {  /*CONSTRUCTOR*/
		 this.nombre = nombre;
		 this.talle = talle;
	 }
	 
	 public String getNombrePantalon() {
		 return this.nombre;
	 }
	 
	 public Integer getTalle() {
		 return this.talle;
	 }
}
