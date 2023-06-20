package core.models;

import lombok.*;

@Builder
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    private String type;
    private String name;
    private int age;
}
