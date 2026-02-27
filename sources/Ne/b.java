package Ne;

import android.location.Address;
import android.location.Geocoder$GeocodeListener;
import cj.C1110A;
import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Geocoder$GeocodeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lh.a f4388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4389b;
    public final /* synthetic */ d c;

    public b(Lh.a aVar, boolean z4, d dVar) {
        this.f4388a = aVar;
        this.f4389b = z4;
        this.c = dVar;
    }

    public final void onError(String str) {
        this.f4388a.a(new IOException(str));
    }

    public final void onGeocode(List list) {
        j.g(list, numX49.tnTj78("bdjP"));
        Lh.a aVar = this.f4388a;
        Boolean boolValueOf = Boolean.valueOf(this.f4389b);
        this.c.getClass();
        if (list.isEmpty()) {
            list = null;
        }
        aVar.b(new Pair(boolValueOf, list != null ? (Address) C1110A.C(0, list) : null));
    }
}
