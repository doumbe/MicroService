package com.translatelanguage.micoservice.demo.controller;

import com.translatelanguage.micoservice.demo.entity.HistoryEntity;
import com.translatelanguage.micoservice.demo.service.HistoryEntityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;

@RestController
@RequestMapping("/api/")
public class HistoryEntityController {
    private final HistoryEntityService historyEntityService;

    public HistoryEntityController(HistoryEntityService historyEntityService) {
        this.historyEntityService = historyEntityService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "history",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody HistoryEntity newHistory) throws ServerException {
        HistoryEntity historySaved = historyEntityService.saveHistoryEntity(newHistory);
        if (historySaved == null) {
            throw new ServerException("error lor de la sauvegarde ");
        }
    }
}
