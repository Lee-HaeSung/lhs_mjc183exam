package com.lhs.information;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestMjcValidCheck {
    @Test
    public void TestMjcinformation() {
        MjcValidCheck mvc = new MjcValidCheck("010-5442-3234", "underwater@naver.com", "89562");
        assertThat(mvc.isValidPhoneNumber(null)).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("")).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("010-39a2-0203")).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("010-1111-2222")).isEqualTo(true);

        assertThat(mvc.isValidEmail(null)).isEqualTo(false);
        assertThat(mvc.isValidEmail("")).isEqualTo(false);
        assertThat(mvc.isValidEmail("hae(@naver.com")).isEqualTo(false);
        assertThat(mvc.isValidEmail("haesink@naver.com")).isEqualTo(true);

        assertThat(mvc.isValidZipNumber(null)).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("")).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("01588")).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("215588")).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("12526")).isEqualTo(true);
    }
}
