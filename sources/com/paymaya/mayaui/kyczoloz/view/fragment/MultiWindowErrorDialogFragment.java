package com.paymaya.mayaui.kyczoloz.view.fragment;

import K8.U;
import N5.C0491z;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiWindowErrorDialogFragment extends MayaErrorDialogFragment {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f12461f0 = 0;

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setCancelable(false);
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        dialogOnCreateDialog.setOnKeyListener(new U());
        return dialogOnCreateDialog;
    }

    @Override // com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment, com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        n1().setVisibility(8);
        o1().setVisibility(8);
        C0491z c0491z = this.f11839R;
        j.d(c0491z);
        ((View) c0491z.h).setVisibility(8);
        ImageView imageView = this.f11840S;
        if (imageView == null) {
            j.n("mImageViewImage");
            throw null;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), 2131231241));
        String string = getString(R.string.maya_label_something_went_wrong_title);
        j.f(string, "getString(...)");
        TextView textView = this.f11841T;
        if (textView == null) {
            j.n("mTextViewTitle");
            throw null;
        }
        textView.setText(string);
        String string2 = getString(R.string.maya_kyc_multi_window_error);
        HtmlTextView htmlTextView = this.f11842U;
        if (htmlTextView != null) {
            htmlTextView.setTextHTML(string2);
        } else {
            j.n("mTextViewMessage");
            throw null;
        }
    }
}
