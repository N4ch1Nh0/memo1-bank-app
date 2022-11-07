package com.aninfo.service;

import com.aninfo.model.BankTransaction;
import com.aninfo.repository.BankTransactionRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class BankTransactionService {

    @Autowired
    private BankTransactionRepository BTR;

    public BankTransaction createBankTransaction(Long transactionCbu, String transactionType, Double transactionMount) { return BTR.save(new BankTransaction(transactionCbu, transactionType,this.BTR.count() + 1, transactionMount)); }

    public List<BankTransaction> getBankTransactionsByCbu(Long transactionCbu) { return BTR.findBankTransactionByCbu(transactionCbu); }

    public Optional<BankTransaction> getBankTransactionById(Long transactionId) { return BTR.findById(transactionId);}

    public void deleteBankTransactionById(Long transactionId) { BTR.deleteById(transactionId); }

}


