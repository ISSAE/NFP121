// Interface CarElement { 
    interface CarElement {
        void accept(CarElementVisitor visitor);
    }
    
    
// Classe Wheel { 
    class Wheel implements CarElement {
        private String name;
    
        Wheel(String name) {
            this.name = name;
        }
    
        String getName() {
            return this.name;
        }
    
        public void accept(CarElementVisitor visitor) {
            visitor.visit(this);
        }
    }
    
    
// Classe Engine { 
    class Engine implements CarElement {
        public void accept(CarElementVisitor visitor) {
            visitor.visit(this);
        }
    }
    
    
// Classe Body { 
    class Body implements CarElement {
        public void accept(CarElementVisitor visitor) {
            visitor.visit(this);
        }
    }
    
    
    // Classe Body { 
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
    }
    
    
    // Interface CarElementVisitor { 
    interface CarElementVisitor {
        void visit(Wheel wheel);
        void visit(Engine engine);
        void visit(Body body);
        void visitCar(Car car);
    }
    
    
    // Classe CarElementPrintVisitor { 
    class CarElementPrintVisitor implements CarElementVisitor {
        public void visit(Wheel wheel) {
            System.out.println("Visiting "+ wheel.getName() + " wheel");
        }
    
        public void visit(Engine engine) {
            System.out.println("Visiting engine");
        }
    
        public void visit(Body body) {
            System.out.println("Visiting body");
        }
    
        public void visitCar(Car car) {
            System.out.println("\nVisiting car");
            for(CarElement element : car.getElements()) {
                element.accept(this);
            }
            System.out.println("Visited car");
        }
    }
    
    
    // Classe CarElementDoVisitor { 
    class CarElementDoVisitor implements CarElementVisitor {
        public void visit(Wheel wheel) {
            System.out.println("Kicking my "+ wheel.getName());
        }
    
        public void visit(Engine engine) {
            System.out.println("Starting my engine");
        }
    
        public void visit(Body body) {
            System.out.println("Moving my body");
        }
    
        public void visitCar(Car car) {
            System.out.println("\nStarting my car");
            for(CarElement carElement : car.getElements()) {
                carElement.accept(this);
            }
            System.out.println("Started car");
        }
    }
    
    
    public class Main{//On remplace ici le nom de la classe TestVisitorDemo par Main pour être éxécuter sur tech.io
        static public void main(String[] args) {
    
            Car car = new Car();
    
            CarElementVisitor printVisitor = new CarElementPrintVisitor();
            CarElementVisitor doVisitor = new CarElementDoVisitor();
    
            printVisitor.visitCar(car);
            doVisitor.visitCar(car);
        }
    }
