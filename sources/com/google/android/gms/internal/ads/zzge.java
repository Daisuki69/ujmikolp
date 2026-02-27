package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzge {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;

    @Nullable
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzak.zzb("media3.datasource");
    }

    public /* synthetic */ zzge(Uri uri, long j, int i, byte[] bArr, Map map, long j6, long j7, String str, int i4, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j6, j7, null, i4, null);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        long j = this.zze;
        int length2 = String.valueOf(j).length();
        long j6 = this.zzf;
        int length3 = String.valueOf(j6).length();
        int i = this.zzg;
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i).length() + 1);
        androidx.camera.core.impl.a.C(sb2, "DataSpec[GET ", string, ", ");
        sb2.append(j);
        androidx.media3.datasource.cache.c.z(sb2, ", ", j6, ", null, ");
        return We.s.o(sb2, "]", i);
    }

    public final boolean zza(int i) {
        return (this.zzg & i) == i;
    }

    public final zzgd zzb() {
        return new zzgd(this, null);
    }

    private zzge(Uri uri, long j, int i, @Nullable byte[] bArr, Map map, long j6, long j7, @Nullable String str, int i4, @Nullable Object obj) {
        boolean z4 = false;
        boolean z5 = j6 >= 0;
        zzghc.zza(z5);
        zzghc.zza(z5);
        if (j7 > 0) {
            z4 = true;
        } else if (j7 == -1) {
            j7 = -1;
            z4 = true;
        }
        zzghc.zza(z4);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j6;
        this.zzf = j7;
        this.zzg = i4;
    }

    @Deprecated
    public zzge(Uri uri, long j, long j6, @Nullable String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j6, null, 0, null);
    }
}
