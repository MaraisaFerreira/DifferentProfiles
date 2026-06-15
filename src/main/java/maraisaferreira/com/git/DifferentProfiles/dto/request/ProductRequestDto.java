package maraisaferreira.com.git.DifferentProfiles.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import maraisaferreira.com.git.DifferentProfiles.entities.enums.ProductCategories;

public record ProductRequestDto(
        @NotBlank
        String name,
        @NotNull
        @Min(value = 0)
        Double price,
        @NotNull
        @Min(value = 0)
        Integer quantity,
        @NotNull
        ProductCategories category
) {
}
