package site.telion.skyprolesson211.model;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Data
@Component
@Scope("session")
public class ShoppingCart {
    private Set<Integer> productIdList;

    public ShoppingCart() {
        productIdList = new HashSet<>();
    }

    public void addProductToProductIdList(Set<Integer> resultList) {
        if (productIdList.isEmpty()) {
            productIdList = resultList;
        } else {
            productIdList.addAll(resultList);
        }
    }
}
