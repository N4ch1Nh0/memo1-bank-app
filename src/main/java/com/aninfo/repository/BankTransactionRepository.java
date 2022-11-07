package com.aninfo.repository;

import java.util.List;
import com.aninfo.model.BankTransaction;
import org.springframework.data.repository.CrudRepository;

public interface BankTransactionRepository extends CrudRepository<BankTransaction, Long> {

    List<BankTransaction> findBankTransactionByCbu(Long cbu);

    @Override
    List<BankTransaction> findAll();

}
