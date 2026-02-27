package A3;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import y3.C2503d;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends p3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.g f31a;

    public e(p3.g gVar) {
        this.f31a = gVar;
    }

    @Override // p3.e
    public final Object create(Object obj) {
        C2503d c2503d = (C2503d) obj;
        Context contextB = this.f31a.b();
        zzoc zzocVarZzb = zzon.zzb(true != j.b() ? "play-services-mlkit-face-detection" : "face-detection");
        return new h(zzon.zzb(true != j.b() ? "play-services-mlkit-face-detection" : "face-detection"), c2503d, (DynamiteModule.getLocalVersion(contextB, ModuleDescriptor.MODULE_ID) <= 0 && GoogleApiAvailabilityLight.getInstance().getApkVersion(contextB) < 204500000) ? new l(contextB, c2503d, zzocVarZzb) : new b(contextB, c2503d, zzocVarZzb));
    }
}
