package com.paymaya.mayaui.common.view.dialog.impl;

import G5.t;
import N5.C0447e;
import O5.a;
import Q6.l;
import S.b;
import V6.g;
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
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.widget.HtmlTextView;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaSuccessDialogFragment extends MayaBaseBottomSheetDialogFragment implements t, g {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0447e f11890S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f11891T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public HtmlTextView f11892U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public l f11893V;

    @Override // G5.t
    public final void m(String link, View view) {
        j.g(link, "link");
        j.g(view, "view");
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10325B = (C1220i) ((a) W4.a.e().a().c).f4716g.get();
        l lVar = new l(2);
        this.f11893V = lVar;
        lVar.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_success, viewGroup, false);
        int i = R.id.button_got_it;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_got_it);
        if (button != null) {
            i = R.id.image_view_success;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_success)) != null) {
                i = R.id.text_view_success_message;
                HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_success_message);
                if (htmlTextView != null) {
                    i = R.id.text_view_success_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_success_title);
                    if (textView != null) {
                        i = R.id.view_sheet_background;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_sheet_background);
                        if (viewFindChildViewById != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.f11890S = new C0447e(9, button, htmlTextView, viewFindChildViewById, constraintLayout, textView);
                            j.f(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        l lVar = this.f11893V;
        if (lVar == null) {
            j.n("mSuccessDialogFragmentPresenter");
            throw null;
        }
        lVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f11890S = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f11890S;
        j.d(c0447e);
        this.f11891T = (TextView) c0447e.f;
        C0447e c0447e2 = this.f11890S;
        j.d(c0447e2);
        HtmlTextView htmlTextView = (HtmlTextView) c0447e2.f4080d;
        this.f11892U = htmlTextView;
        htmlTextView.setOnLinkClickListener(this);
        C0447e c0447e3 = this.f11890S;
        j.d(c0447e3);
        ((Button) c0447e3.c).setOnClickListener(new b(this, 22));
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("title");
            String string2 = arguments.getString("content");
            l lVar = this.f11893V;
            if (lVar == null) {
                j.n("mSuccessDialogFragmentPresenter");
                throw null;
            }
            lVar.j();
            TextView textView = ((MayaSuccessDialogFragment) ((g) lVar.c.get())).f11891T;
            if (textView == null) {
                j.n("mTextViewMessageTitle");
                throw null;
            }
            textView.setText(string);
            if (string2 == null || C2576A.H(string2)) {
                HtmlTextView htmlTextView2 = ((MayaSuccessDialogFragment) ((g) lVar.c.get())).f11892U;
                if (htmlTextView2 != null) {
                    htmlTextView2.setVisibility(8);
                    return;
                } else {
                    j.n("mTextViewMessageContent");
                    throw null;
                }
            }
            HtmlTextView htmlTextView3 = ((MayaSuccessDialogFragment) ((g) lVar.c.get())).f11892U;
            if (htmlTextView3 != null) {
                htmlTextView3.setTextHTML(string2);
            } else {
                j.n("mTextViewMessageContent");
                throw null;
            }
        }
    }
}
