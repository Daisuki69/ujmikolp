package com.paymaya.mayaui.banktransfer.view.fragment.impl;

import E5.a;
import M2.b;
import S5.c;
import Uh.d;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import b6.C0922a;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.android.gms.tasks.Task;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.BankTransferV3CreateResponse;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.V0;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import l9.C1803a;
import q6.C2166c;
import s6.InterfaceC2243d;
import t6.i;
import y5.e;
import y5.l;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBankTransferOTPFragment extends MayaAbstractBaseOTPFragmentImpl implements InterfaceC2243d, a {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public C0922a f11578j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public i f11579k0;

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final e M1() {
        return X1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.OTP;
    }

    public final BankTransferV3CreateResponse W1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (BankTransferV3CreateResponse) arguments.getParcelable("bank_transfer");
        }
        return null;
    }

    public final C0922a X1() {
        C0922a c0922a = this.f11578j0;
        if (c0922a != null) {
            return c0922a;
        }
        j.n("mBankTransferOTPFragmentPresenter");
        throw null;
    }

    public final void Y1(PayMayaError payMayaError) {
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e("BANK_TRANSFER_CONFIRMATION_".concat(AbstractC1173g.G(27)));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", "Bank Transfer Confirmation Screen");
        map.put("error_reason", payMayaError.mSpiel());
        map.put(StateEvent.Name.ERROR_CODE, String.valueOf(payMayaError.mErrorCode()));
        c1220iO1.b(c1219hE);
    }

    public final void Z1(PayMayaError payMayaError) {
        i iVar = this.f11579k0;
        if (iVar != null) {
            ((MayaBankTransferActivity) iVar).a(payMayaError, getString(R.string.pma_toast_error_title_otp_error));
        }
    }

    public final void a2(PayMayaError payMayaError) {
        i iVar = this.f11579k0;
        if (iVar != null) {
            MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) iVar;
            MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(0, null, null, null, null, false, payMayaError, null, false, 447);
            mayaErrorDialogFragmentZ.f11850c0 = new C2166c(mayaErrorDialogFragmentZ, mayaBankTransferActivity, 0);
            mayaErrorDialogFragmentZ.show(mayaBankTransferActivity.getSupportFragmentManager(), "error_dialog");
        }
    }

    @Override // E5.a
    public final void b(String str) {
        String strGroup;
        C0922a c0922aX1 = X1();
        Matcher matcher = Pattern.compile(".*OTP is ([0-9]{6}).*").matcher(z.t(str, Global.NEWLINE, ""));
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return;
        }
        ((MayaAbstractBaseOTPFragmentImpl) ((InterfaceC2243d) c0922aX1.c.get())).S1(strGroup);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f11579k0 = (i) getActivity();
        O5.a aVar = W4.a.e().h().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f10266c0 = (B5.i) aVar.f4659D.get();
        V0 v0T = aVar.T();
        C1278p0 c1278p0E = aVar.E();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        d sessionSubject = (d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.f11578j0 = new C0922a(v0T, preference, c1278p0E, sessionSubject);
        X1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Object obj = this.f11579k0;
        if (obj != null) {
            ((l) obj).W1();
        }
        X1().i();
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
        i iVar = this.f11579k0;
        if (iVar != null) {
            ((MayaBankTransferActivity) iVar).Q(this);
        }
        U1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            X1().j();
        }
        T1();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        if (C.Z(contextRequireContext)) {
            SmsRetrieverClient client = SmsRetriever.getClient(requireContext());
            j.f(client, "getClient(...)");
            Task<Void> taskStartSmsRetriever = client.startSmsRetriever();
            j.f(taskStartSmsRetriever, "startSmsRetriever(...)");
            taskStartSmsRetriever.addOnSuccessListener(new C1803a(new com.squareup.wire.internal.a(this, 20), 17));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.BANK_TRANSFER;
    }
}
