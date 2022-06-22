package com.biocipher.group.horizon.dto;

public class EfficiencyDto {
    private Integer id;
    private long customerId;
    private String route; //smpp /WEB
    private int eff;
    private String effSts; //SUBMITED
    private boolean active;
    private String scope; //Universal
    private String state; //Submission
    private long fromDt;
    private long toDt;
    private String fromDsply;
    private String toDsply;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getEff() {
        return eff;
    }

    public void setEff(int eff) {
        this.eff = eff;
    }

    public String getEffSts() {
        return effSts;
    }

    public void setEffSts(String effSts) {
        this.effSts = effSts;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getFromDt() {
        return fromDt;
    }

    public void setFromDt(long fromDt) {
        this.fromDt = fromDt;
    }

    public long getToDt() {
        return toDt;
    }

    public void setToDt(long toDt) {
        this.toDt = toDt;
    }

    public String getFromDsply() {
        return fromDsply;
    }

    public void setFromDsply(String fromDsply) {
        this.fromDsply = fromDsply;
    }

    public String getToDsply() {
        return toDsply;
    }

    public void setToDsply(String toDsply) {
        this.toDsply = toDsply;
    }
}
