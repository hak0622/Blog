package studying.blog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import studying.blog.domain.User;
import studying.blog.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String email){
        return userRepository.findByEmail(email).orElseThrow(()->new IllegalArgumentException(email));
    }
}
