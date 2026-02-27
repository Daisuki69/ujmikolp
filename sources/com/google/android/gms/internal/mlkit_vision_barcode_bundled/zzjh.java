package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjh extends zzeh implements zzfn {
    private static final zzjh zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzjh zzjhVar = new zzjh();
        zzb = zzjhVar;
        zzeh.zzV(zzjh.class, zzjhVar);
    }

    private zzjh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new zzjh();
        }
        zzhi zzhiVar = null;
        if (i4 == 4) {
            return new zzjg(zzhiVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
