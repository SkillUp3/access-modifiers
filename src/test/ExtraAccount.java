package test;

import com.company.Account;

/**
 * Created by idejesus on 28/03/2017.
 */
public class ExtraAccount extends Account {
    public ExtraAccount(String accountName) {
        super(accountName);
    }

    public String getAccountName(){
        return accountName;
    }
}
