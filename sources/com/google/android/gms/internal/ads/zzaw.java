package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaw {
    private final zzr zza;

    static {
        new zzav().zze();
        String str = zzeo.zza;
        Integer.toString(0, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaw) {
            return this.zza.equals(((zzaw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ zzr zza() {
        return this.zza;
    }
}
