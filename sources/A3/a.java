package A3;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import java.util.concurrent.Executor;
import y3.C2503d;
import y3.InterfaceC2502c;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends x3.c implements InterfaceC2502c {
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(h hVar, p3.d dVar, C2503d c2503d) {
        c2503d.getClass();
        Executor executor = (Executor) dVar.f19025a.get();
        zzoc zzocVarZzb = zzon.zzb(true != j.b() ? "play-services-mlkit-face-detection" : "face-detection");
        super(hVar, executor);
        boolean zB = j.b();
        this.f = zB;
        zzku zzkuVar = new zzku();
        zzkuVar.zze(zB ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzlj zzljVar = new zzlj();
        zzljVar.zze(j.a(c2503d));
        zzkuVar.zzg(zzljVar.zzi());
        zzocVarZzb.zzd(zzof.zzg(zzkuVar, 1), zzkt.ON_DEVICE_FACE_CREATE);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f ? p3.j.f19034a : new Feature[]{p3.j.c};
    }
}
