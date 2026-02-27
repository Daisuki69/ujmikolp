package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class zzv extends zzuw implements zzvx {
    private static final zzv zzb;
    private int zzd;
    private zzyc zze;
    private byte zzf = 2;

    static {
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzuw.zzF(zzv.class, zzvVar);
    }

    private zzv() {
    }

    public static zzv zzb(byte[] bArr, zzuh zzuhVar) throws zzve {
        return (zzv) zzuw.zzz(zzb, bArr, zzuhVar);
    }

    public final zzyc zzc() {
        zzyc zzycVar = this.zze;
        return zzycVar == null ? zzyc.zzd() : zzycVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i4 == 2) {
            return zzuw.zzC(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new zzv();
        }
        zzj zzjVar = null;
        if (i4 == 4) {
            return new zzu(zzjVar);
        }
        if (i4 == 5) {
            return zzb;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
