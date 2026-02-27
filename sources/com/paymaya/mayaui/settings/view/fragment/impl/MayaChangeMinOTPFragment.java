package com.paymaya.mayaui.settings.view.fragment.impl;

import B5.i;
import E5.a;
import Lb.d;
import N9.f;
import Rb.e;
import S5.c;
import Sb.m;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.text.HtmlCompat;
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
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.C1279q;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import y5.l;
import y5.s;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaChangeMinOTPFragment extends MayaAbstractBaseOTPFragmentImpl implements e, a {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public d f13944j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public m f13945k0;

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final y5.e M1() {
        return W1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        Bundle arguments;
        return (getArguments() == null || (arguments = getArguments()) == null || !arguments.getBoolean("is_new_mobile")) ? EnumC1216e.OTP_OLD_NUMBER : EnumC1216e.OTP_NEW_NUMBER;
    }

    public final d W1() {
        d dVar = this.f13944j0;
        if (dVar != null) {
            return dVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    @Override // E5.a
    public final void b(String str) {
        d dVarW1 = W1();
        Matcher matcher = Pattern.compile(".*mobile number is ([0-9]{6}).*").matcher(z.t(str, Global.NEWLINE, ""));
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            s sVar = (e) dVarW1.c.get();
            j.d(strGroup);
            ((MayaAbstractBaseOTPFragmentImpl) sVar).S1(strGroup);
        }
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        m mVar = this.f13945k0;
        if (mVar == null) {
            return true;
        }
        ((MayaSettingsActivity) mVar).a2();
        return true;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f13945k0 = (m) getActivity();
        O5.a aVar = (O5.a) W4.a.e().y().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f10266c0 = (i) aVar.f4659D.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1279q c1279qI = aVar.i();
        C1278p0 c1278p0E = aVar.E();
        S0 s0S = aVar.S();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.f13944j0 = new d(preference, c1279qI, c1278p0E, s0S, sessionSubject);
        W1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Object obj = this.f13945k0;
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
        m mVar = this.f13945k0;
        if (mVar != null) {
            ((MayaSettingsActivity) mVar).Q(this);
        }
        U1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        T1();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        if (C.Z(contextRequireContext)) {
            SmsRetrieverClient client = SmsRetriever.getClient(requireContext());
            j.f(client, "getClient(...)");
            Task<Void> taskStartSmsRetriever = client.startSmsRetriever();
            j.f(taskStartSmsRetriever, "startSmsRetriever(...)");
            taskStartSmsRetriever.addOnSuccessListener(new Na.d(new f(this, 11), 18));
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("otp_id");
            String string2 = arguments.getString("mobile_number");
            boolean z4 = arguments.getBoolean("is_new_mobile");
            d dVarW1 = W1();
            dVarW1.j();
            dVarW1.h = string;
            dVarW1.i = z4;
            dVarW1.j = string2;
            e eVar = (e) dVarW1.c.get();
            MayaChangeMinOTPFragment mayaChangeMinOTPFragment = (MayaChangeMinOTPFragment) eVar;
            mayaChangeMinOTPFragment.J1().setText(HtmlCompat.fromHtml(mayaChangeMinOTPFragment.getString(R.string.maya_format_enter_otp_sent_to_mobile_number, C.p(string2)), 0));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.CHANGE_MOBILE;
    }
}
