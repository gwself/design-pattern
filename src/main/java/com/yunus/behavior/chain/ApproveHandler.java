package com.yunus.behavior.chain;

// Handler
public interface ApproveHandler {

    void setNextHandler(ApproveHandler nextHandler);

    void approve(Leave leave);

}
