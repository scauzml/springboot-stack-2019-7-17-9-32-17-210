package com.tw.apistackbase.respository;

import com.tw.apistackbase.entiey.Procuratorate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcuratorateResposity extends JpaRepository<Procuratorate,Integer> {
    Procuratorate findProcuratorateById(int id);
}
