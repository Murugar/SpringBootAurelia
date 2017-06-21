package com.iqmsoft.boot.aurelia.films.omdbApiClient;


public interface FilmApi {
    String getCover(String title);

    OmdbFilm getFilmDetails(String title);

    FilmSearchResult searchFilmsByTitle(String title);

}
