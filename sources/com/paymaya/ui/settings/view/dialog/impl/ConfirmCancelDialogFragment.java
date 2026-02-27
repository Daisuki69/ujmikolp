package com.paymaya.ui.settings.view.dialog.impl;

import D7.d;
import N5.Z;
import O5.f;
import W4.a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.BaseDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.EDD;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.settings.view.dialog.impl.ConfirmCancelDialogFragment;
import i8.C1593a;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import n3.C1916a;
import pe.b;

/* JADX INFO: loaded from: classes4.dex */
public final class ConfirmCancelDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Z f14774R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C1593a f14775S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public b f14776T;

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14776T = (b) getActivity();
        a aVarE = a.e();
        if (aVarE.f6274g == null) {
            O5.a aVar = aVarE.f6267a;
            C1916a c1916a = new C1916a(29);
            aVar.getClass();
            aVarE.f6274g = new f(aVar.f4704b, c1916a);
        }
        this.f10241B = (C1220i) aVarE.f6274g.f4755a.f4716g.get();
        C1593a c1593a = new C1593a(7);
        this.f14775S = c1593a;
        c1593a.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_confirm_cancel_dialog, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.negative_text_view_pma_fragment_confirm_cancel_dialog;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.negative_text_view_pma_fragment_confirm_cancel_dialog);
        if (textView != null) {
            i = R.id.positive_text_view_pma_fragment_confirm_cancel_dialog;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.positive_text_view_pma_fragment_confirm_cancel_dialog);
            if (textView2 != null) {
                i = R.id.subtitle_text_view_pma_fragment_confirm_cancel_dialog;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.subtitle_text_view_pma_fragment_confirm_cancel_dialog)) != null) {
                    i = R.id.title_text_view_pma_fragment_confirm_cancel_dialog;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view_pma_fragment_confirm_cancel_dialog)) != null) {
                        this.f14774R = new Z(constraintLayout, textView, textView2, 4);
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1593a c1593a = this.f14775S;
        if (c1593a == null) {
            j.n("mConfirmCancelDialogFragmentPresenter");
            throw null;
        }
        c1593a.i();
        super.onDestroy();
        this.f14774R = null;
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        C1593a c1593a = this.f14775S;
        if (c1593a == null) {
            j.n("mConfirmCancelDialogFragmentPresenter");
            throw null;
        }
        c1593a.j();
        Z z4 = this.f14774R;
        j.d(z4);
        final int i = 0;
        z4.f4042d.setOnClickListener(new View.OnClickListener(this) { // from class: pe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmCancelDialogFragment f19094b;

            {
                this.f19094b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        ConfirmCancelDialogFragment confirmCancelDialogFragment = this.f19094b;
                        Callback.onClick_enter(view2);
                        try {
                            b bVar = confirmCancelDialogFragment.f14776T;
                            if (bVar != null) {
                                EDDActivity eDDActivity = (EDDActivity) bVar;
                                EDD edd = eDDActivity.t1().i;
                                if (edd != null) {
                                    edd.reset();
                                }
                                d dVar = eDDActivity.f14495k;
                                if (dVar != null) {
                                    ((ArrayList) dVar.f992b).clear();
                                }
                                eDDActivity.f14495k = null;
                                eDDActivity.v1();
                            }
                            confirmCancelDialogFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        ConfirmCancelDialogFragment confirmCancelDialogFragment2 = this.f19094b;
                        Callback.onClick_enter(view2);
                        try {
                            confirmCancelDialogFragment2.dismiss();
                            return;
                        } finally {
                        }
                }
            }
        });
        Z z5 = this.f14774R;
        j.d(z5);
        final int i4 = 1;
        z5.c.setOnClickListener(new View.OnClickListener(this) { // from class: pe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmCancelDialogFragment f19094b;

            {
                this.f19094b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        ConfirmCancelDialogFragment confirmCancelDialogFragment = this.f19094b;
                        Callback.onClick_enter(view2);
                        try {
                            b bVar = confirmCancelDialogFragment.f14776T;
                            if (bVar != null) {
                                EDDActivity eDDActivity = (EDDActivity) bVar;
                                EDD edd = eDDActivity.t1().i;
                                if (edd != null) {
                                    edd.reset();
                                }
                                d dVar = eDDActivity.f14495k;
                                if (dVar != null) {
                                    ((ArrayList) dVar.f992b).clear();
                                }
                                eDDActivity.f14495k = null;
                                eDDActivity.v1();
                            }
                            confirmCancelDialogFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        ConfirmCancelDialogFragment confirmCancelDialogFragment2 = this.f19094b;
                        Callback.onClick_enter(view2);
                        try {
                            confirmCancelDialogFragment2.dismiss();
                            return;
                        } finally {
                        }
                }
            }
        });
    }
}
