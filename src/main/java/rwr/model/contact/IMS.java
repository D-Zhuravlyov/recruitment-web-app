package rwr.model.contact;

import rwr.model.Contact;


public class IMS extends Contact {

    private int candidateId;

    private int imsId;
    private String icq;
    private String jabber;
    private String aim;
    private String msn;


    public IMS() {
    }

    public IMS(String icq, String jabber, String aim, String msn) {
        this.icq = icq;
        this.jabber = jabber;
        this.aim = aim;
        this.msn = msn;
    }

    public String getIcq() {
        return icq;
    }

    public void setIcq(String icq) {
        this.icq = icq;
    }

    public String getJabber() {
        return jabber;
    }

    public void setJabber(String jabber) {
        this.jabber = jabber;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public int getImsId() {
        return imsId;
    }

    public void setImsId(int imsId) {
        this.imsId = imsId;
    }

    @Override
    public String toString() {
        return "IMS{" +
                "icq='" + icq + '\'' +
                ", jabber='" + jabber + '\'' +
                ", aim='" + aim + '\'' +
                ", msn='" + msn + '\'' +
                '}';
    }
}
