package org.example.dto;

import lombok.*;
import org.example.constant.Gender;
import org.example.entity.Member;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ProfessorDto {

    private Long id;
    private String profAgency;
    private String profWork;
    private String profBank;
    private String profAccount;
    private String profAcOwner;
    private boolean isActive;

    private String userName;
    private String userPhoneNum;
    private String userEmail;
    private String userAddr;
    private LocalDate userBirthDay;
    private Gender userGender;
    private Long memberId;


    @Builder
    public ProfessorDto(String profAgency, String profWork, String profBank, String profAccount, boolean isActive) {
        this.profAgency = profAgency;
        this.profWork = profWork;
        this.profBank = profBank;
        this.profAccount = profAccount;
        this.isActive = isActive;
    }

    public ProfessorDto(String userName, String userPhoneNum, String userEmail,
                        LocalDate userBirthDay, Gender userGender, boolean isActive,
                        String profWork) {
        this.userName = userName;
        this.userPhoneNum = userPhoneNum;
        this.userEmail = userEmail;
        this.userBirthDay = userBirthDay;
        this.userGender = userGender;
        this.isActive = isActive;
        this.profWork = profWork;
    }

    public ProfessorDto(Long profId, String userName, LocalDate userBirthDay, Gender userGender,
                        String userPhoneNum, String userAddr, Long memberId, String userEmail,
                        boolean isActive, String profAcOwner, String profBank, String profAccount,
                        String profAgency) {
        this.id = profId;
        this.userName = userName;
        this.userBirthDay = userBirthDay;
        this.userGender = userGender;
        this.userPhoneNum = userPhoneNum;
        this.userAddr = userAddr;
        this.memberId = memberId;
        this.userEmail = userEmail;
        this.isActive = isActive;
        this.profAcOwner = profAcOwner;
        this.profBank = profBank;
        this.profAccount = profAccount;
        this.profAgency = profAgency;
    }
}