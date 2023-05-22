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
public class MyBeanAutoConfiguration {
    private String name = "Auto";
    private int age = 24;
}
