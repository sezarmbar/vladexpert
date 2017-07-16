package com.sezar.repsitory;

import com.sezar.model.Catalog;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mahmoudbarakat on 12.07.17.
 */
public interface CatalogRepository extends CrudRepository<Catalog, Long>{
    Catalog findByCaseType(String caseType);
}
