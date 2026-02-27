package M1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends zzeh implements zzfn {
    private static final l zzb;
    private zzeo zzd = zzeh.zzP();
    private zzeo zze = zzeh.zzP();

    static {
        l lVar = new l();
        zzb = lVar;
        zzeh.zzV(l.class, lVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", k.class, "zze", k.class});
        }
        if (i4 == 3) {
            return new l();
        }
        if (i4 == 4) {
            return new B3.b(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
