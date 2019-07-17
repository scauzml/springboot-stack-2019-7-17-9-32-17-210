package com.tw.apistackbase.respository;

import com.tw.apistackbase.entiey.Procuratorate;
import com.tw.apistackbase.entiey.Prosecutors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProsecutorsResposity extends JpaRepository<Prosecutors,Integer> {

    Prosecutors findProsecutorsById(int id);
}
