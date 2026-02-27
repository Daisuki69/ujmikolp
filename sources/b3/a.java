package B3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends zzeh implements zzfn {
    private static final a zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private zzeo zze = zzeh.zzP();
    private String zzg = "";
    private zzdf zzh = zzdf.zzb;

    static {
        a aVar = new a();
        zzb = aVar;
        zzeh.zzV(a.class, aVar);
    }

    public static a a(byte[] bArr, zzds zzdsVar) {
        return (a) zzeh.zzL(zzb, bArr, zzdsVar);
    }

    public final zzeo b() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", l.class, "zzf", h.f338b, "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new a();
        }
        if (i4 == 4) {
            return new b(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
