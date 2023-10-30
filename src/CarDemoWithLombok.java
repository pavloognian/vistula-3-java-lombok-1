import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
class CarWithLombok{
    private String model;
    private String brand;
    private String color;
    private int year;
    private int price;
    private int quantity;
}


public class CarDemoWithLombok {
    public static void main(String[] args) {
        CarWithLombok CarWithLombok1 = new CarWithLombok("Volkswagen","Lenovo","green",2002,1000,10);
        CarWithLombok CarWithLombok2 = new CarWithLombok("GLC","Mercedes","blue",2023,200_000,3);
        System.out.println(CarWithLombok1);
        System.out.println(CarWithLombok2);
        System.out.println(CarWithLombok1.getColor());
        int year = CarWithLombok1.getYear();
        CarWithLombok1.setColor("black");
        System.out.println("Are this objects equal? "+CarWithLombok1.equals(CarWithLombok2));
        System.out.println("The HashCode of this object is: "+CarWithLombok2.hashCode());
        System.out.println("The HashCode of this object is: "+CarWithLombok1.hashCode());

    }
}


