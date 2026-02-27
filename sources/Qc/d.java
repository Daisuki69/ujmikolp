package qc;

import Ah.o;
import Ah.p;
import Lh.g;
import Lh.h;
import Y.e;
import bg.AbstractC0983W;
import cj.C1112C;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.data.api.UpdateProfileApi;
import com.paymaya.data.api.UserProfileUpdateApi;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.UpdateProfileCmsContentData;
import com.paymaya.domain.model.ValidationRule;
import com.paymaya.domain.store.Z;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import d4.AbstractC1331a;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pg.C2038a;
import s.AbstractC2217b;
import tc.InterfaceC2282c;
import xc.InterfaceC2469a;
import y5.AbstractC2509a;
import y5.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f19771d;
    public final e e;
    public int f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19772g;
    public UpdateProfileCmsContentData h;
    public String i;
    public String j;

    public d(e eVar, com.paymaya.data.preference.a aVar) {
        this.f19771d = aVar;
        this.e = eVar;
    }

    public final void k(Function2 function2) {
        boolean z4 = false;
        if (this.f19771d.v().length() == 0) {
            this.f19771d.m0(UUID.randomUUID().toString());
        }
        ((MayaBaseFragment) ((s) this.c.get())).E1();
        e eVar = this.e;
        h hVarH = p.l(((UserProfileUpdateApi) eVar.f6708b).getProfileCMSData(), ((UpdateProfileApi) eVar.c).getUserProfile(), Z.f11419r).h(Th.e.c);
        o oVarA = zh.b.a();
        C2170b c2170b = new C2170b(this, 0);
        Gh.d dVar = new Gh.d(1, new C2038a(6, this, function2, z4), new c(this, 0));
        try {
            try {
                hVarH.f(new g(new Hh.d(dVar, c2170b, 1), oVarA));
                e(dVar);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th2) {
                AbstractC0983W.G(th2);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th2);
                throw nullPointerException;
            }
        } catch (NullPointerException e7) {
            throw e7;
        } catch (Throwable th3) {
            throw AbstractC1213b.L(th3, "subscribeActual failed", th3);
        }
    }

    public final List l() {
        UpdateProfileCmsContentData updateProfileCmsContentData = this.h;
        List<ValidationRule> validationRules = updateProfileCmsContentData != null ? updateProfileCmsContentData.getValidationRules() : null;
        return validationRules == null ? C1112C.f9377a : validationRules;
    }

    public final void m(String str) {
        int iW = C.w(str);
        if (iW == 0) {
            return;
        }
        int iC = AbstractC2217b.c(iW);
        if (iC == 89 || iC == 90) {
            HashMap mapA = C.A(str);
            this.i = (String) jk.b.m(mapA, "next", null);
            this.j = (String) jk.b.m(mapA, "back", null);
        }
    }

    public final void n(PayMayaError payMayaError, int i, boolean z4) {
        AbstractC1331a.r(i, "apiState");
        this.f = i;
        if (payMayaError.mErrorCode() != 30100) {
            InterfaceC2282c interfaceC2282c = ((MayaUpdateProfileBaseFragment) ((InterfaceC2469a) this.c.get())).f14238W;
            if (interfaceC2282c != null) {
                interfaceC2282c.S(z4);
            }
            Unit unit = Unit.f18162a;
            return;
        }
        this.f19771d.r0(true);
        this.f19772g = true;
        InterfaceC2282c interfaceC2282c2 = ((MayaUpdateProfileBaseFragment) ((InterfaceC2469a) this.c.get())).f14238W;
        if (interfaceC2282c2 != null) {
            interfaceC2282c2.u();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(kotlin.jvm.functions.Function1 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            java.lang.String r3 = "subscribeActual failed"
            boolean r4 = r8.f19772g
            if (r4 == 0) goto La4
            int r4 = r8.f
            int r4 = s.AbstractC2217b.c(r4)
            if (r4 == r2) goto L98
            if (r4 == r1) goto L18
            r1 = 3
            if (r4 == r1) goto L98
            goto La0
        L18:
            qc.a r4 = new qc.a
            r4.<init>(r9)
            com.paymaya.data.preference.a r9 = r8.f19771d
            java.lang.String r9 = r9.v()
            int r9 = r9.length()
            if (r9 != 0) goto L36
            com.paymaya.data.preference.a r9 = r8.f19771d
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            r9.m0(r5)
        L36:
            java.lang.ref.WeakReference r9 = r8.c
            java.lang.Object r9 = r9.get()
            y5.s r9 = (y5.s) r9
            com.paymaya.common.base.MayaBaseFragment r9 = (com.paymaya.common.base.MayaBaseFragment) r9
            r9.E1()
            Y.e r9 = r8.e
            java.lang.Object r9 = r9.c
            com.paymaya.data.api.UpdateProfileApi r9 = (com.paymaya.data.api.UpdateProfileApi) r9
            Ah.p r9 = r9.getUserProfile()
            Nh.j r5 = Th.e.c
            Lh.h r9 = r9.h(r5)
            Ah.o r5 = zh.b.a()
            qc.b r6 = new qc.b
            r6.<init>(r8, r2)
            ph.f1 r7 = new ph.f1
            r7.<init>(r4, r1)
            p8.a r1 = new p8.a
            r4 = 4
            r1.<init>(r8, r4)
            Gh.d r4 = new Gh.d
            r4.<init>(r2, r7, r1)
            Hh.d r1 = new Hh.d     // Catch: java.lang.Throwable -> L90 java.lang.NullPointerException -> L96
            r1.<init>(r4, r6, r2)     // Catch: java.lang.Throwable -> L90 java.lang.NullPointerException -> L96
            Lh.g r6 = new Lh.g     // Catch: java.lang.Throwable -> L81 java.lang.NullPointerException -> L8e
            r6.<init>(r1, r5)     // Catch: java.lang.Throwable -> L81 java.lang.NullPointerException -> L8e
            r9.f(r6)     // Catch: java.lang.Throwable -> L81 java.lang.NullPointerException -> L8e
            io.reactivex.rxjava3.disposables.b[] r9 = new io.reactivex.rxjava3.disposables.b[r2]
            r9[r0] = r4
            r8.e(r9)
            goto La0
        L81:
            r9 = move-exception
            bg.AbstractC0983W.G(r9)     // Catch: java.lang.Throwable -> L90 java.lang.NullPointerException -> L96
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L90 java.lang.NullPointerException -> L96
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L90 java.lang.NullPointerException -> L96
            r0.initCause(r9)     // Catch: java.lang.Throwable -> L90 java.lang.NullPointerException -> L96
            throw r0     // Catch: java.lang.Throwable -> L90 java.lang.NullPointerException -> L96
        L8e:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L90 java.lang.NullPointerException -> L96
        L90:
            r9 = move-exception
            java.lang.NullPointerException r9 = com.paymaya.common.utility.AbstractC1213b.L(r9, r3, r9)
            throw r9
        L96:
            r9 = move-exception
            throw r9
        L98:
            M8.H0 r1 = new M8.H0
            r1.<init>(r8, r9)
            r8.k(r1)
        La0:
            r8.f = r2
            r8.f19772g = r0
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.d.o(kotlin.jvm.functions.Function1):void");
    }
}
