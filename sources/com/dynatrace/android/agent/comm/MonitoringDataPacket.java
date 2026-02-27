package com.dynatrace.android.agent.comm;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MonitoringDataPacket {
    public String basicData;
    public List<String> events;

    public MonitoringDataPacket(String str, List<String> list) {
        this.basicData = str;
        this.events = list;
    }

    public String generatePayload() {
        StringBuilder sb2 = new StringBuilder(this.basicData);
        for (String str : this.events) {
            sb2.append("&");
            sb2.append(str);
        }
        return sb2.toString();
    }
}
