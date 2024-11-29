import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook<Placeholder> {
    List<Placeholder> adBook = new ArrayList<>();



    public void display(){
        System.out.println(adBook);
    }



    public void addContact(Placeholder c1){
        adBook.add((Placeholder) c1);

    }
}