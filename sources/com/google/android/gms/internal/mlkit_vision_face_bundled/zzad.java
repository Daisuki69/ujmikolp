package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class zzad extends zzuw implements zzvx {
    private static final zzad zzb;
    private int zzd;
    private zzag zze;
    private zzag zzf;
    private zzag zzg;
    private zzag zzh;

    static {
        zzad zzadVar = new zzad();
        zzb = zzadVar;
        zzuw.zzF(zzad.class, zzadVar);
    }

    private zzad() {
    }

    public static zzac zza() {
        return (zzac) zzb.zzv();
    }

    public static /* synthetic */ void zzc(zzad zzadVar, zzag zzagVar) {
        zzagVar.getClass();
        zzadVar.zze = zzagVar;
        zzadVar.zzd |= 1;
    }

    public static /* synthetic */ void zzd(zzad zzadVar, zzag zzagVar) {
        zzagVar.getClass();
        zzadVar.zzf = zzagVar;
        zzadVar.zzd |= 2;
    }

    public static /* synthetic */ void zze(zzad zzadVar, zzag zzagVar) {
        zzagVar.getClass();
        zzadVar.zzg = zzagVar;
        zzadVar.zzd |= 4;
    }

    public static /* synthetic */ void zzg(zzad zzadVar, zzag zzagVar) {
        zzagVar.getClass();
        zzadVar.zzh = zzagVar;
        zzadVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzuw.zzC(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new zzad();
        }
        zzj zzjVar = null;
        if (i4 == 4) {
            return new zzac(zzjVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
