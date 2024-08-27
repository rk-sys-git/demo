package Source;

import java.util.List;

public class Services {
private String url;
private Headers headers;
private Authentication authentication;
private List<EndPoints> endPoints;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public List<EndPoints> getEndPoints() {
        return endPoints;
    }

    public void setEndPoints(List<EndPoints> endPoints) {
        this.endPoints = endPoints;
    }
}
