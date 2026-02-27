package com.paymaya.mayaui.dashboard.view.fragment.impl;

import A7.h;
import F7.a;
import G6.r;
import G7.C0258a;
import G7.C0260c;
import G7.C0262e;
import G7.C0264g;
import G7.C0265h;
import G7.InterfaceC0263f;
import G7.i;
import G7.n;
import Gh.f;
import Ke.b;
import Kh.C0310o;
import Le.j;
import Le.k;
import N5.C0450f;
import N5.F;
import S5.c;
import Uh.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import cj.C1110A;
import cj.C1112C;
import cj.H;
import cj.M;
import cj.t;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.A;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.EnumC1218g;
import com.paymaya.common.widget.MayaResizingTabLayout;
import com.paymaya.domain.model.DashboardTab;
import com.paymaya.domain.model.flagconfig.DashboardContentConfigDetails;
import com.paymaya.domain.model.flagconfig.DashboardTabConfig;
import com.paymaya.domain.store.K;
import com.paymaya.domain.store.Y;
import com.paymaya.mayaui.cards.view.fragment.impl.MayaCardsFragment;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxV2Activity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import defpackage.AbstractC1414e;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import v.AbstractC2329d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaDashboardFragment extends MayaBaseFragment implements a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public F f12155U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ImageView f12156V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ImageView f12157W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C0450f f12158X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ImageView f12159Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public MayaResizingTabLayout f12160Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ViewPager2 f12161a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public AppCompatTextView f12162b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public n f12163c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C0265h f12164d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C0258a f12165e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public k f12166f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final ArrayList f12167g0 = new ArrayList();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Fragment f12168h0 = new MayaCardsFragment();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final ArrayList f12169i0 = new ArrayList();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final ArrayList f12170j0 = new ArrayList();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public i f12171k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ActivityResultLauncher f12172l0;
    public h m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public j f12173n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public d f12174o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public InterfaceC0263f f12175p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public f f12176q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f12177r0;

    public final h G1() {
        h hVar = this.m0;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.j.n("mFragmentPresenter");
        throw null;
    }

    public final String H1() {
        Object next;
        DashboardTab dashboardTab;
        Iterator it = this.f12169i0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i = ((IndexedValue) next).f18163a;
            MayaResizingTabLayout mayaResizingTabLayout = this.f12160Z;
            if (mayaResizingTabLayout == null) {
                kotlin.jvm.internal.j.n("mTabLayoutDashboardV2");
                throw null;
            }
            if (i == mayaResizingTabLayout.getSelectedTabPosition()) {
                break;
            }
        }
        IndexedValue indexedValue = (IndexedValue) next;
        if (indexedValue == null || (dashboardTab = (DashboardTab) indexedValue.f18164b) == null) {
            return null;
        }
        return dashboardTab.getId();
    }

    public final void I1() {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219h = new C1219h();
        c1219h.p(EnumC1215d.CASH_IN);
        AbstractC1414e.m(c1219h, EnumC1216e.MAYA_SAVINGS_ACCOUNT_UPGRADE, 2);
        c1220iO1.c(activity, c1219h);
    }

    public final void J1(String str, Map map) {
        C1220i c1220iO1 = o1();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : map.entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        c1220iO1.c(fragmentActivityRequireActivity, c1219hE);
    }

    public final void K1(String str) {
        C1220i c1220iO1 = o1();
        EnumC1218g enumC1218g = EnumC1218g.SHARED_ROW;
        C1219h c1219h = new C1219h();
        c1219h.o(enumC1218g);
        c1219h.n(17);
        c1219h.t(EnumC1217f.ITEM);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219h.j;
        map.put("button", str);
        map.put("unread_messages", String.valueOf(this.f12177r0));
        c1220iO1.b(c1219h);
    }

    public final void L1(String str, String str2) {
        C0258a c0258a = this.f12165e0;
        if (c0258a == null) {
            kotlin.jvm.internal.j.n("cardsFlutterScreen");
            throw null;
        }
        c0258a.c().a("requestFullscreen", M.h(new Pair("route", str), new Pair("params", str2)), null);
        c0258a.n();
        c0258a.f1838x.invoke(c0258a.d());
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.j.g(context, "context");
        O5.a aVar = (O5.a) W4.a.e().b().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12166f0 = (k) aVar.f4722j0.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        d dVar = (d) aVar.f4748y.get();
        Y yV = aVar.v();
        this.m0 = new h(aVar2, aVar.u(), (d) aVar.f4725k0.get(), yV, aVar.d(), aVar.S(), aVar.n(), (K) aVar.f4671K.get(), (c) aVar.f4724k.get(), aVar.X(), dVar, aVar.e());
        this.f12173n0 = (j) aVar.f4728l0.get();
        this.f12174o0 = (d) aVar.m0.get();
        super.onAttach(context);
        this.f12172l0 = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new C2.f(4));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12175p0 = (InterfaceC0263f) getActivity();
        G1().h(this);
        d dVar = this.f12174o0;
        if (dVar == null) {
            kotlin.jvm.internal.j.n("mSessionSuccessSubject");
            throw null;
        }
        f fVar = new f(new r(this, 2), Eh.d.f1366d);
        dVar.g(fVar);
        this.f12176q0 = fVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_dashboard, viewGroup, false);
        int i = R.id.barrier_dashboard_tabs;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_dashboard_tabs)) != null) {
            i = R.id.constraint_layout_inbox;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_inbox)) != null) {
                i = R.id.image_view_help_center;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_help_center);
                if (imageView != null) {
                    i = R.id.image_view_inbox;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_inbox);
                    if (imageView2 != null) {
                        i = R.id.image_view_profile;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_profile);
                        if (imageView3 != null) {
                            i = R.id.tab_layout_dashboard_v2;
                            MayaResizingTabLayout mayaResizingTabLayout = (MayaResizingTabLayout) ViewBindings.findChildViewById(viewInflate, R.id.tab_layout_dashboard_v2);
                            if (mayaResizingTabLayout != null) {
                                i = R.id.text_view_username;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_username);
                                if (appCompatTextView != null) {
                                    i = R.id.view_inbox_flutter_icon;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_inbox_flutter_icon);
                                    if (viewFindChildViewById != null) {
                                        int i4 = R.id.card_view_inbox_flutter_count;
                                        CardView cardView = (CardView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.card_view_inbox_flutter_count);
                                        if (cardView != null) {
                                            i4 = R.id.text_view_inbox_flutter_count;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_inbox_flutter_count);
                                            if (appCompatTextView2 != null) {
                                                C0450f c0450f = new C0450f((ViewGroup) viewFindChildViewById, (Object) cardView, (Object) appCompatTextView2, 19);
                                                i = R.id.view_pager_fragment;
                                                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(viewInflate, R.id.view_pager_fragment);
                                                if (viewPager2 != null) {
                                                    i = R.id.view_top_toolbar;
                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_top_toolbar);
                                                    if (viewFindChildViewById2 != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                        this.f12155U = new F(constraintLayout, imageView, imageView2, imageView3, mayaResizingTabLayout, appCompatTextView, c0450f, viewPager2, viewFindChildViewById2, 3);
                                                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                                                        return constraintLayout;
                                                    }
                                                }
                                            }
                                        }
                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f fVar = this.f12176q0;
        if (fVar != null) {
            Dh.a.a(fVar);
        }
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f12155U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219hH = AbstractC2329d.h(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("attribution", n1().f10371a);
        c1219hH.i();
        A1(c1219hH);
        InterfaceC0263f interfaceC0263f = this.f12175p0;
        if (interfaceC0263f != null) {
            ((MayaDashboardActivity) interfaceC0263f).Q(this);
        }
        s1().f("ttd");
        if (this.f12163c0 == null || !kotlin.jvm.internal.j.b(H1(), "savings")) {
            return;
        }
        n nVar = this.f12163c0;
        if (nVar != null) {
            nVar.m(this, s5.f.c);
        } else {
            kotlin.jvm.internal.j.n("savingsFlutterScreen");
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object objA;
        Object newMayaCreditFragment;
        final int i = 2;
        final int i4 = 0;
        final int i6 = 1;
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        F f = this.f12155U;
        kotlin.jvm.internal.j.d(f);
        this.f12162b0 = (AppCompatTextView) f.f3616g;
        this.f12156V = (ImageView) f.e;
        this.f12157W = (ImageView) f.c;
        this.f12160Z = (MayaResizingTabLayout) f.f;
        ViewPager2 viewPager2 = (ViewPager2) f.i;
        this.f12161a0 = viewPager2;
        this.f12159Y = (ImageView) f.f3615d;
        this.f12158X = (C0450f) f.h;
        try {
            Field declaredField = ViewPager2.class.getDeclaredField("mRecyclerView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(viewPager2);
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) obj;
            Field declaredField2 = RecyclerView.class.getDeclaredField("mTouchSlop");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(recyclerView);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.Int");
            declaredField2.set(recyclerView, Integer.valueOf(((Integer) obj2).intValue() * 4));
        } catch (Exception unused) {
            yk.a.b();
        }
        ImageView imageView = this.f12156V;
        List list = null;
        boolean z4 = false;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mImageViewProfile");
            throw null;
        }
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: G7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaDashboardFragment f1846b;

            {
                this.f1846b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaDashboardFragment mayaDashboardFragment = this.f1846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaDashboardFragment.K1("profile_menu");
                            InterfaceC0263f interfaceC0263f = mayaDashboardFragment.f12175p0;
                            if (interfaceC0263f != null) {
                                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) interfaceC0263f;
                                mayaDashboardActivity.n1();
                                B5.i.N(mayaDashboardActivity);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaDashboardFragment mayaDashboardFragment2 = this.f1846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaDashboardFragment2.K1("username");
                            InterfaceC0263f interfaceC0263f2 = mayaDashboardFragment2.f12175p0;
                            if (interfaceC0263f2 != null) {
                                MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) interfaceC0263f2;
                                mayaDashboardActivity2.n1();
                                B5.i.N(mayaDashboardActivity2);
                            }
                            return;
                        } finally {
                        }
                    default:
                        MayaDashboardFragment mayaDashboardFragment3 = this.f1846b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.INBOX);
                            c1219h.i();
                            mayaDashboardFragment3.A1(c1219h);
                            InterfaceC0263f interfaceC0263f3 = mayaDashboardFragment3.f12175p0;
                            if (interfaceC0263f3 != null) {
                                MayaDashboardActivity mayaDashboardActivity3 = (MayaDashboardActivity) interfaceC0263f3;
                                com.paymaya.common.utility.C.Q(mayaDashboardActivity3, mayaDashboardActivity3.getCurrentFocus());
                                mayaDashboardActivity3.n1();
                                mayaDashboardActivity3.startActivity(new Intent(mayaDashboardActivity3, (Class<?>) MayaInboxV2Activity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        AppCompatTextView appCompatTextView = this.f12162b0;
        if (appCompatTextView == null) {
            kotlin.jvm.internal.j.n("mTextViewUsername");
            throw null;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener(this) { // from class: G7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaDashboardFragment f1846b;

            {
                this.f1846b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaDashboardFragment mayaDashboardFragment = this.f1846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaDashboardFragment.K1("profile_menu");
                            InterfaceC0263f interfaceC0263f = mayaDashboardFragment.f12175p0;
                            if (interfaceC0263f != null) {
                                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) interfaceC0263f;
                                mayaDashboardActivity.n1();
                                B5.i.N(mayaDashboardActivity);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaDashboardFragment mayaDashboardFragment2 = this.f1846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaDashboardFragment2.K1("username");
                            InterfaceC0263f interfaceC0263f2 = mayaDashboardFragment2.f12175p0;
                            if (interfaceC0263f2 != null) {
                                MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) interfaceC0263f2;
                                mayaDashboardActivity2.n1();
                                B5.i.N(mayaDashboardActivity2);
                            }
                            return;
                        } finally {
                        }
                    default:
                        MayaDashboardFragment mayaDashboardFragment3 = this.f1846b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.INBOX);
                            c1219h.i();
                            mayaDashboardFragment3.A1(c1219h);
                            InterfaceC0263f interfaceC0263f3 = mayaDashboardFragment3.f12175p0;
                            if (interfaceC0263f3 != null) {
                                MayaDashboardActivity mayaDashboardActivity3 = (MayaDashboardActivity) interfaceC0263f3;
                                com.paymaya.common.utility.C.Q(mayaDashboardActivity3, mayaDashboardActivity3.getCurrentFocus());
                                mayaDashboardActivity3.n1();
                                mayaDashboardActivity3.startActivity(new Intent(mayaDashboardActivity3, (Class<?>) MayaInboxV2Activity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        ImageView imageView2 = this.f12159Y;
        if (imageView2 == null) {
            kotlin.jvm.internal.j.n("mImageViewHelpCenter");
            throw null;
        }
        b.b(imageView2, new C0260c(this, i6));
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("tab") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("subroute") : null;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("inbox_route") : null;
        h hVarG1 = G1();
        hVarG1.j();
        String strB = hVarG1.f213g.b();
        kotlin.jvm.internal.j.f(strB, "getUsernameIdentity(...)");
        if (!hVarG1.f212d.e().isMayaV2SetUsernameEnabled() || C2576A.H(strB)) {
            AppCompatTextView appCompatTextView2 = ((MayaDashboardFragment) ((a) hVarG1.c.get())).f12162b0;
            if (appCompatTextView2 == null) {
                kotlin.jvm.internal.j.n("mTextViewUsername");
                throw null;
            }
            appCompatTextView2.setVisibility(8);
            ImageView imageView3 = ((MayaDashboardFragment) ((a) hVarG1.c.get())).f12156V;
            if (imageView3 == null) {
                kotlin.jvm.internal.j.n("mImageViewProfile");
                throw null;
            }
            imageView3.setVisibility(0);
        } else {
            AppCompatTextView appCompatTextView3 = ((MayaDashboardFragment) ((a) hVarG1.c.get())).f12162b0;
            if (appCompatTextView3 == null) {
                kotlin.jvm.internal.j.n("mTextViewUsername");
                throw null;
            }
            appCompatTextView3.setVisibility(0);
            MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((a) hVarG1.c.get());
            mayaDashboardFragment.getClass();
            AppCompatTextView appCompatTextView4 = mayaDashboardFragment.f12162b0;
            if (appCompatTextView4 == null) {
                kotlin.jvm.internal.j.n("mTextViewUsername");
                throw null;
            }
            appCompatTextView4.setText(strB);
            ImageView imageView4 = ((MayaDashboardFragment) ((a) hVarG1.c.get())).f12156V;
            if (imageView4 == null) {
                kotlin.jvm.internal.j.n("mImageViewProfile");
                throw null;
            }
            imageView4.setVisibility(8);
        }
        if (hVarG1.f212d.e().isInboxV4Enabled()) {
            ImageView imageView5 = ((MayaDashboardFragment) ((a) hVarG1.c.get())).f12157W;
            if (imageView5 == null) {
                kotlin.jvm.internal.j.n("mImageViewInbox");
                throw null;
            }
            imageView5.setVisibility(8);
            C0450f c0450f = ((MayaDashboardFragment) ((a) hVarG1.c.get())).f12158X;
            if (c0450f == null) {
                kotlin.jvm.internal.j.n("mViewInboxFlutterIcon");
                throw null;
            }
            ((ConstraintLayout) c0450f.c).setVisibility(0);
            MayaDashboardFragment mayaDashboardFragment2 = (MayaDashboardFragment) ((a) hVarG1.c.get());
            C0450f c0450f2 = mayaDashboardFragment2.f12158X;
            if (c0450f2 == null) {
                kotlin.jvm.internal.j.n("mViewInboxFlutterIcon");
                throw null;
            }
            b.b((ConstraintLayout) c0450f2.c, new C0260c(mayaDashboardFragment2, i));
        } else {
            ImageView imageView6 = ((MayaDashboardFragment) ((a) hVarG1.c.get())).f12157W;
            if (imageView6 == null) {
                kotlin.jvm.internal.j.n("mImageViewInbox");
                throw null;
            }
            imageView6.setVisibility(0);
            C0450f c0450f3 = ((MayaDashboardFragment) ((a) hVarG1.c.get())).f12158X;
            if (c0450f3 == null) {
                kotlin.jvm.internal.j.n("mViewInboxFlutterIcon");
                throw null;
            }
            ((ConstraintLayout) c0450f3.c).setVisibility(8);
            final MayaDashboardFragment mayaDashboardFragment3 = (MayaDashboardFragment) ((a) hVarG1.c.get());
            ImageView imageView7 = mayaDashboardFragment3.f12157W;
            if (imageView7 == null) {
                kotlin.jvm.internal.j.n("mImageViewInbox");
                throw null;
            }
            imageView7.setOnClickListener(new View.OnClickListener(mayaDashboardFragment3) { // from class: G7.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MayaDashboardFragment f1846b;

                {
                    this.f1846b = mayaDashboardFragment3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            MayaDashboardFragment mayaDashboardFragment4 = this.f1846b;
                            Callback.onClick_enter(view2);
                            try {
                                mayaDashboardFragment4.K1("profile_menu");
                                InterfaceC0263f interfaceC0263f = mayaDashboardFragment4.f12175p0;
                                if (interfaceC0263f != null) {
                                    MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) interfaceC0263f;
                                    mayaDashboardActivity.n1();
                                    B5.i.N(mayaDashboardActivity);
                                }
                                return;
                            } finally {
                            }
                        case 1:
                            MayaDashboardFragment mayaDashboardFragment22 = this.f1846b;
                            Callback.onClick_enter(view2);
                            try {
                                mayaDashboardFragment22.K1("username");
                                InterfaceC0263f interfaceC0263f2 = mayaDashboardFragment22.f12175p0;
                                if (interfaceC0263f2 != null) {
                                    MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) interfaceC0263f2;
                                    mayaDashboardActivity2.n1();
                                    B5.i.N(mayaDashboardActivity2);
                                }
                                return;
                            } finally {
                            }
                        default:
                            MayaDashboardFragment mayaDashboardFragment32 = this.f1846b;
                            Callback.onClick_enter(view2);
                            try {
                                C1219h c1219h = new C1219h();
                                c1219h.n(17);
                                c1219h.t(EnumC1217f.INBOX);
                                c1219h.i();
                                mayaDashboardFragment32.A1(c1219h);
                                InterfaceC0263f interfaceC0263f3 = mayaDashboardFragment32.f12175p0;
                                if (interfaceC0263f3 != null) {
                                    MayaDashboardActivity mayaDashboardActivity3 = (MayaDashboardActivity) interfaceC0263f3;
                                    com.paymaya.common.utility.C.Q(mayaDashboardActivity3, mayaDashboardActivity3.getCurrentFocus());
                                    mayaDashboardActivity3.n1();
                                    mayaDashboardActivity3.startActivity(new Intent(mayaDashboardActivity3, (Class<?>) MayaInboxV2Activity.class));
                                }
                                return;
                            } finally {
                            }
                    }
                }
            });
            hVarG1.e(new C0310o(hVarG1.f.e(zh.b.a()), new V2.c(hVarG1, i), Eh.d.c, Eh.d.f1365b).f());
            hVarG1.D(hVarG1.e.b());
        }
        String strD = hVarG1.f215l.d(A5.f.c);
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = (DashboardContentConfigDetails) A.f10366a.e(strD, DashboardContentConfigDetails.class);
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        boolean z5 = objA instanceof C1038i;
        Object obj3 = objA;
        if (z5) {
            obj3 = null;
        }
        DashboardContentConfigDetails dashboardContentConfigDetails = (DashboardContentConfigDetails) obj3;
        List<DashboardTabConfig> tabsList = dashboardContentConfigDetails != null ? dashboardContentConfigDetails.getTabsList() : null;
        if (tabsList == null) {
            tabsList = C1112C.f9377a;
        }
        List<DashboardTabConfig> tabsList2 = tabsList;
        if (tabsList2.isEmpty()) {
            tabsList2 = new DashboardContentConfigDetails(list, i6, z4 ? 1 : 0).getTabsList();
        }
        List<DashboardTabConfig> list2 = tabsList2;
        ArrayList arrayList = new ArrayList(t.l(list2, 10));
        for (DashboardTabConfig dashboardTabConfig : list2) {
            arrayList.add(new DashboardTab(dashboardTabConfig.getName(), dashboardTabConfig.getId(), null, 4, null));
        }
        MayaDashboardFragment mayaDashboardFragment4 = (MayaDashboardFragment) ((a) hVarG1.c.get());
        mayaDashboardFragment4.getClass();
        InterfaceC0263f interfaceC0263f = mayaDashboardFragment4.f12175p0;
        if (interfaceC0263f != null) {
            ((MayaDashboardActivity) interfaceC0263f).f12140T = arrayList;
        }
        Iterator it = C1110A.a0(arrayList).iterator();
        while (true) {
            H h = (H) it;
            if (!h.f9381b.hasNext()) {
                MayaDashboardFragment mayaDashboardFragment5 = (MayaDashboardFragment) ((a) hVarG1.c.get());
                MayaResizingTabLayout mayaResizingTabLayout = mayaDashboardFragment5.f12160Z;
                if (mayaResizingTabLayout == null) {
                    kotlin.jvm.internal.j.n("mTabLayoutDashboardV2");
                    throw null;
                }
                mayaResizingTabLayout.setVisibility(0);
                FragmentActivity fragmentActivityRequireActivity = mayaDashboardFragment5.requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                ArrayList arrayList2 = mayaDashboardFragment5.f12170j0;
                ArrayList arrayList3 = new ArrayList(t.l(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add((Fragment) ((Pair) it2.next()).f18160a);
                }
                D7.d dVar = new D7.d(fragmentActivityRequireActivity, C1110A.V(arrayList3));
                ViewPager2 viewPager22 = mayaDashboardFragment5.f12161a0;
                if (viewPager22 == null) {
                    kotlin.jvm.internal.j.n("mViewPageFragment");
                    throw null;
                }
                viewPager22.setAdapter(dVar);
                ViewPager2 viewPager23 = mayaDashboardFragment5.f12161a0;
                if (viewPager23 == null) {
                    kotlin.jvm.internal.j.n("mViewPageFragment");
                    throw null;
                }
                viewPager23.setOffscreenPageLimit(1);
                MayaResizingTabLayout mayaResizingTabLayout2 = mayaDashboardFragment5.f12160Z;
                if (mayaResizingTabLayout2 == null) {
                    kotlin.jvm.internal.j.n("mTabLayoutDashboardV2");
                    throw null;
                }
                ViewPager2 viewPager24 = mayaDashboardFragment5.f12161a0;
                if (viewPager24 == null) {
                    kotlin.jvm.internal.j.n("mViewPageFragment");
                    throw null;
                }
                new TabLayoutMediator(mayaResizingTabLayout2, viewPager24, new C0262e(mayaDashboardFragment5)).attach();
                MayaResizingTabLayout mayaResizingTabLayout3 = mayaDashboardFragment5.f12160Z;
                if (mayaResizingTabLayout3 == null) {
                    kotlin.jvm.internal.j.n("mTabLayoutDashboardV2");
                    throw null;
                }
                mayaResizingTabLayout3.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C0264g(mayaDashboardFragment5));
                hVarG1.p(string, string2);
                hVarG1.E(string3);
                return;
            }
            IndexedValue indexedValue = (IndexedValue) h.next();
            DashboardTab dashboardTab = (DashboardTab) indexedValue.f18164b;
            String id = dashboardTab.getId();
            switch (id.hashCode()) {
                case -1352291591:
                    if (id.equals("credit")) {
                        newMayaCreditFragment = new NewMayaCreditFragment();
                        dashboardTab.setEventTarget(EnumC1217f.CREDIT);
                    } else {
                        newMayaCreditFragment = null;
                    }
                    break;
                case -1183703051:
                    if (id.equals("invest")) {
                        newMayaCreditFragment = new Fragment();
                        dashboardTab.setEventTarget(EnumC1217f.INVESTMENT);
                    } else {
                        newMayaCreditFragment = null;
                    }
                    break;
                case -795192327:
                    if (id.equals("wallet")) {
                        newMayaCreditFragment = new MayaWalletFragment();
                        dashboardTab.setEventTarget(EnumC1217f.WALLET);
                    } else {
                        newMayaCreditFragment = null;
                    }
                    break;
                case 94431075:
                    if (id.equals("cards")) {
                        newMayaCreditFragment = mayaDashboardFragment4.f12168h0;
                        dashboardTab.setEventTarget(EnumC1217f.MY_CARDS);
                    } else {
                        newMayaCreditFragment = null;
                    }
                    break;
                case 103143811:
                    if (id.equals("loans")) {
                        newMayaCreditFragment = FlutterFragment.withCachedEngine("loans").renderMode(RenderMode.texture).build();
                        dashboardTab.setEventTarget(EnumC1217f.LOANS);
                    } else {
                        newMayaCreditFragment = null;
                    }
                    break;
                case 1872948409:
                    if (id.equals("savings")) {
                        newMayaCreditFragment = FlutterFragment.withCachedEngine("savings").renderMode(RenderMode.texture).build();
                        dashboardTab.setEventTarget(EnumC1217f.SAVINGS);
                    } else {
                        newMayaCreditFragment = null;
                    }
                    break;
                default:
                    newMayaCreditFragment = null;
                    break;
            }
            if (newMayaCreditFragment != null) {
                mayaDashboardFragment4.f12170j0.add(new Pair(newMayaCreditFragment, dashboardTab.getId()));
            }
            mayaDashboardFragment4.f12169i0.add(indexedValue);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return true;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.DASHBOARD;
    }
}
