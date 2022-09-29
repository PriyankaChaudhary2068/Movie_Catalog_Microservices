package com.bridgelabz.ratingsdataserviceapplication.resources;

import com.bridgelabz.ratingsdataserviceapplication.models.Rating;
import com.bridgelabz.ratingsdataserviceapplication.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsData")
public class RatingDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 9);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 7),
                new Rating("5678", 5));
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
