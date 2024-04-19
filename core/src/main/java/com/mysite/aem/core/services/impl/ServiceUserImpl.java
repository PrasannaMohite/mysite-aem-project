package com.mysite.aem.core.services.impl;

import com.mysite.aem.core.services.ServiceUser;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.HashMap;

@Component(
        service = ServiceUser.class,
        immediate = true
)
public class ServiceUserImpl implements ServiceUser {

    @Reference
    ResourceResolverFactory resourceResolverFactory;
    @Override
    public ResourceResolver getServiceUser(String serviceUserName) throws LoginException {
        HashMap<String, Object> param = new HashMap<>();
        return resourceResolverFactory.getServiceResourceResolver(param);
    }
}
