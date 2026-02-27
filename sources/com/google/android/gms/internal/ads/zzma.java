package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzma extends IllegalStateException {
    public final int zza;

    public zzma(int i) {
        super(i != 0 ? "Player stuck buffering with no progress" : "Player stuck buffering and not loading");
        this.zza = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzma.class == obj.getClass() && this.zza == ((zzma) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }
}
