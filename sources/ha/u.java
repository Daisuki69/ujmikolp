package ha;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.FragmentResultListener;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.g0;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.MayaChoicesAdapterItem;
import com.paymaya.domain.model.OpenMfaMeta;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferConfirmationFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordEnterMinFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import com.paymaya.ui.sendmoney.view.activity.impl.SendMoneyCardActivity;
import com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PageFragment;
import dOYHB6.tiZVw8.numX49;
import f1.EnumC1457c;
import i8.C1594b;
import j1.C1659g;
import j1.InterfaceC1657e;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k1.InterfaceC1690a;
import ke.InterfaceC1771b;
import m8.InterfaceC1854a;
import n8.C1934b;
import n8.InterfaceC1935c;
import s6.InterfaceC2240a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements FragmentResultListener, InterfaceC1690a, Ch.a, InterfaceC1657e, g0, Ch.f, com.tencent.could.huiyansdk.callback.e, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17024b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i, Object obj, Object obj2) {
        this.f17023a = i;
        this.f17024b = obj;
        this.c = obj2;
    }

    @Override // com.tencent.could.huiyansdk.callback.e
    public void a(boolean z4, String str) {
        ((com.tencent.could.huiyansdk.manager.b) this.f17024b).b((String) this.c, z4, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0178 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:37:0x0172, B:39:0x0178, B:41:0x0188, B:42:0x0194), top: B:59:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b3  */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
    @Override // j1.InterfaceC1657e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.u.apply(java.lang.Object):java.lang.Object");
    }

    @Override // com.paymaya.common.utility.g0
    public void b(File file) {
        SendMoneyCardFragment sendMoneyCardFragment = (SendMoneyCardFragment) this.f17024b;
        InterfaceC1771b interfaceC1771b = sendMoneyCardFragment.f14767V;
        if (interfaceC1771b == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bSH0"));
            throw null;
        }
        String string = sendMoneyCardFragment.getString(R.string.pma_label_share_or_save);
        kotlin.jvm.internal.j.f(string, numX49.tnTj78("bSHR"));
        Uri uriC = h0.c(sendMoneyCardFragment.getActivity(), file);
        kotlin.jvm.internal.j.f(uriC, numX49.tnTj78("bSHp"));
        SendMoneyCardActivity sendMoneyCardActivity = (SendMoneyCardActivity) interfaceC1771b;
        String str = (String) this.c;
        sendMoneyCardActivity.e.getClass();
        B5.i.X(sendMoneyCardActivity, string, str, uriC);
    }

    @Override // k1.InterfaceC1690a
    public Object execute() {
        switch (this.f17023a) {
            case 1:
                C1659g c1659g = (C1659g) ((i1.f) this.f17024b).c;
                c1659g.getClass();
                Iterable iterable = (Iterable) this.c;
                if (iterable.iterator().hasNext()) {
                    c1659g.b().compileStatement(numX49.tnTj78("bSHg") + C1659g.m(iterable)).execute();
                    break;
                }
                break;
            default:
                i1.f fVar = (i1.f) this.f17024b;
                fVar.getClass();
                Iterator it = ((HashMap) this.c).entrySet().iterator();
                while (it.hasNext()) {
                    ((C1659g) fVar.i).i(((Integer) r2.getValue()).intValue(), EnumC1457c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        HashMap map;
        MayaInputLayout mayaInputLayout;
        String strTnTj78;
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bSHf"));
        kotlin.jvm.internal.j.g(bundle, numX49.tnTj78("bSH1"));
        MayaChoicesAdapterItem mayaChoicesAdapterItem = (MayaChoicesAdapterItem) bundle.getParcelable(numX49.tnTj78("bSHn"));
        Ci.b bVar = ((MayaPayBillsFormFragment) this.f17024b).f13417A0;
        if (bVar == null || (map = (HashMap) bVar.f) == null || (mayaInputLayout = (MayaInputLayout) map.get(((UIComponent) this.c).parameter())) == null) {
            return;
        }
        AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
        if (mayaChoicesAdapterItem == null || (strTnTj78 = mayaChoicesAdapterItem.getItemAsString()) == null) {
            strTnTj78 = numX49.tnTj78("bSHx");
        }
        inputEditText.setText(strTnTj78);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        switch (this.f17023a) {
            case 10:
                final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f17024b;
                ShopV3HomePageFragment shopV3HomePageFragment = (ShopV3HomePageFragment) this.c;
                Callback.onRefresh_enter();
                try {
                    final int i = 0;
                    swipeRefreshLayout.post(new Runnable() { // from class: we.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    swipeRefreshLayout.setRefreshing(false);
                                    break;
                                default:
                                    swipeRefreshLayout.setRefreshing(false);
                                    break;
                            }
                        }
                    });
                    ((se.e) shopV3HomePageFragment.B1()).n();
                    return;
                } finally {
                }
            default:
                ShopV3PageFragment shopV3PageFragment = (ShopV3PageFragment) this.f17024b;
                final SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) this.c;
                Callback.onRefresh_enter();
                try {
                    shopV3PageFragment.A1().k();
                    final int i4 = 1;
                    swipeRefreshLayout2.post(new Runnable() { // from class: we.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    swipeRefreshLayout2.setRefreshing(false);
                                    break;
                                default:
                                    swipeRefreshLayout2.setRefreshing(false);
                                    break;
                            }
                        }
                    });
                    return;
                } finally {
                }
        }
    }

    @Override // Ch.a
    public void run() {
        switch (this.f17023a) {
            case 3:
                C1594b c1594b = (C1594b) this.f17024b;
                String str = (String) this.c;
                ((MayaBaseFragment) ((InterfaceC1854a) c1594b.c.get())).w1();
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bSH5"));
                MayaForgotPasswordEnterMinFragment mayaForgotPasswordEnterMinFragment = (MayaForgotPasswordEnterMinFragment) ((InterfaceC1854a) c1594b.c.get());
                mayaForgotPasswordEnterMinFragment.getClass();
                OpenMfaMeta openMfaMeta = new OpenMfaMeta(str, numX49.tnTj78("bSHI"), numX49.tnTj78("bSHq"), null, numX49.tnTj78("bSHz"), numX49.tnTj78("bSHJ"), null, 72, null);
                InterfaceC1935c interfaceC1935c = mayaForgotPasswordEnterMinFragment.f12370Z;
                if (interfaceC1935c != null) {
                    MayaForgotPasswordActivity mayaForgotPasswordActivity = (MayaForgotPasswordActivity) interfaceC1935c;
                    mayaForgotPasswordActivity.f12357n = new com.squareup.wire.internal.a(new C1934b(mayaForgotPasswordEnterMinFragment, 0), 12);
                    mayaForgotPasswordActivity.n1();
                    Intent intent = new Intent(mayaForgotPasswordActivity, (Class<?>) MayaMfaActivity.class);
                    intent.putExtra(numX49.tnTj78("bSHl"), openMfaMeta);
                    mayaForgotPasswordActivity.f12358o.launch(intent);
                }
                break;
            default:
                o6.c cVar = (o6.c) this.f17024b;
                BankTransferV3 bankTransferV3 = (BankTransferV3) this.c;
                cVar.getClass();
                kotlin.jvm.internal.j.g(bankTransferV3, numX49.tnTj78("bSHs"));
                ((MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get())).J1(bankTransferV3, true, true);
                break;
        }
    }
}
