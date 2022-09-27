package com.oracle_jpa2;
import javax.persistence.*;

@Entity
@Table(name = "PIC_IMPRT_PROD_CTLG_NOTE")
public class PIC {

    @Id
    @Column(name="PIC_IMPRT_ENT_UID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    public String getId() {
        return id;
    }

    @Column(name="CRT_USER_ID")
    private String CRT_USER_ID;

    @Column(name="CRT_TS")
    private String CRT_TS;

    @Column(name="LASTMT_USER_ID")
    private String LASTMT_USER_ID;

    @Column(name="LASTMT_TS")
    private String LASTMT_TS;

    @Column(name="ORIG_MDM_CTLG_NOTE_KY_ID")
    private String ORIG_MDM_CTLG_NOTE_KY_ID;

    public PIC() {

    }

    public PIC(String CRT_USER_ID, String CRT_TS, String LASTMT_USER_ID, String LASTMT_TS, String ORIG_MDM_CTLG_NOTE_KY_ID) {
        this.CRT_USER_ID = CRT_USER_ID;
        this.CRT_TS = CRT_TS;
        this.LASTMT_USER_ID = LASTMT_USER_ID;
        this.LASTMT_TS = LASTMT_TS;
        this.ORIG_MDM_CTLG_NOTE_KY_ID = ORIG_MDM_CTLG_NOTE_KY_ID;
    }

    public String getCRT_USER_ID() {
        return CRT_USER_ID;
    }

    public void setCRT_USER_ID(String CRT_USER_ID) {
        this.CRT_USER_ID = CRT_USER_ID;
    }

    public String getCRT_TS() {
        return CRT_TS;
    }

    public void setCRT_TS(String CRT_TS) {
        this.CRT_TS = CRT_TS;
    }

    public String getLASTMT_USER_ID() {
        return LASTMT_USER_ID;
    }

    public void setLASTMT_USER_ID(String LASTMT_USER_ID) {
        this.LASTMT_USER_ID = LASTMT_USER_ID;
    }

    public String getLASTMT_TS() {
        return LASTMT_TS;
    }

    public void setLASTMT_TS(String LASTMT_TS) {
        this.LASTMT_TS = LASTMT_TS;
    }

    public String getORIG_MDM_CTLG_NOTE_KY_ID() {
        return ORIG_MDM_CTLG_NOTE_KY_ID;
    }

    public void setORIG_MDM_CTLG_NOTE_KY_ID(String ORIG_MDM_CTLG_NOTE_KY_ID) {
        this.ORIG_MDM_CTLG_NOTE_KY_ID = ORIG_MDM_CTLG_NOTE_KY_ID;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\nPIC_IMPRT_PROD_CTLG_NOTE: " +
                "\n{" +
                "\nPIC_IMPRT_ENT_UID: " + id +
                "\nCRT_USER_ID: " + CRT_USER_ID +
                "\nCRT_TS: " + CRT_TS +
                "\nLASTMT_USER_ID: " + LASTMT_USER_ID +
                "\nLASTMT_TS: " + LASTMT_TS +
                "\nORIG_MDM_CTLG_NOTE_KY_ID: " + ORIG_MDM_CTLG_NOTE_KY_ID +
                "\n}";
    }
}
