package v3;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends p3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.g f20461a;

    public e(p3.g gVar) {
        this.f20461a = gVar;
    }

    @Override // p3.e
    public final Object create(Object obj) {
        r3.b bVar = (r3.b) obj;
        p3.g gVar = this.f20461a;
        Context contextB = gVar.b();
        zzwp zzwpVarZzb = zzxa.zzb(true != AbstractC2338a.c() ? numX49.tnTj78("bbcB") : numX49.tnTj78("bbcu"));
        zzcs zzcsVar = j.h;
        return new g(gVar, bVar, (DynamiteModule.getLocalVersion(contextB, numX49.tnTj78("bbcV")) <= 0 && GoogleApiAvailabilityLight.getInstance().getApkVersion(contextB) < 204500000) ? new k(contextB, bVar, zzwpVarZzb) : new j(contextB, bVar, zzwpVarZzb), zzwpVarZzb);
    }
}
