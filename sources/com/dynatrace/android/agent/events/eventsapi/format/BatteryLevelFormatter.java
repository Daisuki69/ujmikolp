package com.dynatrace.android.agent.events.eventsapi.format;

/* JADX INFO: loaded from: classes2.dex */
public class BatteryLevelFormatter implements Formatter<Integer, Integer> {
    @Override // com.dynatrace.android.agent.events.eventsapi.format.Formatter
    public Integer format(Integer num) {
        if (num.intValue() < 0 || num.intValue() > 100) {
            return null;
        }
        return num;
    }
}
