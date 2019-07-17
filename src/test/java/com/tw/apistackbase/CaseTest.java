package com.tw.apistackbase;

import com.tw.apistackbase.entiey.Case;
import com.tw.apistackbase.respository.CaseResposity;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CaseTest {

     @Autowired
     private CaseResposity caseResposity;
    @Test
    public void should_return_case_when_give_a_case_id() {
        Case aCase = new Case();
        aCase.setCaseName("案件1");
        aCase.setHappenTime(System.currentTimeMillis());

        Assertions.assertThrows(Exception.class,()->{
            caseResposity.saveAndFlush(aCase);
        });
        Case case1= caseResposity.findAllCaseById(aCase.getId());
        Assertions.assertEquals(aCase.getId(),case1.getId());
    }

    @Test
    public void should_return_case_when_order_by_happen_time() {
        Case aCase = new Case();
        aCase.setCaseName("案件1");
        aCase.setHappenTime(System.currentTimeMillis());
        Case aCase1 = new Case();
        aCase1.setCaseName("案件2");
        aCase1.setHappenTime(System.currentTimeMillis()+10);
        caseResposity.saveAndFlush(aCase);
        caseResposity.saveAndFlush(aCase1);

        List<Case> caseList= caseResposity.findByOrderByHappenTimeDesc();
        Assertions.assertEquals(aCase1.getCaseName(),caseList.get(0).getCaseName());
    }

    @Test
    public void should_return_case_when_give_case_name() {
        Case aCase = new Case();
        aCase.setCaseName("案件");
        aCase.setHappenTime(System.currentTimeMillis());
        Case aCase1 = new Case();
        aCase1.setCaseName("案件");
        aCase1.setHappenTime(System.currentTimeMillis()+10);
        caseResposity.saveAndFlush(aCase);
        caseResposity.saveAndFlush(aCase1);

        List<Case> caseList= caseResposity.findAllCaseByCaseName("案件");
        Assertions.assertEquals(2,caseList.size());
    }

    @Test
    public void should_delete_case_when_give_id() {
        Case aCase = new Case();
        aCase.setCaseName("案件");
        aCase.setHappenTime(System.currentTimeMillis());
        Case aCase1 = new Case();
        aCase1.setCaseName("案件1");
        aCase1.setHappenTime(System.currentTimeMillis()+10);
        caseResposity.saveAndFlush(aCase);
        caseResposity.saveAndFlush(aCase1);

        caseResposity.deleteById(aCase.getId());
        List<Case> caseList= caseResposity.findAll();
        Assertions.assertEquals(1,caseList.size());
    }
}
