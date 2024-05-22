package br.com.viniciusfinger.geofences.model;


import jakarta.persistence.*;
import org.locationtech.jts.geom.Polygon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Fence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Enumerated(EnumType.STRING)
    private List<FenceFunctionality> fenceFunctionalities;

    //to-do: vai ser setado por quem criar a cerca? 
    private String color;

    @Column(name = "polygon", columnDefinition = "Geometry(Polygon)")
    private Polygon polygon;

    // to-do: criar uma entidade customer e associar
    private Long customerId;

}
