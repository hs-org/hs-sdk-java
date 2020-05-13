package hsorg.sdk;

import hsorg.sdk.credentials.Credentials;

public final class HS {

    private final Credentials credentials;

    /**
     * @see #create(Credentials) 
     * @param credentials = credentials that will be used
     */
    private HS(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * Returns the defined credentials.
     * @return Credentials
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Creates a new HS instance with the specified credentials.
     * @param credentials = credentials that will be used
     * @return HS
     */
    public static HS create(Credentials credentials) {
        return new HS(credentials);
    }

}