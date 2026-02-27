package com.paymaya.mayaui.paybills.view.fragment.impl;

import A7.j;
import Dh.c;
import Gh.f;
import Kh.C0301f;
import Kh.C0305j;
import Kh.C0307l;
import N5.C0491z;
import O5.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.C1110A;
import cj.C1112C;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.store.A0;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;
import de.m;
import ea.d;
import ea.h;
import ea.i;
import fa.ViewOnClickListenerC1479a;
import ga.g;
import ha.A;
import ha.B;
import ha.z;
import io.reactivex.rxjava3.disposables.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPayBillsSearchFragment extends MayaBaseFragment implements g {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0491z f13472U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public AppCompatEditText f13473V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public AppCompatImageView f13474W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public RecyclerView f13475X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LottieAnimationView f13476Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Group f13477Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Group f13478a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public j f13479b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public h f13480c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public z f13481d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public DashboardLayoutManager f13483f0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f13488k0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final c f13482e0 = new c(1);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f13484g0 = true;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public b f13485h0 = new c(1);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f13486i0 = "";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f13487j0 = 1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f13489l0 = "";
    public final EnumC1216e m0 = EnumC1216e.SEARCH;

    public static final void J1(MayaPayBillsSearchFragment mayaPayBillsSearchFragment) {
        mayaPayBillsSearchFragment.f13485h0.dispose();
        mayaPayBillsSearchFragment.f13488k0 = false;
        mayaPayBillsSearchFragment.L1();
        AppCompatEditText appCompatEditText = mayaPayBillsSearchFragment.f13473V;
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextSearchInput");
            throw null;
        }
        appCompatEditText.setText("");
        mayaPayBillsSearchFragment.f13486i0 = "";
        if (mayaPayBillsSearchFragment.t1().e().isBillsPayEventsV2Enabled()) {
            mayaPayBillsSearchFragment.K1("Clear");
        }
    }

    public final j G1() {
        j jVar = this.f13479b0;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n("mMayaPayBillsSearchFragmentPresenter");
        throw null;
    }

    public final void H1() {
        Context context = getContext();
        InputMethodManager inputMethodManager = (InputMethodManager) (context != null ? context.getSystemService("input_method") : null);
        if (inputMethodManager != null) {
            AppCompatEditText appCompatEditText = this.f13473V;
            if (appCompatEditText != null) {
                inputMethodManager.hideSoftInputFromWindow(appCompatEditText.getWindowToken(), 0);
            } else {
                kotlin.jvm.internal.j.n("mEditTextSearchInput");
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void I1() {
        h hVar = this.f13480c0;
        if (hVar == null) {
            kotlin.jvm.internal.j.n("mBillerSearchListAdapter");
            throw null;
        }
        d dVar = (d) C1110A.H(hVar.f16614d);
        if (dVar == null || dVar.f16611a != -1) {
            return;
        }
        Iterable iterable = (Iterable) hVar.f16614d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((d) obj).f16611a != -1) {
                arrayList.add(obj);
            }
        }
        hVar.f(arrayList);
    }

    public final void K1(String str) {
        C1219h c1219hE = C1219h.e(AbstractC1173g.a(14));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("button", str);
        map.put("page", "Search");
        o1().b(c1219hE);
    }

    public final void L1() {
        LottieAnimationView lottieAnimationView = this.f13476Y;
        if (lottieAnimationView == null) {
            kotlin.jvm.internal.j.n("mLottieAnimationViewLoading");
            throw null;
        }
        lottieAnimationView.setVisibility(8);
        RecyclerView recyclerView = this.f13475X;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewBillerItems");
            throw null;
        }
        recyclerView.setVisibility(8);
        Group group = this.f13477Z;
        if (group == null) {
            kotlin.jvm.internal.j.n("mConstraintGroupEmptyResults");
            throw null;
        }
        group.setVisibility(8);
        Group group2 = this.f13478a0;
        if (group2 == null) {
            kotlin.jvm.internal.j.n("mConstraintGroupError");
            throw null;
        }
        group2.setVisibility(8);
        j jVarG1 = G1();
        AppCompatEditText appCompatEditText = this.f13473V;
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextSearchInput");
            throw null;
        }
        jVarG1.Q(String.valueOf(appCompatEditText.getText()));
        h hVar = this.f13480c0;
        if (hVar != null) {
            hVar.e(C1112C.f9377a);
        } else {
            kotlin.jvm.internal.j.n("mBillerSearchListAdapter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return this.m0;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f13481d0 = (z) getActivity();
        a aVar = W4.a.e().t().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f13479b0 = new j(aVar.g(), (com.paymaya.data.preference.a) aVar.e.get(), (Uh.d) aVar.f4748y.get());
        G1().h(this);
        this.f13480c0 = new h(this, t1().e().isBillersItemsListAcceptsMayaCreditSubtextEnabled());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_pay_bills_search, viewGroup, false);
        int i = R.id.constraint_group_empty_results_state;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_empty_results_state);
        if (group != null) {
            i = R.id.constraint_group_error_state;
            Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_error_state);
            if (group2 != null) {
                i = R.id.edit_text_search_input;
                AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(viewInflate, R.id.edit_text_search_input);
                if (appCompatEditText != null) {
                    i = R.id.image_view_clear_search;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_clear_search);
                    if (appCompatImageView != null) {
                        i = R.id.image_view_empty_results_graphic;
                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_empty_results_graphic)) != null) {
                            i = R.id.image_view_error_graphic;
                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_error_graphic)) != null) {
                                i = R.id.left_guideline;
                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                                    i = R.id.lottie_animation_view_loading;
                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_animation_view_loading);
                                    if (lottieAnimationView != null) {
                                        i = R.id.recycler_view_biller_items;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_biller_items);
                                        if (recyclerView != null) {
                                            i = R.id.right_guideline;
                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                                                i = R.id.text_view_empty_results_message;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_empty_results_message)) != null) {
                                                    i = R.id.text_view_empty_results_title;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_empty_results_title)) != null) {
                                                        i = R.id.text_view_error_message;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_error_message)) != null) {
                                                            i = R.id.text_view_error_title;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_error_title)) != null) {
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                this.f13472U = new C0491z(constraintLayout, group, group2, appCompatEditText, appCompatImageView, lottieAnimationView, recyclerView);
                                                                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                                                                return constraintLayout;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
        this.f13482e0.dispose();
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        j jVarG1 = G1();
        AppCompatEditText appCompatEditText = this.f13473V;
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextSearchInput");
            throw null;
        }
        jVarG1.Q(String.valueOf(appCompatEditText.getText()));
        z zVar = this.f13481d0;
        if (zVar != null) {
            ((MayaPayBillsActivity) zVar).f13344w = "Search";
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        z zVar = this.f13481d0;
        if (zVar != null) {
            ((MayaPayBillsActivity) zVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Resources.Theme theme;
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f13472U;
        kotlin.jvm.internal.j.d(c0491z);
        this.f13473V = (AppCompatEditText) c0491z.f4304d;
        C0491z c0491z2 = this.f13472U;
        kotlin.jvm.internal.j.d(c0491z2);
        this.f13474W = (AppCompatImageView) c0491z2.e;
        C0491z c0491z3 = this.f13472U;
        kotlin.jvm.internal.j.d(c0491z3);
        this.f13475X = (RecyclerView) c0491z3.f;
        C0491z c0491z4 = this.f13472U;
        kotlin.jvm.internal.j.d(c0491z4);
        this.f13476Y = (LottieAnimationView) c0491z4.h;
        C0491z c0491z5 = this.f13472U;
        kotlin.jvm.internal.j.d(c0491z5);
        this.f13477Z = (Group) c0491z5.c;
        C0491z c0491z6 = this.f13472U;
        kotlin.jvm.internal.j.d(c0491z6);
        this.f13478a0 = (Group) c0491z6.f4305g;
        C0305j c0305jC = new C0307l(new C0301f(new m(this, 13), 0), 0).c(B.f16973a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Kh.B bE = c0305jC.b(500L).e(zh.b.a());
        f fVar = new f(new A0(this, 10), Eh.d.f1366d);
        bE.g(fVar);
        this.f13482e0.a(fVar);
        C0491z c0491z7 = this.f13472U;
        kotlin.jvm.internal.j.d(c0491z7);
        RecyclerView recyclerView = (RecyclerView) c0491z7.f;
        DashboardLayoutManager dashboardLayoutManager = new DashboardLayoutManager(recyclerView.getContext(), 1, false);
        this.f13483f0 = dashboardLayoutManager;
        recyclerView.setLayoutManager(dashboardLayoutManager);
        h hVar = this.f13480c0;
        if (hVar == null) {
            kotlin.jvm.internal.j.n("mBillerSearchListAdapter");
            throw null;
        }
        recyclerView.setAdapter(hVar);
        recyclerView.addOnScrollListener(new A(this));
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
        Context context = getContext();
        TypedValue typedValue = new TypedValue();
        int i = (context == null || (theme = context.getTheme()) == null || !theme.resolveAttribute(R.attr.mayaContentViewBorderColor, typedValue, true)) ? R.color.maya_primary_white : typedValue.resourceId;
        i iVar = new i();
        iVar.f16615a = contextRequireContext.getResources().getDimensionPixelOffset(R.dimen.maya_margin_large);
        iVar.f16616b = contextRequireContext.getResources().getDimensionPixelOffset(R.dimen.maya_margin_normal);
        iVar.c = contextRequireContext.getResources().getDimensionPixelSize(R.dimen.maya_margin_normal);
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(contextRequireContext, i));
        iVar.f16617d = paint;
        recyclerView.addItemDecoration(iVar);
        this.f13475X = recyclerView;
        AppCompatImageView appCompatImageView = this.f13474W;
        if (appCompatImageView == null) {
            kotlin.jvm.internal.j.n("mImageViewClearSearch");
            throw null;
        }
        appCompatImageView.setOnClickListener(new ViewOnClickListenerC1479a(this, 6));
        AppCompatEditText appCompatEditText = this.f13473V;
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextSearchInput");
            throw null;
        }
        appCompatEditText.requestFocus();
        Object systemService = requireActivity().getSystemService("input_method");
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        AppCompatEditText appCompatEditText2 = this.f13473V;
        if (appCompatEditText2 == null) {
            kotlin.jvm.internal.j.n("mEditTextSearchInput");
            throw null;
        }
        inputMethodManager.showSoftInput(appCompatEditText2, 1);
        G1().j();
    }
}
