package com.paymaya.mayaui.common.view.dialog.impl;

import N5.C0447e;
import O5.a;
import Q6.l;
import S.b;
import V6.h;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUnderReviewBottomSheetFragment extends BaseBottomSheetDialogFragment implements h {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0447e f11894Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public l f11895R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Function1 f11896S;

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
        this.f10238B = (C1220i) ((a) W4.a.e().a().c).f4716g.get();
        this.f11895R = new l(3);
        l lVar = this.f11895R;
        if (lVar != null) {
            lVar.h(this);
        } else {
            j.n("mFragmentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_under_review, viewGroup, false);
        int i = R.id.button_action_primary;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_action_primary);
        if (button != null) {
            i = R.id.button_action_secondary;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_action_secondary);
            if (button2 != null) {
                i = R.id.image_view_banner;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_banner)) != null) {
                    i = R.id.text_view_header;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header);
                    if (textView != null) {
                        i = R.id.text_view_sub_header;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_sub_header);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.f11894Q = new C0447e(4, button, button2, textView2, constraintLayout, textView);
                            j.f(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C0447e c0447e = this.f11894Q;
            j.d(c0447e);
            ((Button) c0447e.f4080d).setOnClickListener(new b(this, 23));
            C0447e c0447e2 = this.f11894Q;
            j.d(c0447e2);
            ((Button) c0447e2.c).setOnClickListener(new Ad.a(25, this, view));
            l lVar = this.f11895R;
            if (lVar == null) {
                j.n("mFragmentPresenter");
                throw null;
            }
            String string = arguments.getString("title");
            String string2 = arguments.getString("subtitle");
            String string3 = arguments.getString("primary_button_value");
            lVar.j();
            if (string != null && string.length() != 0) {
                MayaUnderReviewBottomSheetFragment mayaUnderReviewBottomSheetFragment = (MayaUnderReviewBottomSheetFragment) ((h) lVar.c.get());
                mayaUnderReviewBottomSheetFragment.getClass();
                C0447e c0447e3 = mayaUnderReviewBottomSheetFragment.f11894Q;
                j.d(c0447e3);
                ((TextView) c0447e3.f).setText(string);
            }
            if (string2 != null && string2.length() != 0) {
                MayaUnderReviewBottomSheetFragment mayaUnderReviewBottomSheetFragment2 = (MayaUnderReviewBottomSheetFragment) ((h) lVar.c.get());
                mayaUnderReviewBottomSheetFragment2.getClass();
                C0447e c0447e4 = mayaUnderReviewBottomSheetFragment2.f11894Q;
                j.d(c0447e4);
                ((TextView) c0447e4.e).setText(string2);
            }
            if (string3 == null || string3.length() == 0) {
                return;
            }
            MayaUnderReviewBottomSheetFragment mayaUnderReviewBottomSheetFragment3 = (MayaUnderReviewBottomSheetFragment) ((h) lVar.c.get());
            mayaUnderReviewBottomSheetFragment3.getClass();
            C0447e c0447e5 = mayaUnderReviewBottomSheetFragment3.f11894Q;
            j.d(c0447e5);
            ((Button) c0447e5.c).setText(string3);
        }
    }
}
