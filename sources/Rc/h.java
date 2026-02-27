package rc;

import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUserProfileUpdateActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileContactsSelectionFragment;
import dOYHB6.tiZVw8.numX49;
import pc.EnumC2032a;
import wc.InterfaceC2393d;
import yc.p;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f19899b;

    public /* synthetic */ h(i iVar, int i) {
        this.f19898a = i;
        this.f19899b = iVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f19898a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bFob"));
                ((MayaBaseFragment) ((InterfaceC2393d) this.f19899b.c.get())).w1();
                this.f19899b.n(th2, EnumC2032a.c, true);
                break;
            default:
                Ze.a aVar = (Ze.a) obj;
                kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("bFoP"));
                i iVar = this.f19899b;
                if (!aVar.f6934b) {
                    p pVar = ((MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get())).f14259a0;
                    if (pVar != null) {
                        AbstractC1236z.h((MayaUserProfileUpdateActivity) pVar, R.id.frame_layout_container, new MayaAllowContactsPermissionFragment());
                    }
                } else {
                    p pVar2 = ((MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get())).f14259a0;
                    if (pVar2 != null) {
                        AbstractC1236z.h((MayaUserProfileUpdateActivity) pVar2, R.id.frame_layout_container, new MayaUserProfileContactsSelectionFragment());
                    }
                }
                break;
        }
    }
}
