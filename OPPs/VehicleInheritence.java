package OPPs;

public class VehicleInheritence {
    
        protected String brand = "Ford";        
        public void honk() {                    
          System.out.println("Tuut, tuut!");
        }
      }
      class Car extends VehicleInheritence {
        private String modelName = "Mustang";    
        public static void main(String[] args) {
      
          Car myCar = new Car(); 
          myCar.honk();
          System.out.println(myCar.brand + " " + myCar.modelName);
        }
      }
