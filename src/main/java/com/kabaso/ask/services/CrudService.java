package com.kabaso.ask.services;

import java.util.List;

/**
 * Created by boniface on 2014/03/09.
 */
public interface CrudService<S, ID> {

    public S find(ID id);

    public S persist(S entity);

    public S merge(S entity);

    public S remove(S entity);

    public List<S> findAll();
}
