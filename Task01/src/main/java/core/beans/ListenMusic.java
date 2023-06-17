package core.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class ListenMusic implements Action {
    private String action = "Слушаем музыку";

    @Override
    public String toString() {
        return action;
    }
}
