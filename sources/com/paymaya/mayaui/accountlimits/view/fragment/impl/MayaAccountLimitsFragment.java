package com.paymaya.mayaui.accountlimits.view.fragment.impl;

import B5.i;
import N5.A;
import N5.C0435a;
import N5.C0489y;
import S5.c;
import Uh.d;
import ac.C0680d;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import b6.C0922a;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.store.C1249b;
import com.paymaya.domain.store.X;
import com.paymaya.mayaui.accountlimits.view.activity.impl.MayaAccountLimitsActivity;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsFragment;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import e6.a;
import f6.InterfaceC1466b;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAccountLimitsFragment extends MayaBaseFragment implements a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0435a f11508U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TabLayout f11509V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ViewPager f11510W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C0489y f11511X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Button f11512Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C0489y f11513Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Button f11514a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public A f11515b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f11516c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C0922a f11517d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public InterfaceC1466b f11518e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public C0680d f11519f0;

    public static final void J1(MayaAccountLimitsFragment mayaAccountLimitsFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.ADDMONEY);
        mayaAccountLimitsFragment.A1(c1219hH);
        InterfaceC1466b interfaceC1466b = mayaAccountLimitsFragment.f11518e0;
        if (interfaceC1466b != null) {
            MayaAccountLimitsActivity mayaAccountLimitsActivity = (MayaAccountLimitsActivity) interfaceC1466b;
            mayaAccountLimitsActivity.n1();
            Intent intent = new Intent(mayaAccountLimitsActivity.getApplicationContext(), (Class<?>) MayaCashInActivity.class);
            intent.setData(mayaAccountLimitsActivity.getIntent().getData());
            i.v0(mayaAccountLimitsActivity, intent);
            mayaAccountLimitsActivity.startActivity(intent);
            mayaAccountLimitsActivity.finish();
        }
    }

    public final C0922a G1() {
        C0922a c0922a = this.f11517d0;
        if (c0922a != null) {
            return c0922a;
        }
        j.n("mAccountLimitsFragmentPresenter");
        throw null;
    }

    public final void H1() {
        TabLayout tabLayout = this.f11509V;
        if (tabLayout == null) {
            j.n("mTabLayoutAccountLimits");
            throw null;
        }
        tabLayout.setVisibility(8);
        ViewPager viewPager = this.f11510W;
        if (viewPager != null) {
            viewPager.setVisibility(8);
        } else {
            j.n("mViewPagerAccountLimits");
            throw null;
        }
    }

    public final void I1() {
        C0489y c0489y = this.f11511X;
        if (c0489y != null) {
            c0489y.f4296b.setVisibility(8);
        } else {
            j.n("mViewAccountLimitsNoCash");
            throw null;
        }
    }

    public final void K1() {
        TabLayout tabLayout = this.f11509V;
        if (tabLayout == null) {
            j.n("mTabLayoutAccountLimits");
            throw null;
        }
        tabLayout.setVisibility(0);
        ViewPager viewPager = this.f11510W;
        if (viewPager != null) {
            viewPager.setVisibility(0);
        } else {
            j.n("mViewPagerAccountLimits");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f11518e0 = (InterfaceC1466b) getActivity();
        O5.a aVar = W4.a.e().g().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C1249b c1249bB = aVar.b();
        X xT = aVar.t();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        d dVar = (d) aVar.f4748y.get();
        j.g(preference, "preference");
        this.f11517d0 = new C0922a(c1249bB, xT, preference, dVar);
        G1().h(this);
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String strL = G1().e.l();
        j.f(strL, "getKYCStatus(...)");
        c1219hM1.j.put("product_type", strL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_account_limits_v2, viewGroup, false);
        int i = R.id.error_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.error_view);
        if (viewFindChildViewById != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewFindChildViewById;
            int i4 = R.id.image_view_error_image;
            if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_error_image)) != null) {
                i4 = R.id.retry_button;
                Button button = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.retry_button);
                if (button != null) {
                    i4 = R.id.text_view_error_message;
                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_error_message)) != null) {
                        i4 = R.id.text_view_error_title;
                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_error_title)) != null) {
                            C0489y c0489y = new C0489y(constraintLayout, button, 4);
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                            i = R.id.maintenance_view;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.maintenance_view);
                            if (viewFindChildViewById2 != null) {
                                int i6 = R.id.image_view_maintenance_image;
                                if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.image_view_maintenance_image)) != null) {
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) viewFindChildViewById2;
                                    int i10 = R.id.text_view_maintenance_message;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.text_view_maintenance_message);
                                    if (textView != null) {
                                        i10 = R.id.text_view_maintenance_title;
                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.text_view_maintenance_title)) != null) {
                                            A a8 = new A(constraintLayout3, textView, 2);
                                            i = R.id.no_cash_view;
                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.no_cash_view);
                                            if (viewFindChildViewById3 != null) {
                                                int i11 = R.id.no_cash_button;
                                                Button button2 = (Button) ViewBindings.findChildViewById(viewFindChildViewById3, R.id.no_cash_button);
                                                if (button2 != null) {
                                                    i11 = R.id.no_cash_image_view;
                                                    if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById3, R.id.no_cash_image_view)) != null) {
                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) viewFindChildViewById3;
                                                        int i12 = R.id.no_cash_subtitle_text_view;
                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById3, R.id.no_cash_subtitle_text_view)) != null) {
                                                            i12 = R.id.no_cash_title_text_view;
                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById3, R.id.no_cash_title_text_view)) != null) {
                                                                C0489y c0489y2 = new C0489y(constraintLayout4, button2, 5);
                                                                i = R.id.tab_layout;
                                                                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(viewInflate, R.id.tab_layout);
                                                                if (tabLayout != null) {
                                                                    i = R.id.view_pager;
                                                                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(viewInflate, R.id.view_pager);
                                                                    if (viewPager != null) {
                                                                        this.f11508U = new C0435a(constraintLayout2, c0489y, a8, c0489y2, tabLayout, viewPager, 7);
                                                                        return constraintLayout2;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i11 = i12;
                                                    }
                                                }
                                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById3.getResources().getResourceName(i11)));
                                            }
                                        }
                                    }
                                    i6 = i10;
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById2.getResources().getResourceName(i6)));
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11508U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1466b interfaceC1466b = this.f11518e0;
        if (interfaceC1466b != null) {
            ((MayaAccountLimitsActivity) interfaceC1466b).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0435a c0435a = this.f11508U;
        j.d(c0435a);
        this.f11509V = (TabLayout) c0435a.f;
        C0435a c0435a2 = this.f11508U;
        j.d(c0435a2);
        this.f11510W = (ViewPager) c0435a2.f4049g;
        C0435a c0435a3 = this.f11508U;
        j.d(c0435a3);
        C0489y c0489y = (C0489y) c0435a3.e;
        this.f11511X = c0489y;
        this.f11512Y = c0489y.c;
        C0435a c0435a4 = this.f11508U;
        j.d(c0435a4);
        C0489y c0489y2 = (C0489y) c0435a4.c;
        this.f11513Z = c0489y2;
        this.f11514a0 = c0489y2.c;
        C0435a c0435a5 = this.f11508U;
        j.d(c0435a5);
        A a8 = (A) c0435a5.f4048d;
        this.f11515b0 = a8;
        this.f11516c0 = a8.c;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        j.f(parentFragmentManager, "getParentFragmentManager(...)");
        C0680d c0680d = new C0680d(parentFragmentManager);
        this.f11519f0 = c0680d;
        ViewPager viewPager = this.f11510W;
        if (viewPager == null) {
            j.n("mViewPagerAccountLimits");
            throw null;
        }
        viewPager.setAdapter(c0680d);
        TabLayout tabLayout = this.f11509V;
        if (tabLayout == null) {
            j.n("mTabLayoutAccountLimits");
            throw null;
        }
        ViewPager viewPager2 = this.f11510W;
        if (viewPager2 == null) {
            j.n("mViewPagerAccountLimits");
            throw null;
        }
        tabLayout.setupWithViewPager(viewPager2);
        G1().j();
        Button button = this.f11512Y;
        if (button == null) {
            j.n("mButtonAccountLimitsNoCashCashIn");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: f6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAccountLimitsFragment f16729b;

            {
                this.f16729b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaAccountLimitsFragment mayaAccountLimitsFragment = this.f16729b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAccountLimitsFragment.J1(mayaAccountLimitsFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaAccountLimitsFragment mayaAccountLimitsFragment2 = this.f16729b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAccountLimitsFragment2.G1().l();
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f11514a0;
        if (button2 == null) {
            j.n("mButtonAccountLimitsErrorRetry");
            throw null;
        }
        final int i4 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: f6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAccountLimitsFragment f16729b;

            {
                this.f16729b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaAccountLimitsFragment mayaAccountLimitsFragment = this.f16729b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAccountLimitsFragment.J1(mayaAccountLimitsFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaAccountLimitsFragment mayaAccountLimitsFragment2 = this.f16729b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAccountLimitsFragment2.G1().l();
                            return;
                        } finally {
                        }
                }
            }
        });
    }
}
