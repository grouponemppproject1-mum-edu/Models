package com.MppProject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.MppProject.models.*;

/**
 * Created by student on 7/10/17.
 */
public interface ImageRepository extends CrudRepository<Image,Long> {
        public Iterable<Image> findAllByUser(User user);
}
