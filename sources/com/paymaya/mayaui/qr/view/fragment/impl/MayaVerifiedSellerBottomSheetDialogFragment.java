package com.paymaya.mayaui.qr.view.fragment.impl;

import Ae.a;
import Fa.c;
import M8.L;
import N5.C0485w;
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
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.widget.HtmlTextView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaVerifiedSellerBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0485w f13647S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public a f13648T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ConstraintLayout f13649U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f13650V;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.VERIFIED_SELLER;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        this.f10327P = true;
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        this.f10325B = (C1220i) W4.a.e().v().f4753a.f4716g.get();
        a aVar = new a(28);
        this.f13648T = aVar;
        aVar.h(this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 11));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_verified_seller, viewGroup, false);
        int i = R.id.about_verified_description;
        if (((HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.about_verified_description)) != null) {
            i = R.id.about_verified_got_it;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.about_verified_got_it);
            if (button != null) {
                i = R.id.about_verified_header;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.about_verified_header)) != null) {
                    i = R.id.about_verified_icon;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.about_verified_icon)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f13647S = new C0485w(constraintLayout, button, constraintLayout);
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
        a aVar = this.f13648T;
        if (aVar == null) {
            j.n("mMayaVerifiedSellerSheetDialogFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0485w c0485w = this.f13647S;
        j.d(c0485w);
        this.f13649U = c0485w.f4251d;
        C0485w c0485w2 = this.f13647S;
        j.d(c0485w2);
        this.f13650V = c0485w2.c;
        a aVar = this.f13648T;
        if (aVar == null) {
            j.n("mMayaVerifiedSellerSheetDialogFragmentPresenter");
            throw null;
        }
        aVar.j();
        Button button = this.f13650V;
        if (button != null) {
            button.setOnClickListener(new L(this, 21));
        } else {
            j.n("mButtonGotIt");
            throw null;
        }
    }
}
