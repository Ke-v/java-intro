package com.kevin;

public class TestAccounts {
    public static void main(String[] args) {
        Account acc1 = new Account("Mary","001",550.50);
        Account acc2 = new Account("Haji","002",5560.50);
        Account acc3 = new Account("Kunta","003",8450.50);
        Account acc4 = new Account("Kinte","004",5580.50);
        Account acc5 = new Account("Brad","005",5656.80);

        System.out.println(acc1.getBalance());  //  ---get data from objects
        acc1.setBalance(6500);
        System.out.println(acc1.getBalance());

        acc1.printDetails();

        acc2.deposit(10000);
        acc2.printDetails();
        acc2.withdraw(890);
        acc2.printDetails();

        String name = "John";
        name.toLowerCase();
        //primitive --- not an object so cannot call function on it
        int x = 10;
        double z = 88;
        boolean finished = true;


        Account[] accounts = {acc1,acc2,acc3,acc4,acc5};

        for (Account k : accounts)
        {
            k.deposit(100);
            k.printDetails();
        }


    }
}
