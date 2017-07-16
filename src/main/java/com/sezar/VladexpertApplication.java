package com.sezar;

import com.sezar.model.Catalog;
import com.sezar.model.Payment;
import com.sezar.model.enums.PaymentStatuse;
import com.sezar.repsitory.CatalogRepository;
import com.sezar.repsitory.ExpertsRepository;
import com.sezar.repsitory.PaymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class VladexpertApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(VladexpertApplication.class);
    @Autowired
    CatalogRepository catalogRepository;
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    ExpertsRepository expertsRepository;

	public static void main(String[] args) {
        SpringApplication.run(VladexpertApplication.class, args);
    }







    @Override
    public void run(String... args)throws Exception{
        Payment payment = new Payment("Olaa","Olaa","Olaa", PaymentStatuse.PAID);
        Catalog catalog = new Catalog("Rula","Olaa","Ollaaa",new Date(),"Ahmad","mahmld","mahmld","mahmld","mahmld"
                ,"mahmld", new Date(),"Ahmad","Ahmad","Ahmad",new Date(),"mahmld","mahmld","mahmld","mahmoud","mahmoud",payment);

//        Experts expert = new Experts("AHmad ",true);
//        expertsRepository.save(expert);

//        paymentRepository.save(payment);
//          catalogRepository.save(catalog);
//        logger.warn(catalog.toString());

        Catalog catalog1=catalogRepository.findByCaseType("Rula");
            logger.warn(catalog1.toString());
//
//        logger.warn(catalog1.toString());

    }




}
