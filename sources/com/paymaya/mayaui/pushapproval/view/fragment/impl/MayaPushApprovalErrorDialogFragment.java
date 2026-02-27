package com.paymaya.mayaui.pushapproval.view.fragment.impl;

import Da.a;
import N5.C0450f;
import Xh.i;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.Navigation;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseDialogFragment;
import com.paymaya.common.utility.C1220i;
import i8.C1593a;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaPushApprovalErrorDialogFragment extends MayaBaseDialogFragment implements a {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0450f f13546R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f13547S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C1593a f13548T;

    public static final void n1(MayaPushApprovalErrorDialogFragment mayaPushApprovalErrorDialogFragment) {
        C1593a c1593a = mayaPushApprovalErrorDialogFragment.f13548T;
        if (c1593a == null) {
            j.n("mayaPushApprovalErrorDialogFragmentPresenter");
            throw null;
        }
        ((MayaPushApprovalErrorDialogFragment) ((a) c1593a.c.get())).f13547S = true;
        FragmentActivity fragmentActivityRequireActivity = ((MayaPushApprovalErrorDialogFragment) ((a) c1593a.c.get())).requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigation.findNavController(fragmentActivityRequireActivity, R.id.nav_host_fragment).popBackStack();
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10330B = (C1220i) W4.a.e().u().f4752a.f4716g.get();
        C1593a c1593a = new C1593a(14);
        this.f13548T = c1593a;
        c1593a.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_push_approval_error, viewGroup, false);
        int i = R.id.button_action;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_action);
        if (button != null) {
            i = R.id.image_view_error_image;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_error_image)) != null) {
                i = R.id.text_view_error_message;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_error_message)) != null) {
                    i = R.id.text_view_error_title;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_error_title)) != null) {
                        i = R.id.view_divider;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_divider);
                        if (viewFindChildViewById != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.f13546R = new C0450f((ViewGroup) constraintLayout, (Object) button, (Object) viewFindChildViewById, 4);
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
        i.G(this, Boolean.valueOf(this.f13547S));
        C1593a c1593a = this.f13548T;
        if (c1593a == null) {
            j.n("mayaPushApprovalErrorDialogFragmentPresenter");
            throw null;
        }
        c1593a.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f13546R = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0450f c0450f = this.f13546R;
        j.d(c0450f);
        ((Button) c0450f.f4087b).setOnClickListener(new Ba.a(this, 2));
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
    }
}
