package pl.scalatech.mockserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MockConfig {
    @Bean
    MockServer wireMockServer(MockSetting setting) {
        return new MockServer(setting);
    }
}
