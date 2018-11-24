package com.yunus.structural.composite.complex;

import java.util.List;

//Component
public interface IEmployee {
    String getName();

    void setName(String name);

    int getEmployeeId();

    void setEmployeeId(int employeeId);

    List<Subscription> getSubscriptions();

    void setSubscriptions(List<Subscription> subscriptions);

    double getCost();

    int getSubscriptionCount(SubscriptionType type);
}
