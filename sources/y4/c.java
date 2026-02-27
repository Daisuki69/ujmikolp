package Y4;

import Bj.r;
import b5.C0909a;
import b5.C0917i;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f6753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f6754b;
    public final /* synthetic */ Function1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f6755d;
    public final /* synthetic */ String e;

    public c(Function1 function1, y yVar, Function1 function12, r rVar, String str) {
        this.f6753a = function1;
        this.f6754b = yVar;
        this.c = function12;
        this.f6755d = rVar;
        this.e = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.c.invoke(this.f6754b.f18195a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError adError) {
        j.g(adError, "adError");
        int code = adError.getCode();
        String message = adError.getMessage();
        j.f(message, "getMessage(...)");
        this.f6755d.T(new C0917i(this.e, new C0909a(code, message, "")));
        super.onAdFailedToLoad(adError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        this.f6753a.invoke(this.f6754b.f18195a);
    }
}
