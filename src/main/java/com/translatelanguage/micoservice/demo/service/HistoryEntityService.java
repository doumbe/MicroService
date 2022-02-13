package com.translatelanguage.micoservice.demo.service;

import com.translatelanguage.micoservice.demo.entity.HistoryEntity;
import com.translatelanguage.micoservice.demo.repository.HistoryEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HistoryEntityService {

    private final Logger logger = LoggerFactory.getLogger(HistoryEntityService.class);

    private final HistoryEntityRepository historyEntityRepository;

    public HistoryEntityService(HistoryEntityRepository historyEntityRepository) {
        this.historyEntityRepository = historyEntityRepository;
    }

    @Transactional
    public HistoryEntity saveHistoryEntity(HistoryEntity historyEntity) {
        return historyEntityRepository.save(historyEntity);
        /*if (id != null) {
            logger.info("##### sauvegarde réalisé avec succès");
        } else {
            logger.info("##### sauvegarde KO");
        }*/
    }
}
