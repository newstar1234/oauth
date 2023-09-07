package com.newstar.oauthback.service.implement;

import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OAuth2UserServiceImplement extends DefaultOAuth2UserService {
    
    @Override
    public OAuth2User loadUser(OAuth2UserRequest request) throws OAuth2AuthenticationException {

        System.out.println(request.getClientRegistration().getRegistrationId());

        OAuth2User oAuth2User = super.loadUser(request);

        // try {
        //     System.out.println(new ObjectMapper().writeValueAsString(oAuth2User.getAttributes()));
            
        // } catch (Exception exception) {
        //     exception.printStackTrace();
        // }
        //! 위 전체 속성 가져왔음 // 밑에는 id랑 profileImage 가져옴

        String id = (String)oAuth2User.getAttributes().get("login");
        String profileImage = (String)oAuth2User.getAttributes().get("avatar_url");

        System.out.println(id);
        System.out.println(profileImage);

        return oAuth2User;

    }

}
