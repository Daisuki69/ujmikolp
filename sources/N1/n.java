package N1;

import G6.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f3504b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3503a = d.f3491a;
    public final int c = Integer.MAX_VALUE;

    public n(w wVar) {
        this.f3504b = wVar;
    }

    public final List a(CharSequence charSequence) {
        charSequence.getClass();
        w wVar = this.f3504b;
        wVar.getClass();
        m mVar = new m(wVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (mVar.hasNext()) {
            arrayList.add((String) mVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
