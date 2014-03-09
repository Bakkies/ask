package com.kabaso.ask.services.crud.Impl;

import com.kabaso.ask.model.Author;
import com.kabaso.ask.services.crud.AuthorCrudservice;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by boniface on 2014/03/09.
 */
public class AuthorCrudServiceImpl implements AuthorCrudservice {


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Author find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Author persist(Author entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Author merge(Author entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Author remove(Author entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Author> findAll() {
        return null;
    }
}
