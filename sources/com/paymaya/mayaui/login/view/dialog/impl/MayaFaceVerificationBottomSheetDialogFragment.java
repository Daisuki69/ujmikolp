package com.paymaya.mayaui.login.view.dialog.impl;

import E1.c;
import Eh.d;
import Gh.f;
import Kh.B;
import N5.C0468n;
import O5.a;
import Q6.l;
import a.AbstractC0617a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewbinding.ViewBindings;
import cj.M;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.K;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.mayaui.login.view.dialog.impl.MayaFaceVerificationBottomSheetDialogFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import e9.InterfaceC1432a;
import f9.DialogInterfaceOnShowListenerC1475b;
import f9.InterfaceC1476c;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import o6.C1967a;
import w9.g;
import w9.h;
import w9.m;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaFaceVerificationBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements InterfaceC1432a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0468n f12743S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Button f12744T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Button f12745U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f12746V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public l f12747W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C1229s f12748X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public InterfaceC1476c f12749Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public m f12750Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public g f12751a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public h f12752b0;

    public static final void v1(MayaFaceVerificationBottomSheetDialogFragment mayaFaceVerificationBottomSheetDialogFragment) {
        C1229s c1229s = mayaFaceVerificationBottomSheetDialogFragment.f12748X;
        if (c1229s == null) {
            j.n("authAnalyticsUtils");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = mayaFaceVerificationBottomSheetDialogFragment.requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strM = AbstractC1213b.m(2);
        j.f(strM, "tapped(...)");
        MfaMeta mfaMetaU1 = mayaFaceVerificationBottomSheetDialogFragment.u1();
        String sourceScreen = mfaMetaU1 != null ? mfaMetaU1.getSourceScreen() : null;
        Button button = mayaFaceVerificationBottomSheetDialogFragment.f12744T;
        if (button == null) {
            j.n("mButtonMaybeLater");
            throw null;
        }
        C1229s.c(c1229s, fragmentActivityRequireActivity, strM, "Please verify your identity (Bottom sheet)", sourceScreen, button.getText().toString(), null, null, mayaFaceVerificationBottomSheetDialogFragment.t1(), 96);
        g gVar = mayaFaceVerificationBottomSheetDialogFragment.f12751a0;
        if (gVar != null) {
            gVar.f20719b.a2();
        }
        mayaFaceVerificationBottomSheetDialogFragment.dismiss();
    }

    public static final void w1(MayaFaceVerificationBottomSheetDialogFragment mayaFaceVerificationBottomSheetDialogFragment) {
        C1229s c1229s = mayaFaceVerificationBottomSheetDialogFragment.f12748X;
        if (c1229s == null) {
            j.n("authAnalyticsUtils");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = mayaFaceVerificationBottomSheetDialogFragment.requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strM = AbstractC1213b.m(2);
        j.f(strM, "tapped(...)");
        Button button = mayaFaceVerificationBottomSheetDialogFragment.f12745U;
        if (button == null) {
            j.n("mButtonContinue");
            throw null;
        }
        C1229s.c(c1229s, fragmentActivityRequireActivity, strM, "Please verify your identity (Bottom sheet)", "Tencent Face Auth Screen", button.getText().toString(), null, null, mayaFaceVerificationBottomSheetDialogFragment.t1(), 96);
        l lVar = mayaFaceVerificationBottomSheetDialogFragment.f12747W;
        if (lVar == null) {
            j.n("mMayaFaceVerificationBottomSheetDialogFragmentPresenter");
            throw null;
        }
        InterfaceC1476c interfaceC1476c = ((MayaFaceVerificationBottomSheetDialogFragment) ((InterfaceC1432a) lVar.c.get())).f12749Y;
        if ((interfaceC1476c != null ? interfaceC1476c.g0() : null) != null) {
            ((MayaFaceVerificationBottomSheetDialogFragment) ((InterfaceC1432a) lVar.c.get())).s1();
        } else {
            ((MayaFaceVerificationBottomSheetDialogFragment) ((InterfaceC1432a) lVar.c.get())).s1();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        m1().n(8);
        this.f10327P = true;
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        a aVar = W4.a.e().p().f4756a;
        this.f10325B = (C1220i) aVar.f4716g.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f12747W = new l(11);
        this.f12748X = (C1229s) aVar.f4684R.get();
        KeyEventDispatcher.Component activity = getActivity();
        this.f12749Y = activity instanceof InterfaceC1476c ? (InterfaceC1476c) activity : null;
        l lVar = this.f12747W;
        if (lVar != null) {
            lVar.h(this);
        } else {
            j.n("mMayaFaceVerificationBottomSheetDialogFragmentPresenter");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new DialogInterfaceOnShowListenerC1475b(this, 0));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_face_verification, viewGroup, false);
        int i = R.id.button_continue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
        if (button != null) {
            i = R.id.button_maybe_later;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_maybe_later);
            if (button2 != null) {
                i = R.id.constraint_layout_content_container;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_content_container)) != null) {
                    i = R.id.image_view_camera;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_camera)) != null) {
                        i = R.id.scroll_view_content;
                        if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_content)) != null) {
                            i = R.id.text_view_numbered_tips;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_numbered_tips);
                            if (textView != null) {
                                i = R.id.text_view_spiel;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_spiel)) != null) {
                                    i = R.id.text_view_tips_title;
                                    if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_tips_title)) != null) {
                                        i = R.id.text_view_title;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title)) != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            this.f12743S = new C0468n(constraintLayout, button, button2, textView, 0);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        j.g(dialog, "dialog");
        h hVar = this.f12752b0;
        if (hVar != null) {
            MayaMfaActivity mayaMfaActivity = hVar.f20720a;
            mayaMfaActivity.Z1().q(mayaMfaActivity.f12931r);
            mayaMfaActivity.f12931r = "";
        }
        super.onDismiss(dialog);
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1229s c1229s = this.f12748X;
        if (c1229s == null) {
            j.n("authAnalyticsUtils");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String challengeId = null;
        String strS = AbstractC1213b.s(2);
        j.f(strS, "viewed(...)");
        MfaMeta mfaMetaU1 = u1();
        String sourceScreen = mfaMetaU1 != null ? mfaMetaU1.getSourceScreen() : null;
        Pair pair = new Pair(EnumC1212a.SCREEN_NAME, "Tencent Face Auth Screen");
        EnumC1212a enumC1212a = EnumC1212a.CHALLENGE_ID;
        MfaMeta mfaMetaU12 = u1();
        if (mfaMetaU12 != null) {
            challengeId = mfaMetaU12.getChallengeId();
        }
        if (challengeId == null) {
            challengeId = "";
        }
        C1229s.d(c1229s, fragmentActivityRequireActivity, strS, sourceScreen, null, null, null, M.h(pair, new Pair(enumC1212a, challengeId)), 56);
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final int i = 1;
        final int i4 = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0468n c0468n = this.f12743S;
        j.d(c0468n);
        this.f12745U = c0468n.c;
        C0468n c0468n2 = this.f12743S;
        j.d(c0468n2);
        this.f12744T = c0468n2.f4161d;
        C0468n c0468n3 = this.f12743S;
        j.d(c0468n3);
        this.f12746V = c0468n3.e;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        TextView textView = this.f12746V;
        if (textView == null) {
            j.n("mTextViewTips");
            throw null;
        }
        CharSequence[] charSequenceArr = {getText(R.string.maya_label_face_auth_tips_item_1), getText(R.string.maya_label_face_auth_tips_item_2), getText(R.string.maya_label_face_auth_tips_item_3), getText(R.string.maya_label_face_auth_tips_item_4)};
        CharSequence charSequenceConcat = "";
        int i6 = 0;
        while (i6 < 4) {
            CharSequence charSequence = charSequenceArr[i6];
            SpannableString spannableString = new SpannableString(charSequence);
            i6++;
            spannableString.setSpan(new K(i6), 0, charSequence.length(), 0);
            charSequenceConcat = TextUtils.concat(charSequenceConcat, spannableString);
        }
        textView.setText(charSequenceConcat);
        Button button = this.f12744T;
        if (button == null) {
            j.n("mButtonMaybeLater");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener(this) { // from class: f9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaFaceVerificationBottomSheetDialogFragment f16744b;

            {
                this.f16744b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaFaceVerificationBottomSheetDialogFragment mayaFaceVerificationBottomSheetDialogFragment = this.f16744b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaFaceVerificationBottomSheetDialogFragment.v1(mayaFaceVerificationBottomSheetDialogFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaFaceVerificationBottomSheetDialogFragment mayaFaceVerificationBottomSheetDialogFragment2 = this.f16744b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaFaceVerificationBottomSheetDialogFragment.w1(mayaFaceVerificationBottomSheetDialogFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f12745U;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: f9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MayaFaceVerificationBottomSheetDialogFragment f16744b;

                {
                    this.f16744b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            MayaFaceVerificationBottomSheetDialogFragment mayaFaceVerificationBottomSheetDialogFragment = this.f16744b;
                            Callback.onClick_enter(view2);
                            try {
                                MayaFaceVerificationBottomSheetDialogFragment.v1(mayaFaceVerificationBottomSheetDialogFragment);
                                return;
                            } finally {
                            }
                        default:
                            MayaFaceVerificationBottomSheetDialogFragment mayaFaceVerificationBottomSheetDialogFragment2 = this.f16744b;
                            Callback.onClick_enter(view2);
                            try {
                                MayaFaceVerificationBottomSheetDialogFragment.w1(mayaFaceVerificationBottomSheetDialogFragment2);
                                return;
                            } finally {
                            }
                    }
                }
            });
        } else {
            j.n("mButtonContinue");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1215d p1() {
        return EnumC1215d.FACE_AUTH_PROMPT;
    }

    public final void s1() {
        if (u1() != null) {
            m mVar = this.f12750Z;
            if (mVar != null) {
                MayaMfaActivity mayaMfaActivity = mVar.f20728a;
                mayaMfaActivity.f12931r = "start_face_auth";
                A7.j jVarZ1 = mayaMfaActivity.Z1();
                MayaMfaActivity mayaMfaActivity2 = (MayaMfaActivity) ((v9.a) jVarZ1.c.get());
                mayaMfaActivity2.getClass();
                B bE = c.r(new Ze.c(mayaMfaActivity2).c((String[]) Arrays.copyOf(new String[]{"android.permission.CAMERA"}, 1))).e(b.a());
                f fVar = new f(new C1967a(jVarZ1, 18), d.f1366d);
                bE.g(fVar);
                jVarZ1.e(fVar);
            }
        } else {
            InterfaceC1476c interfaceC1476c = this.f12749Y;
            if (interfaceC1476c != null) {
                interfaceC1476c.J0();
            }
        }
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        j.g(manager, "manager");
        try {
            super.show(manager, str);
        } catch (IllegalStateException unused) {
            FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
            j.f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
            fragmentTransactionBeginTransaction.add(this, str);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }

    public final Map t1() {
        EnumC1212a enumC1212a = EnumC1212a.TYPE;
        MfaMeta mfaMetaU1 = u1();
        String method = mfaMetaU1 != null ? mfaMetaU1.getMethod() : null;
        if (method == null) {
            method = "";
        }
        Pair pair = new Pair(enumC1212a, method);
        EnumC1212a enumC1212a2 = EnumC1212a.PURPOSE;
        MfaMeta mfaMetaU12 = u1();
        String transactionType = mfaMetaU12 != null ? mfaMetaU12.getTransactionType() : null;
        if (transactionType == null) {
            transactionType = "";
        }
        Pair pair2 = new Pair(enumC1212a2, transactionType);
        EnumC1212a enumC1212a3 = EnumC1212a.CHALLENGE_ID;
        MfaMeta mfaMetaU13 = u1();
        String challengeId = mfaMetaU13 != null ? mfaMetaU13.getChallengeId() : null;
        return M.h(pair, pair2, new Pair(enumC1212a3, challengeId != null ? challengeId : ""));
    }

    public final MfaMeta u1() {
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                return (MfaMeta) AbstractC0617a.D(arguments, "mfa_meta", MfaMeta.class);
            }
        } catch (ClassCastException unused) {
        }
        return null;
    }
}
