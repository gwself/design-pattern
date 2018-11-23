package com.yunus.structural.proxy;

/**
 * 代理类
 *
 * @author lanxum
 */
public class FolderProxy implements IFolder {

    /**
     * 和装饰的最大区别是 被代理类不是传入的是直接创建的 隐藏被代理类的内部实现
     */
    Folder folder;
    User user;

    public FolderProxy(User user) {
        this.user = user;
    }

    public void performOperations() {
        if (user.getUserName().equalsIgnoreCase("bobo") &&
                user.getPassword().equalsIgnoreCase("xyz")) {
            folder = new Folder();
            folder.performOperations();
        } else {
            System.out.println("You don't have access to this folder");
        }
    }

}
