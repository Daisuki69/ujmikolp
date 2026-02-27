package com.google.android.gms.internal.ads;

import android.os.Build;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzr {
    private final SparseBooleanArray zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzr)) {
            return false;
        }
        zzr zzrVar = (zzr) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return this.zza.equals(zzrVar.zza);
        }
        SparseBooleanArray sparseBooleanArray = this.zza;
        if (sparseBooleanArray.size() != zzrVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            if (zzc(i) != zzrVar.zzc(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.zza.hashCode();
        }
        SparseBooleanArray sparseBooleanArray = this.zza;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            size = (size * 31) + zzc(i);
        }
        return size;
    }

    public final boolean zza(int i) {
        return this.zza.get(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzghc.zzm(i, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i);
    }
}
