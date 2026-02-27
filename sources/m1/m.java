package M1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends zzeh implements zzfn {
    private static final m zzb;

    static {
        m mVar = new m();
        zzb = mVar;
        zzeh.zzV(m.class, mVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0000", null);
        }
        if (i4 == 3) {
            return new m();
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
