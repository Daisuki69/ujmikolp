package com.dynatrace.android.agent;

import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public interface DTXAction {
    void cancel();

    String getRequestTag();

    String getRequestTagHeader();

    boolean isFinished();

    void leaveAction();

    void reportError(String str, int i);

    void reportError(String str, Throwable th2);

    void reportEvent(String str);

    void reportValue(String str, double d10);

    void reportValue(String str, int i);

    void reportValue(String str, long j);

    void reportValue(String str, String str2);

    @Deprecated
    void tagRequest(HttpURLConnection httpURLConnection);
}
