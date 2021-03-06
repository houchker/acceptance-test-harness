package org.jenkinsci.test.acceptance.docker.fixtures;

import org.jenkinsci.test.acceptance.docker.DockerContainer;
import org.jenkinsci.test.acceptance.docker.DockerFixture;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Runs Artifactory OSS container
 */
@DockerFixture(id = "artifactory", ports = 8081)
public class ArtifactoryContainer extends DockerContainer {


    public URL getURL() throws MalformedURLException {
        return new URL("http://" + ipBound(8081) + ":" + port(8081) + "/artifactory");
    }

    /**
     * Rest Api to verify Artifactory is up and running
     */
    public URL getPingURL() throws MalformedURLException {
        return new URL("http://" + ipBound(8081) + ":" + port(8081) + "/artifactory/api/system/ping");
    }
}
