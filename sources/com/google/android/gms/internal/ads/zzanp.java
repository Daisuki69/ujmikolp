package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzanp {
    public final int zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzanp(int i, @Nullable String str, int i4, @Nullable List list, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i4;
        this.zzd = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i = this.zzc;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }
}
