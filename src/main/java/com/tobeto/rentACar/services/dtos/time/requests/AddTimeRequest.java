package com.tobeto.rentACar.services.dtos.time.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddTimeRequest {

    @NotBlank(message = "Time name field can not be empty!")
    private String timeName;
}
