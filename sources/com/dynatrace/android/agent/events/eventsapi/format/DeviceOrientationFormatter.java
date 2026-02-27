package com.dynatrace.android.agent.events.eventsapi.format;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceOrientationFormatter implements Formatter<Integer, String> {
    @Override // com.dynatrace.android.agent.events.eventsapi.format.Formatter
    public String format(Integer num) {
        return num.intValue() == 1 ? "portrait" : num.intValue() == 2 ? "landscape" : "unsupported";
    }
}
