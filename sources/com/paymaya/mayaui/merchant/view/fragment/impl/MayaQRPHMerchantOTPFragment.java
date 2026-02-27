package com.paymaya.mayaui.merchant.view.fragment.impl;

import D8.C0214w;
import E5.a;
import S5.c;
import Uh.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import l9.C1803a;
import o9.i;
import p9.InterfaceC2027l;
import y5.e;
import y5.l;
import y5.s;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaQRPHMerchantOTPFragment extends MayaAbstractBaseOTPFragmentImpl implements i, a {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public C0214w f12906j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public InterfaceC2027l f12907k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public QRPHMerchantPaymentTransaction f12908l0;

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final e M1() {
        return W1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.OTP;
    }

    public final C0214w W1() {
        C0214w c0214w = this.f12906j0;
        if (c0214w != null) {
            return c0214w;
        }
        j.n("mQRPHMerchantOTPFragmentPresenter");
        throw null;
    }

    public final void X1(String str) {
        InterfaceC2027l interfaceC2027l = this.f12907k0;
        if (interfaceC2027l != null) {
            ((MayaQRPHMerchantActivity) interfaceC2027l).o(getString(R.string.pma_toast_error_title_otp_error), str);
        }
    }

    public final void Y1(PayMayaError payMayaError) {
        InterfaceC2027l interfaceC2027l = this.f12907k0;
        if (interfaceC2027l != null) {
            String string = getString(R.string.pma_toast_error_title_error);
            j.f(string, "getString(...)");
            String strMSpiel = payMayaError.mSpiel();
            j.f(strMSpiel, "mSpiel(...)");
            ((MayaQRPHMerchantActivity) interfaceC2027l).b2(string, strMSpiel);
        }
    }

    @Override // E5.a
    public final void b(String str) {
        C0214w c0214wW1 = W1();
        Matcher matcher = Pattern.compile(".*OTP is ([0-9]{6}).*").matcher(z.t(str, Global.NEWLINE, ""));
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            s sVar = (i) c0214wW1.c.get();
            j.d(strGroup);
            ((MayaAbstractBaseOTPFragmentImpl) sVar).S1(strGroup);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f12907k0 = (InterfaceC2027l) getActivity();
        O5.a aVar = W4.a.e().q().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f10266c0 = (B5.i) aVar.f4659D.get();
        this.f12906j0 = new C0214w(aVar.B(), aVar.E(), (com.paymaya.data.preference.a) aVar.e.get(), (d) aVar.f4748y.get());
        W1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Object obj = this.f12907k0;
        if (obj != null) {
            ((l) obj).W1();
        }
        W1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        V1();
        super.onPause();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2027l interfaceC2027l = this.f12907k0;
        if (interfaceC2027l != null) {
            ((MayaQRPHMerchantActivity) interfaceC2027l).Q(this);
        }
        U1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("qr_ph_merchant_payment_transaction");
            j.d(parcelable);
            this.f12908l0 = (QRPHMerchantPaymentTransaction) parcelable;
        }
        W1().j();
        T1();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        if (C.Z(contextRequireContext)) {
            SmsRetrieverClient client = SmsRetriever.getClient(requireContext());
            j.f(client, "getClient(...)");
            Task<Void> taskStartSmsRetriever = client.startSmsRetriever();
            j.f(taskStartSmsRetriever, "startSmsRetriever(...)");
            taskStartSmsRetriever.addOnSuccessListener(new C1803a(new com.squareup.wire.internal.a(this, 16), 10));
        }
        Group group = this.f10262Y;
        if (group != null) {
            group.setVisibility(8);
        } else {
            j.n("mHelpCenterConstraintGroup");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.QRPH;
    }
}
