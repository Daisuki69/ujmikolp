package f5;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import i5.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f16723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5.d f16724b;
    public final LifecycleOwner c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FragmentActivity f16725d;
    public final Long e;
    public final Float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f16726g;
    public final Integer h;
    public final Function1 i;
    public final Function1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Function2 f16727k;

    public g(l viewModel, s5.d adPlacement, LifecycleOwner lifecycleOwner, FragmentActivity activity, Long l6, Float f, Integer num, Integer num2, Function1 function1, Function1 function12, Function2 function2) {
        j.g(viewModel, "viewModel");
        j.g(adPlacement, "adPlacement");
        j.g(lifecycleOwner, "lifecycleOwner");
        j.g(activity, "activity");
        this.f16723a = viewModel;
        this.f16724b = adPlacement;
        this.c = lifecycleOwner;
        this.f16725d = activity;
        this.e = l6;
        this.f = f;
        this.f16726g = num;
        this.h = num2;
        this.i = function1;
        this.j = function12;
        this.f16727k = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return j.b(this.f16723a, gVar.f16723a) && this.f16724b == gVar.f16724b && j.b(this.c, gVar.c) && j.b(this.f16725d, gVar.f16725d) && j.b(this.e, gVar.e) && j.b(this.f, gVar.f) && j.b(this.f16726g, gVar.f16726g) && j.b(this.h, gVar.h) && j.b(this.i, gVar.i) && j.b(this.j, gVar.j) && j.b(this.f16727k, gVar.f16727k);
    }

    public final int hashCode() {
        int iHashCode = (this.f16725d.hashCode() + ((this.c.hashCode() + ((this.f16724b.hashCode() + (this.f16723a.hashCode() * 31)) * 31)) * 31)) * 31;
        Long l6 = this.e;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        Float f = this.f;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.f16726g;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Function1 function1 = this.i;
        int iHashCode6 = (iHashCode5 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.j;
        int iHashCode7 = (iHashCode6 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function2 function2 = this.f16727k;
        return iHashCode7 + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        return "BannerAdCarouselParameters(viewModel=" + this.f16723a + ", adPlacement=" + this.f16724b + ", lifecycleOwner=" + this.c + ", activity=" + this.f16725d + ", autoScrollDelay=" + this.e + ", borderRadius=" + this.f + ", topMargin=" + this.f16726g + ", bottomMargin=" + this.h + ", onAdTapped=" + this.i + ", onAdLoadSuccess=" + this.j + ", onAdLoadFail=" + this.f16727k + ")";
    }
}
