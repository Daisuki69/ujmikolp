package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class zzic extends zzeh implements zzfn {
    private static final zzic zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zzic zzicVar = new zzic();
        zzb = zzicVar;
        zzeh.zzV(zzic.class, zzicVar);
    }

    private zzic() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzid.zza, "zzf"});
        }
        if (i4 == 3) {
            return new zzic();
        }
        zzhi zzhiVar = null;
        if (i4 == 4) {
            return new zzib(zzhiVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
