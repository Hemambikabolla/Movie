package com.infy.eventregistration.entity;

import java.util.List;



import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CastCrewMember {

    @Id
    private String id;

    private String name;

    private String role;

    
    private String type;

    @Embedded
    private ContactInfo contactInfo;

   
    private String contractStatus;

    @ElementCollection
    @CollectionTable(name = "member_availability", joinColumns = @JoinColumn(name = "member_id"))
    @Column(name = "availability")
    private List<String> availability;

    private double dailyRate;

    // Constructors
    public CastCrewMember() {}

    public CastCrewMember(String id, String name, String role, String type,
                          ContactInfo contactInfo, String contractStatus,
                          List<String> availability, double dailyRate) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.type = type;
        this.contactInfo = contactInfo;
        this.contractStatus = contractStatus;
        this.availability = availability;
        this.dailyRate = dailyRate;
    }

    // Getters and setters omitted for brevity

   

    @Embeddable
    public static class ContactInfo {
        private String email;
        private String phone;

        public ContactInfo() {}

        public ContactInfo(String email, String phone) {
            this.email = email;
            this.phone = phone;
        }

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

        
    }
}

