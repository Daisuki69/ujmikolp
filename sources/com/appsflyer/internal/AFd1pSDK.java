package com.appsflyer.internal;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1pSDK extends TimerTask {
    private final Thread AFKeystoreWrapper;

    public AFd1pSDK(Thread thread) {
        this.AFKeystoreWrapper = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.AFKeystoreWrapper.interrupt();
    }
}
