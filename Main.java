class Main {
  public static void main(String[] args) {
    // objects have attributes (properties) and methods (behaviors)
    // objects created from classes
    // classes serve as blueprints for the objects

    // p1 object created from Person class
    Person p1 = new Person("Darrel", "darrel.supreme@patelhs.org", "123-456-7898");
    //p2 object created from Person class
    Person p2 = new Person("Sammy","sammy@patelhs.org","456-567-8912");
    //calling the print method through both objects
    p1.print();
    p2.print();

  }
}