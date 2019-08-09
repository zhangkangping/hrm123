package com.company.oasis.dao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Emp {
    private Integer empno;

    private String ename;

    private String job;

    private Integer mgr;

    private BigDecimal sal;

    private BigDecimal comm;

    private Date hiredate;

    private Integer deptno;

    public Emp(String ename, String job, Integer mgr, BigDecimal sal, BigDecimal comm, Date hiredate, Integer deptno) {
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.sal = sal;
        this.comm = comm;
        this.hiredate = hiredate;
        this.deptno = deptno;
    }

    public Emp(Integer empno, String ename, String job, Integer mgr, BigDecimal sal, BigDecimal comm, Date hiredate, Integer deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.sal = sal;
        this.comm = comm;
        this.hiredate = hiredate;
        this.deptno = deptno;
    }

    public Emp() {
        super();
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", sal=" + sal +
                ", comm=" + comm +
                ", hiredate=" + hiredate +
                ", deptno=" + deptno +
                '}';
    }
}