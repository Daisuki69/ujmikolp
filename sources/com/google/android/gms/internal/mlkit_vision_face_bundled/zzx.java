package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class zzx extends zzuw implements zzvx {
    private static final zzx zzb;
    private int zzd;
    private boolean zzi;
    private boolean zzj;
    private boolean zzm;
    private zzz zzn;
    private zzl zzo;
    private zzad zzp;
    private float zze = 0.1f;
    private int zzf = 1;
    private int zzg = 1;
    private int zzh = 1;
    private float zzk = 45.0f;
    private float zzl = 0.5f;

    static {
        zzx zzxVar = new zzx();
        zzb = zzxVar;
        zzuw.zzF(zzx.class, zzxVar);
    }

    private zzx() {
    }

    public static zzw zza() {
        return (zzw) zzb.zzv();
    }

    public static /* synthetic */ void zzc(zzx zzxVar, float f) {
        zzxVar.zzd |= 1;
        zzxVar.zze = f;
    }

    public static /* synthetic */ void zzd(zzx zzxVar, boolean z4) {
        zzxVar.zzd |= 32;
        zzxVar.zzj = z4;
    }

    public static /* synthetic */ void zze(zzx zzxVar, boolean z4) {
        zzxVar.zzd |= 256;
        zzxVar.zzm = true;
    }

    public static /* synthetic */ void zzg(zzx zzxVar, zzz zzzVar) {
        zzzVar.getClass();
        zzxVar.zzn = zzzVar;
        zzxVar.zzd |= 512;
    }

    public static /* synthetic */ void zzh(zzx zzxVar, zzl zzlVar) {
        zzlVar.getClass();
        zzxVar.zzo = zzlVar;
        zzxVar.zzd |= 1024;
    }

    public static /* synthetic */ void zzi(zzx zzxVar, zzad zzadVar) {
        zzadVar.getClass();
        zzxVar.zzp = zzadVar;
        zzxVar.zzd |= 2048;
    }

    public static /* synthetic */ void zzj(zzx zzxVar, boolean z4) {
        zzxVar.zzd |= 16;
        zzxVar.zzi = z4;
    }

    public static /* synthetic */ void zzm(zzx zzxVar, int i) {
        zzxVar.zzf = i - 1;
        zzxVar.zzd |= 2;
    }

    public static /* synthetic */ void zzn(zzx zzxVar, int i) {
        zzxVar.zzg = i - 1;
        zzxVar.zzd |= 4;
    }

    public static /* synthetic */ void zzo(zzx zzxVar, int i) {
        zzxVar.zzh = i - 1;
        zzxVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzuw.zzC(zzb, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ခ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"zzd", "zze", "zzf", zzaa.zza, "zzg", zzm.zza, "zzh", zzae.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i4 == 3) {
            return new zzx();
        }
        zzj zzjVar = null;
        if (i4 == 4) {
            return new zzw(zzjVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzk() {
        int iZza = zzn.zza(this.zzg);
        if (iZza == 0) {
            return 2;
        }
        return iZza;
    }

    public final int zzl() {
        int iZza = zzab.zza(this.zzf);
        if (iZza == 0) {
            return 2;
        }
        return iZza;
    }
}
