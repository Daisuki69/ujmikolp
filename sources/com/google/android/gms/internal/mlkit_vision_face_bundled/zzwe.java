package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzwe {
    public static final /* synthetic */ int zza = 0;
    private static final zzwe zzb = new zzwe();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzwi zzc = new zzvo();

    private zzwe() {
    }

    public static zzwe zza() {
        return zzb;
    }

    public final zzwh zzb(Class cls) {
        zzvc.zzc(cls, "messageType");
        zzwh zzwhVar = (zzwh) this.zzd.get(cls);
        if (zzwhVar != null) {
            return zzwhVar;
        }
        zzwh zzwhVarZza = this.zzc.zza(cls);
        zzvc.zzc(cls, "messageType");
        zzwh zzwhVar2 = (zzwh) this.zzd.putIfAbsent(cls, zzwhVarZza);
        return zzwhVar2 == null ? zzwhVarZza : zzwhVar2;
    }
}
