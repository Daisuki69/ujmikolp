package m5;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import n5.C1928e;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1928e f18386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5.f f18387b;
    public final LifecycleOwner c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f18388d;
    public final Function1 e;
    public final Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function2 f18389g;

    public g(C1928e viewModel, s5.f adPlacement, LifecycleOwner lifecycleOwner, Activity activity, Function1 function1, Function1 function12, Function2 function2) {
        j.g(viewModel, "viewModel");
        j.g(adPlacement, "adPlacement");
        this.f18386a = viewModel;
        this.f18387b = adPlacement;
        this.c = lifecycleOwner;
        this.f18388d = activity;
        this.e = function1;
        this.f = function12;
        this.f18389g = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return j.b(this.f18386a, gVar.f18386a) && this.f18387b == gVar.f18387b && j.b(this.c, gVar.c) && j.b(this.f18388d, gVar.f18388d) && j.b(this.e, gVar.e) && j.b(this.f, gVar.f) && j.b(this.f18389g, gVar.f18389g);
    }

    public final int hashCode() {
        int iHashCode = (this.f18388d.hashCode() + ((this.c.hashCode() + ((this.f18387b.hashCode() + (this.f18386a.hashCode() * 31)) * 31)) * 31)) * 31;
        Function1 function1 = this.e;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.f;
        int iHashCode3 = (iHashCode2 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function2 function2 = this.f18389g;
        return iHashCode3 + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        return "InterstitialAdParameters(viewModel=" + this.f18386a + ", adPlacement=" + this.f18387b + ", lifecycleOwner=" + this.c + ", activity=" + this.f18388d + ", onAdTapped=" + this.e + ", onAdLoadSuccess=" + this.f + ", onAdLoadFail=" + this.f18389g + ")";
    }
}
