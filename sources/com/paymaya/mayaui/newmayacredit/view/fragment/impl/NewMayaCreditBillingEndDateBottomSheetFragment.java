package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import Ag.j;
import Bb.f;
import Fa.c;
import M8.L;
import N5.C0491z;
import P9.i;
import Q9.s;
import W4.a;
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
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import cj.C1112C;
import cj.t;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.CreditBillingSettings;
import com.paymaya.domain.model.CreditTermScheduleSettings;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaCreditBillingEndDateBottomSheetFragment extends MayaBaseBottomSheetDialogFragment implements i {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0491z f13175S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public NumberPicker f13176T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Button f13177U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public j f13178V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public f f13179W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public s f13180X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final EnumC1216e f13181Y = EnumC1216e.SELECT_BILL_END_DATE;

    public static final void s1(NewMayaCreditBillingEndDateBottomSheetFragment newMayaCreditBillingEndDateBottomSheetFragment) throws JSONException {
        C1220i c1220iN1 = newMayaCreditBillingEndDateBottomSheetFragment.n1();
        FragmentActivity activity = newMayaCreditBillingEndDateBottomSheetFragment.getActivity();
        C1219h c1219hD = C1219h.d(newMayaCreditBillingEndDateBottomSheetFragment.p1());
        c1219hD.r(newMayaCreditBillingEndDateBottomSheetFragment.f13181Y);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.SET);
        c1220iN1.c(activity, c1219hD);
        f fVar = newMayaCreditBillingEndDateBottomSheetFragment.f13179W;
        if (fVar == null) {
            kotlin.jvm.internal.j.n("mNewMayaCreditBillingEndDateBottomSheetFragmentPresenter");
            throw null;
        }
        NumberPicker numberPicker = newMayaCreditBillingEndDateBottomSheetFragment.f13176T;
        if (numberPicker == null) {
            kotlin.jvm.internal.j.n("mNumberPickerDay");
            throw null;
        }
        int value = numberPicker.getValue();
        CreditTermScheduleSettings creditTermScheduleSettings = (CreditTermScheduleSettings) fVar.e;
        CreditBillingSettings billingSettings = creditTermScheduleSettings != null ? creditTermScheduleSettings.getBillingSettings() : null;
        if ((billingSettings != null ? billingSettings.getDaysValue() : null) == null) {
            j jVar = ((NewMayaCreditBillingEndDateBottomSheetFragment) ((i) fVar.c.get())).f13178V;
            if (jVar != null) {
                jVar.invoke(0, Integer.valueOf(value));
            }
        } else {
            List<Integer> daysValue = billingSettings.getDaysValue();
            int iIntValue = daysValue != null ? daysValue.get(value).intValue() : 0;
            j jVar2 = ((NewMayaCreditBillingEndDateBottomSheetFragment) ((i) fVar.c.get())).f13178V;
            if (jVar2 != null) {
                jVar2.invoke(Integer.valueOf(value), Integer.valueOf(iIntValue));
            }
        }
        newMayaCreditBillingEndDateBottomSheetFragment.dismiss();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return this.f13181Y;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        this.f10325B = (C1220i) a.e().D().f4752a.f4716g.get();
        this.f13179W = new f(5);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditBillingEndDateBottomSheetFragment.NewMayaCreditBillingEndDateBottomSheetFragmentListener");
        this.f13180X = (s) componentRequireActivity;
        f fVar = this.f13179W;
        if (fVar == null) {
            kotlin.jvm.internal.j.n("mNewMayaCreditBillingEndDateBottomSheetFragmentPresenter");
            throw null;
        }
        fVar.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        kotlin.jvm.internal.j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 14));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_maya_credit_billing_end_date_bottom_sheet, viewGroup, false);
        int i = R.id.billing_end_date_bottom_space;
        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_bottom_space)) != null) {
            i = R.id.billing_end_date_selection_view;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_selection_view);
            if (viewFindChildViewById != null) {
                i = R.id.day_background_selection_view;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.day_background_selection_view);
                if (viewFindChildViewById2 != null) {
                    i = R.id.day_label_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.day_label_text_view)) != null) {
                        i = R.id.day_number_picker;
                        NumberPicker numberPicker = (NumberPicker) ViewBindings.findChildViewById(viewInflate, R.id.day_number_picker);
                        if (numberPicker != null) {
                            i = R.id.left_guideline;
                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                                i = R.id.reminder_text_view;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.reminder_text_view)) != null) {
                                    i = R.id.right_guideline;
                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                                        i = R.id.sheet_background_view;
                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.sheet_background_view);
                                        if (viewFindChildViewById3 != null) {
                                            i = R.id.submit_button;
                                            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.submit_button);
                                            if (button != null) {
                                                i = R.id.title_text_view;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view)) != null) {
                                                    i = R.id.top_sheet_line_view;
                                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.top_sheet_line_view);
                                                    if (viewFindChildViewById4 != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                        this.f13175S = new C0491z(constraintLayout, viewFindChildViewById, viewFindChildViewById2, numberPicker, viewFindChildViewById3, button, viewFindChildViewById4);
                                                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
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
        f fVar = this.f13179W;
        if (fVar == null) {
            kotlin.jvm.internal.j.n("mNewMayaCreditBillingEndDateBottomSheetFragmentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        s sVar = this.f13180X;
        if (sVar != null) {
            ((NewMayaCreditActivity) sVar).Q(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [cj.C] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ?? days;
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f13175S;
        kotlin.jvm.internal.j.d(c0491z);
        this.f13176T = (NumberPicker) c0491z.f4305g;
        C0491z c0491z2 = this.f13175S;
        kotlin.jvm.internal.j.d(c0491z2);
        this.f13177U = (Button) c0491z2.c;
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            CreditTermScheduleSettings creditTermScheduleSettings = arguments != null ? (CreditTermScheduleSettings) arguments.getParcelable("schedule_settings") : null;
            Bundle arguments2 = getArguments();
            Integer numValueOf = arguments2 != null ? Integer.valueOf(arguments2.getInt("selected_id")) : null;
            Bundle arguments3 = getArguments();
            Integer numValueOf2 = arguments3 != null ? Integer.valueOf(arguments3.getInt("selected_day")) : null;
            f fVar = this.f13179W;
            if (fVar == null) {
                kotlin.jvm.internal.j.n("mNewMayaCreditBillingEndDateBottomSheetFragmentPresenter");
                throw null;
            }
            fVar.j();
            fVar.e = creditTermScheduleSettings;
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
            if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                iIntValue2 = 1;
            }
            CreditTermScheduleSettings creditTermScheduleSettings2 = (CreditTermScheduleSettings) fVar.e;
            CreditBillingSettings billingSettings = creditTermScheduleSettings2 != null ? creditTermScheduleSettings2.getBillingSettings() : null;
            if ((billingSettings != null ? billingSettings.getDaysValue() : null) == null) {
                i iVar = (i) fVar.c.get();
                int endDayMinValue = billingSettings != null ? billingSettings.getEndDayMinValue() : 1;
                int endDayMaxValue = billingSettings != null ? billingSettings.getEndDayMaxValue() : 27;
                NewMayaCreditBillingEndDateBottomSheetFragment newMayaCreditBillingEndDateBottomSheetFragment = (NewMayaCreditBillingEndDateBottomSheetFragment) iVar;
                NumberPicker numberPicker = newMayaCreditBillingEndDateBottomSheetFragment.f13176T;
                if (numberPicker == null) {
                    kotlin.jvm.internal.j.n("mNumberPickerDay");
                    throw null;
                }
                numberPicker.setMinValue(endDayMinValue);
                NumberPicker numberPicker2 = newMayaCreditBillingEndDateBottomSheetFragment.f13176T;
                if (numberPicker2 == null) {
                    kotlin.jvm.internal.j.n("mNumberPickerDay");
                    throw null;
                }
                numberPicker2.setMaxValue(endDayMaxValue);
                NumberPicker numberPicker3 = newMayaCreditBillingEndDateBottomSheetFragment.f13176T;
                if (numberPicker3 == null) {
                    kotlin.jvm.internal.j.n("mNumberPickerDay");
                    throw null;
                }
                numberPicker3.setValue(iIntValue2);
            } else {
                List<Integer> daysValue = billingSettings.getDaysValue();
                if (daysValue != null) {
                    List<Integer> list = daysValue;
                    days = new ArrayList(t.l(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        days.add(String.valueOf(((Number) it.next()).intValue()));
                    }
                } else {
                    days = C1112C.f9377a;
                }
                NewMayaCreditBillingEndDateBottomSheetFragment newMayaCreditBillingEndDateBottomSheetFragment2 = (NewMayaCreditBillingEndDateBottomSheetFragment) ((i) fVar.c.get());
                newMayaCreditBillingEndDateBottomSheetFragment2.getClass();
                kotlin.jvm.internal.j.g(days, "days");
                NumberPicker numberPicker4 = newMayaCreditBillingEndDateBottomSheetFragment2.f13176T;
                if (numberPicker4 == null) {
                    kotlin.jvm.internal.j.n("mNumberPickerDay");
                    throw null;
                }
                numberPicker4.setMinValue(0);
                NumberPicker numberPicker5 = newMayaCreditBillingEndDateBottomSheetFragment2.f13176T;
                if (numberPicker5 == null) {
                    kotlin.jvm.internal.j.n("mNumberPickerDay");
                    throw null;
                }
                numberPicker5.setMaxValue(days.size() - 1);
                NumberPicker numberPicker6 = newMayaCreditBillingEndDateBottomSheetFragment2.f13176T;
                if (numberPicker6 == null) {
                    kotlin.jvm.internal.j.n("mNumberPickerDay");
                    throw null;
                }
                numberPicker6.setDisplayedValues((String[]) ((Collection) days).toArray(new String[0]));
                NumberPicker numberPicker7 = newMayaCreditBillingEndDateBottomSheetFragment2.f13176T;
                if (numberPicker7 == null) {
                    kotlin.jvm.internal.j.n("mNumberPickerDay");
                    throw null;
                }
                numberPicker7.setValue(iIntValue);
            }
        }
        Button button = this.f13177U;
        if (button != null) {
            button.setOnClickListener(new L(this, 25));
        } else {
            kotlin.jvm.internal.j.n("mButtonSubmit");
            throw null;
        }
    }
}
