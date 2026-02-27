package com.paymaya.common.base;

import Ag.l;
import Xh.i;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.paymaya.R;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.data.preference.a;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import y5.AbstractActivityC2512d;
import y5.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseFragment extends Fragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1220i f10245B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public a f10246K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ProgressDialog f10247P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C1219h f10248Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f10249R = false;

    public EnumC1216e U() {
        return null;
    }

    public final AttributionSource l1() {
        AttributionSource attributionSource = (getActivity() == null || !(getActivity() instanceof AbstractActivityC2512d)) ? (getActivity() == null || !(getActivity() instanceof q)) ? null : (AttributionSource) ((q) getActivity()).getIntent().getParcelableExtra("extra_attribution_source") : (AttributionSource) ((AbstractActivityC2512d) getActivity()).getIntent().getParcelableExtra("extra_attribution_source");
        return attributionSource == null ? AttributionSource.c : attributionSource;
    }

    public EnumC1215d m1() {
        if (getActivity() != null && (getActivity() instanceof AbstractActivityC2512d)) {
            return ((AbstractActivityC2512d) getActivity()).k1();
        }
        if (getActivity() == null || !(getActivity() instanceof q)) {
            return null;
        }
        return ((q) getActivity()).q1();
    }

    public final void n1() {
        this.f10247P.dismiss();
    }

    public final void o1(C1219h c1219h) {
        C1220i c1220i = this.f10245B;
        FragmentActivity activity = getActivity();
        c1219h.p(m1());
        c1219h.r(U());
        c1220i.c(activity, c1219h);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f10247P = new ProgressDialog(context);
        new MayaLoadingDialogFragment();
        C.i(getClass().getSimpleName(), "onAttach fragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1219h c1219hD = C1219h.d(m1());
        c1219hD.r(U());
        c1219hD.n(7);
        this.f10248Q = c1219hD;
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
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        C.i(getClass().getSimpleName(), "onPause fragment");
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
        if (this.f10249R) {
            C1220i c1220i = this.f10245B;
            C1219h c1219h = this.f10248Q;
            c1220i.getClass();
            C1220i.f(c1219h);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (this.f10249R) {
            this.f10245B.d(getActivity(), this.f10248Q);
        }
        C.i(getClass().getSimpleName(), "onStop fragment");
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.bind(this, view);
        C.i(getClass().getSimpleName(), "onViewCreated fragment");
    }

    public final void p1() {
        C.R(getActivity());
        this.f10247P.setTitle("");
        this.f10247P.setMessage(getString(R.string.pma_progress_message_please_wait));
        this.f10247P.setCancelable(false);
        this.f10247P.show();
    }

    public final void q1(String str) {
        if (getActivity() != null) {
            i.J(getActivity(), new l(25, this, str));
        }
    }
}
