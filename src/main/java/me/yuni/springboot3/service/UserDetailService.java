package me.yuni.springboot3.service;

import lombok.RequiredArgsConstructor;
import me.yuni.springboot3.domain.User;
import me.yuni.springboot3.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    //사용자 이름(email)으로 사용자의 정보를 가져오는 메서드
    @Override
    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(()->new IllegalArgumentException((email)));
    }
}
