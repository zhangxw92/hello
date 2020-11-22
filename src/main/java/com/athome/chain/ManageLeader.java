package com.athome.chain;

public class ManageLeader extends ApproveProcess {
    public ManageLeader(String name) {
        super(name);
    }

    @Override
    public void approve(Purchase request) {
        if (request.getSum() >= 500 && request.getSum() < 1000) {
            System.out.println(request.getId() + "被" + this.name + "处理");
        } else {
            approveProcess.approve(request);
        }
    }
}
