package com.paymaya.common.base;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import butterknife.ButterKnife;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import y5.AbstractActivityC2512d;
import y5.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1220i f10241B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ProgressDialog f10242K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C1219h f10243P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f10244Q = false;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f10242K = new ProgressDialog(context);
        C.i(getClass().getSimpleName(), "onAttach dialog fragment");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1219h c1219hD = C1219h.d((getActivity() == null || !(getActivity() instanceof AbstractActivityC2512d)) ? (getActivity() == null || !(getActivity() instanceof q)) ? null : ((q) getActivity()).q1() : ((AbstractActivityC2512d) getActivity()).k1());
        c1219hD.r(null);
        c1219hD.n(7);
        this.f10243P = c1219hD;
        C.i(getClass().getSimpleName(), "onCreate dialog fragment");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getWindow().requestFeature(1);
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
        if (this.f10244Q) {
            C1220i c1220i = this.f10241B;
            C1219h c1219h = this.f10243P;
            c1220i.getClass();
            C1220i.f(c1219h);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (this.f10244Q) {
            this.f10241B.d(getActivity(), this.f10243P);
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
