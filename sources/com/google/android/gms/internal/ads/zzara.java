package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzara extends zzhih implements zzhjt {
    private static final zzara zzn;
    private static volatile zzhka zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private zzhit zzb = zzhih.zzbM();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzara zzaraVar = new zzara();
        zzn = zzaraVar;
        zzhih.zzbu(zzara.class, zzaraVar);
    }

    private zzara() {
    }

    public static zzaqz zza() {
        return (zzaqz) zzn.zzbn();
    }

    public final /* synthetic */ void zzb(zzars zzarsVar) {
        zzarsVar.getClass();
        zzhit zzhitVar = this.zzb;
        if (!zzhitVar.zza()) {
            this.zzb = zzhih.zzbN(zzhitVar);
        }
        this.zzb.add(zzarsVar);
    }

    public final /* synthetic */ void zzc() {
        this.zzb = zzhih.zzbM();
    }

    public final /* synthetic */ void zzd(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", zzars.class, "zzc", "zzd", "zze", "zzf", "zzg", zzarq.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzara();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaqz(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzo;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzara.class) {
            try {
                zzhicVar = zzo;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzn);
                    zzo = zzhicVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhicVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void zzj(long j) {
        this.zza |= 64;
        this.zzi = j;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void zzm(long j) {
        this.zza |= 512;
        this.zzl = j;
    }

    public final /* synthetic */ void zzn(long j) {
        this.zza |= 1024;
        this.zzm = j;
    }

    public final /* synthetic */ void zzp(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }
}
