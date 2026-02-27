package com.dynatrace.android.agent.events.eventsapi.format;

/* JADX INFO: loaded from: classes2.dex */
public class ToStringFormatter<T> implements Formatter<T, String> {
    @Override // com.dynatrace.android.agent.events.eventsapi.format.Formatter
    public String format(T t5) {
        if (t5 == null) {
            return null;
        }
        return String.valueOf(t5);
    }
}
