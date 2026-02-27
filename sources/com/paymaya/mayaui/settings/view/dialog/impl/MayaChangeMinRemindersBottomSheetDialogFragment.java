package com.paymaya.mayaui.settings.view.dialog.impl;

import Fa.c;
import G5.t;
import L9.C0327e;
import N5.C0447e;
import O5.a;
import Qb.b;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaChangeMinRemindersBottomSheetDialogFragment;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaChangeMinRemindersBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements t {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0447e f13844S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public HtmlTextView f13845T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Button f13846U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f13847V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0327e f13848W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public b f13849X;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.REMINDERS;
    }

    @Override // G5.t
    public final void m(String str, View view) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.NO_ACCESS);
        c1219hH.i();
        r1(c1219hH);
        dismiss();
        b bVar = this.f13849X;
        if (bVar != null) {
            MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) bVar;
            mayaSettingsActivity.n1().w(mayaSettingsActivity, "https://cares.paymaya.com/s/article/I-lost-the-SIM-and-or-phone-with-the-number-that-s-registered-to-my-PayMaya-account");
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        m1().i();
        this.f13849X = (b) getActivity();
        this.f10325B = (C1220i) ((a) W4.a.e().y().c).f4716g.get();
        C0327e c0327e = new C0327e(7);
        this.f13848W = c0327e;
        c0327e.h(this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 18));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_change_min_reminders_bottom_sheet, viewGroup, false);
        int i = R.id.button_cancel;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_cancel);
        if (button != null) {
            i = R.id.button_continue;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
            if (button2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.image_view_information_icon;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_information_icon)) != null) {
                    i = R.id.text_view_no_access_link;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_no_access_link);
                    if (htmlTextView != null) {
                        i = R.id.text_view_reminder_1_number;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reminder_1_number)) != null) {
                            i = R.id.text_view_reminder_1_text;
                            if (((HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reminder_1_text)) != null) {
                                i = R.id.text_view_reminder_2_number;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reminder_2_number)) != null) {
                                    i = R.id.text_view_reminder_2_text;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reminder_2_text)) != null) {
                                        i = R.id.text_view_reminder_3_number;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reminder_3_number)) != null) {
                                            i = R.id.text_view_reminder_3_text;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reminder_3_text)) != null) {
                                                i = R.id.text_view_reminders_title;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reminders_title)) != null) {
                                                    i = R.id.view_sheet_background;
                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_sheet_background);
                                                    if (viewFindChildViewById != null) {
                                                        this.f13844S = new C0447e((ViewGroup) constraintLayout, (Object) button, (Object) button2, (Object) htmlTextView, (Object) viewFindChildViewById, 7);
                                                        j.f(constraintLayout, "getRoot(...)");
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f13848W;
        if (c0327e == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13844S = null;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f13844S;
        j.d(c0447e);
        this.f13845T = (HtmlTextView) c0447e.e;
        C0447e c0447e2 = this.f13844S;
        j.d(c0447e2);
        this.f13846U = (Button) c0447e2.c;
        C0447e c0447e3 = this.f13844S;
        j.d(c0447e3);
        this.f13847V = (Button) c0447e3.f4080d;
        C0327e c0327e = this.f13848W;
        if (c0327e == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0327e.j();
        HtmlTextView htmlTextView = this.f13845T;
        if (htmlTextView == null) {
            j.n("mTextViewNoAccess");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(this);
        Button button = this.f13846U;
        if (button == null) {
            j.n("mButtonCancel");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Qb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaChangeMinRemindersBottomSheetDialogFragment f5346b;

            {
                this.f5346b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaChangeMinRemindersBottomSheetDialogFragment mayaChangeMinRemindersBottomSheetDialogFragment = this.f5346b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.CANCEL);
                            c1219h.i();
                            mayaChangeMinRemindersBottomSheetDialogFragment.r1(c1219h);
                            mayaChangeMinRemindersBottomSheetDialogFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        MayaChangeMinRemindersBottomSheetDialogFragment mayaChangeMinRemindersBottomSheetDialogFragment2 = this.f5346b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.CONTINUE);
                            c1219hH.i();
                            mayaChangeMinRemindersBottomSheetDialogFragment2.r1(c1219hH);
                            mayaChangeMinRemindersBottomSheetDialogFragment2.dismiss();
                            b bVar = mayaChangeMinRemindersBottomSheetDialogFragment2.f13849X;
                            if (bVar != null) {
                                String string = mayaChangeMinRemindersBottomSheetDialogFragment2.getString(R.string.maya_label_enter_password);
                                j.f(string, "getString(...)");
                                String string2 = mayaChangeMinRemindersBottomSheetDialogFragment2.getString(R.string.maya_label_change_min_enter_password_description);
                                j.f(string2, "getString(...)");
                                ((MayaSettingsActivity) bVar).Z1(string, string2);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f13847V;
        if (button2 == null) {
            j.n("mButtonContinue");
            throw null;
        }
        final int i4 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: Qb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaChangeMinRemindersBottomSheetDialogFragment f5346b;

            {
                this.f5346b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaChangeMinRemindersBottomSheetDialogFragment mayaChangeMinRemindersBottomSheetDialogFragment = this.f5346b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.CANCEL);
                            c1219h.i();
                            mayaChangeMinRemindersBottomSheetDialogFragment.r1(c1219h);
                            mayaChangeMinRemindersBottomSheetDialogFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        MayaChangeMinRemindersBottomSheetDialogFragment mayaChangeMinRemindersBottomSheetDialogFragment2 = this.f5346b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.CONTINUE);
                            c1219hH.i();
                            mayaChangeMinRemindersBottomSheetDialogFragment2.r1(c1219hH);
                            mayaChangeMinRemindersBottomSheetDialogFragment2.dismiss();
                            b bVar = mayaChangeMinRemindersBottomSheetDialogFragment2.f13849X;
                            if (bVar != null) {
                                String string = mayaChangeMinRemindersBottomSheetDialogFragment2.getString(R.string.maya_label_enter_password);
                                j.f(string, "getString(...)");
                                String string2 = mayaChangeMinRemindersBottomSheetDialogFragment2.getString(R.string.maya_label_change_min_enter_password_description);
                                j.f(string2, "getString(...)");
                                ((MayaSettingsActivity) bVar).Z1(string, string2);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1215d p1() {
        return EnumC1215d.MOBILE_NUMBER;
    }
}
