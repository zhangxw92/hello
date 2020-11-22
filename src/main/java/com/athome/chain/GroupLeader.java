package com.athome.chain;

public class GroupLeader extends ApproveProcess {


    public GroupLeader(String name) {
        super(name);
    }

    @Override
    public void approve(Purchase request) {
        if (request.getSum() < 500) {
            System.out.println(request.getId() + "被" + this.name + "处理");
        } else {
            approveProcess.approve(request);
        }

    }
}
