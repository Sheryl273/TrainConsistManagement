package main;

class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Petroleum cannot be assigned to Rectangular Bogie");
            }

            this.cargo = cargoType;
            System.out.println("Cargo Assigned Successfully: " + cargoType);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo Validation Completed.");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public String getShape() {
        return shape;
    }
}

public class UseCase15TrainConsistMgmt {

    public static void main(String[] args) {

        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie bogie3 = new GoodsBogie("Rectangular");
        bogie3.assignCargo("Coal");

        System.out.println("Program continues safely.");
    }
}
