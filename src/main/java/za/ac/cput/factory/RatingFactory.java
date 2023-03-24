package za.ac.cput.factory;

/*  RatingFactory.java
    Factory for the Rating Entity
    Author: Muhammed Luqmaan Hoosain (220464901)
    Date: 24 March 2023
*/

import za.ac.cput.domain.Rating;
import java.time.LocalDate;
import static za.ac.cput.util.Helper.generateId;
import static za.ac.cput.util.Helper.isNullOrEmpty;

public class RatingFactory {

    public static Rating createRating(double rating) {
        if(isNullOrEmpty(rating)) {
            return null;
        }

        if(rating <= 0) {
            throw new IllegalArgumentException("Rating cannot be a negative value or zero");
        }

        return new Rating.RatingBuilder()
                .withRatingId(generateId())
                .withRating(rating)
                .withCreatedAt(LocalDate.now())
                .build();
    }
}
