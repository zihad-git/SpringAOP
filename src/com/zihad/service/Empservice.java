package com.zihad.service;

import com.zihad.model.Accountant;
import com.zihad.model.Manager;


public class Empservice {
    private Manager manager;
    private Accountant accountant;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }
    
    
}
