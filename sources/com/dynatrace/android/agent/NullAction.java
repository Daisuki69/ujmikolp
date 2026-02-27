package com.dynatrace.android.agent;

import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
final class NullAction implements DTXAction {
    static final DTXAction INSTANCE = new NullAction();

    private NullAction() {
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void cancel() {
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public String getRequestTag() {
        return "";
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public String getRequestTagHeader() {
        return Dynatrace.getRequestTagHeader();
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public boolean isFinished() {
        return true;
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void leaveAction() {
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void reportError(String str, int i) {
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void reportEvent(String str) {
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void reportValue(String str, double d10) {
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void tagRequest(HttpURLConnection httpURLConnection) {
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void reportError(String str, Throwable th2) {
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void reportValue(String str, int i) {
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void reportValue(String str, long j) {
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void reportValue(String str, String str2) {
    }
}
