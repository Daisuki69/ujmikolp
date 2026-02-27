package com.dynatrace.android.agent;

/* JADX INFO: loaded from: classes2.dex */
public interface ModifiableUserAction {
    void cancel();

    String getActionName();

    void reportError(String str, int i);

    void reportError(String str, Throwable th2);

    void reportEvent(String str);

    void reportValue(String str, double d10);

    void reportValue(String str, int i);

    void reportValue(String str, long j);

    void reportValue(String str, String str2);

    void setActionName(String str);
}
