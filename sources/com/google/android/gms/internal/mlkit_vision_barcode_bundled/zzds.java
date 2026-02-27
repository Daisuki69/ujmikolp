package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzds {
    static final zzds zza = new zzds(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private final Map zzd;

    public zzds() {
        this.zzd = new HashMap();
    }

    public static zzds zza() {
        int i = zzfu.zza;
        return zza;
    }

    public final zzef zzb(zzfm zzfmVar, int i) {
        return (zzef) this.zzd.get(new zzdr(zzfmVar, i));
    }

    public zzds(boolean z4) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
