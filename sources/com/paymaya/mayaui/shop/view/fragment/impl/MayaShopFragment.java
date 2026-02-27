package com.paymaya.mayaui.shop.view.fragment.impl;

import B5.i;
import N5.A1;
import N5.C0491z;
import S5.c;
import Uh.d;
import ac.C0680d;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import bc.a;
import cc.InterfaceC1091d;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.MayaResizingTabLayout;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopFragment;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopFragment extends MayaBaseLoadingFragment implements a {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Lb.a f13998o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C0680d f13999p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f14000q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public InterfaceC1091d f14001r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Handler f14002s0;
    public ArrayList t0 = new ArrayList();
    public ArrayList u0 = new ArrayList();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f14003v0 = "Home";
    public C0491z w0;

    public static final void T1(MayaShopFragment mayaShopFragment) {
        InterfaceC1091d interfaceC1091d = mayaShopFragment.f14001r0;
        if (interfaceC1091d != null) {
            ((MayaShopV2Activity) interfaceC1091d).getIntent().putExtra("origin_screen", "search");
        }
        InterfaceC1091d interfaceC1091d2 = mayaShopFragment.f14001r0;
        if (interfaceC1091d2 != null) {
            MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1091d2;
            mayaShopV2Activity.n1();
            i.H(mayaShopV2Activity, "");
        }
        C1220i c1220iO1 = mayaShopFragment.o1();
        FragmentActivity activity = mayaShopFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaShopFragment.u1());
        c1219hD.n(17);
        AbstractC1414e.n(c1219hD, EnumC1217f.SEARCH, c1220iO1, activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_shop, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.maya_shop_purchase_history_notification_completed_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.maya_shop_purchase_history_notification_completed_view);
        if (viewFindChildViewById != null) {
            int i4 = R.id.shop_notification_history_completed_status_image_view;
            if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.shop_notification_history_completed_status_image_view)) != null) {
                i4 = R.id.shop_notification_history_completed_subtitle_text_view;
                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.shop_notification_history_completed_subtitle_text_view)) != null) {
                    i4 = R.id.shop_notification_history_completed_title_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.shop_notification_history_completed_title_text_view)) != null) {
                        A1 a12 = new A1((CardView) viewFindChildViewById, 3);
                        i = R.id.maya_shop_purchase_history_notification_processing_view;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.maya_shop_purchase_history_notification_processing_view);
                        if (viewFindChildViewById2 != null) {
                            int i6 = R.id.maya_shop_purchase_history_processing_status_image_view;
                            if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.maya_shop_purchase_history_processing_status_image_view)) != null) {
                                i6 = R.id.maya_shop_purchase_history_processing_subtitle_text_view;
                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.maya_shop_purchase_history_processing_subtitle_text_view)) != null) {
                                    i6 = R.id.maya_shop_purchase_history_processing_title_text_view;
                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.maya_shop_purchase_history_processing_title_text_view)) != null) {
                                        A1 a13 = new A1((CardView) viewFindChildViewById2, 4);
                                        i = R.id.maya_shop_tab_layout;
                                        MayaResizingTabLayout mayaResizingTabLayout = (MayaResizingTabLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_shop_tab_layout);
                                        if (mayaResizingTabLayout != null) {
                                            i = R.id.maya_shop_view_pager;
                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(viewInflate, R.id.maya_shop_view_pager);
                                            if (viewPager != null) {
                                                i = R.id.shop_search_container;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.shop_search_container);
                                                if (linearLayout != null) {
                                                    this.w0 = new C0491z(constraintLayout, constraintLayout, a12, a13, mayaResizingTabLayout, viewPager, linearLayout, 16);
                                                    j.f(constraintLayout, "getRoot(...)");
                                                    return constraintLayout;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById2.getResources().getResourceName(i6)));
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_error2, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_loading_fullscreen, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final void P1() {
        if (this.t0.isEmpty() || this.u0.isEmpty()) {
            return;
        }
        Handler handler = this.f14002s0;
        if (handler != null) {
            handler.post((Runnable) this.u0.get(0));
        } else {
            j.n("mNotificationAnimationHandler");
            throw null;
        }
    }

    public final String Q1() {
        if (C.e(getArguments())) {
            return null;
        }
        return requireArguments().getString("shop_list_data");
    }

    public final Lb.a R1() {
        Lb.a aVar = this.f13998o0;
        if (aVar != null) {
            return aVar;
        }
        j.n("mShopV3FragmentPresenter");
        throw null;
    }

    public final void S1() {
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("from_deep_link", "true");
        if (C.e(getArguments())) {
            return;
        }
        requireArguments().remove("shop_list_data");
        requireActivity().getIntent().setData(null);
    }

    public final void U1() {
        if (this.t0.isEmpty() || this.u0.isEmpty()) {
            return;
        }
        this.t0.remove(0);
        this.u0.remove(0);
        P1();
    }

    public final void V1(String str) {
        int i;
        C0680d c0680d = this.f13999p0;
        if (c0680d == null || str == null || str.length() == 0) {
            i = -1;
        } else {
            Iterator it = ((ArrayList) c0680d.c).iterator();
            i = 0;
            while (it.hasNext()) {
                if (j.b(((ShopProviderCategory) it.next()).getCode(), str)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        }
        if (i > -1) {
            C0491z c0491z = this.w0;
            j.d(c0491z);
            ((ViewPager) c0491z.f4304d).setCurrentItem(i);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        setHasOptionsMenu(true);
        this.f14001r0 = (InterfaceC1091d) getActivity();
        O5.a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f13998o0 = new Lb.a(aVar.P(), aVar.Q(), (com.paymaya.data.preference.a) aVar.e.get(), (d) aVar.f4717g0.get(), (d) aVar.f4748y.get());
        this.f14002s0 = new Handler(Looper.getMainLooper());
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        R1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        R1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.w0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1091d interfaceC1091d = this.f14001r0;
        if (interfaceC1091d != null) {
            ((MayaShopV2Activity) interfaceC1091d).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        ActionBar supportActionBar;
        ActionBar supportActionBar2;
        super.onStart();
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        if (C.e(appCompatActivity != null ? appCompatActivity.getSupportActionBar() : null)) {
            return;
        }
        AppCompatActivity appCompatActivity2 = (AppCompatActivity) getActivity();
        this.f14000q0 = (appCompatActivity2 == null || (supportActionBar2 = appCompatActivity2.getSupportActionBar()) == null) ? 0.0f : supportActionBar2.getElevation();
        C0491z c0491z = this.w0;
        j.d(c0491z);
        ((MayaResizingTabLayout) c0491z.f4305g).setElevation(this.f14000q0);
        AppCompatActivity appCompatActivity3 = (AppCompatActivity) getActivity();
        if (appCompatActivity3 == null || (supportActionBar = appCompatActivity3.getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.setElevation(0.0f);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        AppCompatActivity appCompatActivity;
        ActionBar supportActionBar;
        super.onStop();
        AppCompatActivity appCompatActivity2 = (AppCompatActivity) getActivity();
        if (C.e(appCompatActivity2 != null ? appCompatActivity2.getSupportActionBar() : null) || (appCompatActivity = (AppCompatActivity) getActivity()) == null || (supportActionBar = appCompatActivity.getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.setElevation(this.f14000q0);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        R1().j();
        C0491z c0491z = this.w0;
        j.d(c0491z);
        final int i = 0;
        ((A1) c0491z.f).f3548b.setOnClickListener(new View.OnClickListener(this) { // from class: cc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopFragment f9334b;

            {
                this.f9334b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaShopFragment mayaShopFragment = this.f9334b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaShopFragment.t0.clear();
                            mayaShopFragment.u0.clear();
                            C0491z c0491z2 = mayaShopFragment.w0;
                            kotlin.jvm.internal.j.d(c0491z2);
                            ((A1) c0491z2.f).f3548b.setVisibility(8);
                            InterfaceC1091d interfaceC1091d = mayaShopFragment.f14001r0;
                            if (interfaceC1091d != null) {
                                MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1091d;
                                mayaShopV2Activity.n1().Y(mayaShopV2Activity, "KYUUBI_PENDING");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaShopFragment mayaShopFragment2 = this.f9334b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaShopFragment2.t0.clear();
                            mayaShopFragment2.u0.clear();
                            C0491z c0491z3 = mayaShopFragment2.w0;
                            kotlin.jvm.internal.j.d(c0491z3);
                            ((A1) c0491z3.e).f3548b.setVisibility(8);
                            InterfaceC1091d interfaceC1091d2 = mayaShopFragment2.f14001r0;
                            if (interfaceC1091d2 != null) {
                                MayaShopV2Activity mayaShopV2Activity2 = (MayaShopV2Activity) interfaceC1091d2;
                                mayaShopV2Activity2.n1().Y(mayaShopV2Activity2, "DISBURSEMENT_SUCCESSFUL");
                            }
                            return;
                        } finally {
                        }
                    default:
                        MayaShopFragment mayaShopFragment3 = this.f9334b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopFragment.T1(mayaShopFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        C0491z c0491z2 = this.w0;
        j.d(c0491z2);
        final int i4 = 1;
        ((A1) c0491z2.e).f3548b.setOnClickListener(new View.OnClickListener(this) { // from class: cc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopFragment f9334b;

            {
                this.f9334b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaShopFragment mayaShopFragment = this.f9334b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaShopFragment.t0.clear();
                            mayaShopFragment.u0.clear();
                            C0491z c0491z22 = mayaShopFragment.w0;
                            kotlin.jvm.internal.j.d(c0491z22);
                            ((A1) c0491z22.f).f3548b.setVisibility(8);
                            InterfaceC1091d interfaceC1091d = mayaShopFragment.f14001r0;
                            if (interfaceC1091d != null) {
                                MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1091d;
                                mayaShopV2Activity.n1().Y(mayaShopV2Activity, "KYUUBI_PENDING");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaShopFragment mayaShopFragment2 = this.f9334b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaShopFragment2.t0.clear();
                            mayaShopFragment2.u0.clear();
                            C0491z c0491z3 = mayaShopFragment2.w0;
                            kotlin.jvm.internal.j.d(c0491z3);
                            ((A1) c0491z3.e).f3548b.setVisibility(8);
                            InterfaceC1091d interfaceC1091d2 = mayaShopFragment2.f14001r0;
                            if (interfaceC1091d2 != null) {
                                MayaShopV2Activity mayaShopV2Activity2 = (MayaShopV2Activity) interfaceC1091d2;
                                mayaShopV2Activity2.n1().Y(mayaShopV2Activity2, "DISBURSEMENT_SUCCESSFUL");
                            }
                            return;
                        } finally {
                        }
                    default:
                        MayaShopFragment mayaShopFragment3 = this.f9334b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopFragment.T1(mayaShopFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        C0491z c0491z3 = this.w0;
        j.d(c0491z3);
        final int i6 = 2;
        ((LinearLayout) c0491z3.h).setOnClickListener(new View.OnClickListener(this) { // from class: cc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopFragment f9334b;

            {
                this.f9334b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaShopFragment mayaShopFragment = this.f9334b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaShopFragment.t0.clear();
                            mayaShopFragment.u0.clear();
                            C0491z c0491z22 = mayaShopFragment.w0;
                            kotlin.jvm.internal.j.d(c0491z22);
                            ((A1) c0491z22.f).f3548b.setVisibility(8);
                            InterfaceC1091d interfaceC1091d = mayaShopFragment.f14001r0;
                            if (interfaceC1091d != null) {
                                MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1091d;
                                mayaShopV2Activity.n1().Y(mayaShopV2Activity, "KYUUBI_PENDING");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaShopFragment mayaShopFragment2 = this.f9334b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaShopFragment2.t0.clear();
                            mayaShopFragment2.u0.clear();
                            C0491z c0491z32 = mayaShopFragment2.w0;
                            kotlin.jvm.internal.j.d(c0491z32);
                            ((A1) c0491z32.e).f3548b.setVisibility(8);
                            InterfaceC1091d interfaceC1091d2 = mayaShopFragment2.f14001r0;
                            if (interfaceC1091d2 != null) {
                                MayaShopV2Activity mayaShopV2Activity2 = (MayaShopV2Activity) interfaceC1091d2;
                                mayaShopV2Activity2.n1().Y(mayaShopV2Activity2, "DISBURSEMENT_SUCCESSFUL");
                            }
                            return;
                        } finally {
                        }
                    default:
                        MayaShopFragment mayaShopFragment3 = this.f9334b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopFragment.T1(mayaShopFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
    }
}
