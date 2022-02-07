package postapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private int id;
    private String title;
    private String content;
    private User1 user;
    private String created;
    private String updated;

}
