package com.exp.commentary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.commentary.entity.MatchEntity;

public interface MatchRepository extends  JpaRepository<MatchEntity, Long>    {

}
