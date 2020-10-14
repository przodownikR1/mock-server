package pl.scalatech.mockserver;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
class MockServerController {
    private final MockServer mockServer;

    @GetMapping("/restart")
    ResponseEntity<Void> restart() {
        mockServer.restart();
        return ok().build();
    }
}
