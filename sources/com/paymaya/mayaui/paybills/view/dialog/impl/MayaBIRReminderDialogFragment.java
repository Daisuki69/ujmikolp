package com.paymaya.mayaui.paybills.view.dialog.impl;

import N5.C0447e;
import Q6.l;
import W4.a;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import f9.DialogInterfaceOnShowListenerC1475b;
import fa.InterfaceC1480b;
import fa.ViewOnClickListenerC1479a;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBIRReminderDialogFragment extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0447e f13345S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public l f13346T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public InterfaceC1480b f13347U;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10325B = (C1220i) a.e().t().f4754a.f4716g.get();
        this.f13346T = new l(23);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.paybills.view.dialog.impl.MayaBIRReminderDialogFragment.BIRReminderDialogFragmentListener");
        this.f13347U = (InterfaceC1480b) componentRequireActivity;
        l lVar = this.f13346T;
        if (lVar == null) {
            j.n("mBIRReminderDialogFragmentPresenter");
            throw null;
        }
        lVar.h(this);
        l lVar2 = this.f13346T;
        if (lVar2 == null) {
            j.n("mBIRReminderDialogFragmentPresenter");
            throw null;
        }
        lVar2.j();
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new DialogInterfaceOnShowListenerC1475b(this, 3));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_bir_reminder, viewGroup, false);
        int i = R.id.description_part_one_text_view;
        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.description_part_one_text_view)) != null) {
            i = R.id.description_part_two_text_view;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.description_part_two_text_view)) != null) {
                i = R.id.got_it_button;
                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.got_it_button);
                if (button != null) {
                    i = R.id.left_guideline;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                        i = R.id.right_guideline;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                            i = R.id.scroll_view_reminder;
                            if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_reminder)) != null) {
                                i = R.id.sheet_background_view;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.sheet_background_view);
                                if (viewFindChildViewById != null) {
                                    i = R.id.tin_12_digit_caption_text_view;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_12_digit_caption_text_view);
                                    if (textView != null) {
                                        i = R.id.tin_12_digit_info_image_view;
                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.tin_12_digit_info_image_view)) != null) {
                                            i = R.id.tin_12_digit_info_text_view;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_12_digit_info_text_view)) != null) {
                                                i = R.id.tin_12_digit_part_1_text_view;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_12_digit_part_1_text_view)) != null) {
                                                    i = R.id.tin_12_digit_part_2_text_view;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_12_digit_part_2_text_view)) != null) {
                                                        i = R.id.tin_12_digit_part_3_text_view;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_12_digit_part_3_text_view)) != null) {
                                                            i = R.id.tin_14_digit_caption_text_view;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_14_digit_caption_text_view);
                                                            if (textView2 != null) {
                                                                i = R.id.tin_14_digit_info_image_view;
                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.tin_14_digit_info_image_view)) != null) {
                                                                    i = R.id.tin_14_digit_info_text_view;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_14_digit_info_text_view)) != null) {
                                                                        i = R.id.tin_14_digit_part_1_text_view;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_14_digit_part_1_text_view)) != null) {
                                                                            i = R.id.tin_14_digit_part_2_text_view;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_14_digit_part_2_text_view)) != null) {
                                                                                i = R.id.tin_14_digit_part_3_text_view;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_14_digit_part_3_text_view)) != null) {
                                                                                    i = R.id.tin_structure_description_text_view;
                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_structure_description_text_view)) != null) {
                                                                                        i = R.id.tin_structure_title_text_view;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tin_structure_title_text_view)) != null) {
                                                                                            i = R.id.title_text_view;
                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view)) != null) {
                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                this.f13345S = new C0447e(6, button, viewFindChildViewById, textView2, constraintLayout, textView);
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
        l lVar = this.f13346T;
        if (lVar == null) {
            j.n("mBIRReminderDialogFragmentPresenter");
            throw null;
        }
        lVar.i();
        super.onDestroy();
        this.f13345S = null;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1480b interfaceC1480b = this.f13347U;
        if (interfaceC1480b != null) {
            ((MayaPayBillsActivity) interfaceC1480b).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        SpannableString spannableString = new SpannableString(getString(R.string.maya_label_bir_reminder_tin_12_caption));
        t1(spannableString);
        s1(spannableString);
        SpannableString spannableString2 = new SpannableString(getString(R.string.maya_label_bir_reminder_tin_14_caption));
        t1(spannableString2);
        s1(spannableString2);
        C0447e c0447e = this.f13345S;
        j.d(c0447e);
        ((TextView) c0447e.f).setText(spannableString);
        C0447e c0447e2 = this.f13345S;
        j.d(c0447e2);
        ((TextView) c0447e2.e).setText(spannableString2);
        C0447e c0447e3 = this.f13345S;
        j.d(c0447e3);
        ((Button) c0447e3.c).setOnClickListener(new ViewOnClickListenerC1479a(this, 0));
    }

    public final void s1(SpannableString spannableString) {
        spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.CerebriBookSmallTextEmphasisViolet), C2576A.F(spannableString, "Branch Code", 0, false, 6), C2576A.F(spannableString, "Branch Code", 0, false, 6) + 11, 17);
    }

    public final void t1(SpannableString spannableString) {
        spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.CerebriBookSmallTextEmphasisGreen), C2576A.F(spannableString, "TIN", 0, false, 6), C2576A.F(spannableString, "TIN", 0, false, 6) + 3, 17);
    }
}
