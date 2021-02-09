package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Car;

class ParticipantsTest {
  @Test
  void create() {
    List<Car> cars = new ArrayList<>(Arrays.asList(new Car("pobi"), new Car("sp")));
    // 정상
    Participants participants = new Participants(cars);
    assertThat(participants.getCars()).extracting("name").contains("pobi", "sp");

    // 생성자 단게에서 방어적 복사해야 함.
    cars.remove(1);
    assertThat(participants.getCars()).extracting("name").contains("pobi", "sp");

    // get 단계에서 unmodifiableList 처리
    List<Car> getCars = participants.getCars();
    assertThatThrownBy(() -> getCars.remove(1)).isInstanceOf(UnsupportedOperationException.class);

    // 또는 new ArrayList()를 통한 방어적 복사해야 함.
    assertThat(participants.getCars()).extracting("name").contains("pobi", "sp");
  }
}