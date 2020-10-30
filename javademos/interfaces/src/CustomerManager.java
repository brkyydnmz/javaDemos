public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add(){
        //iş kodları yazılır
        customerDal.Add();

    }
}

//public CustomerManager da bir tane ICustomer istiyorum bu kim olabilirdi Oracle yada MySql olabilirdi çünkü ikisi de ICustomerDal
