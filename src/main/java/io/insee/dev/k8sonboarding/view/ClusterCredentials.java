package io.insee.dev.k8sonboarding.view;

public class ClusterCredentials {
    private String apiserverUrl;
    private String token = null;
    private String namespace;
    private String user;

    public String getToken() {
	return token;
    }

    public void setToken(String token) {
	this.token = token;
    }

    public String getApiserverUrl() {
	return apiserverUrl;
    }

    public void setApiserverUrl(String apiserverUrl) {
	this.apiserverUrl = apiserverUrl;
    }

    public String getNamespace() {
	return namespace;
    }

    public void setNamespace(String namespace) {
	this.namespace = namespace;
    }

    public String getUser() {
	return user;
    }

    public void setUser(String user) {
	this.user = user;
    }

}