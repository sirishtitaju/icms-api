package com.initial.model;

/***
 User
 ***/
import io.micronaut.context.annotation.Prototype;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Validated
@Prototype
@Introspected
public class AuthorDTO {

    @NotBlank
    private String authorName;
    private String authorProfile;
    private String description;
}
