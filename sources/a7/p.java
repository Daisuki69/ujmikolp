package A7;

import a.AbstractC0617a;
import a7.C0633A;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.domain.model.ActivityDescription;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivitySendMoneyFragment;
import sd.AbstractC2252a;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends AbstractC2252a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231d;

    public /* synthetic */ p(int i) {
        this.f231d = i;
    }

    private final void A() {
        C0633A c0633aT;
        int iHashCode;
        super.j();
        UserActivity userActivityM1 = ((MayaAbstractBaseUserActivityFragmentImpl) ((F7.o) this.c.get())).M1();
        if (userActivityM1 != null) {
            q(userActivityM1.mDescription());
            ActivityDescription activityDescriptionMDescription = userActivityM1.mDescription();
            String strMMethod = userActivityM1.mMethod();
            String strMTarget = activityDescriptionMDescription != null ? activityDescriptionMDescription.mTarget() : null;
            if (strMTarget == null) {
                strMTarget = "";
            }
            if (kotlin.jvm.internal.j.b(strMMethod, "MONEYINDB") || kotlin.jvm.internal.j.b(strMMethod, "SMP2PCONDB")) {
                ((MayaAbstractBaseUserActivityFragmentImpl) ((F7.o) this.c.get())).Q1(AbstractC2252a.p(strMTarget));
            } else {
                ((MayaAbstractBaseUserActivityFragmentImpl) ((F7.o) this.c.get())).Q1(strMTarget);
            }
            Amount amountMAmount = userActivityM1.mAmount();
            r(amountMAmount != null ? amountMAmount.getFormattedValue() : null, userActivityM1.mDisplay());
            String strMMethod2 = userActivityM1.mMethod();
            if (kotlin.jvm.internal.j.b(strMMethod2, "INSTASEND") || kotlin.jvm.internal.j.b(strMMethod2, "INSTAPSD")) {
                MayaUserActivitySendMoneyFragment mayaUserActivitySendMoneyFragment = (MayaUserActivitySendMoneyFragment) ((F7.o) this.c.get());
                mayaUserActivitySendMoneyFragment.H1().setImageDrawable(ContextCompat.getDrawable(mayaUserActivitySendMoneyFragment.requireContext(), R.drawable.maya_ic_user_activity_icon_instapay));
            } else {
                ((MayaAbstractBaseUserActivityFragmentImpl) ((F7.o) this.c.get())).P1();
            }
            v(userActivityM1.mDisplay());
            u(userActivityM1.mStatusDisplay());
            s(userActivityM1.mTimestamp());
            String strMMethod3 = userActivityM1.mMethod();
            if (kotlin.jvm.internal.j.b(strMMethod3, "INSTASEND") || kotlin.jvm.internal.j.b(strMMethod3, "INSTAPSD")) {
                MayaUserActivitySendMoneyFragment mayaUserActivitySendMoneyFragment2 = (MayaUserActivitySendMoneyFragment) ((F7.o) this.c.get());
                mayaUserActivitySendMoneyFragment2.W1();
                mayaUserActivitySendMoneyFragment2.T1(mayaUserActivitySendMoneyFragment2.getString(R.string.maya_label_instapay_status));
            } else {
                ((MayaAbstractBaseUserActivityFragmentImpl) ((F7.o) this.c.get())).N1();
            }
            ((MayaAbstractBaseUserActivityFragmentImpl) ((F7.o) this.c.get())).V1();
            t(userActivityM1.mMessage());
            String strMProvider = userActivityM1.mProvider();
            Decoration decorationMDecoration = userActivityM1.mDecoration();
            x(strMProvider, decorationMDecoration != null ? decorationMDecoration.getMIconUrl() : null, userActivityM1.mTransferPersonalizationMeta());
            y5.v vVar = (F7.o) this.c.get();
            String strMMethod4 = userActivityM1.mMethod();
            if (strMMethod4 == null || ((iHashCode = strMMethod4.hashCode()) == -1479123773 ? !strMMethod4.equals("INSTASEND") : !(iHashCode == 1337757190 && strMMethod4.equals("INSTAPSD")))) {
                Object obj = this.c.get();
                kotlin.jvm.internal.j.f(obj, "view(...)");
                F7.i iVar = (F7.i) obj;
                C0633A c0633a = new C0633A();
                AbstractC0617a.k(c0633a, iVar, userActivityM1);
                C0633A.d(c0633a, new boolean[]{C0633A.c(c0633a, ((MayaAbstractBaseUserActivityFragmentImpl) iVar).L1(), userActivityM1.getParsedReferenceNoWithSpaces(), null, 12)});
                c0633aT = c0633a;
            } else {
                Object obj2 = this.c.get();
                kotlin.jvm.internal.j.f(obj2, "view(...)");
                c0633aT = AbstractC0617a.t((F7.n) obj2, userActivityM1);
            }
            ((MayaAbstractBaseUserActivityFragmentImpl) vVar).R1(c0633aT);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z() {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.p.z():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r2.equals("rejected") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r2 = (com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityPurchaseFragment) ((F7.l) r1.c.get());
        r2.W1();
        r2.T1(r2.getString(com.paymaya.R.string.maya_label_card_transactions_void));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r2.equals("void") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L76
            int r0 = r2.hashCode()
            switch(r0) {
                case -1500711525: goto L55;
                case -982450881: goto L34;
                case -608496514: goto L13;
                case 3625364: goto La;
                default: goto L9;
            }
        L9:
            goto L76
        La:
            java.lang.String r0 = "void"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L76
        L13:
            java.lang.String r0 = "rejected"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L76
        L1c:
            java.lang.ref.WeakReference r2 = r1.c
            java.lang.Object r2 = r2.get()
            F7.l r2 = (F7.l) r2
            com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityPurchaseFragment r2 = (com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityPurchaseFragment) r2
            r2.W1()
            r0 = 2131952796(0x7f13049c, float:1.9542045E38)
            java.lang.String r0 = r2.getString(r0)
            r2.T1(r0)
            return
        L34:
            java.lang.String r0 = "posted"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3d
            goto L76
        L3d:
            java.lang.ref.WeakReference r2 = r1.c
            java.lang.Object r2 = r2.get()
            F7.l r2 = (F7.l) r2
            com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityPurchaseFragment r2 = (com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityPurchaseFragment) r2
            r2.W1()
            r0 = 2131952795(0x7f13049b, float:1.9542043E38)
            java.lang.String r0 = r2.getString(r0)
            r2.T1(r0)
            return
        L55:
            java.lang.String r0 = "authorized"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5e
            goto L76
        L5e:
            java.lang.ref.WeakReference r2 = r1.c
            java.lang.Object r2 = r2.get()
            F7.l r2 = (F7.l) r2
            com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityPurchaseFragment r2 = (com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityPurchaseFragment) r2
            r2.W1()
            r0 = 2131952794(0x7f13049a, float:1.954204E38)
            java.lang.String r0 = r2.getString(r0)
            r2.T1(r0)
            return
        L76:
            java.lang.ref.WeakReference r2 = r1.c
            java.lang.Object r2 = r2.get()
            F7.l r2 = (F7.l) r2
            com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl r2 = (com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl) r2
            r2.N1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.p.B(java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0c49  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03f5  */
    @Override // y5.AbstractC2509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 3968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.p.j():void");
    }
}
