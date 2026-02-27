package com.dynatrace.android.agent.util;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class SdkVersionProviderImpl implements SdkVersionProvider {
    @Override // com.dynatrace.android.agent.util.SdkVersionProvider
    public int sdkVersion() {
        return Build.VERSION.SDK_INT;
    }
}
