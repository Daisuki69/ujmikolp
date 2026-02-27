package com.paymaya.common.base;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ConfirmationBottomSheetFragment;
import io.flutter.plugins.firebase.core.a;
import y5.AbstractActivityC2512d;
import y5.q;

/* JADX INFO: loaded from: classes3.dex */
public class BaseBottomSheetDialogFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1220i f10238B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C1219h f10239K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f10240P = false;

    public EnumC1216e U() {
        return null;
    }

    public EnumC1215d l1() {
        if (getActivity() != null && (getActivity() instanceof AbstractActivityC2512d)) {
            return ((AbstractActivityC2512d) getActivity()).k1();
        }
        if (getActivity() == null || !(getActivity() instanceof q)) {
            return null;
        }
        return ((q) getActivity()).q1();
    }

    public final void m1(C1219h c1219h) {
        C1220i c1220i = this.f10238B;
        FragmentActivity activity = getActivity();
        c1219h.p(l1());
        c1219h.r(U());
        c1220i.c(activity, c1219h);
    }

    public final void n1(ConstraintLayout constraintLayout) {
        if (getView() == null) {
            return;
        }
        getView().post(new a(20, (ShopV3ConfirmationBottomSheetFragment) this, constraintLayout));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        C.i(getClass().getSimpleName(), "onAttach dialog fragment");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1219h c1219hD = C1219h.d(l1());
        c1219hD.r(U());
        c1219hD.n(7);
        this.f10239K = c1219hD;
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

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
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
        if (this.f10240P) {
            C1220i c1220i = this.f10238B;
            C1219h c1219h = this.f10239K;
            c1220i.getClass();
            C1220i.f(c1219h);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (this.f10240P) {
            this.f10238B.d(getActivity(), this.f10239K);
        }
        C.i(getClass().getSimpleName(), "onStop dialog fragment");
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.bind(this, view);
        C.i(getClass().getSimpleName(), "onViewCreated dialog fragment");
    }
}
