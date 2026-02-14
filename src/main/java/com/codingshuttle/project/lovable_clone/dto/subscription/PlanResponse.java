package com.codingshuttle.project.lovable_clone.dto.subscription;

public record PlanResponse(
        Long id,
        String name,
        Integer maxProjects,
        Integer maxTokenPerDay,
        Boolean unlimited,
        String price
) {
}
