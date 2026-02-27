package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhoe extends zzhih implements zzhjt {
    private static final zzhoe zzl;
    private static volatile zzhka zzm;
    private int zza;
    private int zzb;
    private zzhnf zzd;
    private zzhnj zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private zzhip zzg = zzhih.zzbC();
    private String zzh = "";
    private zzhit zzj = zzhih.zzbM();

    static {
        zzhoe zzhoeVar = new zzhoe();
        zzl = zzhoeVar;
        zzhih.zzbu(zzhoe.class, zzhoeVar);
    }

    private zzhoe() {
    }

    public static zzhod zze() {
        return (zzhod) zzl.zzbn();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        byte[] bArr = null;
        switch (zzhigVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzk);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhih.zzbv(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzhob.zza, "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhoe();
            case NEW_BUILDER:
                return new zzhod(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                zzhka zzhkaVar = zzm;
                if (zzhkaVar != null) {
                    return zzhkaVar;
                }
                synchronized (zzhoe.class) {
                    try {
                        zzhicVar = zzm;
                        if (zzhicVar == null) {
                            zzhicVar = new zzhic(zzl);
                            zzm = zzhicVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return zzhicVar;
            default:
                throw null;
        }
    }

    public final /* synthetic */ void zzg(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzi(zzhnf zzhnfVar) {
        zzhnfVar.getClass();
        this.zzd = zzhnfVar;
        this.zza |= 4;
    }

    public final /* synthetic */ void zzj(String str) {
        str.getClass();
        zzhit zzhitVar = this.zzj;
        if (!zzhitVar.zza()) {
            this.zzj = zzhih.zzbN(zzhitVar);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void zzl(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }
}
