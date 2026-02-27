package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxt extends zzuw implements zzvx {
    private static final zzxt zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;

    static {
        zzxt zzxtVar = new zzxt();
        zzb = zzxtVar;
        zzuw.zzF(zzxt.class, zzxtVar);
    }

    private zzxt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzuw.zzC(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new zzxt();
        }
        zzxj zzxjVar = null;
        if (i4 == 4) {
            return new zzxs(zzxjVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
