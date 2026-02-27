package rc;

import Kh.J;
import Kh.T;
import cj.C1110A;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.ContactHeaderModel;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.domain.store.C1286u;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import oi.C1983a;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Bb.f {
    public final C1286u f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.paymaya.data.database.repository.k kVar, Uh.d dVar, C1286u c1286u) {
        super(kVar, dVar);
        kotlin.jvm.internal.j.g(kVar, numX49.tnTj78("bFoP8"));
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("bFoPC"));
        this.f = c1286u;
    }

    @Override // Bb.f
    public final ArrayList l(List list) {
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bFoP4"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Contact contact = (Contact) it.next();
            String strMName = contact.mName();
            kotlin.jvm.internal.j.f(strMName, numX49.tnTj78("bFoPo"));
            String strMNumber = contact.mNumber();
            kotlin.jvm.internal.j.f(strMNumber, numX49.tnTj78("bFoPK"));
            ContactModel contactModel = new ContactModel(strMName, strMNumber, contact.mPhotoUri(), null, null, null, contact.mContactId(), 56, null);
            char cCharAt = contact.mName().charAt(0);
            if (Character.isLetter(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (linkedHashSet.add(Character.valueOf(upperCase))) {
                    arrayList.add(new ContactHeaderModel(String.valueOf(upperCase)));
                }
                arrayList.add(contactModel);
            } else {
                if (linkedHashSet.add('#')) {
                    arrayList2.add(new ContactHeaderModel(numX49.tnTj78("bFoPw")));
                }
                arrayList2.add(contactModel);
            }
        }
        return C1110A.L(arrayList2, arrayList);
    }

    @Override // Bb.f
    public final void m() {
        ((MayaContactsSelectionFragment) ((X6.c) this.c.get())).w0 = true;
        new T(5, new Lh.d(new Lh.d(new Lh.d(new Lh.h(new J(new j(this), 1).h(Th.e.c), zh.b.a(), 0), new p8.a(this, 7), 2), new C1983a(this, 7), 0), new o6.f(this, 5), 1), new j(this)).e();
    }
}
