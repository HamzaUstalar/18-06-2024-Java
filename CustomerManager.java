public class CustomerManager {

    private ICustomerDal customerDal; // CustomerManager'ın custormerDal'ı var ve biz onun Add'ini çağırıcaz.
    // Yukarıdaki sistemi insan ister istemez unutabiliyor. Bunu unutmamak için aşşağıdaki gibi yaparız.
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        // iş kodları yazılır.
        customerDal.Add();
    }
    
}
