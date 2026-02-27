package ki;

import D.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18147b;

    public /* synthetic */ i(Object obj, int i) {
        this.f18146a = i;
        this.f18147b = obj;
    }

    @Override // ki.InterfaceC1782c
    public final Ff.f execute() {
        boolean z4;
        switch (this.f18146a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) this.f18147b).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Ff.f fVarExecute = ((InterfaceC1782c) it.next()).execute();
                        arrayList.add(fVarExecute);
                        if (!AbstractC2217b.b(1, fVarExecute.c)) {
                            z4 = false;
                        }
                    } else {
                        z4 = true;
                    }
                }
                Map mapSingletonMap = Collections.singletonMap("serial_task_results", arrayList);
                if (!z4) {
                }
                break;
            case 1:
                Iterator it2 = ((Set) this.f18147b).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1782c) it2.next()).execute();
                }
                break;
            case 2:
                try {
                    ((Mi.c) this.f18147b).m();
                } catch (Exception e) {
                    Ri.a.g("Error loading rule based segments: " + e.getLocalizedMessage());
                    return Ff.f.d(21);
                }
                break;
            case 3:
                try {
                    ((yi.e) this.f18147b).b();
                } catch (Exception unused) {
                    return Ff.f.d(10);
                }
                break;
            case 4:
                Ri.a.d("Informing sse token expired through pushing retryable error.");
                ((yi.j) this.f18147b).f21308b.b(new S(3));
                break;
            default:
                Ri.a.d("Reconnecting to streaming");
                ((zi.c) this.f18147b).h.b();
                break;
        }
        return Ff.f.k(10);
    }

    public i(Mi.c cVar) {
        this.f18146a = 2;
        Objects.requireNonNull(cVar);
        this.f18147b = cVar;
    }

    public i(Set set) {
        this.f18146a = 1;
        Objects.requireNonNull(set);
        this.f18147b = set;
    }

    public i(InterfaceC1782c[] interfaceC1782cArr) {
        this.f18146a = 0;
        this.f18147b = Arrays.asList(interfaceC1782cArr);
    }
}
