package yc;

import K8.InterfaceC0280e;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBindingFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcUploadDocumentsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserUpdateWorkDetailsFragment;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class B implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaBaseBindingFragment f21095b;

    public /* synthetic */ B(MayaBaseBindingFragment mayaBaseBindingFragment, int i) {
        this.f21094a = i;
        this.f21095b = mayaBaseBindingFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f21094a) {
            case 0:
                MayaUserUpdateWorkDetailsFragment mayaUserUpdateWorkDetailsFragment = (MayaUserUpdateWorkDetailsFragment) this.f21095b;
                Callback.onClick_enter(view);
                try {
                    MayaUserUpdateWorkDetailsFragment.k2(mayaUserUpdateWorkDetailsFragment);
                    return;
                } finally {
                }
            default:
                MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment = (MayaKycAmlcUploadDocumentsFragment) this.f21095b;
                Callback.onClick_enter(view);
                try {
                    MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment2 = (MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) mayaKycAmlcUploadDocumentsFragment.K1().c.get());
                    KeyEventDispatcher.Component componentRequireActivity = mayaKycAmlcUploadDocumentsFragment2.requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    H8.b bVar = (H8.b) componentRequireActivity;
                    if (((M8.A) mayaKycAmlcUploadDocumentsFragment2.f12480Y.getValue()).a()) {
                        ((MayaKycActivity) bVar).finish();
                    } else {
                        ((MayaKycActivity) bVar).i2(true);
                    }
                    String str = ((M8.A) mayaKycAmlcUploadDocumentsFragment.f12480Y.getValue()).a() ? "Dashboard" : "Work Information";
                    String string = mayaKycAmlcUploadDocumentsFragment.getString(R.string.pma_label_back);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    mayaKycAmlcUploadDocumentsFragment.L1(string, str);
                    return;
                } finally {
                }
        }
    }
}
