package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ae.a;
import K8.InterfaceC0292q;
import M8.C0332a;
import M8.O0;
import M8.P0;
import N5.C0435a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseDialogFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.D;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaKycErrorDialogFragment extends MayaBaseDialogFragment implements InterfaceC0292q {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0435a f12530R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public a f12531S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public P0 f12532T;

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycErrorDialogFragment.MayaKycErrorDialogFragmentListener");
        this.f12532T = (P0) componentRequireActivity;
        this.f10330B = (C1220i) ((O5.a) W4.a.e().f().c).f4716g.get();
        a aVar = new a(12);
        this.f12531S = aVar;
        aVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_kyc_error, viewGroup, false);
        int i = R.id.maya_kyc_button_action;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_button_action);
        if (button != null) {
            i = R.id.maya_kyc_image_view_error_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_image_view_error_image);
            if (imageView != null) {
                i = R.id.maya_kyc_text_view_error_message;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_text_view_error_message);
                if (textView != null) {
                    i = R.id.maya_kyc_text_view_error_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_text_view_error_title);
                    if (textView2 != null) {
                        i = R.id.maya_kyc_view_divider;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_view_divider);
                        if (viewFindChildViewById != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.f12530R = new C0435a((ViewGroup) constraintLayout, (View) button, (View) imageView, textView, textView2, viewFindChildViewById, 6);
                            j.f(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        a aVar = this.f12531S;
        if (aVar == null) {
            j.n("mKycErrorDialogFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12530R = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        j.g(dialog, "dialog");
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycErrorDialogFragment.ErrorDialogDismissListener");
        ((O0) componentRequireActivity).onDismiss();
        super.onDismiss(dialog);
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            a aVar = this.f12531S;
            if (aVar == null) {
                j.n("mKycErrorDialogFragmentPresenter");
                throw null;
            }
            int i = arguments.getInt("drawableRes");
            int i4 = arguments.getInt("titleRes");
            int i6 = arguments.getInt("messageRes");
            int i10 = arguments.getInt("actionRes");
            aVar.j();
            MayaKycErrorDialogFragment mayaKycErrorDialogFragment = (MayaKycErrorDialogFragment) ((InterfaceC0292q) aVar.c.get());
            C0435a c0435a = mayaKycErrorDialogFragment.f12530R;
            j.d(c0435a);
            ((ImageView) c0435a.f4048d).setImageDrawable(ContextCompat.getDrawable(mayaKycErrorDialogFragment.requireContext(), i));
            Button button = (Button) c0435a.c;
            C.r0(button, new C0332a(mayaKycErrorDialogFragment, 4));
            button.setText(mayaKycErrorDialogFragment.getString(i10));
            ((TextView) c0435a.f4049g).setText(mayaKycErrorDialogFragment.getString(i4));
            ((TextView) c0435a.e).setText(mayaKycErrorDialogFragment.getString(i6));
        }
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("pageSource") : null;
        if (j.b(string, getString(R.string.maya_fragment_kyc_liveness_capture_screen_label))) {
            return;
        }
        Bundle arguments3 = getArguments();
        int i11 = arguments3 != null ? arguments3.getInt("errorCode") : -1;
        String strD = D.d(i11);
        P0 p02 = this.f12532T;
        C1219h c1219hH = p02 != null ? p02.H() : null;
        if (c1219hH != null) {
            c1219hH.s("ERROR");
            c1219hH.n(2);
            c1219hH.g("page", string);
            c1219hH.g(StateEvent.Name.ERROR_CODE, String.valueOf(i11));
            c1219hH.g(Constants.REASON, strD);
        }
        l1().c(getActivity(), c1219hH);
    }
}
