package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgn extends zzmf implements zznn {
    private static final zzgn zzd;
    private zzmo zzb = zzmf.zzcv();

    static {
        zzgn zzgnVar = new zzgn();
        zzd = zzgnVar;
        zzmf.zzcp(zzgn.class, zzgnVar);
    }

    private zzgn() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzmf.zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i4 == 3) {
            return new zzgn();
        }
        byte[] bArr = null;
        if (i4 == 4) {
            return new zzgm(bArr);
        }
        if (i4 == 5) {
            return zzd;
        }
        throw null;
    }
}
