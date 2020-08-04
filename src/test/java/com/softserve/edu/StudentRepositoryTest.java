package com.softserve.edu;

import com.softserve.edu.entity.User;
import com.softserve.edu.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.mock.mockito.MockBean;

@DataJpaTest
public class StudentRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
//    @MockBean
    private UserRepository userRepository;
//
//    @BeforeEach
//    public void setUp(){
//        String email = "email";
//        String firstname = "fName";
//        String lastname = "lName";
//        String password = "pass";
//
//        User user = new User();
//        user.setFirstname(firstname);
//        user.setLastname(lastname);
//        user.setEmail(email);
//
//        Mockito.when(userRepository.findUserByEmail(Mockito.any())).thenReturn(user);
//    }

    @Test
    public void newUserTest(){
        String email = "email";
        String firstname = "fName";
        String lastname = "lName";
        String password = "pass";

        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setEmail(email);
        //// ....

        userRepository.save(user);

        User actual = userRepository.findUserByEmail(email);
        Assertions.assertEquals(firstname, actual.getFirstname());
    }
}
