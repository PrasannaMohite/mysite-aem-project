package com.mysite.aem.core.services;

import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;

public interface ServiceUser {
    ResourceResolver getServiceUser(String serviceUserName) throws LoginException;
}
