package com.paymaya.mayaui.rekyc.view.fragment.impl;

import Bb.a;
import N5.C0441c;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import fa.ViewOnClickListenerC1479a;
import kb.InterfaceC1769a;
import kotlin.jvm.internal.j;
import lb.InterfaceC1820a;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class ReKycIntroBottomSheetFragment extends BaseBottomSheetDialogFragment implements InterfaceC1769a {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0441c f13703Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public a f13704R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public com.paymaya.data.preference.a f13705S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public InterfaceC1820a f13706T;

    public static final void q1(ReKycIntroBottomSheetFragment reKycIntroBottomSheetFragment) {
        a aVar = reKycIntroBottomSheetFragment.f13704R;
        if (aVar == null) {
            j.n("mReKycIntroBottomSheetFragmentPresenter");
            throw null;
        }
        ReKycIntroBottomSheetFragment reKycIntroBottomSheetFragment2 = (ReKycIntroBottomSheetFragment) ((InterfaceC1769a) aVar.c.get());
        reKycIntroBottomSheetFragment2.getClass();
        C1219h c1219h = new C1219h();
        c1219h.n(17);
        c1219h.t(EnumC1217f.UPDATE_NOW);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("rekyc_status", reKycIntroBottomSheetFragment2.o1().x());
        c1219h.j.put("rekyc_reason", reKycIntroBottomSheetFragment2.o1().w());
        c1219h.i();
        reKycIntroBottomSheetFragment2.m1(c1219h);
        reKycIntroBottomSheetFragment.dismiss();
        InterfaceC1820a interfaceC1820a = reKycIntroBottomSheetFragment.f13706T;
        if (interfaceC1820a != null) {
            ((MayaDashboardActivity) interfaceC1820a).Y1().k();
        }
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.REKYC_UI_BLOCK;
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment
    public final EnumC1215d l1() {
        return EnumC1215d.EKYC_V6;
    }

    public final com.paymaya.data.preference.a o1() {
        com.paymaya.data.preference.a aVar = this.f13705S;
        if (aVar != null) {
            return aVar;
        }
        j.n("mPreference");
        throw null;
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10240P = true;
        setStyle(0, R.style.AppBottomSheetDialogTheme);
        O5.a aVar = W4.a.e().F().f4753a;
        this.f10238B = (C1220i) aVar.f4716g.get();
        this.f13704R = new a((com.paymaya.data.preference.a) aVar.e.get(), 20);
        this.f13705S = (com.paymaya.data.preference.a) aVar.e.get();
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycIntroBottomSheetFragment.ReKycIntroBottomSheetFragmentListener");
        this.f13706T = (InterfaceC1820a) activity;
        a aVar2 = this.f13704R;
        if (aVar2 != null) {
            aVar2.h(this);
        } else {
            j.n("mReKycIntroBottomSheetFragmentPresenter");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_re_kyc_intro_bottom_sheet, viewGroup, false);
        int i = R.id.button_complete_now;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_complete_now);
        if (button != null) {
            i = R.id.constraint_layout_rekyc_bottom_sheet;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_rekyc_bottom_sheet)) != null) {
                i = R.id.image_view_piggy_bank;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_piggy_bank)) != null) {
                    i = R.id.image_view_piggy_bank_amount;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_piggy_bank_amount)) != null) {
                        i = R.id.image_view_piggy_bank_blue;
                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_piggy_bank_blue)) != null) {
                            i = R.id.text_view_get_credit;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_get_credit)) != null) {
                                i = R.id.text_view_get_saving_account_label;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_get_saving_account_label)) != null) {
                                    i = R.id.text_view_invest_crypto;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_invest_crypto)) != null) {
                                        i = R.id.text_view_unlock_desc;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_unlock_desc)) != null) {
                                            i = R.id.text_view_update_title;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_update_title)) != null) {
                                                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                this.f13703Q = new C0441c(nestedScrollView, button, 0);
                                                j.f(nestedScrollView, "getRoot(...)");
                                                return nestedScrollView;
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

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        a aVar = this.f13704R;
        if (aVar == null) {
            j.n("mReKycIntroBottomSheetFragmentPresenter");
            throw null;
        }
        if (!aVar.e.e().isPartnerOnboardingEnabled()) {
            ((ReKycIntroBottomSheetFragment) ((InterfaceC1769a) aVar.c.get())).p1();
            return;
        }
        String strP = aVar.e.p();
        j.f(strP, "getMayaOnboardingPartner(...)");
        if (strP.length() <= 0) {
            ((ReKycIntroBottomSheetFragment) ((InterfaceC1769a) aVar.c.get())).p1();
            return;
        }
        ReKycIntroBottomSheetFragment reKycIntroBottomSheetFragment = (ReKycIntroBottomSheetFragment) ((InterfaceC1769a) aVar.c.get());
        reKycIntroBottomSheetFragment.getClass();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("rekyc_status", reKycIntroBottomSheetFragment.o1().x());
        c1219h.j.put("rekyc_reason", reKycIntroBottomSheetFragment.o1().w());
        c1219h.j.put("partner", reKycIntroBottomSheetFragment.o1().p());
        c1219h.j.put("branch", reKycIntroBottomSheetFragment.o1().q());
        c1219h.j.put("kyc_level", reKycIntroBottomSheetFragment.o1().k().toString());
        c1219h.i();
        reKycIntroBottomSheetFragment.m1(c1219h);
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0441c c0441c = this.f13703Q;
        j.d(c0441c);
        ((Button) c0441c.c).setOnClickListener(new ViewOnClickListenerC1479a(this, 14));
    }

    public final void p1() {
        C1219h c1219hH = AbstractC2329d.h(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("rekyc_status", o1().x());
        c1219hH.j.put("rekyc_reason", o1().w());
        c1219hH.i();
        m1(c1219hH);
    }
}
