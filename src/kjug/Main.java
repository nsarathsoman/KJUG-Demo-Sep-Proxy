package kjug;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Contact contact = new Contact();
        contact.setName("Sasdas");
        contact.setPhone(9328492342l);

        System.out.println(contact);

        Class<Contact> contactClass = Contact.class;
        Contact contact1 = contactClass.newInstance();
        contact1.setName("Reflect");
        contact1.setPhone(1231231231l);

        System.out.println(contact1);
    }
}
