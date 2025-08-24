package complexrelationships.app.model.events;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Speaker  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long speakerId;

    private String speakerName;
    private Duration presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

}
