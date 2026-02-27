package com.paymaya.common.base;

import W4.b;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import y5.AbstractActivityC2512d;
import y5.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MayaBaseBottomSheetDialogFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1220i f10325B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C1219h f10326K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f10327P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final InterfaceC1033d f10328Q = C1034e.b(new b(this, 27));

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f10329R = 7;

    public C1220i J() {
        return n1();
    }

    public EnumC1216e U() {
        return null;
    }

    public final View l1(BottomSheetDialog bottomSheetDialog) {
        if (bottomSheetDialog != null) {
            return bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
        }
        return null;
    }

    public final C1219h m1() {
        C1219h c1219h = this.f10326K;
        if (c1219h != null) {
            return c1219h;
        }
        j.n("durationAnalyticsEvent");
        throw null;
    }

    public final C1220i n1() {
        C1220i c1220i = this.f10325B;
        if (c1220i != null) {
            return c1220i;
        }
        j.n("mAnalyticsUtils");
        throw null;
    }

    public final int o1() {
        return (int) (((Number) q1().f18161b).floatValue() * 0.7f);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        C.i(getClass().getSimpleName(), "onAttach dialog fragment");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1219h c1219hD = C1219h.d(p1());
        c1219hD.r(U());
        c1219hD.n(this.f10329R);
        this.f10326K = c1219hD;
        C.i(getClass().getSimpleName(), "onCreate dialog fragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C.i(getClass().getSimpleName(), "onDestroy dialog fragment");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C.i(getClass().getSimpleName(), "onDestroyView dialog fragment");
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (!((Boolean) this.f10328Q.getValue()).booleanValue()) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
            j.d(layoutInflaterOnGetLayoutInflater);
            return layoutInflaterOnGetLayoutInflater;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super.onGetLayoutInflater(bundle);
        j.f(layoutInflaterOnGetLayoutInflater2, "onGetLayoutInflater(...)");
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater2.cloneInContext(new ContextThemeWrapper(requireContext(), R.style.MayaThemeLight));
        j.d(layoutInflaterCloneInContext);
        return layoutInflaterCloneInContext;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        C.i(getClass().getSimpleName(), "onPause dialog fragment");
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C.i(getClass().getSimpleName(), "onResume dialog fragment");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.f10327P) {
            n1();
            m1().f11205g = System.nanoTime();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        if (this.f10327P) {
            n1().d(getActivity(), m1());
        }
        C.i(getClass().getSimpleName(), "onStop dialog fragment");
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C.i(getClass().getSimpleName(), "onViewCreated dialog fragment");
    }

    public EnumC1215d p1() {
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

    public final Pair q1() {
        WindowManager windowManager;
        Display defaultDisplay;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Activity activity = (Activity) getContext();
        if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    public final void r1(C1219h c1219h) {
        C1220i c1220iN1 = n1();
        FragmentActivity activity = getActivity();
        c1219h.p(p1());
        c1219h.r(U());
        c1220iN1.c(activity, c1219h);
    }
}
