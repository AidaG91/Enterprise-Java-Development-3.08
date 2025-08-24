package complexrelationships.app.model.events;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "event_id")
@NoArgsConstructor
@AllArgsConstructor

public class Conference extends Event {

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;
}
