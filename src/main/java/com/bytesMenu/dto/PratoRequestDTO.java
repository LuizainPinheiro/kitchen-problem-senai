package com.bytesMenu.dto;
import lombok.Data;

import java.math.BigDecimal;

public record PratoRequestDTO(
        String name,
        BigDecimal price,
        String description

) {

}
