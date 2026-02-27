package L5;

import A7.f;
import Kh.C0301f;
import Xe.e;
import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Xe.d f2811a;

    public final f a() {
        f fVar = new f(25);
        fVar.c = new ArrayList();
        fVar.f210b = this.f2811a;
        return fVar;
    }

    public final void b(String str, String str2, String[] strArr) {
        this.f2811a.b(str, str2, strArr);
    }

    public final void c(String str, List list) {
        Xe.d dVar = this.f2811a;
        Xe.a aVarC = dVar.c();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dVar.insert(str, 0, (ContentValues) it.next());
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

    public final C0301f d(String str, M5.f fVar) {
        String strD = fVar.d();
        Xe.d dVar = this.f2811a;
        dVar.getClass();
        M5.b bVar = new M5.b(str, 3);
        if (dVar.c.get() != null) {
            throw new IllegalStateException("Cannot create observable query in transaction. Use query() for a query inside a transaction.");
        }
        Xe.b bVar2 = new Xe.b(dVar, bVar, strD);
        return E1.c.r((e) dVar.f6611d.filter(bVar).map(bVar2).startWith(bVar2).observeOn(dVar.h).compose(dVar.f6610b).doOnSubscribe(dVar.f6612g).to(e.f6613b));
    }

    public final void e(String str, ContentValues contentValues, String str2, String[] strArr) {
        Xe.d dVar = this.f2811a;
        if (dVar.f6609a.getWritableDatabase().H(str, contentValues, str2, strArr, 0) > 0) {
            dVar.f(Collections.singleton(str));
        }
    }
}
