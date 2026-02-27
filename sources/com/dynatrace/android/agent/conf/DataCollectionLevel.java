package com.dynatrace.android.agent.conf;

/* JADX INFO: loaded from: classes2.dex */
public enum DataCollectionLevel {
    OFF(0),
    PERFORMANCE(1),
    USER_BEHAVIOR(2);

    private final int javaScriptValue;

    DataCollectionLevel(int i) {
        this.javaScriptValue = i;
    }

    public static DataCollectionLevel castJavaScriptValue(int i) {
        DataCollectionLevel dataCollectionLevel = OFF;
        if (i == dataCollectionLevel.javaScriptValue) {
            return dataCollectionLevel;
        }
        DataCollectionLevel dataCollectionLevel2 = PERFORMANCE;
        return i == dataCollectionLevel2.javaScriptValue ? dataCollectionLevel2 : USER_BEHAVIOR;
    }

    public int getJavaScriptValue() {
        return this.javaScriptValue;
    }
}
