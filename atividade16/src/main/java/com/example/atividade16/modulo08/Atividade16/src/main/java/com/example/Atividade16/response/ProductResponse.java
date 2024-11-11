package com.example.atividade16.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ProductResponse {
    private Long id;

    private String name;

    private String description;

    private int quantity;

}
