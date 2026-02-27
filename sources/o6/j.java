package o6;

import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferListFragment;
import java.util.List;
import s6.InterfaceC2242c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Ch.f, Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f18801a;

    @Override // Ch.c
    public void accept(Object obj) {
        n nVar = this.f18801a;
        nVar.f((Throwable) obj, true);
        ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).P1();
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        return this.f18801a.p((List) obj);
    }
}
