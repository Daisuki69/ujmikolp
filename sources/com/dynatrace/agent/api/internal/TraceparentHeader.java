package com.dynatrace.agent.api.internal;

import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.k;
import zj.n;
import zj.o;

/* JADX INFO: loaded from: classes2.dex */
public final class TraceparentHeader {
    private static final String SUPPORTED_TRACEPARENT_VERSION = "00";
    private final String parentId;
    private final String traceFlags;
    private final String traceId;
    private final String version;
    public static final Companion Companion = new Companion(null);
    private static final String TRACEPARENT_REGEX = "^00-([0-9a-f]{32})-([0-9a-f]{16})-(0[01])$";
    private static final o pattern = new o(TRACEPARENT_REGEX);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TraceparentHeader parse(String traceparent) {
            j.g(traceparent, "traceparent");
            o oVar = TraceparentHeader.pattern;
            String lowerCase = traceparent.toLowerCase(Locale.ROOT);
            j.f(lowerCase, "toLowerCase(...)");
            n nVarD = oVar.d(lowerCase);
            if (nVarD == null) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "The provided traceparent header does not match the format:'00-<trace-id-32-HEXDIG>-<parent-id-16-HEXDIG>-<trace-flags-2-HEXDIG>'");
                return null;
            }
            String str = (String) ((k) nVarD.a()).get(1);
            String str2 = (String) ((k) nVarD.a()).get(2);
            String str3 = (String) ((k) nVarD.a()).get(3);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '0') {
                    for (int i4 = 0; i4 < str2.length(); i4++) {
                        if (str2.charAt(i4) != '0') {
                            return new TraceparentHeader(TraceparentHeader.SUPPORTED_TRACEPARENT_VERSION, str, str2, str3, null);
                        }
                    }
                    Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "Parent ID in traceparent header must not be all zeros");
                    return null;
                }
            }
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "Trace ID in traceparent header must not be all zeros");
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TraceparentHeader(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getTraceFlags() {
        return this.traceFlags;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getVersion() {
        return this.version;
    }

    private TraceparentHeader(String str, String str2, String str3, String str4) {
        this.version = str;
        this.traceId = str2;
        this.parentId = str3;
        this.traceFlags = str4;
    }
}
