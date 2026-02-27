package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class zzh extends zzuw implements zzvx {
    private static final zzh zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private String zzk = "";

    static {
        zzh zzhVar = new zzh();
        zzb = zzhVar;
        zzuw.zzF(zzh.class, zzhVar);
    }

    private zzh() {
    }

    public static zzg zza() {
        return (zzg) zzb.zzv();
    }

    public static /* synthetic */ void zzc(zzh zzhVar, int i) {
        zzhVar.zzd |= 1;
        zzhVar.zze = i;
    }

    public static /* synthetic */ void zzd(zzh zzhVar, long j) {
        zzhVar.zzd |= 32;
        zzhVar.zzj = j;
    }

    public static /* synthetic */ void zze(zzh zzhVar, int i) {
        zzhVar.zzd |= 2;
        zzhVar.zzf = i;
    }

    public static /* synthetic */ void zzg(zzh zzhVar, int i) {
        zzhVar.zzg = i - 1;
        zzhVar.zzd |= 4;
    }

    public static /* synthetic */ void zzh(zzh zzhVar, int i) {
        zzhVar.zzh = i - 1;
        zzhVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzuw.zzC(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", zze.zza, "zzh", zzi.zza, "zzi", "zzj", "zzk"});
        }
        if (i4 == 3) {
            return new zzh();
        }
        zzf zzfVar = null;
        if (i4 == 4) {
            return new zzg(zzfVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
