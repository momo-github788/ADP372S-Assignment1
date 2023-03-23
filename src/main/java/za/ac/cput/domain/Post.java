package za.ac.cput.domain;

/*  Post.java
    Entity for the Post
    Author: Muhammed Luqmaan Hoosain (220464901)
    Date: 19 March 2023
*/

import java.time.LocalDateTime;
import java.util.Objects;


public class Post {
    private String postId;
    private String title;
    private String description;
    private double price;
    private Vehicle vehicle;
    private Branch branch;
    private LocalDateTime createdAt;
    private LocalDateTime expiredAt;
    private boolean isActive;
    private String salesPersonId;

    private Post() {

    }

    private Post(PostBuilder builder) {
        this.postId = builder.postId;
        this.title = builder.title;
        this.description = builder.description;
        this.price = builder.price;
        this.vehicle = builder.vehicle;
        this.branch = builder.branch;
        this.createdAt = builder.createdAt;
        this.expiredAt = builder.expiredAt;
        this.isActive = builder.isActive;
        this.salesPersonId = builder.salesPersonId;
    }

    public String getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Branch getBranch() {
        return branch;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getExpiredAt() {
        return expiredAt;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getSalesPersonId() {
        return salesPersonId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Double.compare(post.price, price) == 0 && isActive == post.isActive && Objects.equals(postId, post.postId) && Objects.equals(title, post.title) && Objects.equals(description, post.description) && Objects.equals(vehicle, post.vehicle) && Objects.equals(branch, post.branch) && Objects.equals(createdAt, post.createdAt) && Objects.equals(expiredAt, post.expiredAt) && Objects.equals(salesPersonId, post.salesPersonId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, title, description, price, vehicle, branch, createdAt, expiredAt, isActive, salesPersonId);
    }


    @Override
    public String toString() {
        return "Post{" +
                "postId='" + postId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vehicle=" + vehicle +
                ", branch=" + branch +
                ", createdAt=" + createdAt +
                ", expiredAt=" + expiredAt +
                ", isActive=" + isActive +
                ", salesPersonId='" + salesPersonId + '\'' +
                '}';
    }

    public static class PostBuilder {
        private String postId;
        private String title;
        private String description;
        private double price;
        private Vehicle vehicle;
        private Branch branch;
        private LocalDateTime createdAt;
        private LocalDateTime expiredAt;
        private boolean isActive;
        private String salesPersonId;

        public PostBuilder withPostId(String postId) {
            this.postId = postId;
            return this;
        }

        public PostBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public PostBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public PostBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public PostBuilder withVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public PostBuilder withBranch(Branch branch) {
            this.branch = branch;
            return this;
        }

        public PostBuilder withCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public PostBuilder withExpiredAt(LocalDateTime expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }

        public PostBuilder withIsActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public PostBuilder withSalesPersonId(String salesPersonId) {
            this.salesPersonId = salesPersonId;
            return this;
        }

        public PostBuilder copy(Post post) {
            this.postId = post.postId;
            this.title = post.title;
            this.description = post.description;
            this.price = post.price;
            this.vehicle = post.vehicle;
            this.branch = post.branch;
            this.createdAt = post.createdAt;
            this.expiredAt = post.expiredAt;
            this.isActive = post.isActive;
            this.salesPersonId = post.salesPersonId;
            return this;
        }


        public Post build() {
            return new Post(this);
        }

    }


}
