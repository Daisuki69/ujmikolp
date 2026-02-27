package Ne;

import Ah.o;
import Hh.e;
import N9.f;
import android.app.Activity;
import android.content.IntentSender;
import android.location.Geocoder;
import bg.AbstractC0983W;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsClient;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f4392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FusedLocationProviderClient f4393b;
    public final SettingsClient c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocationRequest f4394d;
    public final LocationSettingsRequest e;
    public final Geocoder f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f4395g;
    public final Dh.c h;

    public d(Activity activity, FusedLocationProviderClient fusedLocationProviderClient, SettingsClient settingsClient, LocationRequest locationRequest, LocationSettingsRequest locationSettingsRequest, Geocoder geocoder) {
        j.g(fusedLocationProviderClient, numX49.tnTj78("bdjb"));
        j.g(settingsClient, numX49.tnTj78("bdj2"));
        j.g(locationSettingsRequest, numX49.tnTj78("bdjL"));
        this.f4392a = activity;
        this.f4393b = fusedLocationProviderClient;
        this.c = settingsClient;
        this.f4394d = locationRequest;
        this.e = locationSettingsRequest;
        this.f = geocoder;
        this.h = new Dh.c(1);
    }

    public final Gh.d a(f fVar, Ag.j jVar) {
        Hh.c cVar = new Hh.c(new Na.d(this, 5), 0);
        o oVarA = zh.b.a();
        Bb.c cVar2 = new Bb.c(7, this, jVar, fVar);
        Gh.d dVar = new Gh.d(0, new Lh.c(9, this, fVar, false), cVar2);
        try {
            cVar.d(new e(dVar, oVarA));
            return dVar;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
            NullPointerException nullPointerException = new NullPointerException(numX49.tnTj78("bdjr"));
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final void b(Throwable th2, f fVar) {
        boolean z4 = th2 instanceof ApiException;
        Activity activity = this.f4392a;
        if (!z4) {
            if (th2 instanceof ResolvableApiException) {
                try {
                    ((ResolvableApiException) th2).startResolutionForResult(activity, 1100);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                    yk.a.d();
                    return;
                }
            } else {
                if (fVar != null) {
                    fVar.invoke((Exception) th2);
                    return;
                }
                return;
            }
        }
        int statusCode = ((ApiException) th2).getStatusCode();
        if (statusCode != 6) {
            if (statusCode == 8502 && fVar != null) {
                fVar.invoke((Exception) th2);
                return;
            }
            return;
        }
        j.e(th2, numX49.tnTj78("bdjZ"));
        try {
            ((ResolvableApiException) th2).startResolutionForResult(activity, 1100);
        } catch (IntentSender.SendIntentException unused2) {
            yk.a.d();
        }
    }
}
