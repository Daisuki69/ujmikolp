package io.split.android.client.service.sseclient;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class EventStreamParser {
    public static final String DATA_FIELD = "data";
    public static final String EVENT_FIELD = "event";
    private static final String FIELD_SEPARATOR = ":";
    public static final String ID_FIELD = "data";
    public static final String KEEP_ALIVE_EVENT = "keepalive";
    private static final String KEEP_ALIVE_TOKEN = ":keepalive";

    public boolean isKeepAlive(Map<String, String> map) {
        return KEEP_ALIVE_EVENT.equals(map.get("event"));
    }

    public boolean parseLineAndAppendValue(String str, Map<String, String> map) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (KEEP_ALIVE_TOKEN.equals(strTrim)) {
            map.put("event", KEEP_ALIVE_EVENT);
            return true;
        }
        if (strTrim.isEmpty() && map.size() == 0) {
            return false;
        }
        if (strTrim.isEmpty()) {
            return true;
        }
        int iIndexOf = strTrim.indexOf(":");
        if (iIndexOf == 0) {
            return false;
        }
        if (iIndexOf > -1) {
            map.put(strTrim.substring(0, iIndexOf).trim(), iIndexOf < strTrim.length() - 1 ? strTrim.substring(iIndexOf + 1, strTrim.length()).trim() : "");
        } else {
            map.put(strTrim.trim(), "");
        }
        return false;
    }
}
