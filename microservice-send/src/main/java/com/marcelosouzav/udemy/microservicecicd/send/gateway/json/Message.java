package com.marcelosouzav.udemy.microservicecicd.send.gateway.json;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message {

    @NotNull(message = "Tipo é obrigatório")
    @NotEmpty(message = "Tipo é obrigatório")
    private String type;

    @NotNull(message = "Cliente é obrigatório")
    @NotEmpty(message = "CLiente é obrigatório")
    private String client;

    @NotNull(message = "Nome é obrigatório")
    @NotEmpty(message = "Nome é obrigatório")
    private String name;
}
