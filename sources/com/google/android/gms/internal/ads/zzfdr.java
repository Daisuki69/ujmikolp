package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfdr {
    public static Bundle zza(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void zzb(Bundle bundle, @Nullable String str, @Nullable String str2, boolean z4) {
        if (!z4 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void zzc(Bundle bundle, @Nullable String str, int i, boolean z4) {
        if (z4) {
            bundle.putInt(str, i);
        }
    }

    public static void zzd(Bundle bundle, @Nullable String str, boolean z4, boolean z5) {
        if (z5) {
            bundle.putBoolean(str, z4);
        }
    }

    public static void zze(Bundle bundle, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void zzf(Bundle bundle, @Nullable String str, @Nullable Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void zzg(Bundle bundle, @Nullable String str, @Nullable List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void zzh(Bundle bundle, @Nullable String str, @Nullable Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }
}
