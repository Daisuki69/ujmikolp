package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxo extends zzuw implements zzvx {
    private static final zzxo zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;

    static {
        zzxo zzxoVar = new zzxo();
        zzb = zzxoVar;
        zzuw.zzF(zzxo.class, zzxoVar);
    }

    private zzxo() {
    }

    public static zzxo zzi() {
        return zzb;
    }

    public final float zzb() {
        return this.zze;
    }

    public final float zzd() {
        return this.zzg;
    }

    public final float zze() {
        return this.zzf;
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
            return new zzxo();
        }
        zzxj zzxjVar = null;
        if (i4 == 4) {
            return new zzxn(zzxjVar);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }

    public final float zzg() {
        return this.zzh;
    }
}
