package M1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends zzeh implements zzfn {
    private static final e zzb;
    private int zzd;
    private zzem zze = zzeh.zzM();
    private zzem zzf = zzeh.zzM();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        e eVar = new e();
        zzb = eVar;
        zzeh.zzV(e.class, eVar);
    }

    public static d a() {
        return (d) zzb.zzG();
    }

    public static /* synthetic */ void b(e eVar, int i) {
        eVar.zzd |= 2;
        eVar.zzh = i;
    }

    public static /* synthetic */ void c(e eVar, float f) {
        zzem zzemVar = eVar.zze;
        if (!zzemVar.zzc()) {
            eVar.zze = zzeh.zzN(zzemVar);
        }
        eVar.zze.zzh(f);
    }

    public static /* synthetic */ void d(e eVar, float f) {
        zzem zzemVar = eVar.zzf;
        if (!zzemVar.zzc()) {
            eVar.zzf = zzeh.zzN(zzemVar);
        }
        eVar.zzf.zzh(f);
    }

    public static /* synthetic */ void e(e eVar, int i) {
        eVar.zzd |= 1;
        eVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i4 == 3) {
            return new e();
        }
        if (i4 == 4) {
            return new d(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
