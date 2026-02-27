package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcqu implements zzcqv {
    private final Map zza;

    public zzcqu(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    @Nullable
    public final zzedz zza(int i, String str) {
        return (zzedz) this.zza.get(str);
    }
}
