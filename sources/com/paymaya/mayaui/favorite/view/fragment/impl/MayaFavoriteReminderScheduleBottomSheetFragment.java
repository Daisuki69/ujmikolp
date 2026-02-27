package com.paymaya.mayaui.favorite.view.fragment.impl;

import Fa.c;
import N5.C0435a;
import Q6.l;
import W4.a;
import W4.b;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import c8.d;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteReminderScheduleBottomSheetFragment;
import d8.InterfaceC1344i;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaFavoriteReminderScheduleBottomSheetFragment extends MayaBaseBottomSheetDialogFragment implements d {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0435a f12350S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public NumberPicker f12351T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Button f12352U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f12353V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public l f12354W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final InterfaceC1033d f12355X = C1034e.b(new b(this, 17));

    public static final void s1(MayaFavoriteReminderScheduleBottomSheetFragment mayaFavoriteReminderScheduleBottomSheetFragment) {
        NumberPicker numberPicker = mayaFavoriteReminderScheduleBottomSheetFragment.f12351T;
        if (numberPicker == null) {
            j.n("mNumberPickerDayWheel");
            throw null;
        }
        int value = numberPicker.getValue();
        C1220i c1220iN1 = mayaFavoriteReminderScheduleBottomSheetFragment.n1();
        FragmentActivity activity = mayaFavoriteReminderScheduleBottomSheetFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaFavoriteReminderScheduleBottomSheetFragment.p1());
        c1219hD.r(EnumC1216e.REMINDER);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.SAVE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("day", String.valueOf(value));
        c1219hD.i();
        c1220iN1.c(activity, c1219hD);
        NumberPicker numberPicker2 = mayaFavoriteReminderScheduleBottomSheetFragment.f12351T;
        if (numberPicker2 == null) {
            j.n("mNumberPickerDayWheel");
            throw null;
        }
        int value2 = numberPicker2.getValue();
        Bundle bundle = new Bundle();
        bundle.putInt("result_selected_reminder_day", value2);
        mayaFavoriteReminderScheduleBottomSheetFragment.getParentFragmentManager().setFragmentResult("request_select_reminder_day", bundle);
        mayaFavoriteReminderScheduleBottomSheetFragment.dismiss();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.REMINDER;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("event_attribute_service") : null;
        if (string == null) {
            string = "";
        }
        C1219h c1219hM1 = m1();
        c1219hM1.r(EnumC1216e.REMINDER);
        c1219hM1.n(8);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("screen", string);
        c1219hM1.i();
        this.f10325B = (C1220i) a.e().m().f4756a.f4716g.get();
        this.f12354W = new l(10);
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof InterfaceC1344i) {
        }
        l lVar = this.f12354W;
        if (lVar != null) {
            lVar.h(this);
        } else {
            j.n("mFavoriteBillerReminderDateBottomSheetFragmentPresenter");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 29));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_favorite_reminder_schedule, viewGroup, false);
        int i = R.id.button_cancel;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_cancel);
        if (button != null) {
            i = R.id.button_save;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_save);
            if (button2 != null) {
                i = R.id.number_picker_day_wheel;
                NumberPicker numberPicker = (NumberPicker) ViewBindings.findChildViewById(viewInflate, R.id.number_picker_day_wheel);
                if (numberPicker != null) {
                    i = R.id.space_bottom_picker_padding;
                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_bottom_picker_padding)) != null) {
                        i = R.id.text_view_description;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description)) != null) {
                            i = R.id.text_view_month_end_dates_info;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_month_end_dates_info)) != null) {
                                i = R.id.text_view_picker_day_label;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_picker_day_label)) != null) {
                                    i = R.id.text_view_title;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title)) != null) {
                                        i = R.id.view_day_picker_background;
                                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_day_picker_background);
                                        if (viewFindChildViewById != null) {
                                            i = R.id.view_picker_selected_day_background;
                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_picker_selected_day_background);
                                            if (viewFindChildViewById2 != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                this.f12350S = new C0435a(constraintLayout, button, button2, numberPicker, viewFindChildViewById, viewFindChildViewById2, 3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        l lVar = this.f12354W;
        if (lVar == null) {
            j.n("mFavoriteBillerReminderDateBottomSheetFragmentPresenter");
            throw null;
        }
        lVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0435a c0435a = this.f12350S;
        j.d(c0435a);
        this.f12351T = (NumberPicker) c0435a.e;
        C0435a c0435a2 = this.f12350S;
        j.d(c0435a2);
        this.f12352U = (Button) c0435a2.c;
        C0435a c0435a3 = this.f12350S;
        j.d(c0435a3);
        this.f12353V = (Button) c0435a3.f4048d;
        Button button = this.f12352U;
        if (button == null) {
            j.n("mButtonCancel");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: d8.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaFavoriteReminderScheduleBottomSheetFragment f16296b;

            {
                this.f16296b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaFavoriteReminderScheduleBottomSheetFragment mayaFavoriteReminderScheduleBottomSheetFragment = this.f16296b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iN1 = mayaFavoriteReminderScheduleBottomSheetFragment.n1();
                            FragmentActivity activity = mayaFavoriteReminderScheduleBottomSheetFragment.getActivity();
                            C1219h c1219hD = C1219h.d(mayaFavoriteReminderScheduleBottomSheetFragment.p1());
                            c1219hD.r(EnumC1216e.REMINDER);
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.CANCEL);
                            c1219hD.i();
                            c1220iN1.c(activity, c1219hD);
                            mayaFavoriteReminderScheduleBottomSheetFragment.getParentFragmentManager().setFragmentResult("request_select_reminder_day", new Bundle());
                            mayaFavoriteReminderScheduleBottomSheetFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        MayaFavoriteReminderScheduleBottomSheetFragment mayaFavoriteReminderScheduleBottomSheetFragment2 = this.f16296b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaFavoriteReminderScheduleBottomSheetFragment.s1(mayaFavoriteReminderScheduleBottomSheetFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f12353V;
        if (button2 == null) {
            j.n("mButtonSave");
            throw null;
        }
        final int i4 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: d8.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaFavoriteReminderScheduleBottomSheetFragment f16296b;

            {
                this.f16296b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaFavoriteReminderScheduleBottomSheetFragment mayaFavoriteReminderScheduleBottomSheetFragment = this.f16296b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iN1 = mayaFavoriteReminderScheduleBottomSheetFragment.n1();
                            FragmentActivity activity = mayaFavoriteReminderScheduleBottomSheetFragment.getActivity();
                            C1219h c1219hD = C1219h.d(mayaFavoriteReminderScheduleBottomSheetFragment.p1());
                            c1219hD.r(EnumC1216e.REMINDER);
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.CANCEL);
                            c1219hD.i();
                            c1220iN1.c(activity, c1219hD);
                            mayaFavoriteReminderScheduleBottomSheetFragment.getParentFragmentManager().setFragmentResult("request_select_reminder_day", new Bundle());
                            mayaFavoriteReminderScheduleBottomSheetFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        MayaFavoriteReminderScheduleBottomSheetFragment mayaFavoriteReminderScheduleBottomSheetFragment2 = this.f16296b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaFavoriteReminderScheduleBottomSheetFragment.s1(mayaFavoriteReminderScheduleBottomSheetFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        l lVar = this.f12354W;
        if (lVar != null) {
            lVar.j();
        } else {
            j.n("mFavoriteBillerReminderDateBottomSheetFragmentPresenter");
            throw null;
        }
    }
}
