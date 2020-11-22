package com.athome.chain;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        Purchase purchase = new Purchase(1, 100);


        ApproveProcess groupLeader = new GroupLeader("组长");
        ApproveProcess manageLeader = new ManageLeader("经理");
        ApproveProcess chairMainLeader = new ChairMainLeader("董事长");

        groupLeader.setApproveProcess(manageLeader);
        manageLeader.setApproveProcess(chairMainLeader);
        chairMainLeader.setApproveProcess(groupLeader);

        chairMainLeader.approve(purchase);
    }

}
