package com.school_journal.controller;

import com.school_journal.controller.common.AbstractController;
import com.school_journal.entity.JournalEntity;
import com.school_journal.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/journal")
public class JournalController extends AbstractController<JournalEntity, JournalService> {
    public JournalController(JournalService service) {
        super(service);
    }
}
