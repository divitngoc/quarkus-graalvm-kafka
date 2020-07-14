package com.divitngoc.model;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RegisterForReflection
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Collaborator {

    @EqualsAndHashCode.Include
    private String name;
    private double yoe;

}
