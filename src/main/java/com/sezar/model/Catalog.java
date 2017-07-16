package com.sezar.model;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by mahmoudbarakat on 12.07.17.
 */

@Entity
@Table(name = "CATALOG")
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at" ,nullable = false, updatable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at" ,nullable = false)
    private Date updatedAt;

    private String caseType;

    private String courtCaseId;
    private String caseId;
    private Date dateFrom;

    private String regionCourtName;
    private String judgeName;

    private String courtInfoAndDate;

    private String plaintiffName;
    private String respondentName;
    private String petitionsNumberAndDate;
    private Date inspectionDate;
    private String inspectionTime;
    private String inspectionHistory;
    private String letters;

    private Date closingDate;
    private String closingDateHistory;
    private String expertI;
    private String expertII;
    private String expertIII;
    private String caseStatuse;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Payment_id")
    private Payment payment;

//    ------------
    public Catalog() {
    }

    public Catalog(String caseType, String courtCaseId, String caseId,
                   Date dateFrom, String regionCourtName, String judgeName,
                   String courtInfoAndDate, String plaintiffName, String respondentName,
                   String petitionsNumberAndDate, Date inspectionDate, String inspectionTime,
                   String inspectionHistory, String letters, Date closingDate,
                   String closingDateHistory, String expertI, String expertII,
                   String expertIII, String caseStatuse, Payment payment) {
        this.caseType = caseType;
        this.courtCaseId = courtCaseId;
        this.caseId = caseId;
        this.dateFrom = dateFrom;
        this.regionCourtName = regionCourtName;
        this.judgeName = judgeName;
        this.courtInfoAndDate = courtInfoAndDate;
        this.plaintiffName = plaintiffName;
        this.respondentName = respondentName;
        this.petitionsNumberAndDate = petitionsNumberAndDate;
        this.inspectionDate = inspectionDate;
        this.inspectionTime = inspectionTime;
        this.inspectionHistory = inspectionHistory;
        this.letters = letters;
        this.closingDate = closingDate;
        this.closingDateHistory = closingDateHistory;
        this.expertI = expertI;
        this.expertII = expertII;
        this.expertIII = expertIII;
        this.caseStatuse = caseStatuse;
        this.payment = payment;
    }


    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCourtCaseId() {
        return courtCaseId;
    }

    public void setCourtCaseId(String courtCaseId) {
        this.courtCaseId = courtCaseId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getRegionCourtName() {
        return regionCourtName;
    }

    public void setRegionCourtName(String regionCourtName) {
        this.regionCourtName = regionCourtName;
    }

    public String getJudgeName() {
        return judgeName;
    }

    public void setJudgeName(String judgeName) {
        this.judgeName = judgeName;
    }

    public String getCourtInfoAndDate() {
        return courtInfoAndDate;
    }

    public void setCourtInfoAndDate(String courtInfoAndDate) {
        this.courtInfoAndDate = courtInfoAndDate;
    }

    public String getPlaintiffName() {
        return plaintiffName;
    }

    public void setPlaintiffName(String plaintiffName) {
        this.plaintiffName = plaintiffName;
    }

    public String getRespondentName() {
        return respondentName;
    }

    public void setRespondentName(String respondentName) {
        this.respondentName = respondentName;
    }

    public String getPetitionsNumberAndDate() {
        return petitionsNumberAndDate;
    }

    public void setPetitionsNumberAndDate(String petitionsNumberAndDate) {
        this.petitionsNumberAndDate = petitionsNumberAndDate;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getInspectionTime() {
        return inspectionTime;
    }

    public void setInspectionTime(String inspectionTime) {
        this.inspectionTime = inspectionTime;
    }

    public String getInspectionHistory() {
        return inspectionHistory;
    }

    public void setInspectionHistory(String inspectionHistory) {
        this.inspectionHistory = inspectionHistory;
    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public String getClosingDateHistory() {
        return closingDateHistory;
    }

    public void setClosingDateHistory(String closingDateHistory) {
        this.closingDateHistory = closingDateHistory;
    }

    public String getExpertI() {
        return expertI;
    }

    public void setExpertI(String expertI) {
        this.expertI = expertI;
    }

    public String getExpertII() {
        return expertII;
    }

    public void setExpertII(String expertII) {
        this.expertII = expertII;
    }

    public String getExpertIII() {
        return expertIII;
    }

    public void setExpertIII(String expertIII) {
        this.expertIII = expertIII;
    }

    public String getCaseStatuse() {
        return caseStatuse;
    }

    public void setCaseStatuse(String caseStatuse) {
        this.caseStatuse = caseStatuse;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @PrePersist
    @PreUpdate
    public void preSave() {
        preSaveImpl();
    }

    protected void preSaveImpl() {
        Timestamp now = new Timestamp(new DateTime().getMillis());
        if ( getCreatedAt() == null ) {
            setCreatedAt( now );
        }
        setUpdatedAt( now );
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", caseType='" + caseType + '\'' +
                ", courtCaseId='" + courtCaseId + '\'' +
                ", caseId='" + caseId + '\'' +
                ", dateFrom=" + dateFrom +
                ", regionCourtName='" + regionCourtName + '\'' +
                ", judgeName='" + judgeName + '\'' +
                ", courtInfoAndDate='" + courtInfoAndDate + '\'' +
                ", plaintiffName='" + plaintiffName + '\'' +
                ", respondentName='" + respondentName + '\'' +
                ", petitionsNumberAndDate='" + petitionsNumberAndDate + '\'' +
                ", inspectionDate=" + inspectionDate +
                ", inspectionTime='" + inspectionTime + '\'' +
                ", inspectionHistory='" + inspectionHistory + '\'' +
                ", letters='" + letters + '\'' +
                ", closingDate=" + closingDate +
                ", closingDateHistory='" + closingDateHistory + '\'' +
                ", expertI='" + expertI + '\'' +
                ", expertII='" + expertII + '\'' +
                ", expertIII='" + expertIII + '\'' +
                ", caseStatuse='" + caseStatuse + '\'' +
                ", payment=" + payment.toString() +
                '}';
    }
}
