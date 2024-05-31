package br.com.viniciusfinger.geofences.model;

import br.com.viniciusfinger.geofences.enums.EventType;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Event {

    /*
    Fence entrance and exit events (and another events)
     */

    //to-do: terminar de implementar. Associar a funcionalidade que gerou o evento.

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private EventType type;

}