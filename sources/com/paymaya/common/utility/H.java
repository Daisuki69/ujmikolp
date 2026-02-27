package com.paymaya.common.utility;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lc.C1824a;
import lc.C1825b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10419b;
    public final /* synthetic */ Object c;

    public /* synthetic */ H(int i, Object obj, Object obj2) {
        this.f10418a = i;
        this.f10419b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [com.paymaya.common.base.MayaBaseLoadingFragment, ic.b] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f10419b;
        Object obj2 = this.c;
        switch (this.f10418a) {
            case 0:
                Context context = (Context) obj;
                AlertDialog alertDialog = (AlertDialog) obj2;
                Callback.onClick_enter(view);
                try {
                    I.b(context, alertDialog);
                    return;
                } finally {
                }
            case 1:
                Function1 function1 = (Function1) obj;
                MayaErrorDialogFragment mayaErrorDialogFragment = (MayaErrorDialogFragment) obj2;
                int i = MayaForgotPasswordActivity.f12356r;
                Callback.onClick_enter(view);
                try {
                    function1.invoke(mayaErrorDialogFragment);
                    mayaErrorDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 2:
                C1824a c1824a = (C1824a) obj;
                mc.e eVar = (mc.e) obj2;
                Callback.onClick_enter(view);
                try {
                    c1824a.f18286a.f(eVar);
                    return;
                } finally {
                }
            case 3:
                C1825b c1825b = (C1825b) obj;
                OnlinePayment onlinePayment = (OnlinePayment) obj2;
                Callback.onClick_enter(view);
                try {
                    C1825b.D(c1825b, onlinePayment);
                    return;
                } finally {
                }
            case 4:
                w1.r rVar = (w1.r) obj;
                Callback.onClick_enter(view);
                try {
                    rVar.getClass();
                    return;
                } finally {
                }
            case 5:
                Function0 function0 = (Function0) obj;
                MayaErrorDialogFragment mayaErrorDialogFragment2 = (MayaErrorDialogFragment) obj2;
                int i4 = MayaMfaActivity.f12926w;
                Callback.onClick_enter(view);
                try {
                    function0.invoke();
                    mayaErrorDialogFragment2.dismiss();
                    return;
                } finally {
                }
            case 6:
                MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) obj;
                MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) obj2;
                List list = MayaUserProfileUpdateFragment.f14261f0;
                Callback.onClick_enter(view);
                try {
                    mayaUserProfileUpdateFragment.u2(false);
                    C.Q(mayaUserProfileUpdateFragment.getActivity(), mayaProfileInputLayout.getInputEditText());
                    return;
                } finally {
                }
            default:
                AlertDialog alertDialog2 = (AlertDialog) obj2;
                EKycPhotoCaptureFragment eKycPhotoCaptureFragment = (EKycPhotoCaptureFragment) obj;
                Callback.onClick_enter(view);
                try {
                    alertDialog2.dismiss();
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", eKycPhotoCaptureFragment.requireContext().getPackageName(), null));
                    eKycPhotoCaptureFragment.startActivityForResult(intent, 2);
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ H(AlertDialog alertDialog, EKycPhotoCaptureFragment eKycPhotoCaptureFragment) {
        this.f10418a = 7;
        this.c = alertDialog;
        this.f10419b = eKycPhotoCaptureFragment;
    }
}
