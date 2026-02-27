package com.dynatrace.android.agent.events.eventsapi;

import We.s;
import androidx.media3.datasource.cache.c;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public final class EventPayloadUtility {
    private static final String KEY_URL_ENCODED = Utility.urlEncode("\"dt.send_timestamp\":");
    private static final String SEND_NOW_MACRO = "%%SEND_NOW%%";

    private EventPayloadUtility() {
    }

    public static String replaceMacroWithTime(String str, long j) {
        StringBuilder sb2 = new StringBuilder();
        String str2 = KEY_URL_ENCODED;
        return str.replaceAll(s.p(sb2, str2, SEND_NOW_MACRO), str2 + j);
    }

    public static String replacePlaceholderWithMacro(String str) {
        StringBuilder sb2 = new StringBuilder();
        String str2 = KEY_URL_ENCODED;
        return str.replaceFirst(c.j(EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER, str2, sb2), str2 + SEND_NOW_MACRO);
    }
}
