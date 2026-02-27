package com.paymaya.ui.shopv3.view.fragment.impl;

import E9.e;
import N5.A1;
import N5.D1;
import O5.a;
import Uh.d;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import b6.C0922a;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3Fragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import ve.b;
import we.InterfaceC2418g;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3Fragment extends BaseLoadingFragment implements b {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public C0922a f14784a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public e f14785b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f14786c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public InterfaceC2418g f14787d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Handler f14788e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ArrayList f14789f0 = new ArrayList();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ArrayList f14790g0 = new ArrayList();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public D1 f14791h0;

    public final void A1() {
        if (this.f14789f0.isEmpty() || this.f14790g0.isEmpty()) {
            return;
        }
        Handler handler = this.f14788e0;
        if (handler != null) {
            handler.post((Runnable) this.f14790g0.get(0));
        } else {
            j.n("mNotificationAnimationHandler");
            throw null;
        }
    }

    public final String B1() {
        if (C.e(getArguments())) {
            return null;
        }
        return requireArguments().getString("shop_list_data");
    }

    public final C0922a C1() {
        C0922a c0922a = this.f14784a0;
        if (c0922a != null) {
            return c0922a;
        }
        j.n("mShopV3FragmentPresenter");
        throw null;
    }

    public final Toolbar D1() {
        D1 d12 = this.f14791h0;
        j.d(d12);
        Toolbar pmaViewToolbar = (Toolbar) d12.f3583d;
        j.f(pmaViewToolbar, "pmaViewToolbar");
        return pmaViewToolbar;
    }

    public final void E1() {
        C1219h c1219h = this.f10248Q;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("from_deep_link", "true");
        if (C.e(getArguments())) {
            return;
        }
        requireArguments().remove("shop_list_data");
        requireActivity().getIntent().setData(null);
    }

    public final void F1() {
        if (this.f14789f0.isEmpty() || this.f14790g0.isEmpty()) {
            return;
        }
        this.f14789f0.remove(0);
        this.f14790g0.remove(0);
        A1();
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.SHOP;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        setHasOptionsMenu(true);
        this.f14787d0 = (InterfaceC2418g) getActivity();
        a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14784a0 = new C0922a(aVar.P(), (com.paymaya.data.preference.a) aVar.e.get(), (d) aVar.f4717g0.get(), (d) aVar.f4748y.get());
        this.f14788e0 = new Handler(Looper.getMainLooper());
        this.f14789f0 = new ArrayList();
        this.f14790g0 = new ArrayList();
        C1().h(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14791h0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2418g interfaceC2418g = this.f14787d0;
        if (interfaceC2418g != null) {
            ((MayaShopActivity) interfaceC2418g).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        ActionBar supportActionBar;
        ActionBar supportActionBar2;
        super.onStart();
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        if (C.e(appCompatActivity != null ? appCompatActivity.getSupportActionBar() : null)) {
            return;
        }
        AppCompatActivity appCompatActivity2 = (AppCompatActivity) getActivity();
        this.f14786c0 = (appCompatActivity2 == null || (supportActionBar2 = appCompatActivity2.getSupportActionBar()) == null) ? 0.0f : supportActionBar2.getElevation();
        D1 d12 = this.f14791h0;
        j.d(d12);
        ((TabLayout) d12.f3584g).setElevation(this.f14786c0);
        AppCompatActivity appCompatActivity3 = (AppCompatActivity) getActivity();
        if (appCompatActivity3 == null || (supportActionBar = appCompatActivity3.getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.setElevation(0.0f);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        AppCompatActivity appCompatActivity;
        ActionBar supportActionBar;
        super.onStop();
        AppCompatActivity appCompatActivity2 = (AppCompatActivity) getActivity();
        if (C.e(appCompatActivity2 != null ? appCompatActivity2.getSupportActionBar() : null) || (appCompatActivity = (AppCompatActivity) getActivity()) == null || (supportActionBar = appCompatActivity.getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.setElevation(this.f14786c0);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C1().j();
        D1 d12 = this.f14791h0;
        j.d(d12);
        final int i = 0;
        ((A1) d12.f).f3548b.setOnClickListener(new View.OnClickListener(this) { // from class: we.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopV3Fragment f20754b;

            {
                this.f20754b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        ShopV3Fragment shopV3Fragment = this.f20754b;
                        Callback.onClick_enter(view2);
                        try {
                            shopV3Fragment.f14789f0.clear();
                            shopV3Fragment.f14790g0.clear();
                            D1 d13 = shopV3Fragment.f14791h0;
                            kotlin.jvm.internal.j.d(d13);
                            ((A1) d13.f).f3548b.setVisibility(8);
                            InterfaceC2418g interfaceC2418g = shopV3Fragment.f14787d0;
                            if (interfaceC2418g != null) {
                                MayaShopActivity mayaShopActivity = (MayaShopActivity) interfaceC2418g;
                                mayaShopActivity.e.Y(mayaShopActivity, "KYUUBI_PENDING");
                            }
                            return;
                        } finally {
                        }
                    default:
                        ShopV3Fragment shopV3Fragment2 = this.f20754b;
                        Callback.onClick_enter(view2);
                        try {
                            shopV3Fragment2.f14789f0.clear();
                            shopV3Fragment2.f14790g0.clear();
                            D1 d14 = shopV3Fragment2.f14791h0;
                            kotlin.jvm.internal.j.d(d14);
                            ((A1) d14.e).f3548b.setVisibility(8);
                            InterfaceC2418g interfaceC2418g2 = shopV3Fragment2.f14787d0;
                            if (interfaceC2418g2 != null) {
                                MayaShopActivity mayaShopActivity2 = (MayaShopActivity) interfaceC2418g2;
                                mayaShopActivity2.e.Y(mayaShopActivity2, "DISBURSEMENT_SUCCESSFUL");
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        D1 d13 = this.f14791h0;
        j.d(d13);
        final int i4 = 1;
        ((A1) d13.e).f3548b.setOnClickListener(new View.OnClickListener(this) { // from class: we.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopV3Fragment f20754b;

            {
                this.f20754b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        ShopV3Fragment shopV3Fragment = this.f20754b;
                        Callback.onClick_enter(view2);
                        try {
                            shopV3Fragment.f14789f0.clear();
                            shopV3Fragment.f14790g0.clear();
                            D1 d132 = shopV3Fragment.f14791h0;
                            kotlin.jvm.internal.j.d(d132);
                            ((A1) d132.f).f3548b.setVisibility(8);
                            InterfaceC2418g interfaceC2418g = shopV3Fragment.f14787d0;
                            if (interfaceC2418g != null) {
                                MayaShopActivity mayaShopActivity = (MayaShopActivity) interfaceC2418g;
                                mayaShopActivity.e.Y(mayaShopActivity, "KYUUBI_PENDING");
                            }
                            return;
                        } finally {
                        }
                    default:
                        ShopV3Fragment shopV3Fragment2 = this.f20754b;
                        Callback.onClick_enter(view2);
                        try {
                            shopV3Fragment2.f14789f0.clear();
                            shopV3Fragment2.f14790g0.clear();
                            D1 d14 = shopV3Fragment2.f14791h0;
                            kotlin.jvm.internal.j.d(d14);
                            ((A1) d14.e).f3548b.setVisibility(8);
                            InterfaceC2418g interfaceC2418g2 = shopV3Fragment2.f14787d0;
                            if (interfaceC2418g2 != null) {
                                MayaShopActivity mayaShopActivity2 = (MayaShopActivity) interfaceC2418g2;
                                mayaShopActivity2.e.Y(mayaShopActivity2, "DISBURSEMENT_SUCCESSFUL");
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View s1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_shop_v3, container, false);
        int i = R.id.bg_green_image_view_pma_fragment_shop_v3_page;
        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.bg_green_image_view_pma_fragment_shop_v3_page)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.pma_view_toolbar;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.pma_view_toolbar);
            if (toolbar != null) {
                i = R.id.purchase_history_notification_completed_view_pma_fragment_shop_v3;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.purchase_history_notification_completed_view_pma_fragment_shop_v3);
                if (viewFindChildViewById != null) {
                    int i4 = R.id.constraint_layout_pma_view_shop_v3_notification_purchase_history_completed;
                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_layout_pma_view_shop_v3_notification_purchase_history_completed)) != null) {
                        CardView cardView = (CardView) viewFindChildViewById;
                        int i6 = R.id.status_image_view_pma_view_shop_v3_notification_purchase_history_completed;
                        if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.status_image_view_pma_view_shop_v3_notification_purchase_history_completed)) != null) {
                            i6 = R.id.subtitle_text_view_pma_view_shop_v3_notification_purchase_history_completed;
                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.subtitle_text_view_pma_view_shop_v3_notification_purchase_history_completed)) != null) {
                                i6 = R.id.title_text_view_pma_view_shop_v3_notification_purchase_history_completed;
                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.title_text_view_pma_view_shop_v3_notification_purchase_history_completed)) != null) {
                                    A1 a12 = new A1(cardView, 5);
                                    i = R.id.purchase_history_notification_processing_view_pma_fragment_shop_v3;
                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.purchase_history_notification_processing_view_pma_fragment_shop_v3);
                                    if (viewFindChildViewById2 != null) {
                                        int i10 = R.id.constraint_layout_pma_view_shop_v3_notification_purchase_history_processing;
                                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.constraint_layout_pma_view_shop_v3_notification_purchase_history_processing)) != null) {
                                            CardView cardView2 = (CardView) viewFindChildViewById2;
                                            int i11 = R.id.status_image_view_pma_view_shop_v3_notification_purchase_history_processing;
                                            if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.status_image_view_pma_view_shop_v3_notification_purchase_history_processing)) != null) {
                                                i11 = R.id.subtitle_text_view_pma_view_shop_v3_notification_purchase_history_processing;
                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.subtitle_text_view_pma_view_shop_v3_notification_purchase_history_processing)) != null) {
                                                    i11 = R.id.title_text_view_pma_view_shop_v3_notification_purchase_history_processing;
                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.title_text_view_pma_view_shop_v3_notification_purchase_history_processing)) != null) {
                                                        A1 a13 = new A1(cardView2, 6);
                                                        i = R.id.tab_layout_pma_fragment_shop_v3;
                                                        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(viewInflate, R.id.tab_layout_pma_fragment_shop_v3);
                                                        if (tabLayout != null) {
                                                            i = R.id.view_pager_pma_fragment_shop_v3;
                                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(viewInflate, R.id.view_pager_pma_fragment_shop_v3);
                                                            if (viewPager != null) {
                                                                this.f14791h0 = new D1(constraintLayout, constraintLayout, toolbar, a12, a13, tabLayout, viewPager);
                                                                j.f(constraintLayout, "getRoot(...)");
                                                                return constraintLayout;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i10 = i11;
                                        }
                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById2.getResources().getResourceName(i10)));
                                    }
                                }
                            }
                        }
                        i4 = i6;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
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
