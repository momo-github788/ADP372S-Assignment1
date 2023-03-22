package za.ac.cput.domain;

/*  Transaction.java
    Entity for the Transaction
    Author: Serge Kalala 220525137
    Date: 20 March 2023
*/
import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction {


    private  String transactionId;
    private  String transactionType;
    private  double amount;
    private  LocalDateTime createdAt;
    private  LocalDateTime updatedAt;

    private Transaction(Builder builder) {
        this.transactionId = builder.transactionId;
        this.transactionType = builder.transactionType;
        this.amount = builder.amount;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return getTransactionId().equals(that.getTransactionId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTransactionId());
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
       @Override
    public String toString() {
        return "transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
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

        public Builder Copy(Transaction name) {
            this.transactionId = name.transactionId;
            this.transactionType = name.transactionType;
            this.amount = name.amount;
            this.createdAt = name.createdAt;
            this.updatedAt = name.updatedAt;

            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }
}

