package com.paymaya.mayaui.favorite.view.dialog.impl;

import Fa.c;
import N5.C0489y;
import Q6.l;
import W4.a;
import Y6.o;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaFavoriteReminderSampleBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public l f12319S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C0489y f12320T;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.REMINDER_SAMPLE;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        C1219h c1219hM1 = m1();
        c1219hM1.r(EnumC1216e.REMINDER_SAMPLE);
        c1219hM1.n(8);
        c1219hM1.i();
        this.f10325B = (C1220i) a.e().m().f4756a.f4716g.get();
        l lVar = new l(9);
        this.f12319S = lVar;
        lVar.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 27));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_reminder_sample, viewGroup, false);
        int i = R.id.button_got_it;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_got_it);
        if (button != null) {
            i = R.id.image_view_sample_reminder_graphic;
            if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_sample_reminder_graphic)) != null) {
                i = R.id.text_view_sample_reminder_description;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_sample_reminder_description)) != null) {
                    i = R.id.text_view_sample_reminder_title;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_sample_reminder_title)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f12320T = new C0489y(constraintLayout, button, 2);
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
        l lVar = this.f12319S;
        if (lVar == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        lVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        l lVar = this.f12319S;
        if (lVar == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        lVar.j();
        C0489y c0489y = this.f12320T;
        j.d(c0489y);
        c0489y.c.setOnClickListener(new o(this, 10));
    }
}
