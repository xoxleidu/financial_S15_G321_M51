package com.imooc.seller;

import com.imooc.seller.service.VerifyService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VerifyTest {
    @Autowired
    private VerifyService verifyService;
    //private static DateFormat DAY_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    public void makeVerificationTest(){

        Date day = new GregorianCalendar(2018,7,2).getTime();
        File file = verifyService.makeVerificationFile("101",day);

        System.out.println(file.getAbsolutePath());

    }

    @Test
    public void saveChanOrdersTest(){

        Date day = new GregorianCalendar(2018,7,2).getTime();
        verifyService.saveChanOrders("101",day);

    }

    @Test
    public void verifyTest(){

        Date day = new GregorianCalendar(2018,7,2).getTime();
        System.out.println(String.join(";", verifyService.verifyOrder("101", day)));
    }

}
