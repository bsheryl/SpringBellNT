package core.controller;

import core.other.FileManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stubs")
public class StubController {

    @Value("${users-api-path}")
    String userApiPath;

    @GetMapping("/users")
    public String getUsers() {
        return FileManager.getMapManager().get(String.format("%susers.json", userApiPath));
    }
}