package B3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends zzeh implements zzfn {
    private static final p zzb;
    private int zzd;
    private zzck zze;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";
    private zzeo zzh = zzeh.zzP();
    private zzeo zzi = zzeh.zzP();
    private zzeo zzj = zzeh.zzP();
    private zzeo zzk = zzeh.zzP();
    private String zzl = "";

    static {
        p pVar = new p();
        zzb = pVar;
        zzeh.zzV(p.class, pVar);
    }

    public static p a() {
        return zzb;
    }

    public final zzeo b() {
        return this.zzk;
    }

    public final zzeo c() {
        return this.zzi;
    }

    public final zzeo d() {
        return this.zzh;
    }

    public final zzeo e() {
        return this.zzj;
    }

    public final zzck zza() {
        zzck zzckVar = this.zze;
        return zzckVar == null ? zzck.zzb() : zzckVar;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzco.class, "zzi", r.class, "zzj", "zzk", zzci.class, "zzl"});
        }
        if (i4 == 3) {
            return new p();
        }
        if (i4 == 4) {
            return new b(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
