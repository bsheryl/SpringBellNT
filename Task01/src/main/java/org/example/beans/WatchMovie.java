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
public class WatchMovie implements Action {
    private String action = "Смотрим фильм";

    @Override
    public String toString() {
        return action;
    }
}
