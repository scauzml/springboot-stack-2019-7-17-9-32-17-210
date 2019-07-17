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
        caseResposity.saveAndFlush(aCase);

        Case case1= caseResposity.findAllCaseById(aCase.getId());
        Assertions.assertEquals(aCase.getId(),case1.getId());
    }

    @Test
    public void should_return_case_when_() {
        Case aCase = new Case();
        aCase.setCaseName("案件1");
        aCase.setHappenTime(System.currentTimeMillis());
        caseResposity.saveAndFlush(aCase);

        Case case1= caseResposity.findAllCaseById(aCase.getId());
        Assertions.assertEquals(aCase.getId(),case1.getId());
    }
}
