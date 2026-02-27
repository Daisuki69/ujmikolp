package k5;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import l5.k;
import s5.e;

/* JADX INFO: renamed from: k5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1765a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f18112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f18113b;
    public final LifecycleOwner c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f18114d;
    public final Function1 e;
    public final Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function2 f18115g;

    public C1765a(k viewModel, e adPlacement, LifecycleOwner lifecycleOwner, Activity activity, Function1 function1, Function1 function12, Function2 function2) {
        j.g(viewModel, "viewModel");
        j.g(adPlacement, "adPlacement");
        this.f18112a = viewModel;
        this.f18113b = adPlacement;
        this.c = lifecycleOwner;
        this.f18114d = activity;
        this.e = function1;
        this.f = function12;
        this.f18115g = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1765a)) {
            return false;
        }
        C1765a c1765a = (C1765a) obj;
        return j.b(this.f18112a, c1765a.f18112a) && this.f18113b == c1765a.f18113b && j.b(this.c, c1765a.c) && j.b(this.f18114d, c1765a.f18114d) && j.b(this.e, c1765a.e) && j.b(this.f, c1765a.f) && j.b(this.f18115g, c1765a.f18115g);
    }

    public final int hashCode() {
        int iHashCode = (this.f18114d.hashCode() + ((this.c.hashCode() + ((this.f18113b.hashCode() + (this.f18112a.hashCode() * 31)) * 31)) * 31)) * 31;
        Function1 function1 = this.e;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.f;
        int iHashCode3 = (iHashCode2 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function2 function2 = this.f18115g;
        return iHashCode3 + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        return "InlineBannerAdParameters(viewModel=" + this.f18112a + ", adPlacement=" + this.f18113b + ", lifecycleOwner=" + this.c + ", activity=" + this.f18114d + ", onAdTapped=" + this.e + ", onAdLoadSuccess=" + this.f + ", onAdLoadFail=" + this.f18115g + ")";
    }
}
