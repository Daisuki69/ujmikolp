package com.paymaya.mayaui.sendmoney.view.fragment.impl;

import Ab.c;
import B5.i;
import Bb.o;
import E5.a;
import Fb.d;
import G7.t;
import Gb.l;
import M2.b;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
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
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import y5.e;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaSendMoneyOTPFragment extends MayaAbstractBaseOTPFragmentImpl implements d, a {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public o f13813j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public l f13814k0;

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final e M1() {
        return W1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.OTP;
    }

    public final c W1() {
        o oVar = this.f13813j0;
        if (oVar != null) {
            return oVar;
        }
        j.n("mMayaSendMoneyOTPFragmentPresenter");
        throw null;
    }

    public final void X1(PayMayaError payMayaError) {
        l lVar = this.f13814k0;
        if (lVar != null) {
            getString(R.string.pma_toast_error_title_verification_code_error);
            MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) lVar;
            MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(0, null, null, null, null, false, payMayaError, null, false, 447);
            mayaErrorDialogFragmentZ.f11850c0 = new J5.a(mayaSendMoneyActivity, 18);
            mayaErrorDialogFragmentZ.show(mayaSendMoneyActivity.getSupportFragmentManager(), "error_dialog");
        }
    }

    public final void Y1(PayMayaError payMayaError) {
        l lVar = this.f13814k0;
        if (lVar != null) {
            ((MayaSendMoneyActivity) lVar).a(payMayaError, getString(R.string.pma_toast_error_title_otp_error));
        }
    }

    @Override // E5.a
    public final void b(String str) {
        String strGroup;
        o oVar = (o) W1();
        Matcher matcher = Pattern.compile(".*OTP is ([0-9]{6}).*").matcher(z.t(str, Global.NEWLINE, ""));
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return;
        }
        ((MayaAbstractBaseOTPFragmentImpl) ((d) oVar.c.get())).S1(strGroup);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f13814k0 = (l) getActivity();
        O5.a aVar = W4.a.e().x().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f10266c0 = (i) aVar.f4659D.get();
        this.f13813j0 = new o(aVar.T(), (com.paymaya.data.preference.a) aVar.e.get(), aVar.E(), (Uh.d) aVar.f4748y.get());
        ((AbstractC2509a) W1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Object obj = this.f13814k0;
        if (obj != null) {
            ((y5.l) obj).W1();
        }
        ((AbstractC2509a) W1()).i();
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
        l lVar = this.f13814k0;
        if (lVar != null) {
            ((MayaSendMoneyActivity) lVar).Q(this);
        }
        U1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            ((o) W1()).j();
        }
        T1();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        if (C.Z(contextRequireContext)) {
            SmsRetrieverClient client = SmsRetriever.getClient(requireContext());
            j.f(client, "getClient(...)");
            Task<Void> taskStartSmsRetriever = client.startSmsRetriever();
            j.f(taskStartSmsRetriever, "startSmsRetriever(...)");
            taskStartSmsRetriever.addOnSuccessListener(new t(new Ag.d(this, 19), 4));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.SEND_MONEY;
    }
}
