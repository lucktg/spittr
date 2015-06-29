package com.nearsoft.spittr.domain.repository;

import com.nearsoft.spittr.domain.model.Spittle;

import java.util.List;

/**
 * Created by vtorres on 28/06/15.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
}
