package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzxn {
    public static zzxn zzg(@NonNull Iterable iterable, int i, int i4, float f) {
        Iterator it = iterable.iterator();
        int iMax = 0;
        int iMin = i;
        int iMin2 = i4;
        int iMax2 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.x);
            iMax2 = Math.max(iMax2, point.y);
        }
        float f3 = i;
        float f7 = i4;
        return new zzxg((iMin + 0.0f) / f3, (iMin2 + 0.0f) / f7, (iMax + 0.0f) / f3, (iMax2 + 0.0f) / f7, 0.0f);
    }

    public abstract float zza();

    public abstract float zzb();

    public abstract float zzc();

    public abstract float zzd();

    public abstract float zze();

    public final float zzf() {
        if (!zzh()) {
            return 0.0f;
        }
        return (zzd() - zze()) * (zzb() - zzc());
    }

    public final boolean zzh() {
        return zzc() >= 0.0f && zzc() < zzb() && zzb() <= 1.0f && zze() >= 0.0f && zze() < zzd() && zzd() <= 1.0f;
    }
}
