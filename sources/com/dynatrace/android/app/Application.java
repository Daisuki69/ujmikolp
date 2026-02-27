package com.dynatrace.android.app;

import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class Application extends android.app.Application {
    @Override // android.app.Application
    public /* synthetic */ void onCreate() {
        Callback.onCreate(this);
        super.onCreate();
    }
}
