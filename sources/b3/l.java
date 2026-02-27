package B3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends zzeh implements zzfn {
    private static final l zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private zzdf zzf;
    private String zzg;
    private d zzh;
    private int zzi;
    private p zzj;
    private r zzk;
    private zzco zzl;
    private g zzm;
    private j zzn;
    private i zzo;
    private t zzp;
    private o zzq;
    private q zzr;
    private m zzs;
    private zzeo zzt;
    private zzen zzu;
    private String zzv;
    private zzeo zzw;
    private boolean zzx;
    private double zzy;
    private zzdf zzz;

    static {
        l lVar = new l();
        zzb = lVar;
        zzeh.zzV(l.class, lVar);
    }

    public l() {
        zzdf zzdfVar = zzdf.zzb;
        this.zzf = zzdfVar;
        this.zzg = "";
        this.zzt = zzeh.zzP();
        this.zzu = zzeh.zzO();
        this.zzv = "";
        this.zzw = zzeh.zzP();
        this.zzx = true;
        this.zzz = zzdfVar;
    }

    public static /* synthetic */ void n(l lVar, int i, f fVar) {
        fVar.getClass();
        zzeo zzeoVar = lVar.zzt;
        if (!zzeoVar.zzc()) {
            lVar.zzt = zzeh.zzQ(zzeoVar);
        }
        lVar.zzt.set(i, fVar);
    }

    public final int a() {
        int iW = S1.s.w(this.zzi);
        if (iW == 0) {
            return 1;
        }
        return iW;
    }

    public final int b() {
        return this.zzt.size();
    }

    public final o c() {
        o oVar = this.zzq;
        return oVar == null ? o.c() : oVar;
    }

    public final p d() {
        p pVar = this.zzj;
        return pVar == null ? p.a() : pVar;
    }

    public final q e() {
        q qVar = this.zzr;
        return qVar == null ? q.a() : qVar;
    }

    public final r f() {
        r rVar = this.zzk;
        return rVar == null ? r.a() : rVar;
    }

    public final t g() {
        t tVar = this.zzp;
        return tVar == null ? t.c() : tVar;
    }

    public final g h() {
        g gVar = this.zzm;
        return gVar == null ? g.a() : gVar;
    }

    public final i i() {
        i iVar = this.zzo;
        return iVar == null ? i.a() : iVar;
    }

    public final j j() {
        j jVar = this.zzn;
        return jVar == null ? j.a() : jVar;
    }

    public final zzdf k() {
        return this.zzf;
    }

    public final String l() {
        return this.zzg;
    }

    public final zzeo m() {
        return this.zzt;
    }

    public final boolean o() {
        return (this.zzd & 4096) != 0;
    }

    public final boolean p() {
        return (this.zzd & 32) != 0;
    }

    public final boolean q() {
        return (this.zzd & 8192) != 0;
    }

    public final boolean r() {
        return (this.zzd & 64) != 0;
    }

    public final boolean s() {
        return (this.zzd & 2048) != 0;
    }

    public final boolean t() {
        return (this.zzd & 128) != 0;
    }

    public final boolean u() {
        return (this.zzd & 256) != 0;
    }

    public final boolean v() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean w() {
        return (this.zzd & 512) != 0;
    }

    public final int x() {
        int iB = S1.r.B(this.zze);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final zzco zzb() {
        zzco zzcoVar = this.zzl;
        return zzcoVar == null ? zzco.zzb() : zzcoVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i4 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", h.f339d, "zzf", "zzg", "zzi", h.e, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", f.class, "zzv", "zzw", f.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i4 == 3) {
            return new l();
        }
        if (i4 == 4) {
            return new k(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        this.zzA = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
