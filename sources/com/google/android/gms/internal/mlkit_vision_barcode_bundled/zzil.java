package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class zzil extends zzeh implements zzfn {
    private static final zzil zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzil zzilVar = new zzil();
        zzb = zzilVar;
        zzeh.zzV(zzil.class, zzilVar);
    }

    private zzil() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new zzil();
        }
        zzhi zzhiVar = null;
        if (i4 == 4) {
            return new zzik(zzhiVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
