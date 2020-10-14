package pl.scalatech.mockserver;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.common.SingleRootFileSource;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PreDestroy;

@Slf4j
class MockServer {
    private final MockSetting setting;
    private final WireMockServer wireMockServer;

    public MockServer(MockSetting setting) {
        this.setting = setting;
        wireMockServer = new WireMockServer(
                WireMockConfiguration.options()
                                     .port(setting.port)
                                     .fileSource(new SingleRootFileSource("./wiremock")));
        wireMockServer.start();
        log.info("<<MockServer start >>");
    }

    public WireMockServer getWireMock() {
        return wireMockServer;
    }

    @PreDestroy
    void stopWiremockStandalone() {
        wireMockServer.stop();
        log.info("<<MockServer stop>>");
    }

    public void restart() {
        wireMockServer.stop();
        wireMockServer.start();
        log.info("<<MockServer restart>>");
    }


}