public class Main {
    public static void main (String[] args) {
        ContactsManager cm = new ContactsManager();

        Contact c1 = new Contact();
        c1.name = "John";
        c1.phoneNumber = "18283856";

        cm.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "Tom";
        c2.phoneNumber = "95480562";

        cm.addContact(c2);

        Contact c3 = new Contact();
        c3.name = "Marco";
        c3.phoneNumber = "46582165";

        cm.addContact(c3);

        cm.searchContact("Marco");

        System.out.println(cm.searchContact("Marco").phoneNumber);
    }
}
