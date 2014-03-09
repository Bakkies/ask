package com.kabaso.ask.services.crud.Impl;

import com.kabaso.ask.model.Question;
import com.kabaso.ask.services.crud.QuestionCrudservice;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by boniface on 2014/03/09.
 */
public class QuestionCrudServiceImpl implements QuestionCrudservice {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Question find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Question persist(Question entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Question merge(Question entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Question remove(Question entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Question> findAll() {
        return null;
    }
}
