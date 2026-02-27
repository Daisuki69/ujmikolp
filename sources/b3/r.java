package B3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends zzeh implements zzfn {
    private static final r zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        r rVar = new r();
        zzb = rVar;
        zzeh.zzV(r.class, rVar);
    }

    public static r a() {
        return zzb;
    }

    public final int b() {
        int i;
        int i4 = this.zze;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1) {
                i = i4 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", h.f, "zzf", "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new r();
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
