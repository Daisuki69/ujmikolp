package L6;

import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.webkit.WebViewClientCompat;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInWebFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import com.paymaya.ui.common.view.fragment.impl.WebFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends WebViewClientCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f2821b;

    public /* synthetic */ D(Fragment fragment, int i) {
        this.f2820a = i;
        this.f2821b = fragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageFinished(android.webkit.WebView r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L6.D.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L6.D.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
        switch (this.f2820a) {
            case 0:
                if (view != null) {
                    view.loadUrl("about:blank");
                }
                yk.a.a();
                ((MayaCashInWebFragment) this.f2821b).w0 = true;
                break;
            case 1:
                kotlin.jvm.internal.j.g(view, "view");
                kotlin.jvm.internal.j.g(description, "description");
                kotlin.jvm.internal.j.g(failingUrl, "failingUrl");
                view.loadUrl("about:blank");
                yk.a.a();
                ((WebFragment) this.f2821b).f14429j0 = true;
                break;
            default:
                kotlin.jvm.internal.j.g(view, "view");
                kotlin.jvm.internal.j.g(description, "description");
                kotlin.jvm.internal.j.g(failingUrl, "failingUrl");
                view.loadUrl("about:blank");
                yk.a.a();
                ((MayaWebFragment) this.f2821b).f11966z0 = true;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bc  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L6.D.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
