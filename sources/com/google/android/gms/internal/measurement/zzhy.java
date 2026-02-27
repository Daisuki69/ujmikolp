package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhy extends zzmf implements zznn {
    private static final zzhy zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private zzhc zzf;

    static {
        zzhy zzhyVar = new zzhy();
        zzg = zzhyVar;
        zzmf.zzcp(zzhy.class, zzhyVar);
    }

    private zzhy() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzmf.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new zzhy();
        }
        byte[] bArr = null;
        if (i4 == 4) {
            return new zzhx(bArr);
        }
        if (i4 == 5) {
            return zzg;
        }
        throw null;
    }
}
