package br.com.marcelosv.kafkaline.ibgeservice.gateway.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoList implements Serializable {
    private List<EstadoJson> list;
}
