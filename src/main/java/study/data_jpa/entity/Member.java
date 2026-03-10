package study.data_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String username;

    // Entity는 기본적으로 디폴트 생성자가 하나 필요하다.
    // JPA가 Proxy기술을 쓸 때 접근가능하도록 private로 만들면 안됨 protected까지는 열어놔야 됨
    protected Member() {
    }

    public Member(String username) {
        this.username = username;
    }
}
