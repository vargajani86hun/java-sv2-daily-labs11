package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    @Test
    void testUser() {
        String email = "valami@freemail.hu";
        String psw = "jelszÓ1234";
        User user = new NormalUser(email, psw);
        assertEquals(email, user.getUserEmail());
        assertEquals(psw, user.getPassword());
    }

}