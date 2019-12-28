package co.kr.example.restaurant.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant(1004L,"미미 삼겹", "대전시 유성구 궁동 460");

        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("미미 삼겹"));
        assertThat(restaurant.getAddress(), is("대전시 유성구 궁동 460"));
    }
    @Test
    public void information() {
        Restaurant restaurant = new Restaurant(1005L, "마라탕", "대전시 유성구 봉명동 매드블럭 1F");
        assertThat(restaurant.getInformation(), is("마라탕 in 대전시 유성구 봉명동 매드블럭 1F"));
    }
}