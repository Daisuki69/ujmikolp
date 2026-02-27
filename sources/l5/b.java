package L5;

import android.content.ContentValues;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Xe.d f2812a;

    public final void a(String str, List list) {
        Xe.d dVar = this.f2812a;
        Xe.a aVarC = dVar.c();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dVar.insert(str, 5, (ContentValues) it.next());
            }
            aVarC.f();
            aVarC.close();
            list.size();
        } catch (Throwable th2) {
            if (aVarC != null) {
                try {
                    aVarC.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
