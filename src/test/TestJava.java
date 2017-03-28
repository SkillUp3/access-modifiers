package test;

import com.company.Account;
import com.company.Test;

/**
 * Created by idejesus on 27/03/2017.
 */
public class TestJava implements Test{
    Account mAccount = new Account("test");

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public boolean methodC() {
        return false;
    }
}
