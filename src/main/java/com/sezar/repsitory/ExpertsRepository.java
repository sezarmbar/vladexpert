package com.sezar.repsitory;

import com.sezar.model.Experts;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mahmoudbarakat on 12.07.17.
 */


public interface ExpertsRepository extends CrudRepository<Experts, Long> {
}
