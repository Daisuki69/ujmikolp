package com.paymaya.mayaui.pushapproval.view.fragment.impl;

import Ag.k;
import Da.c;
import N5.C0489y;
import W4.a;
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
import bj.C1034e;
import bj.InterfaceC1033d;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import i8.C1593a;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements c {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0489y f13554S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f13555T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final InterfaceC1033d f13556U = C1034e.b(new k(this, 13));

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C1593a f13557V;

    public static final void s1(MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.DONE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("challengeId", (String) mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment.f13556U.getValue());
        c1219hH.i();
        mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment.r1(c1219hH);
        C1593a c1593a = mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment.f13557V;
        if (c1593a == null) {
            j.n("mMayaPushApprovalRequestAuthorizedBottomSheetDialogFragmentPresenter");
            throw null;
        }
        ((MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment) ((c) c1593a.c.get())).f13555T = true;
        FragmentActivity fragmentActivityRequireActivity = ((MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment) ((c) c1593a.c.get())).requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigation.findNavController(fragmentActivityRequireActivity, R.id.nav_host_fragment).popBackStack();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.REQUEST_APPROVED;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10325B = (C1220i) a.e().u().f4752a.f4716g.get();
        C1593a c1593a = new C1593a(15);
        this.f13557V = c1593a;
        c1593a.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        this.f10327P = true;
        m1().i();
        m1().o(p1());
        m1().r(EnumC1216e.REQUEST_APPROVED);
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("challengeId", (String) this.f13556U.getValue());
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setOnShowListener(new Fa.c(this, 0));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_push_approval_authorize, viewGroup, false);
        int i = R.id.button_done;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_done);
        if (button != null) {
            i = R.id.image_view_success;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_success)) != null) {
                i = R.id.text_view_header;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                    i = R.id.text_view_header_subtext;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_subtext)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f13554S = new C0489y(constraintLayout, button, 0);
                        j.f(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        i.G(this, Boolean.valueOf(this.f13555T));
        C1593a c1593a = this.f13557V;
        if (c1593a == null) {
            j.n("mMayaPushApprovalRequestAuthorizedBottomSheetDialogFragmentPresenter");
            throw null;
        }
        c1593a.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f13554S = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0489y c0489y = this.f13554S;
        j.d(c0489y);
        c0489y.c.setOnClickListener(new Ba.a(this, 3));
    }
}
