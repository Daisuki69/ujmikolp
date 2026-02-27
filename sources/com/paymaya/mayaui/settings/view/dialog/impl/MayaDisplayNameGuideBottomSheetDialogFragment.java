package com.paymaya.mayaui.settings.view.dialog.impl;

import L9.C0327e;
import M8.L;
import N5.C0466m;
import O5.a;
import Qb.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaDisplayNameGuideBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0466m f13850S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C0327e f13851T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public c f13852U;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10325B = (C1220i) ((a) W4.a.e().y().c).f4716g.get();
        this.f13851T = new C0327e(10);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.settings.view.dialog.impl.MayaDisplayNameGuideBottomSheetDialogFragment.MayaDisplayNameGuideBottomSheetDialogFragmentListener");
        this.f13852U = (c) componentRequireActivity;
        C0327e c0327e = this.f13851T;
        if (c0327e == null) {
            j.n("mDisplayNameGuideBottomSheetDialogFragmentPresenter");
            throw null;
        }
        c0327e.h(this);
        C0327e c0327e2 = this.f13851T;
        if (c0327e2 == null) {
            j.n("mDisplayNameGuideBottomSheetDialogFragmentPresenter");
            throw null;
        }
        c0327e2.j();
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_display_name_guide, viewGroup, false);
        int i = R.id.bottom_space_guide_transaction_example_destination;
        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.bottom_space_guide_transaction_example_destination)) != null) {
            i = R.id.bottom_space_guide_transaction_example_fee;
            if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.bottom_space_guide_transaction_example_fee)) != null) {
                i = R.id.bottom_space_guide_transaction_example_message;
                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.bottom_space_guide_transaction_example_message)) != null) {
                    i = R.id.bottom_space_guide_transaction_example_source;
                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.bottom_space_guide_transaction_example_source)) != null) {
                        i = R.id.button_done;
                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_done);
                        if (button != null) {
                            i = R.id.guideline_labels_half;
                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_labels_half)) != null) {
                                i = R.id.text_view_guide_example_transaction_amount;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_example_transaction_amount)) != null) {
                                    i = R.id.text_view_guide_example_transaction_destination_label;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_example_transaction_destination_label)) != null) {
                                        i = R.id.text_view_guide_example_transaction_destination_mobile_phone;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_example_transaction_destination_mobile_phone)) != null) {
                                            i = R.id.text_view_guide_example_transaction_destination_value;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_example_transaction_destination_value)) != null) {
                                                i = R.id.text_view_guide_example_transaction_fee_label;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_example_transaction_fee_label)) != null) {
                                                    i = R.id.text_view_guide_example_transaction_fee_value;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_example_transaction_fee_value)) != null) {
                                                        i = R.id.text_view_guide_example_transaction_message;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_example_transaction_message)) != null) {
                                                            i = R.id.text_view_guide_example_transaction_source_label;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_example_transaction_source_label)) != null) {
                                                                i = R.id.text_view_guide_example_transaction_source_mobile_phone;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_example_transaction_source_mobile_phone)) != null) {
                                                                    i = R.id.text_view_guide_example_transaction_source_value;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_example_transaction_source_value)) != null) {
                                                                        i = R.id.text_view_guide_example_transaction_title;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_example_transaction_title)) != null) {
                                                                            i = R.id.text_view_guide_title;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_title)) != null) {
                                                                                i = R.id.view_guide_transaction_example_destination_background;
                                                                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_guide_transaction_example_destination_background);
                                                                                if (viewFindChildViewById != null) {
                                                                                    i = R.id.view_guide_transaction_example_fee_background;
                                                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_guide_transaction_example_fee_background);
                                                                                    if (viewFindChildViewById2 != null) {
                                                                                        i = R.id.view_guide_transaction_example_message_background;
                                                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_guide_transaction_example_message_background);
                                                                                        if (viewFindChildViewById3 != null) {
                                                                                            i = R.id.view_guide_transaction_example_source_background;
                                                                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_guide_transaction_example_source_background);
                                                                                            if (viewFindChildViewById4 != null) {
                                                                                                i = R.id.view_sheet_background;
                                                                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.view_sheet_background);
                                                                                                if (viewFindChildViewById5 != null) {
                                                                                                    i = R.id.view_transparent_gradient_background;
                                                                                                    View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.view_transparent_gradient_background);
                                                                                                    if (viewFindChildViewById6 != null) {
                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                        this.f13850S = new C0466m((ViewGroup) constraintLayout, (Object) button, viewFindChildViewById, (Object) viewFindChildViewById2, (Object) viewFindChildViewById3, (Object) viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, 0);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f13851T;
        if (c0327e == null) {
            j.n("mDisplayNameGuideBottomSheetDialogFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
        this.f13850S = null;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        c cVar = this.f13852U;
        if (cVar != null) {
            ((MayaSettingsActivity) cVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0466m c0466m = this.f13850S;
        j.d(c0466m);
        ((Button) c0466m.c).setOnClickListener(new L(this, 28));
    }
}
