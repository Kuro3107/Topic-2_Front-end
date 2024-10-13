package com.example.SWP_Project_BackEnd.Repository;

import com.example.SWP_Project_BackEnd.Entity.KoiFarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KoiFarmRepository extends JpaRepository<KoiFarm, Long> {
}

