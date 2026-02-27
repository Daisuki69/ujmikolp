package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzasq extends zzhih implements zzhjt {
    private static final zzasq zzA;
    private static volatile zzhka zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzasq zzasqVar = new zzasq();
        zzA = zzasqVar;
        zzhih.zzbu(zzasq.class, zzasqVar);
    }

    private zzasq() {
    }

    public static zzasp zza() {
        return (zzasp) zzA.zzbn();
    }

    public final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void zzd(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzhin zzhinVar = zzatb.zza;
            return zzhih.zzbv(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhinVar, "zzi", "zzj", "zzk", "zzl", zzhinVar, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (iOrdinal == 3) {
            return new zzasq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzasp(bArr);
        }
        if (iOrdinal == 5) {
            return zzA;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzB;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzasq.class) {
            try {
                zzhicVar = zzB;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzA);
                    zzB = zzhicVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhicVar;
    }

    public final /* synthetic */ void zze(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void zzg() {
        this.zza &= -9;
        this.zze = -1L;
    }

    public final /* synthetic */ void zzh(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void zzi(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final /* synthetic */ void zzj(long j) {
        this.zza |= 128;
        this.zzi = j;
    }

    public final /* synthetic */ void zzk(long j) {
        this.zza |= 256;
        this.zzj = j;
    }

    public final /* synthetic */ void zzl(long j) {
        this.zza |= 512;
        this.zzk = j;
    }

    public final /* synthetic */ void zzm(long j) {
        this.zza |= 2048;
        this.zzm = j;
    }

    public final /* synthetic */ void zzn(long j) {
        this.zza |= 4096;
        this.zzn = j;
    }

    public final /* synthetic */ void zzo(long j) {
        this.zza |= 8192;
        this.zzo = j;
    }

    public final /* synthetic */ void zzp(long j) {
        this.zza |= 16384;
        this.zzp = j;
    }

    public final /* synthetic */ void zzq(long j) {
        this.zza |= 32768;
        this.zzu = j;
    }

    public final /* synthetic */ void zzr(long j) {
        this.zza |= 65536;
        this.zzv = j;
    }

    public final /* synthetic */ void zzs(long j) {
        this.zza |= 131072;
        this.zzw = j;
    }

    public final /* synthetic */ void zzt(long j) {
        this.zza |= 262144;
        this.zzx = j;
    }

    public final /* synthetic */ void zzv(int i) {
        this.zzh = i - 1;
        this.zza |= 64;
    }

    public final /* synthetic */ void zzw(int i) {
        this.zzl = i - 1;
        this.zza |= 1024;
    }
}
