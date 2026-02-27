package com.paymaya.mayaui.login.view.fragment.impl;

import B5.i;
import E5.a;
import S5.c;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.utility.C1220i;
import de.m;
import g9.InterfaceC1508c;
import h9.k;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import of.p;
import y5.e;
import y5.l;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaLoginOTPFragment extends MayaAbstractBaseOTPFragmentImpl implements InterfaceC1508c, a {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Lb.a f12789j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public k f12790k0;

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final e M1() {
        return W1();
    }

    public final Lb.a W1() {
        Lb.a aVar = this.f12789j0;
        if (aVar != null) {
            return aVar;
        }
        j.n("mMayaLoginOTPFragmentPresenter");
        throw null;
    }

    @Override // E5.a
    public final void b(String str) {
        String strGroup;
        Lb.a aVarW1 = W1();
        if (aVarW1.g()) {
            Matcher matcher = Pattern.compile(".*OTP is ([0-9]{6}).*").matcher(z.t(str, Global.NEWLINE, ""));
            if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
                return;
            }
            MayaLoginOTPFragment mayaLoginOTPFragment = (MayaLoginOTPFragment) ((InterfaceC1508c) aVarW1.c.get());
            mayaLoginOTPFragment.getClass();
            mayaLoginOTPFragment.S1(strGroup);
        }
    }

    @Override // g9.InterfaceC1506a
    public final void g(String str, String str2, String str3) {
        o1().a(str, str2, str3);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f12790k0 = (k) getActivity();
        O5.a aVar = W4.a.e().p().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f10266c0 = (i) aVar.f4659D.get();
        this.f12789j0 = new Lb.a((com.paymaya.data.preference.a) aVar.e.get(), aVar.J(), aVar.E(), aVar.i(), (c) aVar.f4724k.get());
        W1().h(this);
        this.f10270g0 = false;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        W1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Object obj = this.f12790k0;
        if (obj != null) {
            ((l) obj).W1();
        }
        V1();
        super.onPause();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        if (p.v(contextRequireContext)) {
            SmsRetrieverClient client = SmsRetriever.getClient(requireContext());
            j.f(client, "getClient(...)");
            Task<Void> taskStartSmsRetriever = client.startSmsRetriever();
            j.f(taskStartSmsRetriever, "startSmsRetriever(...)");
            taskStartSmsRetriever.addOnSuccessListener(new m(new com.squareup.wire.internal.a(this, 8), 10));
        }
        k kVar = this.f12790k0;
        if (kVar != null) {
            kVar.Q(this);
        }
        U1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        T1();
        W1().j();
    }
}
