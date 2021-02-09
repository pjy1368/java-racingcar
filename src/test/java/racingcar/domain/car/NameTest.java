package racingcar.domain.car;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NameTest {

  @ParameterizedTest
  @ValueSource(strings = {"", "spring"})
  @DisplayName("이름 길이가 0 이하 또는 5 이상일 때 에러 확인")
  void car_name_exception(String name) {
    assertThatThrownBy(() -> new Car(name))
        .isInstanceOf(IllegalStateException.class);
  }

}