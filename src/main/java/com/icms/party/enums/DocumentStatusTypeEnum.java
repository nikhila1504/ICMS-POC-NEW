package com.icms.party.enums;

public enum DocumentStatusTypeEnum {

	FOR_DATA_ENTRY("FORDZVLE"),
	FOR_COVERAGE_EVALUATION("FORCIUVY"),
	FOR_CLAIM_EXAMINATION("FORCUTWT"),
	FOR_MEDIATOR_ASSIGNMENT("FORMWLXX"),
	//FOR_MEDIATION("FORMCEDX"),
	//FOR_HEARING("FORHMQQS"),
	SCHEDULE_FOR_HEARING("FORSQLOK"),
	SCHEDULE_FOR_MEDIATION("FRADRSCH"),
	SCHEDULE_FOR_APPEAL("SCHDAPPL"),
	AWAITING_HEARING("AWAIACDM"),
	COMPLETED("COMPLSHH"),
	FOR_PENDING_ORDER("FORPMJJV"),
	FOR_REVIEW_AND_FINALIZATION("FORRJXRV"),
	FOR_AMENDED_NOTICE_GENERATION("FORAHJSG"),
	PENDING("PENDLEOT"),
	//FOR_PROCESSING("FORPDLKL"),
	AMENDED_NOTICE_FOR_HEARING("AMNDDNFH"),
	AMENDED_NOTICE_FOR_MEDIATION("AMNDDNFM"),
	AWAITING_OBJECTION("AWAICKOG"),
	OBJECTION_RECIEVED("OBJENUUR"),
	OBJECTION_NOT_RECEIVED("OBJEDNMU"),
	FOR_COMPLETION("FORCGYAF"),
	SUBMITTED("SUBMITTD"),
	APPROVED("APPRNUKH"),
	REJECTED("REJEOIJZ"),
	DENIED("DENIWHEB"),
	FOR_PRELIMINARY_REVIEW("FORPGAOF"), 
	FOR_ACTION_STAFF_ASSIGNMENT("FORAVCRX"),
	FOR_REHAB_COORDINATOR_REVIEW("FORRRCHZ"),
	FOR_REHAB_CONFERENCE("FORRDHQQ"),
	FOR_ADMIN_DECISION("FORARYQE"),
	SCHEDULE_FOR_REHAB("SCHDRHAB"),
	OBJECTION_RECEIVED("OBJENUUR"),
	AWAITING_HEARING_FOR_WCR1CATEE("AWAIMZWV"),
	AWAITING_APPEAL_FOR_WCR1CATEE("AWAIEGZA"),
	NOT_FILED_WITH_BOARD("NOTFLBRD"),
	AWAITING_SUPERIOR_COURT_FOR_WCR1CATEE("AWAIGDMW"),
	AMENDED_NOTICE_OF_APPEAL("AMNDNOAP"),
	FOR_JUDICIAL_REVIEW("FORJPYTE"),
	FOR_JUDICIAL_REVIEW_2("FORJFVHH"),
    WORKFLOW_NOT_TRIGGERED("WORKFLNO"),
	SCHEDULE_FOR_TELECONFERENCE("SCHDTELC"),
	AWAITING_TELECONFERENCE("AWTNTELC"),
	FOR_REVIEW("FORRTYIB"),
	ORDER_REVIEW("ORDETVWA"),
	FOR_FINAL_JUDICIAL_REVIEW("FORFXEXA"),
	FOR_APPROVAL("FORAAOCR");
	

	//IN_FILE("INFILEDS");
    
	private String code;	    
	    
	DocumentStatusTypeEnum(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
    
    @Override
    public String toString() {
        return this.code;
    }
    
}
