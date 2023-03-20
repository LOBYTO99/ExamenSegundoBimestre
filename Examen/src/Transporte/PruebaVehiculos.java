package Transporte;
public class PruebaVehiculos {
    public static void main(String[]args){
    Vehiculo vehiculo1[] = new Vehiculo[3];
    
    vehiculo1 = new Automovil[0];
    vehiculo1 = new Motocicleta[1];
    
    Vehiculo a = new Vehiculo() {};
    Vehiculo b = new Automovil();
    Vehiculo c = new Motocicleta();
    
    a.Acelerar();
    b.Acelerar();
    c.Acelerar();
    }
}
