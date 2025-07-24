package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phoneNum;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    public Advisor() {}

    public Advisor(String name, String email, String phoneNum, List<Client> clients) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.clients = clients;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhoneNum() { return phoneNum; }
    public List<Client> getClients() { return clients; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNum(String phoneNum) { this.phoneNum = phoneNum; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}
