public class Person {
  // attriibutes--AKA variables
  private String name;
  private String email;
  private String phoneNumber;

  // this method will print out the values
  public void print() 
  {
    System.out.println("Name = " + name);
    System.out.println("Email = " + email);
    System.out.println("Phone Number = " + phoneNumber);
  }

  // Constructor--assign values to my private variables
  public Person(String anotherName, String anotherEmail, String anotherNumber) 
  {
    name = anotherName;
    email = anotherEmail;
    phoneNumber = anotherNumber;
  }

}