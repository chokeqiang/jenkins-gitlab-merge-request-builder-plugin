package org.jenkinsci.plugins.gitlab.models.webhook;

/**
 * Created by lordx_000 on 11/14/2015.
 */
public class MergeRequestRepository {
    public String name;
    public String http_url;
    public String ssh_url;

    @Override
    public String toString() {
        return "MergeRequestRepository{" +
                "name='" + name + '\'' +
                ", http_url='" + http_url + '\'' +
                ", ssh_url='" + ssh_url + '\'' +
                '}';
    }
}
