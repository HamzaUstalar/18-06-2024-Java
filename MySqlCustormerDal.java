public class MySqlCustormerDal implements ICustomerDal, IRepository{ // Dal = Data Access Layer

    @Override
    public void Add() {
        System.out.println("My SQL Eklendi.");
    }
}
