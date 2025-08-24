package complexrelationships.app.model.events;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "event_id")

public class Exposition extends Event {

}
