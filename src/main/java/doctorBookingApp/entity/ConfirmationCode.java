package doctorBookingApp.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ConfirmationCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String confirmationCode;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    @JsonIgnore
    private User user;

    @Column
    private LocalDateTime expiredDateTime;


}
