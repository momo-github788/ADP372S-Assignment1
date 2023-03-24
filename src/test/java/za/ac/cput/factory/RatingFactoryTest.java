package za.ac.cput.factory;

/*  RatingFactoryTest.java
    Test class for RatingFactory
    Author: Muhammed Luqmaan Hoosain (220464901)
    Date: 24 March 2023
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Rating;
import static org.junit.jupiter.api.Assertions.*;

class RatingFactoryTest {

    @Test
    void testCreateRatingSuccess() {
        Rating rating = RatingFactory.createRating(4.5);

        System.out.println(rating);
        assertNotNull(rating);
    }


    @Test
    void testCreateRatingExceptionWhenPassingNegativeRating() {

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> RatingFactory.createRating(-999));
        System.out.println(exception);

        assertTrue(exception.getMessage().contentEquals("Rating cannot be a negative value or zero"));
    }

}