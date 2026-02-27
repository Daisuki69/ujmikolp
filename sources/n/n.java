package N;

import D.S;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaAgreementSettingsBottomSheetFragment;
import dOYHB6.tiZVw8.numX49;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3487a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3488b;

    public n(CTInAppBaseFragment cTInAppBaseFragment) {
        this.f3488b = new WeakReference(cTInAppBaseFragment);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f3487a) {
            case 1:
                super.onPageFinished(webView, str);
                Button button = ((NewMayaAgreementSettingsBottomSheetFragment) this.f3488b).f13138V;
                if (button != null) {
                    button.setEnabled(true);
                    return;
                } else {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("PJ2H"));
                    throw null;
                }
            default:
                super.onPageFinished(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        switch (this.f3487a) {
            case 0:
                kotlin.jvm.internal.j.g(view, "view");
                kotlin.jvm.internal.j.g(url, "url");
                CTInAppBaseFragment cTInAppBaseFragment = (CTInAppBaseFragment) ((WeakReference) this.f3488b).get();
                if (cTInAppBaseFragment == null) {
                    S.l(numX49.tnTj78("PJ2e"));
                    return true;
                }
                CTInAppAction.CREATOR.getClass();
                CTInAppAction cTInAppAction = new CTInAppAction(null);
                cTInAppAction.f9471a = f.f3463d;
                cTInAppAction.f9472b = url;
                cTInAppBaseFragment.u1(cTInAppAction, null, null);
                return true;
            default:
                return super.shouldOverrideUrlLoading(view, url);
        }
    }

    public n(NewMayaAgreementSettingsBottomSheetFragment newMayaAgreementSettingsBottomSheetFragment) {
        this.f3488b = newMayaAgreementSettingsBottomSheetFragment;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest webResourceRequest) {
        String string;
        switch (this.f3487a) {
            case 0:
                kotlin.jvm.internal.j.g(view, "view");
                kotlin.jvm.internal.j.g(webResourceRequest, numX49.tnTj78("PJ2Q"));
                Uri url = webResourceRequest.getUrl();
                if (url != null && (string = url.toString()) != null) {
                    CTInAppBaseFragment cTInAppBaseFragment = (CTInAppBaseFragment) ((WeakReference) this.f3488b).get();
                    if (cTInAppBaseFragment != null) {
                        CTInAppAction.CREATOR.getClass();
                        CTInAppAction cTInAppAction = new CTInAppAction(null);
                        cTInAppAction.f9471a = f.f3463d;
                        cTInAppAction.f9472b = string;
                        cTInAppBaseFragment.u1(cTInAppAction, null, null);
                        return true;
                    }
                    S.l(numX49.tnTj78("PJ2t"));
                    return true;
                }
                S.l(numX49.tnTj78("PJ2U"));
                return true;
            default:
                if (webResourceRequest == null) {
                    return true;
                }
                NewMayaAgreementSettingsBottomSheetFragment newMayaAgreementSettingsBottomSheetFragment = (NewMayaAgreementSettingsBottomSheetFragment) this.f3488b;
                B5.i iVar = newMayaAgreementSettingsBottomSheetFragment.f13144b0;
                if (iVar != null) {
                    iVar.k0(newMayaAgreementSettingsBottomSheetFragment.requireActivity(), webResourceRequest.getUrl().toString());
                    return true;
                }
                kotlin.jvm.internal.j.n(numX49.tnTj78("PJ2O"));
                throw null;
        }
    }
}
