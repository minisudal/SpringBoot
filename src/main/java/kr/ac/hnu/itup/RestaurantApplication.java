package kr.ac.hnu.itup;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RestaurantApplication {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.setName("miso restaurant");
        restaurant.setAddress("대전광역시 동구");
        restaurant.setPhone("042-222-3333");
        Chef chef = new Chef();

        chef.setName("백종원");

        // 로그를 보고 싶을 때는 System.out.println()을 쓰면 절대로 안된다.
        // log4j나 log4j2, slf4j와 같은 라이브러리를 사용해서 로그를 찍어야 한다.
        // log의 5가지 레벨(Level)
        // trace, debug, info, warning, error
        // 출력 세팅은 application.properties에서 한다.

        log.info("restaurant: {}", restaurant);
    }
}
