package com.dynatrace.android.agent.crash;

/* JADX INFO: loaded from: classes2.dex */
public interface CrashListener {
    void notifyCustomCrash(String str, String str2, String str3, String str4);

    void notifyJavaCrash(Thread thread, Throwable th2);
}
