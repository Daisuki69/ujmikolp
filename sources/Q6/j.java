package Q6;

import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Ah.r, Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bb.f f5278a;

    public /* synthetic */ j(Bb.f fVar) {
        this.f5278a = fVar;
    }

    @Override // Ah.r
    public void a(Lh.a aVar) {
        try {
            aVar.b(((com.paymaya.data.database.repository.k) this.f5278a.e).b());
        } catch (Exception e) {
            aVar.a(e);
        }
    }

    @Override // Ch.a
    public void run() {
        ((MayaContactsSelectionFragment) ((X6.c) this.f5278a.c.get())).w0 = false;
    }
}
