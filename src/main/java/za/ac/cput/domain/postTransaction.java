package za.ac.cput.domain;


public class PostTransaction {
    private  String postId;
    private  String transactionId;

    private postTransaction(Builder builder) {
        this.postId = builder.postId;
        this.transactionId = builder.transactionId;
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

        public postTransaction build() {
            return new postTransaction(this);
        }
    }
}

