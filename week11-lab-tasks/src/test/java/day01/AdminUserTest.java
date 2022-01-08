package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testAdminUser() {
        String email = "valami@freemail.hu";
        String psw = "jelszÓ1234";
        String expectedPsw = "**********";
        User user = new AdminUser(email, psw);
        assertEquals(email, user.getUserEmail());
        assertEquals(expectedPsw, user.getPassword());
    }

}