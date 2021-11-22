package Lesson4;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LombokUser {

    private String name;
    private String surname;
    private String addres;
    private String email;
    private String phone;
    private String vkLinr;
    private String facebookLink;
}
