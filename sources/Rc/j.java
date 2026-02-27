package rc;

import Ah.r;
import com.paymaya.domain.model.Contact;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements r, Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f19910a;

    @Override // Ah.r
    public void a(Lh.a aVar) {
        try {
            List listB = this.f19910a.f.f11483b.b();
            kotlin.jvm.internal.j.d(listB);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB) {
                String strMNumber = ((Contact) obj).mNumber();
                kotlin.jvm.internal.j.f(strMNumber, "mNumber(...)");
                if (new zj.o("\\D").f("", strMNumber).length() >= 11) {
                    arrayList.add(obj);
                }
            }
            aVar.b(arrayList);
        } catch (Exception e) {
            aVar.a(e);
        }
    }

    @Override // Ch.a
    public void run() {
        ((MayaContactsSelectionFragment) ((X6.c) this.f19910a.c.get())).w0 = false;
    }
}
