package com.example.Backend_Traini8_LeviManaseWani.Dto;

import lombok.Data;

@Data
public class SearchDto {

        private Long id;
        private String centerName;
        private String centerCode;
        private String contactEmail;
        private String contactPhone;

        public SearchDto(Long id, String centerName, String centerCode, String contactEmail, String contactPhone) {
            this.id = id;
            this.centerName = centerName;
            this.centerCode = centerCode;
            this.contactEmail = contactEmail;
            this.contactPhone = contactPhone;
        }

        // Getters and Setters as lombok wasnt working for this file




    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}


