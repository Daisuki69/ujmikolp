package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxy extends zzuw implements zzvx {
    private static final zzxy zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private int zzh = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
    private int zzi;
    private float zzj;

    static {
        zzxy zzxyVar = new zzxy();
        zzb = zzxyVar;
        zzuw.zzF(zzxy.class, zzxyVar);
    }

    private zzxy() {
    }

    public final float zzb() {
        return this.zze;
    }

    public final float zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzuw.zzC(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ခ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzxv.zza, "zzi", zzxx.zza, "zzj"});
        }
        if (i4 == 3) {
            return new zzxy();
        }
        zzxj zzxjVar = null;
        if (i4 == 4) {
            return new zzxu(zzxjVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzg() {
        int iZza = zzxw.zza(this.zzh);
        if (iZza == 0) {
            return 15001;
        }
        return iZza;
    }
}
