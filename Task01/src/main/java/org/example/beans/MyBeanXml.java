package org.example.beans;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyBeanXml {
    private String name;
    private int age;
}
