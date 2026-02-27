package B3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends zzeh implements zzfn {
    private static final n zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        n nVar = new n();
        zzb = nVar;
        zzeh.zzV(n.class, nVar);
    }

    public static n e() {
        return zzb;
    }

    public final int a() {
        return this.zzg;
    }

    public final int b() {
        return this.zzh;
    }

    public final int c() {
        return this.zzj;
    }

    public final int d() {
        return this.zze;
    }

    public final boolean f() {
        return this.zzk;
    }

    public final int zzc() {
        return this.zzi;
    }

    public final int zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i4 == 3) {
            return new n();
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
