package com.paymaya.mayaui.settings.view.dialog.impl;

import Fa.c;
import L9.C0327e;
import M8.L;
import N5.C0453g;
import O5.a;
import Pb.b;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import androidx.webkit.WebViewClientCompat;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.widget.ScrollableWebView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaLicensesBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements b {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0453g f13863S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C0327e f13864T;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10325B = (C1220i) ((a) W4.a.e().y().c).f4716g.get();
        C0327e c0327e = new C0327e(11);
        this.f13864T = c0327e;
        c0327e.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 20));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_licences, viewGroup, false);
        int i = R.id.button_done;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_done);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.left_guideline;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                i = R.id.right_guideline;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                    i = R.id.text_view_header;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                        i = R.id.view_sheet_background;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_sheet_background);
                        if (viewFindChildViewById != null) {
                            i = R.id.web_view_license;
                            ScrollableWebView scrollableWebView = (ScrollableWebView) ViewBindings.findChildViewById(viewInflate, R.id.web_view_license);
                            if (scrollableWebView != null) {
                                this.f13863S = new C0453g(4, constraintLayout, button, viewFindChildViewById, scrollableWebView);
                                j.f(constraintLayout, "getRoot(...)");
                                return constraintLayout;
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
        C0327e c0327e = this.f13864T;
        if (c0327e == null) {
            j.n("mMayaLicensesBottomSheetDialogFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0327e c0327e = this.f13864T;
        if (c0327e == null) {
            j.n("mMayaLicensesBottomSheetDialogFragmentPresenter");
            throw null;
        }
        c0327e.j();
        C0453g c0453g = this.f13863S;
        j.d(c0453g);
        ((Button) c0453g.c).setOnClickListener(new L(this, 29));
        C0453g c0453g2 = this.f13863S;
        j.d(c0453g2);
        ScrollableWebView scrollableWebView = (ScrollableWebView) c0453g2.e;
        scrollableWebView.setBackgroundColor(0);
        scrollableWebView.setBackgroundResource(R.drawable.maya_bg_secondary_color_rounded);
        scrollableWebView.setWebViewClient(new WebViewClientCompat());
    }
}
