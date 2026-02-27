package com.paymaya.common.base;

import Ag.l;
import S5.c;
import Sc.d;
import W4.b;
import Xh.i;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import bj.C1034e;
import bj.InterfaceC1033d;
import butterknife.ButterKnife;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.data.preference.a;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import kotlin.jvm.internal.j;
import l9.C1803a;
import o6.f;
import y5.AbstractActivityC2512d;
import y5.q;
import y5.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MayaBaseFragment extends Fragment implements s {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1220i f10334B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public a f10335K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public c f10336P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C1219h f10337Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f10338R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f10339S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final InterfaceC1033d f10340T = C1034e.b(new b(this, 28));

    public static void l1(final View viewToApplyMarginTop) {
        j.g(viewToApplyMarginTop, "viewToApplyMarginTop");
        final View rootView = viewToApplyMarginTop.getRootView();
        rootView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: y5.r
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
                kotlin.jvm.internal.j.g(insets, "insets");
                int systemWindowInsetTop = insets.getSystemWindowInsetTop();
                View view2 = viewToApplyMarginTop;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                kotlin.jvm.internal.j.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + systemWindowInsetTop, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                view2.setLayoutParams(marginLayoutParams);
                rootView.setOnApplyWindowInsetsListener(null);
                return insets.consumeSystemWindowInsets();
            }
        });
    }

    public final void A1(C1219h analyticsEvent) {
        j.g(analyticsEvent, "analyticsEvent");
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        analyticsEvent.p(u1());
        analyticsEvent.r(U());
        c1220iO1.c(activity, analyticsEvent);
    }

    public final void B1(String str) {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            j.e(activity, "null cannot be cast to non-null type android.app.Activity");
            i.J(activity, new l(26, this, str));
        }
    }

    public final void C1(String str) {
        C.R(getActivity());
        if (getChildFragmentManager().findFragmentByTag("loading_dialog") == null) {
            Bundle bundle = new Bundle();
            bundle.putString("message", str);
            bundle.putBoolean("cancelable", false);
            MayaLoadingDialogFragment mayaLoadingDialogFragment = new MayaLoadingDialogFragment();
            mayaLoadingDialogFragment.setArguments(bundle);
            getChildFragmentManager().beginTransaction().add(mayaLoadingDialogFragment, "loading_dialog").commitNowAllowingStateLoss();
        }
    }

    public final void D1() {
        C.R(getActivity());
        C1("");
    }

    public final void E1() {
        C.R(getActivity());
        C1("");
    }

    public final void F1() {
        if (this.f10338R) {
            o1();
            m1().f11205g = System.nanoTime();
        }
    }

    public C1220i J() {
        return o1();
    }

    public EnumC1216e U() {
        return null;
    }

    public final C1219h m1() {
        C1219h c1219h = this.f10337Q;
        if (c1219h != null) {
            return c1219h;
        }
        j.n("durationAnalyticsEvent");
        throw null;
    }

    public final AttributionSource n1() {
        AttributionSource attributionSource;
        if (getActivity() == null) {
            return AttributionSource.c;
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof AbstractActivityC2512d) {
            FragmentActivity activity2 = getActivity();
            j.e(activity2, "null cannot be cast to non-null type com.paymaya.common.base.BaseActivity");
            attributionSource = (AttributionSource) ((AbstractActivityC2512d) activity2).getIntent().getParcelableExtra("extra_attribution_source");
        } else if (activity instanceof q) {
            FragmentActivity activity3 = getActivity();
            j.e(activity3, "null cannot be cast to non-null type com.paymaya.common.base.MayaBaseActivity");
            attributionSource = (AttributionSource) ((q) activity3).getIntent().getParcelableExtra("extra_attribution_source");
        } else {
            attributionSource = AttributionSource.c;
        }
        return attributionSource == null ? AttributionSource.c : attributionSource;
    }

    public final C1220i o1() {
        C1220i c1220i = this.f10334B;
        if (c1220i != null) {
            return c1220i;
        }
        j.n("mAnalyticsUtils");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        s1().f739a = p1();
        s1().e("ttd");
        s1().e("ttfd");
        C.i(getClass().getSimpleName(), "onAttach fragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(U());
        c1219hD.n(7);
        c1219hD.i();
        this.f10337Q = c1219hD;
        C.i(getClass().getSimpleName(), "onCreate fragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C.i(getClass().getSimpleName(), "onDestroy fragment");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C.i(getClass().getSimpleName(), "onDestroyView fragment");
        s1().a();
        super.onDestroyView();
    }

    public void onDismiss() {
        w1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        C.i(getClass().getSimpleName(), "onPause fragment");
        s1().a();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C.i(getClass().getSimpleName(), "onResume fragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C.i(getClass().getSimpleName(), "onStart fragment");
        F1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        y1();
        C.i(getClass().getSimpleName(), "onStop fragment");
        s1().a();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        ButterKnife.bind(this, view);
        View view2 = getView();
        if (view2 != null) {
            ViewCompat.setOnApplyWindowInsetsListener(view2, new C1803a(this, 27));
        }
        C.i(getClass().getSimpleName(), "onViewCreated fragment");
        f fVar = new f(this, 21);
        d dVar = new d();
        dVar.f5718a = view;
        dVar.f5719b = fVar;
        dVar.c = new Handler(Looper.getMainLooper());
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnDrawListener(dVar);
        } else {
            view.addOnAttachStateChangeListener(new Sc.c(dVar, 0));
        }
    }

    public boolean p1() {
        return this instanceof MayaSessionExpiredFragment;
    }

    public final c q1() {
        c cVar = this.f10336P;
        if (cVar != null) {
            return cVar;
        }
        j.n("mFlagConfigurationService");
        throw null;
    }

    public boolean r1() {
        return false;
    }

    public final C5.a s1() {
        return (C5.a) this.f10340T.getValue();
    }

    public final a t1() {
        a aVar = this.f10335K;
        if (aVar != null) {
            return aVar;
        }
        j.n("mPreference");
        throw null;
    }

    public EnumC1215d u1() {
        EnumC1215d enumC1215dQ1;
        FragmentActivity activity = getActivity();
        EnumC1215d enumC1215d = EnumC1215d.DEFAULT;
        if (activity != null) {
            FragmentActivity activity2 = getActivity();
            if (activity2 instanceof AbstractActivityC2512d) {
                FragmentActivity activity3 = getActivity();
                j.e(activity3, "null cannot be cast to non-null type com.paymaya.common.base.BaseActivity");
                enumC1215dQ1 = ((AbstractActivityC2512d) activity3).k1();
            } else if (activity2 instanceof q) {
                FragmentActivity activity4 = getActivity();
                j.e(activity4, "null cannot be cast to non-null type com.paymaya.common.base.MayaBaseActivity");
                enumC1215dQ1 = ((q) activity4).q1();
            } else {
                enumC1215dQ1 = enumC1215d;
            }
            if (enumC1215dQ1 != null) {
                return enumC1215dQ1;
            }
        }
        return enumC1215d;
    }

    public final int v1() {
        Display defaultDisplay = requireActivity().getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final void w1() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("loading_dialog");
        DialogFragment dialogFragment = fragmentFindFragmentByTag instanceof DialogFragment ? (DialogFragment) fragmentFindFragmentByTag : null;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
    }

    public final void x1(OnBackPressedCallback onBackPressedCallback) {
        j.g(onBackPressedCallback, "onBackPressedCallback");
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback);
    }

    public final void y1() {
        if (this.f10338R) {
            o1().d(getActivity(), m1());
        }
    }

    public final void z1(C1219h analyticsEvent) {
        j.g(analyticsEvent, "analyticsEvent");
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        analyticsEvent.p(u1());
        c1220iO1.c(activity, analyticsEvent);
    }
}
