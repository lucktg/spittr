package com.nearsoft.spittr.domain.repository;

import com.nearsoft.spittr.domain.model.Spitter;

/**
 * Created by vtorres on 29/06/15.
 */
public interface SpitterRepository {

    Spitter save(Spitter unsaved);

    Spitter findByUsername(String userName);
}
