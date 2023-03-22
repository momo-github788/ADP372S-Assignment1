package za.ac.cput.domain;

/*  PostTransaction.java
    Entity for the PostTransaction
    Author: Serge Kalala 220525137
    Date: 20 March 2023
*/

import java.util.Objects;

public class PostTransaction {
    private  String postId;

    private  String transactionId;

    private PostTransaction(Builder builder) {
        this.postId = builder.postId;
        this.transactionId = builder.transactionId;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PostTransaction)) return false;
        PostTransaction that = (PostTransaction) o;
        return getPostId().equals(that.getPostId()) && getTransactionId().equals(that.getTransactionId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPostId(), getTransactionId());
    }
    public String getPostId() {
        return postId;
    }

    public String getTransactionId() {
        return transactionId;
    }
      @Override
    public String toString() {
        return "postTransaction{" +
                "postId='" + postId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }

    public static class Builder {
        private String postId;
        private String transactionId;

        public Builder withPostId(String postId) {
            this.postId = postId;
            return this;
        }

        public Builder withTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public Builder Copy(PostTransaction name) {

            this.postId = name.postId;
            this.transactionId = name.transactionId;
            return this;
        }

        public PostTransaction build() {
            return new PostTransaction(this);
        }
    }
}

