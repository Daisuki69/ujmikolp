package M1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends zzeh implements zzfn {
    private static final g zzb;
    private zzeo zzd = zzeh.zzP();

    static {
        g gVar = new g();
        zzb = gVar;
        zzeh.zzV(g.class, gVar);
    }

    public static f a() {
        return (f) zzb.zzG();
    }

    public static /* synthetic */ void b(g gVar, e eVar) {
        eVar.getClass();
        zzeo zzeoVar = gVar.zzd;
        if (!zzeoVar.zzc()) {
            gVar.zzd = zzeh.zzQ(zzeoVar);
        }
        gVar.zzd.add(eVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", e.class});
        }
        if (i4 == 3) {
            return new g();
        }
        if (i4 == 4) {
            return new f(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
