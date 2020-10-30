public class Customer {
    int id;
    String firstName;
    String lastName;

    public Customer(){

    }

    //eklenebilir olması için public i kullandık üstteki kullanım ile alttaki kullanım aynı şeylerdir.

    public Customer (int id , String firstName , String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    }

}
