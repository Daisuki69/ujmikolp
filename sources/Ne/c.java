package Ne;

import Ag.j;
import G6.v;
import Gc.h;
import Lh.g;
import N9.f;
import android.location.Location;
import bg.AbstractC0983W;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.paymaya.common.utility.AbstractC1213b;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends LocationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f4390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f4391b;
    public final /* synthetic */ f c;

    public c(d dVar, j jVar, f fVar) {
        this.f4390a = dVar;
        this.f4391b = jVar;
        this.c = fVar;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        kotlin.jvm.internal.j.g(locationAvailability, numX49.tnTj78("bdjk"));
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        kotlin.jvm.internal.j.g(locationResult, numX49.tnTj78("bdjB"));
        Location lastLocation = locationResult.getLastLocation();
        if (lastLocation != null) {
            double latitude = lastLocation.getLatitude();
            double longitude = lastLocation.getLongitude();
            d dVar = this.f4390a;
            dVar.getClass();
            String strTnTj78 = numX49.tnTj78("bdju");
            a aVar = new a(dVar, latitude, longitude);
            try {
                g gVar = new g(new Gh.d(1, new v(this.f4391b, 23), new h(this.c, 21)), zh.b.a());
                try {
                    Lh.a aVar2 = new Lh.a(gVar);
                    gVar.a(aVar2);
                    try {
                        aVar.a(aVar2);
                    } catch (Throwable th2) {
                        AbstractC0983W.G(th2);
                        aVar2.a(th2);
                    }
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th3) {
                    AbstractC0983W.G(th3);
                    NullPointerException nullPointerException = new NullPointerException(strTnTj78);
                    nullPointerException.initCause(th3);
                    throw nullPointerException;
                }
            } catch (NullPointerException e7) {
                throw e7;
            } catch (Throwable th4) {
                throw AbstractC1213b.L(th4, strTnTj78, th4);
            }
        }
    }
}
