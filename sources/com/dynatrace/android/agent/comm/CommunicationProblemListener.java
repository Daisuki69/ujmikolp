package com.dynatrace.android.agent.comm;

/* JADX INFO: loaded from: classes2.dex */
public interface CommunicationProblemListener {
    void onError(Throwable th2);

    void onFailure(int i, String str, String str2);
}
