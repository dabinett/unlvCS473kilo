// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package edu.unlv.kilo.domain;

import edu.unlv.kilo.domain.MoneyValue;
import edu.unlv.kilo.domain.TransactionEntity;

privileged aspect TransactionEntity_Roo_JavaBean {
    
    public MoneyValue TransactionEntity.getAmount() {
        return this.amount;
    }
    
    public void TransactionEntity.setAmount(MoneyValue amount) {
        this.amount = amount;
    }
    
}
