package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaa extends zzeh implements zzfn {
    private static final zzaa zzb;
    private int zzd;
    private zzad zze;
    private boolean zzf;

    static {
        zzaa zzaaVar = new zzaa();
        zzb = zzaaVar;
        zzeh.zzV(zzaa.class, zzaaVar);
    }

    private zzaa() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new zzaa();
        }
        zzy zzyVar = null;
        if (i4 == 4) {
            return new zzz(zzyVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
