package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzuh {
    static final zzuh zza = new zzuh(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private final Map zzd;

    public zzuh() {
        this.zzd = new HashMap();
    }

    public static zzuh zza() {
        int i = zzwe.zza;
        return new zzuh();
    }

    public final zzuu zzb(zzvw zzvwVar, int i) {
        return (zzuu) this.zzd.get(new zzug(zzvwVar, i));
    }

    public final void zzc(zzuu zzuuVar) {
        this.zzd.put(new zzug(zzuuVar.zza, 202056002), zzuuVar);
    }

    public zzuh(boolean z4) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
