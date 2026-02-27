package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbc {
    public static int zza(int i) {
        boolean z4;
        if (i == 0 || i == 1) {
            z4 = true;
        } else if (i == 2) {
            i = 2;
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkArgument(z4, "granularity %d must be a Granularity.GRANULARITY_* constants", Integer.valueOf(i));
        return i;
    }

    public static String zzb(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
