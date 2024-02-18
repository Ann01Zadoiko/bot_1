package com.example.please.atWork;

import com.example.please.user.User;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "list_of_employees")
public class AtWork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDate date = LocalDate.now();

//    @Column(name = "at_word")
//    private boolean atWork;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;

//    @Column(name = "number_of_list")
//    private Integer numberOfList = 0;

    @Override
    public String toString() {
        return "AtWork{" +
                "id=" + id +
                ", date=" + date +
                ", user=" + user +
                '}';
    }
}

