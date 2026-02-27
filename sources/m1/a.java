package M1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends zzeh implements zzfn {
    private static final a zzb;
    private int zzd;
    private i zze;
    private c zzf;
    private l zzg;

    static {
        a aVar = new a();
        zzb = aVar;
        zzeh.zzV(a.class, aVar);
    }

    public static j a() {
        return (j) zzb.zzG();
    }

    public static /* synthetic */ void b(a aVar, i iVar) {
        iVar.getClass();
        aVar.zze = iVar;
        aVar.zzd |= 1;
    }

    public static /* synthetic */ void c(a aVar, c cVar) {
        cVar.getClass();
        aVar.zzf = cVar;
        aVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i4 == 3) {
            return new a();
        }
        if (i4 == 4) {
            return new j(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
