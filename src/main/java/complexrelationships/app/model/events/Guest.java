package complexrelationships.app.model.events;

import complexrelationships.app.enums.events.GuestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guestId;

    private String guestName;
    private GuestStatus guestStatus;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
