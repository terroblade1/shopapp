package com.example.shopapp.responses;

import com.example.shopapp.models.Category;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse extends BaseResponse{
    private String name;

    private Float price;

    private String thumbnail;

    private String description;

    private Long categoryId;
}
