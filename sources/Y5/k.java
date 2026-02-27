package y5;

import android.os.CountDownTimer;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeOtpFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21067a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21068b;
    public final /* synthetic */ MayaBaseFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment, long j) {
        super(j, 1000L);
        this.c = mayaMultiTypeOtpFragment;
        this.f21068b = mayaMultiTypeOtpFragment.I1().d();
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.f21067a) {
            case 0:
                MayaAbstractBaseOTPFragmentImpl mayaAbstractBaseOTPFragmentImpl = (MayaAbstractBaseOTPFragmentImpl) this.c;
                mayaAbstractBaseOTPFragmentImpl.f10268e0 = 0L;
                mayaAbstractBaseOTPFragmentImpl.K1().setTextHTML(mayaAbstractBaseOTPFragmentImpl.getString(R.string.maya_html_link_resend_code));
                return;
            default:
                MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = (MayaMultiTypeOtpFragment) this.c;
                mayaMultiTypeOtpFragment.f12950d0 = 0L;
                HtmlTextView htmlTextView = mayaMultiTypeOtpFragment.f12946Z;
                if (htmlTextView == null) {
                    kotlin.jvm.internal.j.n("mResendCodeHtmlTextView");
                    throw null;
                }
                htmlTextView.setClickable(true);
                HtmlTextView htmlTextView2 = mayaMultiTypeOtpFragment.f12946Z;
                if (htmlTextView2 != null) {
                    htmlTextView2.setTextHTML(mayaMultiTypeOtpFragment.getString(R.string.maya_label_resend_otp_link));
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mResendCodeHtmlTextView");
                    throw null;
                }
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        MayaBaseFragment mayaBaseFragment = this.c;
        long j6 = this.f21068b;
        switch (this.f21067a) {
            case 0:
                MayaAbstractBaseOTPFragmentImpl mayaAbstractBaseOTPFragmentImpl = (MayaAbstractBaseOTPFragmentImpl) mayaBaseFragment;
                mayaAbstractBaseOTPFragmentImpl.f10268e0 = j6 - j;
                long j7 = 1000;
                int i = (int) ((j + j7) / j7);
                String quantityString = mayaAbstractBaseOTPFragmentImpl.getResources().getQuantityString(R.plurals.maya_format_resend_code_countdown, i, Integer.valueOf(i));
                kotlin.jvm.internal.j.f(quantityString, "getQuantityString(...)");
                mayaAbstractBaseOTPFragmentImpl.K1().setText(quantityString);
                return;
            default:
                MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = (MayaMultiTypeOtpFragment) mayaBaseFragment;
                mayaMultiTypeOtpFragment.f12950d0 = j6 - j;
                long j9 = 1000;
                int i4 = (int) ((j + j9) / j9);
                String quantityString2 = mayaMultiTypeOtpFragment.getResources().getQuantityString(R.plurals.maya_mfa_format_resend_code_countdown, i4, Integer.valueOf(i4));
                kotlin.jvm.internal.j.f(quantityString2, "getQuantityString(...)");
                HtmlTextView htmlTextView = mayaMultiTypeOtpFragment.f12946Z;
                if (htmlTextView != null) {
                    htmlTextView.setText(quantityString2);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mResendCodeHtmlTextView");
                    throw null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MayaAbstractBaseOTPFragmentImpl mayaAbstractBaseOTPFragmentImpl, long j) {
        super(j, 1000L);
        this.c = mayaAbstractBaseOTPFragmentImpl;
        this.f21068b = mayaAbstractBaseOTPFragmentImpl.M1().d();
    }
}
