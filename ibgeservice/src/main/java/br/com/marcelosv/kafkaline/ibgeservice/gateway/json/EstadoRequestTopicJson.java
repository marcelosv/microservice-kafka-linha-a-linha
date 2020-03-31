package br.com.marcelosv.kafkaline.ibgeservice.gateway.json;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstadoRequestTopicJson {
    private String uf;
}
