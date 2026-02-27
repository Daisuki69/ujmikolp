package com.paymaya.mayaui.cashin.view.fragment.impl;

import G6.t;
import Gh.f;
import K6.m;
import L6.B;
import L6.C;
import L6.D;
import N5.W0;
import O5.a;
import S5.c;
import W6.b;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import z2.d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public class MayaCashInWebFragment extends MayaBaseLoadingFragment implements m, b {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public W0 f11756o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public WebView f11757p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ProgressBar f11758q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public t f11759r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public B5.m f11760s0;
    public B t0;
    public ExecutePullFunds u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public BankPullPaymentOption f11761v0;
    public boolean w0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_web, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.full_screen_view;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.full_screen_view);
        if (frameLayout != null) {
            i = R.id.web_page_progress_bar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.web_page_progress_bar);
            if (progressBar != null) {
                i = R.id.web_view;
                WebView webView = (WebView) ViewBindings.findChildViewById(viewInflate, R.id.web_view);
                if (webView != null) {
                    this.f11756o0 = new W0(constraintLayout, constraintLayout, frameLayout, progressBar, webView);
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

    public final ExecutePullFunds P1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (ExecutePullFunds) arguments.getParcelable("pullFunds");
        }
        return null;
    }

    public final t Q1() {
        t tVar = this.f11759r0;
        if (tVar != null) {
            return tVar;
        }
        j.n("mMayaCashInWebFragmentPresenter");
        throw null;
    }

    public final B5.m R1() {
        B5.m mVar = this.f11760s0;
        if (mVar != null) {
            return mVar;
        }
        j.n("mSuspendSessionController");
        throw null;
    }

    public final void S1(int i) {
        ProgressBar progressBar = this.f11758q0;
        if (progressBar != null) {
            progressBar.setProgress(i);
        } else {
            j.n("mWebPageProgressBar");
            throw null;
        }
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        t tVarQ1 = Q1();
        WebView webView = ((MayaCashInWebFragment) ((m) tVarQ1.c.get())).f11757p0;
        if (webView == null) {
            j.n("mWebView");
            throw null;
        }
        if (!webView.canGoBack()) {
            MayaCashInWebFragment mayaCashInWebFragment = (MayaCashInWebFragment) ((m) tVarQ1.c.get());
            String string = mayaCashInWebFragment.getString(R.string.maya_label_are_you_sure_you_want_to_leave);
            j.f(string, "getString(...)");
            d.n(R.drawable.maya_ic_warning, string, mayaCashInWebFragment.getString(R.string.maya_label_your_progress_will_be_lost), new Pair(mayaCashInWebFragment.getString(R.string.maya_label_leave), new Ag.d(mayaCashInWebFragment, 21)), new Pair(mayaCashInWebFragment.getString(R.string.maya_label_cancel), null), null, 96).show(mayaCashInWebFragment.getChildFragmentManager(), "alert_dialog");
            return true;
        }
        WebView webView2 = ((MayaCashInWebFragment) ((m) tVarQ1.c.get())).f11757p0;
        if (webView2 != null) {
            webView2.goBack();
            return true;
        }
        j.n("mWebView");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t0 = (B) getActivity();
        a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        S0 s0S = aVar.S();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(sessionSubject, "sessionSubject");
        this.f11759r0 = new t(s0S, sessionSubject);
        this.f11760s0 = (B5.m) aVar.f4718h0.get();
        Q1().h(this);
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
        WebView webView = this.f11757p0;
        if (webView == null) {
            j.n("mWebView");
            throw null;
        }
        webView.stopLoading();
        WebView webView2 = this.f11757p0;
        if (webView2 == null) {
            j.n("mWebView");
            throw null;
        }
        webView2.destroy();
        R1().a();
        Q1().i();
        super.onDestroy();
        this.f11756o0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        j.g(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.back_maya_menu_web) {
            WebView webView = this.f11757p0;
            if (webView != null) {
                webView.goBack();
                return true;
            }
            j.n("mWebView");
            throw null;
        }
        if (itemId == R.id.forward_maya_menu_web) {
            WebView webView2 = this.f11757p0;
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
        WebView webView3 = this.f11757p0;
        if (webView3 != null) {
            webView3.reload();
            return true;
        }
        j.n("mWebView");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        t tVarQ1 = Q1();
        tVarQ1.f = true;
        String str = tVarQ1.h;
        if (str != null && !C2576A.H(str)) {
            tVarQ1.m(tVarQ1.h);
        }
        f fVar = R1().f;
        if (fVar != null) {
            Dh.a.a(fVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        j.g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.back_maya_menu_web);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.forward_maya_menu_web);
        if (menuItemFindItem != null) {
            WebView webView = this.f11757p0;
            if (webView == null) {
                j.n("mWebView");
                throw null;
            }
            menuItemFindItem.setEnabled(webView.canGoBack());
            Drawable icon = menuItemFindItem.getIcon();
            if (icon != null) {
                WebView webView2 = this.f11757p0;
                if (webView2 == null) {
                    j.n("mWebView");
                    throw null;
                }
                icon.setAlpha(webView2.canGoBack() ? 255 : 100);
            }
        }
        if (menuItemFindItem2 != null) {
            WebView webView3 = this.f11757p0;
            if (webView3 == null) {
                j.n("mWebView");
                throw null;
            }
            menuItemFindItem2.setEnabled(webView3.canGoForward());
            Drawable icon2 = menuItemFindItem2.getIcon();
            if (icon2 != null) {
                WebView webView4 = this.f11757p0;
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
        B b8 = this.t0;
        if (b8 != null) {
            ((MayaCashInActivity) b8).Q(this);
        }
        t tVarQ1 = Q1();
        tVarQ1.f = false;
        String str = tVarQ1.h;
        if (str != null && !C2576A.H(str)) {
            tVarQ1.m(tVarQ1.h);
        }
        R1().b();
        t tVarQ12 = Q1();
        if (tVarQ12.i) {
            tVarQ12.i = false;
            tVarQ12.k();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        R1().a();
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        W0 w0 = this.f11756o0;
        j.d(w0);
        this.f11757p0 = w0.e;
        W0 w02 = this.f11756o0;
        j.d(w02);
        this.f11758q0 = w02.f3974d;
        j.d(this.f11756o0);
        L1();
        WebView webView = this.f11757p0;
        if (webView == null) {
            j.n("mWebView");
            throw null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        WebView webView2 = this.f11757p0;
        if (webView2 == null) {
            j.n("mWebView");
            throw null;
        }
        webView2.setWebChromeClient(new C(this, 0));
        WebView webView3 = this.f11757p0;
        if (webView3 == null) {
            j.n("mWebView");
            throw null;
        }
        webView3.setWebViewClient(new D(this, 0));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.u0 = (ExecutePullFunds) arguments.getParcelable("pullFunds");
            this.f11761v0 = (BankPullPaymentOption) arguments.getParcelable("paymentOption");
            Q1().l(this.f11761v0, com.paymaya.common.utility.C.W(getActivity()));
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return this.f11761v0 == null ? EnumC1215d.CASH_IN : EnumC1215d.BANK_PULL;
    }
}
