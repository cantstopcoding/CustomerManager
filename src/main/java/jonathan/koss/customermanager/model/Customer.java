package jonathan.koss.customermanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false)
    private String customerCode;

    public Customer() {}

    public Customer(String name, String email, String jobTitle, String phone, String imageUrl, String customerCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.customerCode = customerCode;
    }
}
