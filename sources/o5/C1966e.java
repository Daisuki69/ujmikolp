package o5;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import b5.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import r5.m;

/* JADX INFO: renamed from: o5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1966e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f18778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5.m f18779b;
    public final LifecycleOwner c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f18780d;
    public final p e;
    public final Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function1 f18781g;
    public final Function2 h;

    public C1966e(m viewModel, s5.m adPlacement, LifecycleOwner lifecycleOwner, Activity activity, p header, Function1 function1, Function1 function12, Function2 function2) {
        j.g(viewModel, "viewModel");
        j.g(adPlacement, "adPlacement");
        j.g(header, "header");
        this.f18778a = viewModel;
        this.f18779b = adPlacement;
        this.c = lifecycleOwner;
        this.f18780d = activity;
        this.e = header;
        this.f = function1;
        this.f18781g = function12;
        this.h = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1966e)) {
            return false;
        }
        C1966e c1966e = (C1966e) obj;
        return j.b(this.f18778a, c1966e.f18778a) && this.f18779b == c1966e.f18779b && j.b(this.c, c1966e.c) && j.b(this.f18780d, c1966e.f18780d) && j.b(this.e, c1966e.e) && j.b(this.f, c1966e.f) && j.b(this.f18781g, c1966e.f18781g) && j.b(this.h, c1966e.h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.f18780d.hashCode() + ((this.c.hashCode() + ((this.f18779b.hashCode() + (this.f18778a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        Function1 function1 = this.f;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.f18781g;
        int iHashCode3 = (iHashCode2 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function2 function2 = this.h;
        return iHashCode3 + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        return "VerticalBannerAdParameters(viewModel=" + this.f18778a + ", adPlacement=" + this.f18779b + ", lifecycleOwner=" + this.c + ", activity=" + this.f18780d + ", header=" + this.e + ", onAdTapped=" + this.f + ", onAdLoadSuccess=" + this.f18781g + ", onAdLoadFail=" + this.h + ")";
    }
}
