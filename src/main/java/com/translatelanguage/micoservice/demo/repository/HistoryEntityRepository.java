package com.translatelanguage.micoservice.demo.repository;

import com.translatelanguage.micoservice.demo.entity.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryEntityRepository extends JpaRepository<HistoryEntity,Long> { }
