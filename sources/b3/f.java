package B3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends zzeh implements zzfn {
    private static final f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        f fVar = new f();
        zzb = fVar;
        zzeh.zzV(f.class, fVar);
    }

    public static e c() {
        return (e) zzb.zzG();
    }

    public static /* synthetic */ void d(int i, f fVar) {
        fVar.zzd |= 1;
        fVar.zze = i;
    }

    public static /* synthetic */ void e(int i, f fVar) {
        fVar.zzd |= 2;
        fVar.zzf = i;
    }

    public final int a() {
        return this.zze;
    }

    public final int b() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new f();
        }
        if (i4 == 4) {
            return new e(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
