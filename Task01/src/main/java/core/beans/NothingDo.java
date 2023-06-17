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
public class NothingDo implements Action {
    private String action = "Гоняем балду";

    @Override
    public String toString() {
        return action;
    }
}
