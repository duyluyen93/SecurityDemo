package com.example.securitydemo.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Service
public class AuthClientDetailsService implements ClientDetailsService {
    @Override
    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {
        // todo: test authorization: browser/1234
        BaseClientDetails details = new BaseClientDetails();
        details.setClientId(s);
        details.setClientSecret("$2a$10$fWNTd3H.u7G/aNROVQSifebOkZ2xzU5nUPOCI2Ld42M8E25/ljJqK");    // pass encode "1234"
        details.setAuthorizedGrantTypes(Arrays.asList("refresh_token,password".split(",")));
        details.setScope(Arrays.asList("web".split(",")));

        details.setAccessTokenValiditySeconds(3600);

        return s.equals("browser") ? details : null;
    }
}
