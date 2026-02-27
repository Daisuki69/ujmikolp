package com.paymaya.mayaui.login.view.dialog.impl;

import A5.b;
import Lb.a;
import N5.C0447e;
import S5.c;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.P;
import com.paymaya.common.utility.e0;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.login.view.dialog.impl.MayaRegistrationSuccessBottomSheetDialogFragment;
import e9.InterfaceC1433b;
import f9.DialogInterfaceOnShowListenerC1475b;
import f9.InterfaceC1478e;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaRegistrationSuccessBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements InterfaceC1433b {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0447e f12757S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public a f12758T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C1229s f12759U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public c f12760V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public View f12761W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Button f12762X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Button f12763Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Group f12764Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public InterfaceC1478e f12765a0;

    public static final void v1(MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment) {
        Group group = mayaRegistrationSuccessBottomSheetDialogFragment.f12764Z;
        if (group == null) {
            j.n("mConstraintGroupSubmitInviteCode");
            throw null;
        }
        if (group.getVisibility() == 0) {
            mayaRegistrationSuccessBottomSheetDialogFragment.n1().b(C1219h.e(AbstractC1213b.k(3, EnumC1217f.INPUT_CODE)));
        } else {
            C1219h c1219hD = C1219h.d(EnumC1215d.REGISTRATION);
            c1219hD.r(EnumC1216e.SUCCESS);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.SUBMIT_CODE);
            c1219hD.i();
            mayaRegistrationSuccessBottomSheetDialogFragment.r1(c1219hD);
        }
        mayaRegistrationSuccessBottomSheetDialogFragment.s1(new Pair("Invite code", mayaRegistrationSuccessBottomSheetDialogFragment.u1() ? "Referral" : "Submit invite code"));
        a aVarT1 = mayaRegistrationSuccessBottomSheetDialogFragment.t1();
        if (((com.paymaya.data.preference.a) aVarT1.f).e().isMgmRedesignEnabled()) {
            MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment2 = (MayaRegistrationSuccessBottomSheetDialogFragment) ((InterfaceC1433b) aVarT1.c.get());
            mayaRegistrationSuccessBottomSheetDialogFragment2.dismiss();
            InterfaceC1478e interfaceC1478e = mayaRegistrationSuccessBottomSheetDialogFragment2.f12765a0;
            if (interfaceC1478e != null) {
                interfaceC1478e.D();
            }
        }
    }

    public static final void w1(MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment) {
        Group group = mayaRegistrationSuccessBottomSheetDialogFragment.f12764Z;
        if (group == null) {
            j.n("mConstraintGroupSubmitInviteCode");
            throw null;
        }
        if (group.getVisibility() == 0) {
            mayaRegistrationSuccessBottomSheetDialogFragment.n1().b(C1219h.e(AbstractC1213b.k(3, EnumC1217f.HOME)));
        } else {
            C1219h c1219hD = C1219h.d(EnumC1215d.REGISTRATION);
            c1219hD.r(EnumC1216e.SUCCESS);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.HOME);
            c1219hD.i();
            mayaRegistrationSuccessBottomSheetDialogFragment.r1(c1219hD);
        }
        Button button = mayaRegistrationSuccessBottomSheetDialogFragment.f12762X;
        if (button == null) {
            j.n("mButtonGoToHome");
            throw null;
        }
        mayaRegistrationSuccessBottomSheetDialogFragment.s1(new Pair(button.getText().toString(), "Dashboard"));
        mayaRegistrationSuccessBottomSheetDialogFragment.dismiss();
        ((P) mayaRegistrationSuccessBottomSheetDialogFragment.t1().h).a();
        InterfaceC1478e interfaceC1478e = mayaRegistrationSuccessBottomSheetDialogFragment.f12765a0;
        if (interfaceC1478e != null) {
            interfaceC1478e.x();
        }
    }

    public static final void x1(MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment) {
        String string;
        Group group = mayaRegistrationSuccessBottomSheetDialogFragment.f12764Z;
        if (group == null) {
            j.n("mConstraintGroupSubmitInviteCode");
            throw null;
        }
        if (group.getVisibility() == 0) {
            mayaRegistrationSuccessBottomSheetDialogFragment.n1().b(C1219h.e(AbstractC1213b.k(3, EnumC1217f.UPGRADE)));
        } else {
            C1219h c1219hD = C1219h.d(EnumC1215d.REGISTRATION);
            c1219hD.r(EnumC1216e.SUCCESS);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.UPGRADE);
            c1219hD.i();
            mayaRegistrationSuccessBottomSheetDialogFragment.r1(c1219hD);
        }
        Button button = mayaRegistrationSuccessBottomSheetDialogFragment.f12763Y;
        if (button == null) {
            j.n("mButtonUpgradeNow");
            throw null;
        }
        String string2 = button.getText().toString();
        if (mayaRegistrationSuccessBottomSheetDialogFragment.u1()) {
            string = "KYC Upgrade";
        } else {
            string = mayaRegistrationSuccessBottomSheetDialogFragment.getString(R.string.maya_fragment_kyc_initial_loading_screen_label);
            j.f(string, "getString(...)");
        }
        mayaRegistrationSuccessBottomSheetDialogFragment.s1(new Pair(string2, string));
        mayaRegistrationSuccessBottomSheetDialogFragment.dismiss();
        ((P) mayaRegistrationSuccessBottomSheetDialogFragment.t1().h).a();
        InterfaceC1478e interfaceC1478e = mayaRegistrationSuccessBottomSheetDialogFragment.f12765a0;
        if (interfaceC1478e != null) {
            interfaceC1478e.N();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.SUCCESS;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().p().f4756a;
        this.f10325B = (C1220i) aVar.f4716g.get();
        this.f12758T = new a((com.paymaya.data.preference.a) aVar.e.get(), (c) aVar.f4724k.get(), (e0) aVar.f4685S.get(), (P) aVar.f4687T.get());
        this.f12759U = (C1229s) aVar.f4684R.get();
        this.f12760V = (c) aVar.f4724k.get();
        m1().i();
        m1().n(8);
        this.f10327P = true;
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        KeyEventDispatcher.Component activity = getActivity();
        this.f12765a0 = activity instanceof InterfaceC1478e ? (InterfaceC1478e) activity : null;
        t1().h(this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new DialogInterfaceOnShowListenerC1475b(this, 2));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_registration_success, viewGroup, false);
        int i = R.id.button_go_to_home;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_go_to_home);
        if (button != null) {
            i = R.id.button_upgrade_now;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_upgrade_now);
            if (button2 != null) {
                i = R.id.constraint_group_submit_invite_code;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_submit_invite_code);
                if (group != null) {
                    i = R.id.guideline_left_submit_invite_code;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_left_submit_invite_code)) != null) {
                        i = R.id.guideline_right_submit_invite_code;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_right_submit_invite_code)) != null) {
                            i = R.id.image_view_graphic_header;
                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_graphic_header)) != null) {
                                i = R.id.image_view_submit_invite_code_icon;
                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_submit_invite_code_icon)) != null) {
                                    i = R.id.space_submit_invite_code_bottom;
                                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_submit_invite_code_bottom)) != null) {
                                        i = R.id.space_submit_invite_code_top;
                                        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_submit_invite_code_top)) != null) {
                                            i = R.id.text_view_description;
                                            if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description)) != null) {
                                                i = R.id.text_view_submit_invite_code_spiel;
                                                if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_submit_invite_code_spiel)) != null) {
                                                    i = R.id.text_view_submit_invite_code_title;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_submit_invite_code_title)) != null) {
                                                        i = R.id.text_view_title;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title)) != null) {
                                                            i = R.id.view_submit_invite_code_section;
                                                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_submit_invite_code_section);
                                                            if (viewFindChildViewById != null) {
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                this.f12757S = new C0447e(constraintLayout, button, button2, group, viewFindChildViewById, 3);
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

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f12757S;
        j.d(c0447e);
        this.f12761W = (View) c0447e.f;
        C0447e c0447e2 = this.f12757S;
        j.d(c0447e2);
        this.f12763Y = (Button) c0447e2.f4080d;
        C0447e c0447e3 = this.f12757S;
        j.d(c0447e3);
        this.f12762X = (Button) c0447e3.c;
        C0447e c0447e4 = this.f12757S;
        j.d(c0447e4);
        this.f12764Z = (Group) c0447e4.e;
        View view2 = this.f12761W;
        if (view2 == null) {
            j.n("mViewSubmitInviteCodeSection");
            throw null;
        }
        final int i = 0;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: f9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationSuccessBottomSheetDialogFragment f16748b;

            {
                this.f16748b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i) {
                    case 0:
                        MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment = this.f16748b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaRegistrationSuccessBottomSheetDialogFragment.v1(mayaRegistrationSuccessBottomSheetDialogFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment2 = this.f16748b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaRegistrationSuccessBottomSheetDialogFragment.w1(mayaRegistrationSuccessBottomSheetDialogFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment3 = this.f16748b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaRegistrationSuccessBottomSheetDialogFragment.x1(mayaRegistrationSuccessBottomSheetDialogFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f12762X;
        if (button == null) {
            j.n("mButtonGoToHome");
            throw null;
        }
        final int i4 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: f9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationSuccessBottomSheetDialogFragment f16748b;

            {
                this.f16748b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i4) {
                    case 0:
                        MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment = this.f16748b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaRegistrationSuccessBottomSheetDialogFragment.v1(mayaRegistrationSuccessBottomSheetDialogFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment2 = this.f16748b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaRegistrationSuccessBottomSheetDialogFragment.w1(mayaRegistrationSuccessBottomSheetDialogFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment3 = this.f16748b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaRegistrationSuccessBottomSheetDialogFragment.x1(mayaRegistrationSuccessBottomSheetDialogFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f12763Y;
        if (button2 == null) {
            j.n("mButtonUpgradeNow");
            throw null;
        }
        final int i6 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: f9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationSuccessBottomSheetDialogFragment f16748b;

            {
                this.f16748b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i6) {
                    case 0:
                        MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment = this.f16748b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaRegistrationSuccessBottomSheetDialogFragment.v1(mayaRegistrationSuccessBottomSheetDialogFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment2 = this.f16748b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaRegistrationSuccessBottomSheetDialogFragment.w1(mayaRegistrationSuccessBottomSheetDialogFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment3 = this.f16748b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaRegistrationSuccessBottomSheetDialogFragment.x1(mayaRegistrationSuccessBottomSheetDialogFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        t1().j();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1215d p1() {
        return EnumC1215d.REGISTRATION;
    }

    public final void s1(Pair pair) {
        String strP = u1() ? AbstractC1213b.p(12) : AbstractC1213b.o(3);
        String str = u1() ? "Registration Success (Bottom sheet)" : "You're in! Welcome to Maya (Bottom sheet)";
        j.d(strP);
        String str2 = (String) pair.f18160a;
        String str3 = (String) pair.f18161b;
        C1229s c1229s = this.f12759U;
        if (c1229s == null) {
            j.n("mAuthAnalyticsUtils");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        C1229s.c(c1229s, fragmentActivityRequireActivity, strP, str, str3, str2, null, null, null, 224);
    }

    public final a t1() {
        a aVar = this.f12758T;
        if (aVar != null) {
            return aVar;
        }
        j.n("mMayaRegistrationSuccessBottomSheetDialogFragmentPresenter");
        throw null;
    }

    public final boolean u1() {
        c cVar = this.f12760V;
        if (cVar != null) {
            return c.b(cVar, b.f53B1);
        }
        j.n("mFlagConfigurationService");
        throw null;
    }
}
