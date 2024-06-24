public class Main {
    public static void main(String[] args){
        // Interfaceler ve Abstract'lar newlenemezler.
        // Classlar birden fazla interface'i implemente edebilir.
        // Fakat classlar sadece bir class'ı extends edebilir.
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal()); // İçerdeki yapıyı istediğimi gibi değiştirebiliriz. Artık yeniliğe açığız.
        // customerManager.customerDal=new OracleCustomerDal(); Buradaki erişimi private ile kapattım zaten içerden erişim sağlıyabiliyoruz.
        customerManager.add();
    }
}