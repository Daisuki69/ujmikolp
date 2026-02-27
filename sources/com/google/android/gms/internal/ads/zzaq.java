package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class zzaq {
    public final int zza;
    public final int zzb;

    public zzaq(int i, int i4) {
        this.zza = i;
        this.zzb = i4;
    }

    public final int zza() {
        int i = this.zzb;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
