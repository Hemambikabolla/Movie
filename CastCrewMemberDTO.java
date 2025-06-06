package com.infy.eventregistration.dto;

import java.util.List;

import lombok.Data;
@Data
public class CastCrewMemberDTO {

    private String id;
    private String name;
    private String role;
    private String type;
    private ContactInfoDTO contactInfo;
    private String contractStatus;
    private List<String> availability;
    private double dailyRate;

    public CastCrewMemberDTO() {}

    public CastCrewMemberDTO(String id, String name, String role, String type,
                            ContactInfoDTO contactInfo, String contractStatus,
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

    public static class ContactInfoDTO {
        private String email;
        private String phone;

        public ContactInfoDTO() {}

        public ContactInfoDTO(String email, String phone) {
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

        // Getters and setters omitted for brevity
    }
}
