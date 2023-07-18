package poo.encapsulation;

// La encapsulación explica que no se debe poder acceder directamente a los atributos
// de la clase a no ser que sea a través de métodos llamados getters y setters.
class Encapsulation {
    public static void main(String[] args) {
        // En el código de más abajo definimos la clase poo.encapsulation.Car
        Car car = new Car();

        car.setModel("Subaru Impreza WRX");
        car.setMaxSpeed(255);

        System.out.println("Model: " + car.getModel() + ", Max Speed: " + car.getMaxSpeed());
    }
}

// Clase con atributos privados
class Car {
    // Definimos los atributos como privados
    private String model;
    private int maxSpeed;

    // Constructores
    public Car() {
    }

    // Métodos para acceder a los atributos (Getters y Setters)
    // Getter para el atributo model
    public String getModel() {
        return model;
    }

    // Setter para el atributo model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter para el atributo maxSpeed
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Setter para el atributo maxSpeed
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

