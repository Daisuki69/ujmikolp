package y9;

import Ah.i;
import G5.t;
import Kh.C0300e;
import Kh.J;
import Lh.h;
import a.AbstractC0617a;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentResultListener;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.mayaui.inboxsupport.view.activity.impl.MayaInboxSupportActivity;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeOtpFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalListFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSearchFragment;
import i2.C1585a;
import kotlin.jvm.internal.j;
import pg.C2038a;
import pg.r;
import pg.s;
import rc.C2198e;
import rc.C2199f;
import ya.C2516a;
import zd.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements OnSuccessListener, t, Ch.a, FragmentResultListener, s, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21083b;

    public /* synthetic */ d(Object obj, int i) {
        this.f21082a = i;
        this.f21083b = obj;
    }

    @Override // Ah.i
    public void c(C0300e c0300e) {
        SearchView searchView = ((EDDSearchFragment) this.f21083b).f14547T;
        if (searchView != null) {
            searchView.setOnQueryTextListener(new q(c0300e));
        }
    }

    @Override // G5.t
    public void m(String str, View view) {
        MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = (MayaMultiTypeOtpFragment) this.f21083b;
        if (System.currentTimeMillis() - mayaMultiTypeOtpFragment.f12951e0 >= mayaMultiTypeOtpFragment.f12952f0) {
            mayaMultiTypeOtpFragment.I1().b();
        }
        mayaMultiTypeOtpFragment.f12951e0 = System.currentTimeMillis();
        f fVar = mayaMultiTypeOtpFragment.f12943W;
        if (fVar != null) {
            String strM = AbstractC1213b.m(9);
            j.f(strM, "tapped(...)");
            HtmlTextView htmlTextView = mayaMultiTypeOtpFragment.f12946Z;
            if (htmlTextView == null) {
                j.n("mResendCodeHtmlTextView");
                throw null;
            }
            ((MayaMfaActivity) fVar).c2(strM, "Enter the OTP", "Enter the OTP", htmlTextView.getText().toString());
        }
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        j.g(str, "<unused var>");
        j.g(bundle, "bundle");
        ContactModel contactModel = (ContactModel) AbstractC0617a.D(bundle, "key_selected_contact_model", ContactModel.class);
        if (contactModel != null) {
            rc.i iVar = (rc.i) ((MayaUserContactReferenceFragment) this.f21083b).Z1();
            String contactId = contactModel.getContactId();
            if (contactId != null) {
                new Lh.d(new Lh.d(new Lh.d(new h(new J(new C1585a(4, iVar, contactId, contactModel), 1).h(Th.e.c), zh.b.a(), 0), new C2198e(iVar, 1), 2), new C2038a(8, iVar, contactModel, false), 0), new C2199f(iVar, 1), 1).e();
            }
        }
    }

    @Override // pg.s
    public void onMethodCall(r methodCall, pg.t result) {
        int i = MayaInboxSupportActivity.f12415v;
        j.g(methodCall, "methodCall");
        j.g(result, "result");
        new Handler(Looper.getMainLooper()).post(new androidx.work.impl.b(26, methodCall, (MayaInboxSupportActivity) this.f21083b, result));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f21082a) {
            case 0:
                ((com.squareup.wire.internal.a) this.f21083b).invoke(obj);
                break;
            default:
                ((com.squareup.wire.internal.a) this.f21083b).invoke(obj);
                break;
        }
    }

    @Override // Ch.a
    public void run() {
        MayaPushApprovalListFragment mayaPushApprovalListFragment = (MayaPushApprovalListFragment) ((Da.b) ((C2516a) this.f21083b).c.get());
        mayaPushApprovalListFragment.L1().i();
        LottieAnimationView lottieAnimationView = mayaPushApprovalListFragment.f13550V;
        if (lottieAnimationView == null) {
            j.n("mTopLottieView");
            throw null;
        }
        lottieAnimationView.a();
        LottieAnimationView lottieAnimationView2 = mayaPushApprovalListFragment.f13550V;
        if (lottieAnimationView2 == null) {
            j.n("mTopLottieView");
            throw null;
        }
        lottieAnimationView2.setProgress(0.0f);
        mayaPushApprovalListFragment.G1().setEnabled(true);
    }
}
