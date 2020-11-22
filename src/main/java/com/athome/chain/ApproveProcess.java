package com.athome.chain;

public abstract class ApproveProcess {

    //下一级审批人
    ApproveProcess approveProcess;
    //审批人的姓名
    String name;

    public void setApproveProcess(ApproveProcess approveProcess) {
        this.approveProcess = approveProcess;
    }

    public ApproveProcess(String name) {
        this.name = name;
    }

    //处理申请具体做的事情
    public abstract void approve(Purchase request);

}
