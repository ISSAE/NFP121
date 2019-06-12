// Interface CarElement { autofold 
    interface CarElement {
        void print();
        void faire();
    }
    // }
    
    // Classe Wheel { autofold 
    class Wheel implements CarElement {
        private String name;
    
        Wheel(String name) {
            this.name = name;
        }
    
        String getName() {
            return this.name;
        }
        public void print() {
            System.out.println("Visiting "+ wheel.getName() + " wheel");
        }

        public void faire() {
            System.out.println("Kicking my "+ wheel.getName());
        }
    
    }
    // }
    
    // Classe Engine { autofold 
    class Engine implements CarElement {
 
        public void print() {
            System.out.println("Visiting engine");
        }
        public void faire() {
            System.out.println("Starting my engine");
        }

    }
    // }
    
    // Classe Body { autofold 
    class Body implements CarElement {
        public void accept(CarElementVisitor visitor) {
            visitor.visit(this);
        }
        public void print() {
            System.out.println("Visiting body");
        }

        public void faire() {
            System.out.println("Moving my body");
        }
    }
    // }
    
    // Classe Body { autofold 
    class Car {
        CarElement[] elements;
    
        public CarElement[] getElements() {
            return elements.clone(); // Retourne une copie du tableau de références
        }
    
        public Car() {
            this.elements = new CarElement[] {
                    new Wheel("front left"),
                    new Wheel("front right"),
                    new Wheel("back left"),
                    new Wheel("back right"),
                    new Body(),
                    new Engine()
                };
        }

            
        public void print() {
            System.out.println("\nVisiting car");
            for(CarElement element : car.getElements()) {
                   element.print();
            }
            System.out.println("Visited car");
        }

        public void faire() {
            System.out.println("\nStarting my car");
            for(CarElement carElement : car.getElements()) {
                carElement.faire();
            }
            System.out.println("Started car");
        }
    }
    

 
    
    public class Sans{
        static public void main(String[] args) {
    
            Car car = new Car();
    
            car.print();
            car.faire();
        }
    }