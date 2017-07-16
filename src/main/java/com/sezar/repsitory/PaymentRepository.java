package com.sezar.repsitory;

import com.sezar.model.Payment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mahmoudbarakat on 12.07.17.
 */

public interface PaymentRepository extends CrudRepository<Payment,Long> {
}
