package Ne;

import Ah.r;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import cj.C1110A;
import java.io.IOException;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f4386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f4387b;
    public final /* synthetic */ double c;

    public /* synthetic */ a(d dVar, double d10, double d11) {
        this.f4386a = dVar;
        this.f4387b = d10;
        this.c = d11;
    }

    @Override // Ah.r
    public final void a(Lh.a aVar) {
        boolean zIsPresent = Geocoder.isPresent();
        try {
            int i = Build.VERSION.SDK_INT;
            d dVar = this.f4386a;
            double d10 = this.f4387b;
            double d11 = this.c;
            if (i >= 33) {
                dVar.f.getFromLocation(d10, d11, 1, new b(aVar, zIsPresent, dVar));
                return;
            }
            List<Address> fromLocation = dVar.f.getFromLocation(d10, d11, 1);
            Boolean boolValueOf = Boolean.valueOf(zIsPresent);
            Address address = null;
            if (fromLocation != null) {
                if (fromLocation.isEmpty()) {
                    fromLocation = null;
                }
                if (fromLocation != null) {
                    address = (Address) C1110A.C(0, fromLocation);
                }
            }
            aVar.b(new Pair(boolValueOf, address));
        } catch (IOException e) {
            aVar.a(e);
        } catch (IllegalArgumentException e7) {
            aVar.a(e7);
        }
    }
}
