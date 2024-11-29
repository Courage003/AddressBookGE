import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Generic code suitable and industry preferred for dynamic changes required

        AddressBook<BusinessContact> a1 = new AddressBook<>();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address book");
        do{
            System.out.println("Enter 1 to create contact \n Enter 2 to display al contacts");
            int input = sc.nextInt();
            switch (input){
                case 1 -> a1.addContact(createBusinessContact());

                case 2 ->  a1.display();
                default -> System.out.println("Wrong input");
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();

        }while(i!=0);

        System.out.println("Thank you for using address book");
        sc.close();


    }



    public static Contact createContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter last name");
        String lname = sc.next();
        System.out.println("Enter city");
        String city = sc.next();
        System.out.println("Enter state");
        String state = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter phone");
        int phone = sc.nextInt();
        System.out.println("Enter zip");
        int zip = sc.nextInt();
        Contact c1 = new Contact(name, lname, city, state, email, phone, zip);
        return c1;
    }

    public static BusinessContact createBusinessContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Company name: ");
        String cname=sc.next();
        System.out.println("Employee name");
        String ename = sc.next();
        System.out.println("Employee mail");
        String bmail=sc.next();

        BusinessContact b1 = new BusinessContact(cname,ename,bmail);
        return b1;


    }



}