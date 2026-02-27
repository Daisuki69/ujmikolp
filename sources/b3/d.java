package B3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends zzeh implements zzfn {
    private static final d zzb;
    private zzeo zzd = zzeh.zzP();

    static {
        d dVar = new d();
        zzb = dVar;
        zzeh.zzV(d.class, dVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", c.class});
        }
        if (i4 == 3) {
            return new d();
        }
        if (i4 == 4) {
            return new b(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
