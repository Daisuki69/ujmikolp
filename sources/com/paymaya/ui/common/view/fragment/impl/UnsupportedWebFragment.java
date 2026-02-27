package com.paymaya.ui.common.view.fragment.impl;

import L9.C0327e;
import N5.C0441c;
import O5.a;
import Wc.b;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class UnsupportedWebFragment extends BaseFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0441c f14408S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f14409T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0327e f14410U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public b f14411V;

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.common.view.fragment.impl.UnsupportedWebFragment.UnsupportedWebFragmentListener");
        this.f14411V = (b) activity;
        a aVar = (a) W4.a.e().a().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14410U = new C0327e(18);
        C0327e c0327e = this.f14410U;
        if (c0327e == null) {
            j.n("mUnsupportedWebFragmentPresenter");
            throw null;
        }
        c0327e.h(this);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        j.g(menu, "menu");
        j.g(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.pma_menu_web_white, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_unsupported_web, viewGroup, false);
        ScrollView scrollView = (ScrollView) viewInflate;
        int i = R.id.download_button_pma_fragment_unsupported_web;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.download_button_pma_fragment_unsupported_web);
        if (textView != null) {
            i = R.id.image_view_pma_fragment_unsupported_web;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_fragment_unsupported_web)) != null) {
                i = R.id.subtitle_text_pma_fragment_unsupported_web;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.subtitle_text_pma_fragment_unsupported_web)) != null) {
                    i = R.id.title_text_pma_fragment_unsupported_web;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_pma_fragment_unsupported_web)) != null) {
                        this.f14408S = new C0441c(scrollView, textView, 18);
                        j.f(scrollView, "getRoot(...)");
                        return scrollView;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f14410U;
        if (c0327e == null) {
            j.n("mUnsupportedWebFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
        this.f14408S = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        Drawable icon;
        Drawable icon2;
        j.g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.back_pma_menu_web);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.forward_pma_menu_web);
        MenuItem menuItemFindItem3 = menu.findItem(R.id.refresh_pma_menu_web);
        if (menuItemFindItem != null) {
            menuItemFindItem.setEnabled(false);
        }
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setEnabled(false);
        }
        if (menuItemFindItem3 != null) {
            menuItemFindItem3.setEnabled(false);
        }
        if (menuItemFindItem != null && (icon2 = menuItemFindItem.getIcon()) != null) {
            icon2.setAlpha(100);
        }
        if (menuItemFindItem2 == null || (icon = menuItemFindItem2.getIcon()) == null) {
            return;
        }
        icon.setAlpha(100);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        b bVar = this.f14411V;
        if (bVar != null) {
            ((MayaWebActivity) bVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0441c c0441c = this.f14408S;
        j.d(c0441c);
        this.f14409T = (TextView) c0441c.c;
        C0327e c0327e = this.f14410U;
        if (c0327e == null) {
            j.n("mUnsupportedWebFragmentPresenter");
            throw null;
        }
        c0327e.j();
        TextView textView = this.f14409T;
        if (textView != null) {
            textView.setOnClickListener(new S.b(this, 24));
        } else {
            j.n("mDownloadChromeButton");
            throw null;
        }
    }
}
