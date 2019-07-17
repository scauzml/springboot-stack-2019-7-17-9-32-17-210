package com.tw.apistackbase.respository;

import com.tw.apistackbase.entiey.SpecificInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpecificInformationResposity extends JpaRepository<SpecificInformation,Integer> {
    List<SpecificInformation> findAllSpecificInformationById(int id);
}
