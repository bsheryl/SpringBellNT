package org.example.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class PlayGame implements Action {
    private String action = "Играем в игру";

    @Override
    public String toString() {
        return action;
    }
}
