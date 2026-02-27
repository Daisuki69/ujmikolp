package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxr extends zzuw implements zzvx {
    private static final zzxr zzb;
    private int zzd;
    private int zze;
    private zztu zzf = zztu.zzb;
    private String zzg = "";
    private float zzh;

    static {
        zzxr zzxrVar = new zzxr();
        zzb = zzxrVar;
        zzuw.zzF(zzxr.class, zzxrVar);
    }

    private zzxr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzuw.zzC(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new zzxr();
        }
        zzxj zzxjVar = null;
        if (i4 == 4) {
            return new zzxq(zzxjVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
