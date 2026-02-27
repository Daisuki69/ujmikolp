package com.dynatrace.android.agent.events.eventsapi;

/* JADX INFO: loaded from: classes2.dex */
public class NonEmptyStringOverridingStrategy implements OverridingStrategy {
    @Override // com.dynatrace.android.agent.events.eventsapi.OverridingStrategy
    public boolean isOverridableBy(Object obj) {
        if (obj instanceof String) {
            return !((String) obj).isEmpty();
        }
        return false;
    }
}
