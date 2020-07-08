package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.springboot.web.model.FeedBack;

@Repository
public interface MyRepo extends CrudRepository<FeedBack, Integer>{

}
