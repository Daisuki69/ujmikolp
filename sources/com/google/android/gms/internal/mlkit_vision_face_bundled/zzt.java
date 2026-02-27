package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzt extends zzuw implements zzvx {
    private static final zzt zzb;
    private int zzd;
    private int zze;
    private zzvb zzf = zzuw.zzA();

    static {
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzuw.zzF(zzt.class, zztVar);
    }

    private zzt() {
    }

    public static zzt zzb() {
        return zzb;
    }

    public final List zzc() {
        return this.zzf;
    }

    public final int zzd() {
        int iZza = zzs.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzuw.zzC(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzd", "zze", zzr.zza, "zzf", zzq.class});
        }
        if (i4 == 3) {
            return new zzt();
        }
        zzj zzjVar = null;
        if (i4 == 4) {
            return new zzo(zzjVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
