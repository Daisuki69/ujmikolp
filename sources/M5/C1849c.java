package m5;

import android.app.Activity;
import androidx.appcompat.app.AlertDialog;
import b5.C0916h;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import k2.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: m5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1849c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeCustomFormatAd f18375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f18376b;
    public final /* synthetic */ C0916h c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1852f f18377d;
    public final /* synthetic */ s5.f e;
    public final /* synthetic */ Activity f;

    public /* synthetic */ C1849c(NativeCustomFormatAd nativeCustomFormatAd, Function1 function1, C0916h c0916h, C1852f c1852f, s5.f fVar, Activity activity) {
        this.f18375a = nativeCustomFormatAd;
        this.f18376b = function1;
        this.c = c0916h;
        this.f18377d = c1852f;
        this.e = fVar;
        this.f = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String button = (String) obj;
        j.g(button, "button");
        this.f18375a.performClick("ad_image");
        Function1 function1 = this.f18376b;
        C0916h c0916h = this.c;
        if (function1 != null) {
            function1.invoke(c0916h);
        }
        C1852f c1852f = this.f18377d;
        C1852f.a(this.e, c0916h, button);
        v0.p(this.f, c0916h);
        AlertDialog alertDialog = c1852f.c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C1852f.f18383d = System.currentTimeMillis();
        return Unit.f18162a;
    }
}
