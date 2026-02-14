package com.codingshuttle.project.lovable_clone.dto.subscription;

import java.time.Instant;

public record SubscriptionResponse(
      PlanResponse plan,
      String name,
      Instant periodEnd,
      Long tokenUsedThisCycle
) {
}
