package com.google.android.gms.internal.consent_sdk;

import L1.i;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i, String str) {
        super(str);
        this.zza = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public final i zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new i(this.zza, super.getMessage());
    }

    public zzg(int i, String str, Throwable th2) {
        super(str, th2);
        this.zza = i;
    }
}
