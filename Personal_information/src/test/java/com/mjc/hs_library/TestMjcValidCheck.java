package com.mjc.hs_library;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestMjcValidCheck {
    @Test
    public void TestHSbro(){
        MjcValidCheck testMvc = new MjcValidCheck();
        assertThat(testMvc.isValidPhoneNumber(null)).isEqualTo(false);
        assertThat(testMvc.isValidPhoneNumber("")).isEqualTo(false);
        assertThat(testMvc.isValidPhoneNumber("010-39a2-0203")).isEqualTo(false);
        assertThat(testMvc.isValidPhoneNumber("010-1111-2222")).isEqualTo(true);

        assertThat(testMvc.isValidEmail(null)).isEqualTo(false);
        assertThat(testMvc.isValidEmail("")).isEqualTo(false);
        assertThat(testMvc.isValidEmail("hae(@naver.com")).isEqualTo(false);
        assertThat(testMvc.isValidEmail("haesink@naver.com")).isEqualTo(true);

        assertThat(testMvc.isValidZipNumber(null)).isEqualTo(false);
        assertThat(testMvc.isValidZipNumber("")).isEqualTo(false);
        assertThat(testMvc.isValidZipNumber("01588")).isEqualTo(false);
        assertThat(testMvc.isValidZipNumber("215588")).isEqualTo(false);
        assertThat(testMvc.isValidZipNumber("12526")).isEqualTo(true);
    }
}
