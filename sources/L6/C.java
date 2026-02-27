package L6;

import Kh.C0305j;
import Kh.C0310o;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import cj.C1132s;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInWebFragment;
import com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import com.paymaya.ui.common.view.fragment.impl.WebFragment;
import dOYHB6.iY9fr2.dLgao9;
import java.util.Arrays;
import java.util.List;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f2819b;

    public /* synthetic */ C(Fragment fragment, int i) {
        this.f2818a = i;
        this.f2819b = fragment;
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        switch (this.f2818a) {
            case 1:
                super.onHideCustomView();
                WebFragment webFragment = (WebFragment) this.f2819b;
                if (webFragment.m0 == null) {
                    return;
                }
                WebView webView = webFragment.f14420a0;
                if (webView == null) {
                    kotlin.jvm.internal.j.n("mWebView");
                    throw null;
                }
                webView.setVisibility(0);
                FrameLayout frameLayout = webFragment.f14421b0;
                if (frameLayout == null) {
                    kotlin.jvm.internal.j.n("mFullScreenLayout");
                    throw null;
                }
                frameLayout.setVisibility(8);
                FrameLayout frameLayout2 = webFragment.f14421b0;
                if (frameLayout2 == null) {
                    kotlin.jvm.internal.j.n("mFullScreenLayout");
                    throw null;
                }
                frameLayout2.removeView(webFragment.m0);
                WebChromeClient.CustomViewCallback customViewCallback = webFragment.f14432n0;
                if (customViewCallback != null) {
                    customViewCallback.onCustomViewHidden();
                }
                webFragment.m0 = null;
                return;
            case 2:
                super.onHideCustomView();
                MayaWebFragment mayaWebFragment = (MayaWebFragment) this.f2819b;
                if (mayaWebFragment.f11950C0 == null) {
                    return;
                }
                Y6.n nVar = mayaWebFragment.u0;
                if (nVar != null) {
                    MayaWebActivity mayaWebActivity = (MayaWebActivity) nVar;
                    if (mayaWebActivity.f11809p) {
                        mayaWebActivity.setRequestedOrientation(13);
                        dLgao9.oVike1(mayaWebActivity.getWindow(), 1024);
                    } else {
                        mayaWebActivity.setRequestedOrientation(1);
                        dLgao9.oVike1(mayaWebActivity.getWindow(), 1024);
                    }
                    mayaWebActivity.w1(true);
                }
                WebView webView2 = mayaWebFragment.f11959o0;
                if (webView2 == null) {
                    kotlin.jvm.internal.j.n("mWebView");
                    throw null;
                }
                webView2.setVisibility(0);
                FrameLayout frameLayout3 = mayaWebFragment.f11960p0;
                if (frameLayout3 == null) {
                    kotlin.jvm.internal.j.n("mFullScreenLayout");
                    throw null;
                }
                frameLayout3.setVisibility(8);
                FrameLayout frameLayout4 = mayaWebFragment.f11960p0;
                if (frameLayout4 == null) {
                    kotlin.jvm.internal.j.n("mFullScreenLayout");
                    throw null;
                }
                frameLayout4.removeView(mayaWebFragment.f11950C0);
                WebChromeClient.CustomViewCallback customViewCallback2 = mayaWebFragment.f11951D0;
                if (customViewCallback2 != null) {
                    customViewCallback2.onCustomViewHidden();
                }
                mayaWebFragment.f11950C0 = null;
                return;
            default:
                super.onHideCustomView();
                return;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest request) {
        PermissionRequest permissionRequest;
        PermissionRequest permissionRequest2;
        switch (this.f2818a) {
            case 1:
                kotlin.jvm.internal.j.g(request, "request");
                ((WebFragment) this.f2819b).f14433o0 = request;
                String[] resources = request.getResources();
                List listAsList = Arrays.asList(Arrays.copyOf(resources, resources.length));
                if (listAsList.contains("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (AbstractC1955a.u(((WebFragment) this.f2819b).getContext(), "android.permission.CAMERA")) {
                        PermissionRequest permissionRequest3 = ((WebFragment) this.f2819b).f14433o0;
                        if (permissionRequest3 != null) {
                            permissionRequest3.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                        }
                    } else {
                        Pc.g gVarA1 = ((WebFragment) this.f2819b).A1();
                        WebFragment webFragment = (WebFragment) ((Vc.c) gVarA1.c.get());
                        webFragment.getClass();
                        Kh.B bE = AbstractC1955a.k(webFragment).e(zh.b.a());
                        Gh.f fVar = new Gh.f(new Gb.d(gVarA1, 24), Eh.d.f1366d);
                        bE.g(fVar);
                        gVarA1.e(fVar);
                    }
                }
                if (listAsList.contains("android.webkit.resource.PROTECTED_MEDIA_ID") && (permissionRequest = ((WebFragment) this.f2819b).f14433o0) != null) {
                    permissionRequest.grant(new String[]{"android.webkit.resource.PROTECTED_MEDIA_ID"});
                    break;
                }
                break;
            case 2:
                kotlin.jvm.internal.j.g(request, "request");
                ((MayaWebFragment) this.f2819b).f11952E0 = request;
                String[] resources2 = request.getResources();
                List listG = C1132s.g(Arrays.copyOf(resources2, resources2.length));
                if (listG.contains("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (AbstractC1955a.u(((MayaWebFragment) this.f2819b).getContext(), "android.permission.CAMERA")) {
                        PermissionRequest permissionRequest4 = ((MayaWebFragment) this.f2819b).f11952E0;
                        if (permissionRequest4 != null) {
                            permissionRequest4.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                        }
                    } else {
                        Q6.t tVarP1 = ((MayaWebFragment) this.f2819b).P1();
                        MayaWebFragment mayaWebFragment = (MayaWebFragment) ((X6.h) tVarP1.c.get());
                        mayaWebFragment.getClass();
                        Kh.B bE2 = AbstractC1955a.k(mayaWebFragment).e(zh.b.a());
                        Gh.f fVar2 = new Gh.f(new Q6.r(tVarP1, 0), Eh.d.f1366d);
                        bE2.g(fVar2);
                        tVarP1.e(fVar2);
                    }
                }
                if (listG.contains("android.webkit.resource.PROTECTED_MEDIA_ID") && (permissionRequest2 = ((MayaWebFragment) this.f2819b).f11952E0) != null) {
                    permissionRequest2.grant(new String[]{"android.webkit.resource.PROTECTED_MEDIA_ID"});
                    break;
                }
                break;
            default:
                super.onPermissionRequest(request);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView view, int i) {
        switch (this.f2818a) {
            case 0:
                kotlin.jvm.internal.j.g(view, "view");
                super.onProgressChanged(view, i);
                G6.t tVarQ1 = ((MayaCashInWebFragment) this.f2819b).Q1();
                ((MayaCashInWebFragment) ((K6.m) tVarQ1.c.get())).S1(i);
                if (i >= 100) {
                    ProgressBar progressBar = ((MayaCashInWebFragment) ((K6.m) tVarQ1.c.get())).f11758q0;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mWebPageProgressBar");
                        throw null;
                    }
                }
                return;
            case 1:
                kotlin.jvm.internal.j.g(view, "view");
                super.onProgressChanged(view, i);
                Pc.g gVarA1 = ((WebFragment) this.f2819b).A1();
                ((WebFragment) ((Vc.c) gVarA1.c.get())).B1(i);
                if (i >= 100) {
                    ProgressBar progressBar2 = ((WebFragment) ((Vc.c) gVarA1.c.get())).f14422c0;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mWebPageProgressBar");
                        throw null;
                    }
                }
                return;
            default:
                kotlin.jvm.internal.j.g(view, "view");
                super.onProgressChanged(view, i);
                Q6.t tVarP1 = ((MayaWebFragment) this.f2819b).P1();
                ((MayaWebFragment) ((X6.h) tVarP1.c.get())).S1(i);
                if (i >= 100) {
                    ProgressBar progressBar3 = ((MayaWebFragment) ((X6.h) tVarP1.c.get())).f11961q0;
                    if (progressBar3 != null) {
                        progressBar3.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mWebPageProgressBar");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView view, String title) {
        switch (this.f2818a) {
            case 1:
                kotlin.jvm.internal.j.g(view, "view");
                kotlin.jvm.internal.j.g(title, "title");
                super.onReceivedTitle(view, title);
                Pc.g gVarA1 = ((WebFragment) this.f2819b).A1();
                if (((WebFragment) this.f2819b).f14430k0) {
                    ((WebFragment) ((Vc.c) gVarA1.c.get())).getClass();
                }
                break;
            case 2:
                kotlin.jvm.internal.j.g(view, "view");
                kotlin.jvm.internal.j.g(title, "title");
                super.onReceivedTitle(view, title);
                Q6.t tVarP1 = ((MayaWebFragment) this.f2819b).P1();
                if (((MayaWebFragment) this.f2819b).f11948A0) {
                    MayaWebFragment mayaWebFragment = (MayaWebFragment) ((X6.h) tVarP1.c.get());
                    mayaWebFragment.getClass();
                    Y6.n nVar = mayaWebFragment.u0;
                    if (nVar != null) {
                        nVar.d(title);
                    }
                }
                break;
            default:
                super.onReceivedTitle(view, title);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        switch (this.f2818a) {
            case 1:
                kotlin.jvm.internal.j.g(view, "view");
                kotlin.jvm.internal.j.g(callback, "callback");
                WebFragment webFragment = (WebFragment) this.f2819b;
                if (webFragment.m0 != null) {
                    callback.onCustomViewHidden();
                    return;
                }
                webFragment.m0 = view;
                WebView webView = webFragment.f14420a0;
                if (webView == null) {
                    kotlin.jvm.internal.j.n("mWebView");
                    throw null;
                }
                webView.setVisibility(4);
                FrameLayout frameLayout = webFragment.f14421b0;
                if (frameLayout == null) {
                    kotlin.jvm.internal.j.n("mFullScreenLayout");
                    throw null;
                }
                frameLayout.setVisibility(0);
                FrameLayout frameLayout2 = webFragment.f14421b0;
                if (frameLayout2 == null) {
                    kotlin.jvm.internal.j.n("mFullScreenLayout");
                    throw null;
                }
                frameLayout2.addView(webFragment.m0);
                webFragment.f14432n0 = callback;
                return;
            case 2:
                kotlin.jvm.internal.j.g(view, "view");
                kotlin.jvm.internal.j.g(callback, "callback");
                MayaWebFragment mayaWebFragment = (MayaWebFragment) this.f2819b;
                if (mayaWebFragment.f11950C0 != null) {
                    callback.onCustomViewHidden();
                    return;
                }
                Y6.n nVar = mayaWebFragment.u0;
                if (nVar != null) {
                    MayaWebActivity mayaWebActivity = (MayaWebActivity) nVar;
                    mayaWebActivity.setRequestedOrientation(13);
                    mayaWebActivity.getWindow().addFlags(1024);
                    mayaWebActivity.w1(false);
                }
                mayaWebFragment.f11950C0 = view;
                WebView webView2 = mayaWebFragment.f11959o0;
                if (webView2 == null) {
                    kotlin.jvm.internal.j.n("mWebView");
                    throw null;
                }
                webView2.setVisibility(4);
                FrameLayout frameLayout3 = mayaWebFragment.f11960p0;
                if (frameLayout3 == null) {
                    kotlin.jvm.internal.j.n("mFullScreenLayout");
                    throw null;
                }
                frameLayout3.setVisibility(0);
                FrameLayout frameLayout4 = mayaWebFragment.f11960p0;
                if (frameLayout4 == null) {
                    kotlin.jvm.internal.j.n("mFullScreenLayout");
                    throw null;
                }
                frameLayout4.addView(mayaWebFragment.f11950C0);
                mayaWebFragment.f11951D0 = callback;
                return;
            default:
                super.onShowCustomView(view, callback);
                return;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        switch (this.f2818a) {
            case 2:
                if (valueCallback == null) {
                    return false;
                }
                MayaWebFragment mayaWebFragment = (MayaWebFragment) this.f2819b;
                Q6.t tVarP1 = mayaWebFragment.P1();
                Ld.b bVar = new Ld.b(4, mayaWebFragment, valueCallback, fileChooserParams);
                if (!((Boolean) ((MayaWebFragment) ((X6.h) tVarP1.c.get())).f11958L0.getValue()).booleanValue()) {
                    return false;
                }
                if (AbstractC1955a.u(((MayaWebFragment) ((X6.h) tVarP1.c.get())).getActivity(), "android.permission.CAMERA")) {
                    return ((Boolean) bVar.invoke()).booleanValue();
                }
                MayaWebFragment mayaWebFragment2 = (MayaWebFragment) ((X6.h) tVarP1.c.get());
                mayaWebFragment2.getClass();
                new C0305j(new C0310o(AbstractC1955a.k(mayaWebFragment2).e(zh.b.a()), new G6.u(tVarP1, 29), Eh.d.c, Eh.d.f1365b), new Q6.s(tVarP1, 0), 1).f();
                return false;
            default:
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }
}
