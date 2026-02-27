package R;

import G7.F;
import ej.C1449a;
import java.util.Comparator;
import m4.p;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5399a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5400b;
    public final /* synthetic */ Object c;

    public b(a aVar, F f) {
        this.f5400b = aVar;
        this.c = f;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5399a) {
            case 0:
                int iCompare = ((a) this.f5400b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                F f = (F) this.c;
                return C1449a.a((Comparable) f.invoke((JSONObject) obj), (Comparable) f.invoke((JSONObject) obj2));
            default:
                p pVar = (p) this.f5400b;
                n4.i iVar = (n4.i) this.c;
                return Float.compare(iVar.a((p) obj2, pVar), iVar.a((p) obj, pVar));
        }
    }

    public b(n4.i iVar, p pVar) {
        this.c = iVar;
        this.f5400b = pVar;
    }
}
