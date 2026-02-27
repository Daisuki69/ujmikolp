package com.dynatrace.android.agent;

import com.dynatrace.android.agent.conf.DataCollectionLevel;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ACTION_MANUAL' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class EventType {
    private static final /* synthetic */ EventType[] $VALUES;
    public static final EventType ACTION_AUTO;
    public static final EventType ACTION_AUTO_LOADING_APP;
    public static final EventType ACTION_MANUAL;
    public static final EventType APP_START;
    public static final EventType CRASH;
    public static final EventType DISPLAY;
    public static final EventType ERROR_EXCEPTION;
    public static final EventType ERROR_INT;
    public static final EventType EVENT_API;
    public static final EventType EVENT_BIZ;
    public static final EventType IDENTIFY_USER;
    public static final EventType NAMED_EVENT;
    public static final EventType PLACEHOLDER;
    public static final EventType RAGE_TAP;
    public static final EventType REDISPLAY;
    public static final EventType SELF_MONITORING_EVENT;
    public static final EventType VALUE_DOUBLE;
    public static final EventType VALUE_INT64;
    public static final EventType VALUE_STRING;
    public static final EventType VISIT_END;
    public static final EventType WEB_REQUEST;
    private DataCollectionLevel dataCollectionLevel;
    private int protocolId;

    private static /* synthetic */ EventType[] $values() {
        return new EventType[]{ACTION_MANUAL, ACTION_AUTO, ACTION_AUTO_LOADING_APP, NAMED_EVENT, VALUE_STRING, VALUE_INT64, VALUE_DOUBLE, VISIT_END, APP_START, DISPLAY, REDISPLAY, WEB_REQUEST, ERROR_INT, ERROR_EXCEPTION, CRASH, IDENTIFY_USER, SELF_MONITORING_EVENT, RAGE_TAP, EVENT_API, EVENT_BIZ, PLACEHOLDER};
    }

    static {
        DataCollectionLevel dataCollectionLevel = DataCollectionLevel.PERFORMANCE;
        ACTION_MANUAL = new EventType("ACTION_MANUAL", 0, 1, dataCollectionLevel);
        ACTION_AUTO = new EventType("ACTION_AUTO", 1, 6, dataCollectionLevel);
        DataCollectionLevel dataCollectionLevel2 = DataCollectionLevel.OFF;
        ACTION_AUTO_LOADING_APP = new EventType("ACTION_AUTO_LOADING_APP", 2, 6, dataCollectionLevel2);
        DataCollectionLevel dataCollectionLevel3 = DataCollectionLevel.USER_BEHAVIOR;
        NAMED_EVENT = new EventType("NAMED_EVENT", 3, 10, dataCollectionLevel3);
        VALUE_STRING = new EventType("VALUE_STRING", 4, 11, dataCollectionLevel3);
        VALUE_INT64 = new EventType("VALUE_INT64", 5, 12, dataCollectionLevel3);
        VALUE_DOUBLE = new EventType("VALUE_DOUBLE", 6, 13, dataCollectionLevel3);
        VISIT_END = new EventType("VISIT_END", 7, 19, dataCollectionLevel);
        APP_START = new EventType("APP_START", 8, 20, dataCollectionLevel);
        DISPLAY = new EventType("DISPLAY", 9, 21, dataCollectionLevel);
        REDISPLAY = new EventType("REDISPLAY", 10, 22, dataCollectionLevel);
        WEB_REQUEST = new EventType("WEB_REQUEST", 11, 30, dataCollectionLevel);
        ERROR_INT = new EventType("ERROR_INT", 12, 40, dataCollectionLevel);
        ERROR_EXCEPTION = new EventType("ERROR_EXCEPTION", 13, 42, dataCollectionLevel);
        CRASH = new EventType("CRASH", 14, 50, dataCollectionLevel2);
        IDENTIFY_USER = new EventType("IDENTIFY_USER", 15, 60, dataCollectionLevel3);
        SELF_MONITORING_EVENT = new EventType("SELF_MONITORING_EVENT", 16, 90, dataCollectionLevel);
        RAGE_TAP = new EventType("RAGE_TAP", 17, 97, dataCollectionLevel);
        EVENT_API = new EventType("EVENT_API", 18, 98, dataCollectionLevel);
        EVENT_BIZ = new EventType("EVENT_BIZ", 19, 98, dataCollectionLevel2);
        PLACEHOLDER = new EventType("PLACEHOLDER", 20, -1, dataCollectionLevel3);
        $VALUES = $values();
    }

    private EventType(String str, int i, int i4, DataCollectionLevel dataCollectionLevel) {
        this.protocolId = i4;
        this.dataCollectionLevel = dataCollectionLevel;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }

    public DataCollectionLevel getDataCollectionLevel() {
        return this.dataCollectionLevel;
    }

    public int getProtocolId() {
        return this.protocolId;
    }
}
