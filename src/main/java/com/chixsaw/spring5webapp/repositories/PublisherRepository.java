package com.chixsaw.spring5webapp.repositories;

import com.chixsaw.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Raphael Frey on 25.11.2022
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
