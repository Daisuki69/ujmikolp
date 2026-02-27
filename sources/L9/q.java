package L9;

import bg.AbstractC0983W;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditAssignContactReferenceFragment;
import o1.AbstractC1955a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1264i0 f2908d;
    public CreditReviewUiModel e;
    public boolean f;

    public q(C1264i0 c1264i0) {
        this.f2908d = c1264i0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r8 = this;
            com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel r0 = r8.e
            if (r0 == 0) goto L80
            J9.a r0 = r0.f13060l
            if (r0 == 0) goto L80
            java.lang.String r1 = r0.f2485a
            java.lang.String r2 = "^(?! )[A-Za-z .\\-]{1,40}$"
            r3 = 0
            if (r1 == 0) goto L14
            boolean r1 = com.paymaya.common.utility.AbstractC1213b.U(r2, r1)
            goto L15
        L14:
            r1 = r3
        L15:
            java.lang.String r4 = r0.f2486b
            if (r4 == 0) goto L1e
            boolean r2 = com.paymaya.common.utility.AbstractC1213b.U(r2, r4)
            goto L1f
        L1e:
            r2 = r3
        L1f:
            java.lang.String r4 = r0.c
            r5 = 1
            if (r4 == 0) goto L2d
            int r4 = r4.length()
            if (r4 != 0) goto L2b
            goto L2d
        L2b:
            r4 = r3
            goto L2e
        L2d:
            r4 = r5
        L2e:
            java.lang.String r6 = r0.f2487d
            if (r6 == 0) goto L5d
            int r6 = r6.length()
            if (r6 != 0) goto L39
            goto L5d
        L39:
            java.lang.String r0 = r0.f2487d
            if (r0 == 0) goto L58
            java.lang.CharSequence r0 = zj.C2576A.b0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.paymaya.common.utility.C.p0(r0)
            java.lang.String r6 = ""
            java.lang.String r7 = "+"
            java.lang.String r0 = zj.z.t(r0, r7, r6)
            java.lang.String r6 = "^(63|0)[0-9]{10}$"
            boolean r0 = com.paymaya.common.utility.AbstractC1213b.U(r6, r0)
            goto L59
        L58:
            r0 = r3
        L59:
            if (r0 == 0) goto L5d
            r0 = r5
            goto L5e
        L5d:
            r0 = r3
        L5e:
            if (r1 == 0) goto L67
            if (r2 == 0) goto L67
            if (r4 != 0) goto L67
            if (r0 == 0) goto L67
            r3 = r5
        L67:
            java.lang.ref.WeakReference r0 = r8.c
            java.lang.Object r0 = r0.get()
            P9.h r0 = (P9.h) r0
            com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditAssignContactReferenceFragment r0 = (com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditAssignContactReferenceFragment) r0
            android.widget.Button r0 = r0.f13170c0
            if (r0 == 0) goto L79
            r0.setEnabled(r3)
            return
        L79:
            java.lang.String r0 = "mContinueButton"
            kotlin.jvm.internal.j.n(r0)
            r0 = 0
            throw r0
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L9.q.k():void");
    }

    public final void l() {
        if (AbstractC1955a.u(((NewMayaCreditAssignContactReferenceFragment) ((P9.h) this.c.get())).getContext(), "android.permission.READ_CONTACTS")) {
            Q9.q qVar = ((NewMayaCreditAssignContactReferenceFragment) ((P9.h) this.c.get())).f13172e0;
            if (qVar != null) {
                com.paymaya.common.utility.E.a("NewMayaCreditActivity", "showContactScreen");
                AbstractC1236z.h((NewMayaCreditActivity) qVar, R.id.fragment_container, new MayaContactsSelectionFragment());
                return;
            }
            return;
        }
        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = (NewMayaCreditAssignContactReferenceFragment) ((P9.h) this.c.get());
        newMayaCreditAssignContactReferenceFragment.getClass();
        try {
            AbstractC1955a.l(newMayaCreditAssignContactReferenceFragment).e(zh.b.a()).g(new Gh.e(0, new Gh.f(new G6.r(this, 13), Eh.d.f1366d), new G6.w(this, 11)));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
