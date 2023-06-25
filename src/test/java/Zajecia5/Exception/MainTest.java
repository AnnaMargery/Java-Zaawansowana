package Zajecia5.Exception;

import org.junit.jupiter.api.Test;

import java.util.List;

import static Zajecia5.Exception.Main.convert;
import static org.assertj.core.api.Assertions.assertThat;


public class MainTest {

        @Test
        public void shouldIgnoreBadStrings() {
            // given
            List<String> numbers = List.of("12", "xyz", "??", "135", "-12322", "0.12");

            // when
            List<Integer> result = convert(numbers);

            // then
            assertThat(result).hasSize(3);
            assertThat(result).containsExactly(12, 135, -12322);
        }
    }
