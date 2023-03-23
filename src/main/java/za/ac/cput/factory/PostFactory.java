package za.ac.cput.factory;

/*  PostFactory.java
    Factory for the Post Entity
    Author: Muhammed Luqmaan Hoosain (220464901)
    Date: 22 March 2023
*/

import za.ac.cput.domain.Branch;
import za.ac.cput.domain.Post;
import za.ac.cput.domain.Vehicle;
import java.time.LocalDateTime;

import static za.ac.cput.util.Helper.generateId;
import static za.ac.cput.util.Helper.isNullOrEmpty;


public class PostFactory {


    public static Post createPost(String title, String description, double price, Vehicle vehicle, Branch branch, boolean isActive) {

        if(isNullOrEmpty(title) || isNullOrEmpty(description) || isNullOrEmpty(price) || isNullOrEmpty(vehicle) || isNullOrEmpty(branch) || isNullOrEmpty(isActive)) {
            return null;
        }

        return new Post.PostBuilder()
                .withPostId(generateId())
                .withTitle(title)
                .withDescription(description)
                .withPrice(price)
                .withVehicle(vehicle)
                .withBranch(branch)
                .withCreatedAt(LocalDateTime.now())
                .withExpiredAt(LocalDateTime.now().plusMonths(2))
                .withIsActive(isActive)
                .withSalesPersonId(generateId())
                .build();
    }
}
