package com.paymaya.mayaui.common.view.fragment.impl;

import B5.m;
import C2.f;
import L6.C;
import L6.D;
import M8.T2;
import N5.W0;
import Q6.t;
import Uh.d;
import X6.h;
import Xa.c;
import Y6.l;
import Y6.n;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.MimeTypes;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.internal.i;
import com.google.gson.o;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k2.v0;
import kotlin.jvm.internal.j;
import yk.a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public class MayaWebFragment extends MayaBaseLoadingFragment implements h {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final String[] f11947M0 = {MimeTypes.IMAGE_PNG, "application/pdf", "image/jpg", MimeTypes.IMAGE_JPEG};

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f11948A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f11949B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public View f11950C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f11951D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public PermissionRequest f11952E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Intent f11953F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public ValueCallback f11954G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final ActivityResultLauncher f11955H0;
    public final ActivityResultLauncher I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f11956J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f11957K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final InterfaceC1033d f11958L0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public WebView f11959o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public FrameLayout f11960p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ProgressBar f11961q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public W0 f11962r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public t f11963s0;
    public m t0;
    public n u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f11964v0 = "";
    public String w0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f11965x0 = "";
    public boolean y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f11966z0;

    public MayaWebFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new c(this, 6));
        j.f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f11955H0 = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new f(25));
        j.f(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.I0 = activityResultLauncherRegisterForActivityResult2;
        this.f11958L0 = C1034e.b(new Y6.m(this, 0));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_web_view, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.frame_layout_full_screen;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_full_screen);
        if (frameLayout != null) {
            i = R.id.progress_bar_web;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.progress_bar_web);
            if (progressBar != null) {
                i = R.id.web_view_main;
                WebView webView = (WebView) ViewBindings.findChildViewById(viewInflate, R.id.web_view_main);
                if (webView != null) {
                    this.f11962r0 = new W0(constraintLayout, frameLayout, progressBar, webView, 1);
                    j.f(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_reusable_error, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final t P1() {
        t tVar = this.f11963s0;
        if (tVar != null) {
            return tVar;
        }
        j.n("mWebFragmentPresenter");
        throw null;
    }

    public final boolean Q1() {
        t tVarP1 = P1();
        WebView webView = ((MayaWebFragment) ((h) tVarP1.c.get())).f11959o0;
        if (webView == null) {
            j.n("mWebView");
            throw null;
        }
        if (!webView.canGoBack()) {
            return false;
        }
        WebView webView2 = ((MayaWebFragment) ((h) tVarP1.c.get())).f11959o0;
        if (webView2 != null) {
            webView2.goBack();
            return true;
        }
        j.n("mWebView");
        throw null;
    }

    public final void R1(String str) {
        if (!j.b(str, this.f11964v0)) {
            this.f11965x0 = "";
        }
        if (str != null) {
            WebView webView = this.f11959o0;
            if (webView != null) {
                webView.loadUrl(str);
            } else {
                j.n("mWebView");
                throw null;
            }
        }
    }

    public final void S1(int i) {
        ProgressBar progressBar = this.f11961q0;
        if (progressBar != null) {
            progressBar.setProgress(i);
        } else {
            j.n("mWebPageProgressBar");
            throw null;
        }
    }

    public final void T1() {
        MayaBaseLoadingFragment.N1(this, 100, getString(R.string.maya_default_error_message_web), null, new l(this, 1), 28);
    }

    public final void U1() {
        t tVarP1 = P1();
        String str = this.f11965x0;
        if (str != null && !C2576A.H(str)) {
            ((MayaWebFragment) ((h) tVarP1.c.get())).f11965x0 = "";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            EnumC1217f enumC1217f = null;
            try {
                Iterator it = ((i) T2.x(str).g().g().f10034a.entrySet()).iterator();
                while (((com.google.gson.internal.h) it).hasNext()) {
                    com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                    linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                }
            } catch (Exception e) {
                ">>>> Unable to parse passed analytics event arguments: ".concat(str);
                a.d();
                e.printStackTrace();
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                String str2 = (String) linkedHashMap.get(tVarP1.j);
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -933770714) {
                        if (iHashCode != -234430262) {
                            if (iHashCode == 1954122069 && str2.equals("transactions")) {
                                enumC1217f = EnumC1217f.TRANSACTIONS_NOTIF_CTA;
                            }
                        } else if (str2.equals("updates")) {
                            enumC1217f = EnumC1217f.UPDATES_NOTIF_CTA;
                        }
                    } else if (str2.equals("marketing")) {
                        enumC1217f = EnumC1217f.MARKETING_NOTIF_CTA;
                    }
                }
                if (enumC1217f != null) {
                    MayaWebFragment mayaWebFragment = (MayaWebFragment) ((h) tVarP1.c.get());
                    C1220i c1220iO1 = mayaWebFragment.o1();
                    C1219h c1219hE = C1219h.e("MESSAGES_" + enumC1217f.f11196a + "_FAILED");
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    String strValueOf = String.valueOf((String) linkedHashMap.get("notification_id"));
                    HashMap map = c1219hE.j;
                    map.put("notification_id", strValueOf);
                    map.put(ImagesContract.URL, String.valueOf(mayaWebFragment.f11964v0));
                    map.put("action", String.valueOf((String) linkedHashMap.get("action")));
                    c1220iO1.b(c1219hE);
                }
            }
        }
        MayaBaseLoadingFragment.N1(this, 200, getString(R.string.maya_default_error_message_web), null, new l(this, 0), 28);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.u0 = (n) getActivity();
        O5.a aVar = (O5.a) W4.a.e().a().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f11963s0 = new t(aVar.S(), aVar.Z(), (com.paymaya.data.preference.a) aVar.e.get(), (S5.c) aVar.f4724k.get(), (d) aVar.f4748y.get());
        this.t0 = (m) aVar.f4718h0.get();
        P1().h(this);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        j.g(menu, "menu");
        j.g(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.maya_menu_web, menu);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        m mVar = this.t0;
        if (mVar == null) {
            j.n("mSuspendSessionController");
            throw null;
        }
        mVar.a();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        WebView webView = this.f11959o0;
        if (webView == null) {
            j.n("mWebView");
            throw null;
        }
        webView.stopLoading();
        WebView webView2 = this.f11959o0;
        if (webView2 == null) {
            j.n("mWebView");
            throw null;
        }
        webView2.destroy();
        this.f11962r0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        j.g(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.back_maya_menu_web) {
            WebView webView = this.f11959o0;
            if (webView != null) {
                webView.goBack();
                return true;
            }
            j.n("mWebView");
            throw null;
        }
        if (itemId == R.id.forward_maya_menu_web) {
            WebView webView2 = this.f11959o0;
            if (webView2 != null) {
                webView2.goForward();
                return true;
            }
            j.n("mWebView");
            throw null;
        }
        if (itemId != R.id.refresh_maya_menu_web) {
            return super.onOptionsItemSelected(item);
        }
        WebView webView3 = this.f11959o0;
        if (webView3 != null) {
            webView3.reload();
            return true;
        }
        j.n("mWebView");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        m mVar = this.t0;
        if (mVar == null) {
            j.n("mSuspendSessionController");
            throw null;
        }
        Gh.f fVar = mVar.f;
        if (fVar != null) {
            Dh.a.a(fVar);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        j.g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.back_maya_menu_web);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.forward_maya_menu_web);
        if (menuItemFindItem != null) {
            WebView webView = this.f11959o0;
            if (webView == null) {
                j.n("mWebView");
                throw null;
            }
            menuItemFindItem.setEnabled(webView.canGoBack());
            Drawable icon = menuItemFindItem.getIcon();
            if (icon != null) {
                WebView webView2 = this.f11959o0;
                if (webView2 == null) {
                    j.n("mWebView");
                    throw null;
                }
                icon.setAlpha(webView2.canGoBack() ? 255 : 100);
            }
        }
        if (menuItemFindItem2 != null) {
            WebView webView3 = this.f11959o0;
            if (webView3 == null) {
                j.n("mWebView");
                throw null;
            }
            menuItemFindItem2.setEnabled(webView3.canGoForward());
            Drawable icon2 = menuItemFindItem2.getIcon();
            if (icon2 != null) {
                WebView webView4 = this.f11959o0;
                if (webView4 != null) {
                    icon2.setAlpha(webView4.canGoForward() ? 255 : 100);
                } else {
                    j.n("mWebView");
                    throw null;
                }
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        n nVar = this.u0;
        if (nVar != null) {
            ((MayaWebActivity) nVar).Q(this);
        }
        t tVarP1 = P1();
        String str = this.f11964v0;
        if (tVarP1.h && tVarP1.i) {
            tVarP1.h = false;
            tVarP1.m(str);
        }
        t tVarP12 = P1();
        if (this.f11949B0) {
            m mVar = ((MayaWebFragment) ((h) tVarP12.c.get())).t0;
            if (mVar != null) {
                mVar.b();
            } else {
                j.n("mSuspendSessionController");
                throw null;
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        m mVar = this.t0;
        if (mVar == null) {
            j.n("mSuspendSessionController");
            throw null;
        }
        mVar.a();
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11964v0 = arguments.getString(ImagesContract.URL);
            C1219h c1219hM1 = m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hM1.j.put(ImagesContract.URL, this.f11964v0);
            this.y0 = arguments.getBoolean("limit_links", false);
            this.f11948A0 = arguments.getBoolean("use_web_title", false);
            this.f11949B0 = arguments.getBoolean("has_session", false);
            this.f11956J0 = arguments.getBoolean("allowed_as_in_house_url", false);
            this.f11965x0 = arguments.getString("inbox_event_attributes");
        }
        W0 w0 = this.f11962r0;
        j.d(w0);
        this.f11959o0 = w0.e;
        W0 w02 = this.f11962r0;
        j.d(w02);
        this.f11960p0 = w02.c;
        W0 w03 = this.f11962r0;
        j.d(w03);
        this.f11961q0 = w03.f3974d;
        L1();
        if (((Boolean) this.f11958L0.getValue()).booleanValue()) {
            WebView webView = this.f11959o0;
            if (webView == null) {
                j.n("mWebView");
                throw null;
            }
            webView.getSettings().setAllowFileAccess(true);
        }
        WebView webView2 = this.f11959o0;
        if (webView2 == null) {
            j.n("mWebView");
            throw null;
        }
        webView2.getSettings().setJavaScriptEnabled(true);
        WebView webView3 = this.f11959o0;
        if (webView3 == null) {
            j.n("mWebView");
            throw null;
        }
        webView3.getSettings().setDomStorageEnabled(true);
        WebView webView4 = this.f11959o0;
        if (webView4 == null) {
            j.n("mWebView");
            throw null;
        }
        webView4.getSettings().setMediaPlaybackRequiresUserGesture(false);
        WebView webView5 = this.f11959o0;
        if (webView5 == null) {
            j.n("mWebView");
            throw null;
        }
        webView5.setWebChromeClient(new C(this, i));
        WebView webView6 = this.f11959o0;
        if (webView6 == null) {
            j.n("mWebView");
            throw null;
        }
        webView6.setWebViewClient(new D(this, i));
        if (getArguments() != null) {
            t tVarP1 = P1();
            String str = this.f11964v0;
            boolean z4 = this.y0;
            FragmentActivity activity = getActivity();
            tVarP1.n(str, z4, activity != null ? v0.s(activity) : false, this.f11949B0);
            a.a();
        }
    }
}
