package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhz extends zzat {
    public final int zzc;

    @Nullable
    public final String zzd;
    public final int zze;

    @Nullable
    public final zzu zzf;
    public final int zzg;

    @Nullable
    public final zzup zzh;
    final boolean zzi;

    private zzhz(int i, Throwable th2, int i4) {
        this(i, th2, null, i4, null, -1, null, 4, null, false);
    }

    public static zzhz zza(IOException iOException, int i) {
        return new zzhz(0, iOException, i);
    }

    public static zzhz zzb(Throwable th2, String str, int i, @Nullable zzu zzuVar, int i4, @Nullable zzup zzupVar, boolean z4, int i6) {
        if (zzuVar == null) {
            i4 = 4;
        }
        return new zzhz(1, th2, null, i6, str, i, zzuVar, i4, zzupVar, z4);
    }

    public static zzhz zzc(RuntimeException runtimeException, int i) {
        return new zzhz(2, runtimeException, i);
    }

    @CheckResult
    public final zzhz zzd(@Nullable zzup zzupVar) {
        String message = getMessage();
        String str = zzeo.zza;
        return new zzhz(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzupVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzhz(int i, @Nullable Throwable th2, @Nullable String str, int i4, @Nullable String str2, int i6, @Nullable zzu zzuVar, int i10, @Nullable zzup zzupVar, boolean z4) {
        String str3;
        int i11;
        String strQ;
        String str4;
        if (i == 0) {
            str3 = str2;
            i11 = i6;
            strQ = "Source error";
        } else if (i != 1) {
            strQ = "Unexpected runtime error";
            str3 = str2;
            i11 = i6;
        } else {
            String strValueOf = String.valueOf(zzuVar);
            String str5 = zzeo.zza;
            if (i10 == 0) {
                str4 = "NO";
            } else if (i10 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i10 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i10 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb2 = new StringBuilder(str4.length() + strValueOf.length() + androidx.media3.datasource.cache.c.b(String.valueOf(str2).length() + 14, 9, String.valueOf(i6)) + 19);
            str3 = str2;
            sb2.append(str3);
            sb2.append(" error, index=");
            i11 = i6;
            sb2.append(i11);
            sb2.append(", format=");
            strQ = We.s.q(sb2, strValueOf, ", format_supported=", str4);
        }
        this(TextUtils.isEmpty(null) ? strQ : strQ.concat(": null"), th2, i4, i, str3, i11, zzuVar, i10, zzupVar, SystemClock.elapsedRealtime(), z4);
    }

    private zzhz(String str, @Nullable Throwable th2, int i, int i4, @Nullable String str2, int i6, @Nullable zzu zzuVar, int i10, @Nullable zzup zzupVar, long j, boolean z4) {
        boolean z5;
        super(str, th2, i, Bundle.EMPTY, j);
        if (!z4) {
            z5 = true;
        } else if (i4 == 1) {
            i4 = 1;
            z5 = true;
        } else {
            z5 = false;
        }
        zzghc.zza(z5);
        zzghc.zza(th2 != null);
        this.zzc = i4;
        this.zzd = str2;
        this.zze = i6;
        this.zzf = zzuVar;
        this.zzg = i10;
        this.zzh = zzupVar;
        this.zzi = z4;
    }
}
