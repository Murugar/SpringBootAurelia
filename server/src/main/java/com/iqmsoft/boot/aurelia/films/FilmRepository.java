package com.iqmsoft.boot.aurelia.films;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FilmRepository extends MongoRepository<Film, String> {
    List<Film> findTop10BySeen(boolean seen, Sort sort);
    List<Film> findBySeen(boolean seen);
}
