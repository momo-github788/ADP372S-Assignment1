package za.ac.cput.domain;

/*  Rating.java
    Entity for the Rating
    Author: Muhammed Luqmaan Hoosain (220464901)
    Date: 21 March 2023
*/

import java.time.LocalDate;
import java.util.Objects;

public class Rating {
    private String ratingId;
    private double rating;
    private LocalDate createdAt;

    private Rating() {

    }

    private Rating(RatingBuilder builder) {
        this.ratingId = builder.ratingId;
        this.rating = builder.rating;
        this.createdAt = builder.createdAt;
    }

    public String getRatingId() {
        return ratingId;
    }

    public double getRating() {
        return rating;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating1 = (Rating) o;
        return Double.compare(rating1.rating, rating) == 0 && Objects.equals(ratingId, rating1.ratingId) && Objects.equals(createdAt, rating1.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ratingId, rating, createdAt);
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId='" + ratingId + '\'' +
                ", rating=" + rating +
                ", createdAt=" + createdAt +
                '}';
    }

    public static class RatingBuilder {
        private String ratingId;
        private double rating;
        private LocalDate createdAt;

        public RatingBuilder withRatingId(String ratingId) {
            this.ratingId = ratingId;
            return this;
        }

        public RatingBuilder withRating(double rating) {
            this.rating = rating;
            return this;
        }

        public RatingBuilder withCreatedAt(LocalDate createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public RatingBuilder copy(Rating rating) {
            this.ratingId = rating.ratingId;
            this.rating = rating.rating;
            this.createdAt = rating.createdAt;
            return this;
        }

        public Rating build() {
            return new Rating(this);
        }
    }
}