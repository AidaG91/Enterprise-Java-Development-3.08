package complexrelationships.app.model.events;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

@Data
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "event_type")
@Entity
@NoArgsConstructor
@AllArgsConstructor

public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    private LocalDate eventDate;
    private Duration eventDuration;
    private String eventLocation;
    private String eventTitle;

    @OneToMany(mappedBy = "event")
    private List<Guest> guests;
}
