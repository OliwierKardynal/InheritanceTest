package ie.atu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
    Person firstPerson = new Person();
    firstPerson.setName("Oliwier");
    firstPerson.setAddress("Gort");
    firstPerson.setPhoneNumber("10292210");


    Customer customer = new Customer("Oliwier", "Gort", "09828371", 14, false);
    System.out.println(firstPerson.toString());
    Customer customer2 = new Customer("Oliwier", "Gort", "3312323", 29, true );
    System.out.println(customer2.toString());
    }
}