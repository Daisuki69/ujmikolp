package com.paymaya.ui.common.view.fragment.impl;

import B5.m;
import Gh.f;
import L6.C;
import L6.D;
import N5.W0;
import O5.a;
import Pc.g;
import Vc.c;
import Wc.d;
import Wc.e;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public class WebFragment extends BaseLoadingFragment implements c {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public WebView f14420a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public FrameLayout f14421b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ProgressBar f14422c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public W0 f14423d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public g f14424e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public m f14425f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public e f14426g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f14427h0 = "";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f14428i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f14429j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f14430k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f14431l0;
    public View m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f14432n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public PermissionRequest f14433o0;

    public final g A1() {
        g gVar = this.f14424e0;
        if (gVar != null) {
            return gVar;
        }
        j.n("mWebFragmentPresenter");
        throw null;
    }

    public final void B1(int i) {
        ProgressBar progressBar = this.f14422c0;
        if (progressBar != null) {
            progressBar.setProgress(i);
        } else {
            j.n("mWebPageProgressBar");
            throw null;
        }
    }

    public final void C1() {
        y1(200, getString(R.string.pma_dialog_error_server_default_message_web), new d(this, 1));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        this.f14426g0 = (e) getActivity();
        a aVar = (a) W4.a.e().a().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14424e0 = new g(aVar.S(), aVar.Z(), (com.paymaya.data.preference.a) aVar.e.get(), (Uh.d) aVar.f4748y.get());
        this.f14425f0 = (m) aVar.f4718h0.get();
        A1().h(this);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        j.g(menu, "menu");
        j.g(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.pma_menu_web_white, menu);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        A1().i();
        m mVar = this.f14425f0;
        if (mVar == null) {
            j.n("mSuspendSessionController");
            throw null;
        }
        mVar.a();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        WebView webView = this.f14420a0;
        if (webView == null) {
            j.n("mWebView");
            throw null;
        }
        if (webView == null) {
            j.n("mWebView");
            throw null;
        }
        webView.stopLoading();
        WebView webView2 = this.f14420a0;
        if (webView2 == null) {
            j.n("mWebView");
            throw null;
        }
        webView2.destroy();
        this.f14423d0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        j.g(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.back_pma_menu_web) {
            WebView webView = this.f14420a0;
            if (webView != null) {
                webView.goBack();
                return true;
            }
            j.n("mWebView");
            throw null;
        }
        if (itemId == R.id.forward_pma_menu_web) {
            WebView webView2 = this.f14420a0;
            if (webView2 != null) {
                webView2.goForward();
                return true;
            }
            j.n("mWebView");
            throw null;
        }
        if (itemId != R.id.refresh_pma_menu_web) {
            return super.onOptionsItemSelected(item);
        }
        WebView webView3 = this.f14420a0;
        if (webView3 != null) {
            webView3.reload();
            return true;
        }
        j.n("mWebView");
        throw null;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        m mVar = this.f14425f0;
        if (mVar == null) {
            j.n("mSuspendSessionController");
            throw null;
        }
        f fVar = mVar.f;
        if (fVar != null) {
            Dh.a.a(fVar);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        j.g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.back_pma_menu_web);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.forward_pma_menu_web);
        if (menuItemFindItem != null) {
            WebView webView = this.f14420a0;
            if (webView == null) {
                j.n("mWebView");
                throw null;
            }
            menuItemFindItem.setEnabled(webView.canGoBack());
            Drawable icon = menuItemFindItem.getIcon();
            if (icon != null) {
                WebView webView2 = this.f14420a0;
                if (webView2 == null) {
                    j.n("mWebView");
                    throw null;
                }
                icon.setAlpha(webView2.canGoBack() ? 255 : 100);
            }
        }
        if (menuItemFindItem2 != null) {
            WebView webView3 = this.f14420a0;
            if (webView3 == null) {
                j.n("mWebView");
                throw null;
            }
            menuItemFindItem2.setEnabled(webView3.canGoForward());
            Drawable icon2 = menuItemFindItem2.getIcon();
            if (icon2 != null) {
                WebView webView4 = this.f14420a0;
                if (webView4 != null) {
                    icon2.setAlpha(webView4.canGoForward() ? 255 : 100);
                } else {
                    j.n("mWebView");
                    throw null;
                }
            }
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        e eVar = this.f14426g0;
        if (eVar != null) {
            ((DataPrivacyActivity) eVar).Q(this);
        }
        g gVarA1 = A1();
        String str = this.f14427h0;
        if (gVarA1.f5157g && gVarA1.h) {
            gVarA1.f5157g = false;
            gVarA1.m(str);
        }
        g gVarA12 = A1();
        if (this.f14431l0) {
            m mVar = ((WebFragment) ((c) gVarA12.c.get())).f14425f0;
            if (mVar != null) {
                mVar.b();
            } else {
                j.n("mSuspendSessionController");
                throw null;
            }
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        m mVar = this.f14425f0;
        if (mVar == null) {
            j.n("mSuspendSessionController");
            throw null;
        }
        mVar.a();
        super.onStop();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 1;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        W0 w0 = this.f14423d0;
        j.d(w0);
        this.f14420a0 = w0.e;
        W0 w02 = this.f14423d0;
        j.d(w02);
        this.f14421b0 = w02.c;
        W0 w03 = this.f14423d0;
        j.d(w03);
        this.f14422c0 = w03.f3974d;
        w1();
        WebView webView = this.f14420a0;
        if (webView == null) {
            j.n("mWebView");
            throw null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        WebView webView2 = this.f14420a0;
        if (webView2 == null) {
            j.n("mWebView");
            throw null;
        }
        webView2.getSettings().setDomStorageEnabled(true);
        WebView webView3 = this.f14420a0;
        if (webView3 == null) {
            j.n("mWebView");
            throw null;
        }
        webView3.getSettings().setMediaPlaybackRequiresUserGesture(false);
        WebView webView4 = this.f14420a0;
        if (webView4 == null) {
            j.n("mWebView");
            throw null;
        }
        webView4.setWebChromeClient(new C(this, i));
        WebView webView5 = this.f14420a0;
        if (webView5 == null) {
            j.n("mWebView");
            throw null;
        }
        webView5.setWebViewClient(new D(this, i));
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(ImagesContract.URL);
            this.f14427h0 = string;
            C1219h c1219h = this.f10248Q;
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put(ImagesContract.URL, string);
            this.f14428i0 = arguments.getBoolean("limit_links", false);
            this.f14430k0 = arguments.getBoolean("use_web_title", false);
            this.f14431l0 = arguments.getBoolean("has_session", false);
            A1().n(this.f14427h0, this.f14428i0, com.paymaya.common.utility.C.W(getActivity()), this.f14431l0);
            yk.a.a();
        }
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View s1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_web_view, container, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.full_screen_view_pma_fragment_web_view;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.full_screen_view_pma_fragment_web_view);
        if (frameLayout != null) {
            i = R.id.web_page_progress_bar_pma_fragment_web_view;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.web_page_progress_bar_pma_fragment_web_view);
            if (progressBar != null) {
                i = R.id.web_view_pma_fragment;
                WebView webView = (WebView) ViewBindings.findChildViewById(viewInflate, R.id.web_view_pma_fragment);
                if (webView != null) {
                    this.f14423d0 = new W0(constraintLayout, frameLayout, progressBar, webView, 2);
                    j.f(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View t1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_error2, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View u1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_loading_fullscreen, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
