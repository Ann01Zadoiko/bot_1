package com.example.please.user;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chat_id")
    private Long chatId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "password")
    private String password;

    @Column(name = "at_work")
    private byte atWork;

    @Column(name = "time_of_coming")
    private LocalTime timeComing;

    @Column(name = "room")
    private Integer room;

    @Column(name = "phone_number")
    private String phoneNumber;

   // @OneToOne(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
//    @OneToOne
//    @JoinColumn(name = "id_notification")
//    private Notification notification;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", chatId=" + chatId +
                ", fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", atWork=" + atWork +
                ", timeComing=" + timeComing +
                ", room=" + room +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
