package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFe1dSDK extends AFe1iSDK {
    public AFe1dSDK() {
        this(null, null, null);
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final boolean afDebugLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final boolean afRDLog() {
        return false;
    }

    public AFe1dSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Context context) {
        super(str, null, Boolean.FALSE, null, bool, context);
    }
}
