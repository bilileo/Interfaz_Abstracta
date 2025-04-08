// Definimos la interfaz
interface Volador {
    void volar();  // Método sin implementación
}

// Clases que implementan la interfaz
class Pajaro implements Volador {
    public void volar() {
        System.out.println("El pájaro vuela batiendo sus alas.");
    }
}

class Avion implements Volador {
    public void volar() {
        System.out.println("El avión vuela con motores.");
    }
}

class Drone implements Volador {
    public void volar(){
        System.out.println("El dron vuela con helices en sus motores.");
    }
}

public class Ejemplo_Interfaz{
    public static void main(String[] args) {
        Volador v1 = new Pajaro();
        Volador v2 = new Avion();
        Drone v3 = new Drone();//
        
        v1.volar();  // "El pájaro vuela batiendo sus alas."
        v2.volar();  // "El avión vuela con motores."
        v3.volar();  
    }
}