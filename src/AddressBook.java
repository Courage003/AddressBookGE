import java.util.ArrayList;
import java.util.List;
public class AddressBook {
    List<Contact> addBook= new ArrayList<>();

    public void addContact(Contact c){
        addBook.add(c);
        System.out.println("Contact added");
    }
}
