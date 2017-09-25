class ContactsManager {
    // Fields:
    Contact [] myFriends;
    int friendsCount;

    // Constructor:
    ContactsManager(){
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Methods:
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName){
        Contact c = new Contact();
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                c = myFriends[i];
                return c;
            }
        }
        return null;
    }
}