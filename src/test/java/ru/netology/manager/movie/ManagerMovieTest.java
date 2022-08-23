package ru.netology.manager.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerMovieTest {

    ManagerMovie manager = new ManagerMovie();

    String movie1 = "movie1";
    String movie2 = "movie2";
    String movie3 = "movie3";
    String movie4 = "movie4";
    String movie5 = "movie5";



    @Test
      public void shouldAddMovies() {

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);


        String[] expected = {
           movie1,
           movie2,
           movie3,
           movie4,
           movie5,
        };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected , actual);
    }

    @Test
    public void shouldReverseMovie() {

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = manager.findLast();


        Assertions.assertArrayEquals(expected , actual);

    }

}


