package com.jjugrants.domain;

public class Grants {
    private int id;
    private int sequence;
    private int workId;
    private int adminId;
    private int filedId;

    @Override
    public String toString() {
        return "grants{" +
                "id=" + id +
                ", sequence=" + sequence +
                ", workId=" + workId +
                ", adminId=" + adminId +
                ", filedId=" + filedId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getsequence() {
        return sequence;
    }

    public void setsequence(int sequence) {
        this.sequence = sequence;
    }

    public int getworkId() {
        return workId;
    }

    public void setworkId(int workId) {
        this.workId = workId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getFiledId() {
        return filedId;
    }

    public void setFiledId(int filedId) {
        this.filedId = filedId;
    }
}
