package Z1;

import O1.AbstractC0505d0;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f6880a;

    public b(c cVar) {
        Objects.requireNonNull(cVar);
        this.f6880a = cVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        c cVar = this.f6880a;
        if (cVar.f6881a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            AbstractC0505d0 abstractC0505d0 = a.f6877a;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            cVar.f6882b.u(2, bundle2);
        }
    }
}
