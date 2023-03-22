package za.ac.cput.domain;


import java.time.LocalDateTime;

public class transaction {
    private  String transactionId;
    private  String transactionType;
    private  double amount;
    private  LocalDateTime createdAt;
    private  LocalDateTime updatedAt;

    private transaction(Builder builder) {
        this.transactionId = builder.transactionId;
        this.transactionType = builder.transactionType;
        this.amount = builder.amount;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public static class Builder {
        private String transactionId;
        private String transactionType;
        private double amount;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Builder withTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder withTransactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public Builder withAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder withCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder withUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public transaction build() {
            return new transaction(this);
        }
    }
}

