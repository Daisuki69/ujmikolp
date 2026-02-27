package com.paymaya.common.base;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import kotlin.jvm.internal.j;
import y5.AbstractActivityC2512d;
import y5.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MayaBaseDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1220i f10330B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public MayaLoadingDialogFragment f10331K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C1219h f10332P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f10333Q;

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.MayaDialog;
    }

    public final C1220i l1() {
        C1220i c1220i = this.f10330B;
        if (c1220i != null) {
            return c1220i;
        }
        j.n("mAnalyticsUtils");
        throw null;
    }

    public EnumC1215d m1() {
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

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        C.i(getClass().getSimpleName(), "onAttach dialog fragment");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1219h c1219hD = C1219h.d(m1());
        c1219hD.r(null);
        c1219hD.n(7);
        this.f10332P = c1219hD;
        C.i(getClass().getSimpleName(), "onCreate dialog fragment");
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        j.d(window);
        window.requestFeature(1);
        return dialogOnCreateDialog;
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

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C.i(getClass().getSimpleName(), "onPause dialog fragment");
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C.i(getClass().getSimpleName(), "onResume dialog fragment");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.f10333Q) {
            l1();
            C1219h c1219h = this.f10332P;
            if (c1219h != null) {
                c1219h.f11205g = System.nanoTime();
            } else {
                j.n("durationAnalyticsEvent");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (this.f10333Q) {
            C1220i c1220iL1 = l1();
            FragmentActivity activity = getActivity();
            C1219h c1219h = this.f10332P;
            if (c1219h == null) {
                j.n("durationAnalyticsEvent");
                throw null;
            }
            c1220iL1.d(activity, c1219h);
        }
        C.i(getClass().getSimpleName(), "onStop dialog fragment");
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        ButterKnife.bind(this, view);
        C.i(getClass().getSimpleName(), "onViewCreated dialog fragment");
    }
}
