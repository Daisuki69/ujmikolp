package com.dynatrace.android.agent.mixed;

import We.s;
import com.dynatrace.agent.util.HexGenerator;
import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes2.dex */
public class WebRequestTraceContext {
    private final String traceId = HexGenerator.generateRandomHex(16);
    private final String spanId = HexGenerator.generateRandomHex(8);

    public String getSpanId() {
        return this.spanId;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String getTraceparentId() {
        StringBuilder sb2 = new StringBuilder("00-");
        sb2.append(this.traceId);
        sb2.append(Global.HYPHEN);
        return s.p(sb2, this.spanId, "-01");
    }
}
