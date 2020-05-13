package hsorg.sdk.credentials;

public class TokenCredentials implements Credentials {

    private final String clientId;
    private final String accessToken;

    public TokenCredentials(String clientId, String accessToken) {
        this.clientId       = clientId;
        this.accessToken    = accessToken;
    }

    /**
     * @see Credentials#getClientId()
     * @return String
     */
    @Override
    public String getClientId() {
        return clientId;
    }

    /**
     * Returns the client's single access token.
     * @return String
     */
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public String toString() {
        return "TokenCredentials{" +
                "clientId='" + clientId + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }

}