package com.struts2.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "/spring.local.hibernate.cfg.xml",  
        "/spring.service.cfg.xml" })  
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)  
@Transactional 
public class DaseTest {

}
