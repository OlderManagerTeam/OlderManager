package com.sds.em.po;

public class Branch {
    private Integer branchid;

    private String branchname;

    private String branchpostcode;

    private Integer branchmanagerid;

    private String branchadress;

    private Float branchkpi;

    public Integer getBranchid() {
        return branchid;
    }

    public void setBranchid(Integer branchid) {
        this.branchid = branchid;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname == null ? null : branchname.trim();
    }

    public String getBranchpostcode() {
        return branchpostcode;
    }

    public void setBranchpostcode(String branchpostcode) {
        this.branchpostcode = branchpostcode == null ? null : branchpostcode.trim();
    }

    public Integer getBranchmanagerid() {
        return branchmanagerid;
    }

    public void setBranchmanagerid(Integer branchmanagerid) {
        this.branchmanagerid = branchmanagerid;
    }

    public String getBranchadress() {
        return branchadress;
    }

    public void setBranchadress(String branchadress) {
        this.branchadress = branchadress == null ? null : branchadress.trim();
    }

    public Float getBranchkpi() {
        return branchkpi;
    }

    public void setBranchkpi(Float branchkpi) {
        this.branchkpi = branchkpi;
    }
}