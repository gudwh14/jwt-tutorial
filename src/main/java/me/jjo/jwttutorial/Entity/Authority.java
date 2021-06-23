package me.jjo.jwttutorial.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authority") // Table 명과 매핑 시켜줌
@Getter // 겟 생성자 자동으로 생성
@Setter // 세터 생성자 자동으로 생성
@Builder // 빌더 생성자 자동으로 생성
@AllArgsConstructor
@NoArgsConstructor
public class Authority {

    @Id
    @Column(name = "authority_name", length = 50)
    private String authorityName;
}
