package com.codingshuttle.project.lovable_clone.service;

import com.codingshuttle.project.lovable_clone.dto.subscription.PlanLimitResponse;
import com.codingshuttle.project.lovable_clone.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitOfUser(Long userId);
}
