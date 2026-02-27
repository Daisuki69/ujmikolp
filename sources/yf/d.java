package yf;

import M8.T2;
import com.dynatrace.android.agent.Global;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f21154a = new Nf.c();

    public static String r(b bVar, ArrayList arrayList) throws IOException {
        if (bVar == null) {
            return "null";
        }
        if (arrayList.contains(bVar)) {
            return String.valueOf(bVar.hashCode());
        }
        arrayList.add(bVar);
        if (!(bVar instanceof d)) {
            if (!(bVar instanceof C2531a)) {
                if (!(bVar instanceof m)) {
                    return bVar.toString();
                }
                return "COSObject{" + r(((m) bVar).f21270a, arrayList) + "}";
            }
            StringBuilder sb2 = new StringBuilder("COSArray{");
            Iterator it = ((C2531a) bVar).f21151a.iterator();
            while (it.hasNext()) {
                sb2.append(r((b) it.next(), arrayList));
                sb2.append(Global.SEMICOLON);
            }
            sb2.append("}");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("COSDictionary{");
        for (Map.Entry entry : ((d) bVar).f21154a.entrySet()) {
            sb3.append(entry.getKey());
            sb3.append(Global.COLON);
            sb3.append(r((b) entry.getValue(), arrayList));
            sb3.append(Global.SEMICOLON);
        }
        sb3.append("}");
        if (bVar instanceof p) {
            Af.b bVarK = ((p) bVar).K();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            T2.f(bVarK, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            sb3.append("COSStream{");
            sb3.append(Arrays.hashCode(byteArray));
            sb3.append("}");
            bVarK.close();
        }
        return sb3.toString();
    }

    public final String B(j jVar) {
        b bVarQ = q(jVar);
        if (bVarQ instanceof q) {
            return ((q) bVarQ).f();
        }
        return null;
    }

    public final void C(j jVar) {
        this.f21154a.remove(jVar);
    }

    public final void D(j jVar, int i) {
        F(jVar, i.m(i));
    }

    public final void E(j jVar, Df.c cVar) {
        F(jVar, cVar != null ? cVar.c() : null);
    }

    public final void F(j jVar, b bVar) {
        if (bVar == null) {
            C(jVar);
            return;
        }
        Map map = this.f21154a;
        if ((map instanceof Nf.c) && map.size() >= 1000) {
            this.f21154a = new LinkedHashMap(this.f21154a);
        }
        this.f21154a.put(jVar, bVar);
    }

    public final void G(j jVar, String str) {
        F(jVar, str != null ? j.f(str) : null);
    }

    public final void H(j jVar, String str) {
        F(jVar, str != null ? new q(str) : null);
    }

    public final void f(d dVar) {
        Map map = this.f21154a;
        if (map instanceof Nf.c) {
            if (dVar.f21154a.size() + map.size() >= 1000) {
                this.f21154a = new LinkedHashMap(this.f21154a);
            }
        }
        this.f21154a.putAll(dVar.f21154a);
    }

    public final boolean g(j jVar) {
        b bVarQ = q(jVar);
        return (bVarQ instanceof c) && bVarQ == c.f21152b;
    }

    public final C2531a i(j jVar) {
        b bVarQ = q(jVar);
        if (bVarQ instanceof C2531a) {
            return (C2531a) bVarQ;
        }
        return null;
    }

    public final j k(j jVar) {
        b bVarQ = q(jVar);
        if (bVarQ instanceof j) {
            return (j) bVarQ;
        }
        return null;
    }

    public final b m(String str) {
        return q(j.f(str));
    }

    public final b q(j jVar) {
        b bVar = (b) this.f21154a.get(jVar);
        if (bVar instanceof m) {
            bVar = ((m) bVar).f21270a;
        }
        if (bVar instanceof k) {
            return null;
        }
        return bVar;
    }

    public final int t(j jVar, j jVar2, int i) {
        b bVarQ = q(jVar);
        if (bVarQ == null && jVar2 != null) {
            bVarQ = q(jVar2);
        }
        return bVarQ instanceof l ? ((l) bVarQ).i() : i;
    }

    public final String toString() {
        try {
            return r(this, new ArrayList());
        } catch (IOException e) {
            return "COSDictionary{" + e.getMessage() + "}";
        }
    }

    public final b w(j jVar) {
        return (b) this.f21154a.get(jVar);
    }

    public final long y(j jVar) {
        b bVarQ = q(jVar);
        if (bVarQ instanceof l) {
            return ((l) bVarQ).k();
        }
        return -1L;
    }

    public final String z(j jVar) {
        b bVarQ = q(jVar);
        if (bVarQ instanceof j) {
            return ((j) bVarQ).f21267a;
        }
        if (bVarQ instanceof q) {
            return ((q) bVarQ).f();
        }
        return null;
    }
}
