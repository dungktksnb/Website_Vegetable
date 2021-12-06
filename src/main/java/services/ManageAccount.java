package services;

import daos.CRUDAccount;
import daos.CRUDProduct;
import models.Account;
import models.Product;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class ManageAccount {
    public static ArrayList<Account> listAccount = new ArrayList<>();

    public ManageAccount() {
        try {
            listAccount = (ArrayList<Account>) CRUDAccount.showAccount();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(Account account) throws Exception{
        CRUDAccount.createAccount(account);
        listAccount.add(account);
    }
    public  static void check(String userName,String passWord){
        CRUDAccount.checkLogin(userName,passWord);
    }



}
