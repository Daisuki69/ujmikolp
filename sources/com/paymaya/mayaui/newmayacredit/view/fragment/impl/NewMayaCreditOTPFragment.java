package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import B5.i;
import D8.C0214w;
import E5.a;
import N9.f;
import P9.m;
import Q9.I;
import S5.c;
import Uh.d;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import defpackage.AbstractC1414e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import y5.e;
import y5.s;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaCreditOTPFragment extends MayaAbstractBaseOTPFragmentImpl implements m, a {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public C0214w f13298j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public I f13299k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final boolean f13300l0 = true;

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final e M1() {
        return W1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final void N1() {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
        c1219hD.r(EnumC1216e.OTP);
        c1219hD.n(17);
        AbstractC1414e.n(c1219hD, EnumC1217f.HELP_CENTER, c1220iO1, activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final void P1() {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
        c1219hD.r(EnumC1216e.ACTIVATION_OTP);
        c1219hD.n(17);
        AbstractC1414e.n(c1219hD, EnumC1217f.RESEND, c1220iO1, activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final void Q1() {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
        c1219hD.r(EnumC1216e.ACTIVATION_OTP);
        c1219hD.n(17);
        AbstractC1414e.n(c1219hD, EnumC1217f.VERIFY, c1220iO1, activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.OTP;
    }

    public final C0214w W1() {
        C0214w c0214w = this.f13298j0;
        if (c0214w != null) {
            return c0214w;
        }
        j.n("mMayaCreditOTPFragmentPresenter");
        throw null;
    }

    @Override // E5.a
    public final void b(String str) {
        C0214w c0214wW1 = W1();
        Matcher matcher = Pattern.compile(".*mobile number is ([0-9]{6}).*").matcher(z.t(str, Global.NEWLINE, ""));
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            s sVar = (m) c0214wW1.c.get();
            j.d(strGroup);
            ((MayaAbstractBaseOTPFragmentImpl) sVar).S1(strGroup);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        O5.a aVar = W4.a.e().D().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f10266c0 = (i) aVar.f4659D.get();
        C1264i0 c1264i0A = aVar.A();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        d sessionPublishSubject = (d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionPublishSubject, "sessionPublishSubject");
        this.f13298j0 = new C0214w(c1264i0A, preference, sessionPublishSubject);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditOTPFragment.NewMayaCreditOTPFragmentListener");
        this.f13299k0 = (I) componentRequireActivity;
        W1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
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
        I i = this.f13299k0;
        if (i != null) {
            ((NewMayaCreditActivity) i).Q(this);
        }
        U1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C0214w c0214wW1 = W1();
            String string = arguments.getString("otp_id");
            c0214wW1.j();
            c0214wW1.f1106g = string;
            m mVar = (m) c0214wW1.c.get();
            String strR = ((com.paymaya.data.preference.a) c0214wW1.e).r();
            j.f(strR, "getMobileNumber(...)");
            NewMayaCreditOTPFragment newMayaCreditOTPFragment = (NewMayaCreditOTPFragment) mVar;
            newMayaCreditOTPFragment.getClass();
            newMayaCreditOTPFragment.J1().setText(Html.fromHtml(newMayaCreditOTPFragment.getString(R.string.maya_format_enter_otp_sent_to_mobile_number, C.p(strR))));
        }
        T1();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        if (C.Z(contextRequireContext)) {
            SmsRetrieverClient client = SmsRetriever.getClient(requireContext());
            j.f(client, "getClient(...)");
            Task<Void> taskStartSmsRetriever = client.startSmsRetriever();
            j.f(taskStartSmsRetriever, "startSmsRetriever(...)");
            taskStartSmsRetriever.addOnSuccessListener(new Na.d(new f(this, 9), 7));
        }
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
        AbstractC1414e.m(c1219hD, EnumC1216e.ACTIVATION_OTP, 21);
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.f13300l0;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.CREDIT;
    }
}
