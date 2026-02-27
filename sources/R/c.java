package R;

import G7.F;
import Q6.s;
import cj.C1110A;
import cj.M;
import dOYHB6.tiZVw8.numX49;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k0.C1689a;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f5401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cg.c f5402b;
    public final Lh.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y.f f5403d;
    public final O.k e;
    public ArrayList f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f5404g = new ArrayList();
    public final SimpleDateFormat h = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());

    public c(s sVar, Cg.c cVar, Lh.c cVar2, Y.f fVar, O.k kVar) {
        this.f5401a = sVar;
        this.f5402b = cVar;
        this.c = cVar2;
        this.f5403d = fVar;
        this.e = kVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03b8, code lost:
    
        r2 = r30;
        r0 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a7  */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(R.c r29, R.d r30, java.util.ArrayList r31) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R.c.a(R.c, R.d, java.util.ArrayList):java.util.ArrayList");
    }

    public static ArrayList d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(numX49.tnTj78("bPuA"));
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(numX49.tnTj78("bPuY"));
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArrayOptJSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int length2 = jSONArrayOptJSONArray2.length();
        for (int i4 = 0; i4 < length2; i4++) {
            Object obj2 = jSONArrayOptJSONArray2.get(i4);
            if (obj2 instanceof JSONObject) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<JSONObject> arrayListL = C1110A.L(arrayList2, arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (JSONObject jSONObject2 : arrayListL) {
            e eVar = (jSONObject2 == null || jSONObject2.length() <= 0) ? null : new e(jSONObject2);
            if (eVar != null) {
                arrayList3.add(eVar);
            }
        }
        return arrayList3;
    }

    public static List h(ArrayList arrayList) {
        F f = new F(26);
        return C1110A.Q(new b(new a(f, 0), new F(27)), arrayList);
    }

    public final JSONArray b(List list) {
        int i;
        JSONArray jSONArray;
        ArrayList arrayList = new ArrayList();
        Y.d dVar = this.f5403d.f6709a;
        if (dVar != null) {
            Iterator it = list.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                d dVar2 = (d) it.next();
                Object obj = dVar2.f5406b.get(numX49.tnTj78("bPuT"));
                Object obj2 = dVar2.f5406b.get(numX49.tnTj78("bPuR"));
                if (obj2 == null || !obj2.equals(obj)) {
                    JSONArray jSONArray2 = dVar.c;
                    if (jSONArray2 == null) {
                        String strB = dVar.f6704a.b(numX49.tnTj78("bPup"), numX49.tnTj78("bPu0"));
                        if (strB == null || C2576A.H(strB)) {
                            jSONArray2 = new JSONArray();
                        } else {
                            try {
                                jSONArray = new JSONArray(dVar.f6705b.d(strB, F.e.f1496b));
                            } catch (Exception unused) {
                                jSONArray = new JSONArray();
                            }
                            jSONArray2 = jSONArray;
                        }
                        dVar.c = jSONArray2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray2.length();
                    while (i < length) {
                        Object obj3 = jSONArray2.get(i);
                        if (obj3 instanceof JSONObject) {
                            arrayList2.add(obj3);
                        }
                        i++;
                    }
                    arrayList.addAll(a(this, dVar2, arrayList2));
                }
            }
            for (JSONObject jSONObject : h(arrayList)) {
                if (!jSONObject.optBoolean("suppressed")) {
                    if (i != 0) {
                        g();
                    }
                    Object objOpt = jSONObject.opt("wzrk_ttl_offset");
                    Long l6 = objOpt instanceof Long ? (Long) objOpt : null;
                    if (l6 != null) {
                        jSONObject.put("wzrk_ttl", l6.longValue() + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
                    } else {
                        jSONObject.remove("wzrk_ttl");
                    }
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(jSONObject);
                    return jSONArray3;
                }
                i(jSONObject);
                i = 1;
            }
            if (i != 0) {
                g();
            }
            Unit unit = Unit.f18162a;
        }
        return new JSONArray();
    }

    public final void c(List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        Y.d dVar = this.f5403d.f6709a;
        if (dVar != null) {
            Iterator it = list.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                d dVar2 = (d) it.next();
                String strB = dVar.f6704a.b(numX49.tnTj78("bPug"), numX49.tnTj78("bPuf"));
                JSONArray jSONArray = (strB == null || C2576A.H(strB)) ? new JSONArray() : new JSONArray(strB);
                ArrayList arrayList2 = new ArrayList();
                int length = jSONArray.length();
                while (i < length) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        arrayList2.add(obj);
                    }
                    i++;
                }
                arrayList.addAll(a(this, dVar2, arrayList2));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                long jOptLong = ((JSONObject) it2.next()).optLong("ti");
                if (jOptLong != 0) {
                    this.f.add(Long.valueOf(jOptLong));
                    i = 1;
                }
            }
            if (i != 0) {
                f();
            }
        }
    }

    public final void e() throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Y.d dVar = this.f5403d.f6709a;
        if (dVar != null) {
            C1689a c1689a = dVar.f6704a;
            String strTnTj78 = numX49.tnTj78("bPu1");
            String strTnTj782 = numX49.tnTj78("bPun");
            String strB = c1689a.b(strTnTj78, strTnTj782);
            String strTnTj783 = numX49.tnTj78("bPux");
            String strTnTj784 = numX49.tnTj78("bPus");
            if (strB == null || C2576A.H(strB)) {
                jSONArray = new JSONArray();
            } else {
                try {
                    try {
                        jSONArray = new JSONArray(strB);
                    } catch (JSONException unused) {
                        JSONObject jSONObject = new JSONObject(strB);
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strTnTj784);
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(strTnTj783);
                        JSONArray jSONArray3 = new JSONArray();
                        if (jSONArrayOptJSONArray != null) {
                            int length = jSONArrayOptJSONArray.length();
                            for (int i = 0; i < length; i++) {
                                jSONArray3.put(jSONArrayOptJSONArray.get(i));
                            }
                        }
                        if (jSONArrayOptJSONArray2 != null) {
                            int length2 = jSONArrayOptJSONArray2.length();
                            for (int i4 = 0; i4 < length2; i4++) {
                                jSONArray3.put(jSONArrayOptJSONArray2.get(i4));
                            }
                        }
                        jSONArray = jSONArray3;
                    }
                } catch (JSONException unused2) {
                    jSONArray = new JSONArray();
                }
            }
            ArrayList arrayList = new ArrayList();
            int length3 = jSONArray.length();
            for (int i6 = 0; i6 < length3; i6++) {
                Object obj = jSONArray.get(i6);
                if (obj instanceof Long) {
                    arrayList.add(obj);
                }
            }
            this.f = arrayList;
            String strB2 = c1689a.b("suppressed_ss", strTnTj782);
            if (strB2 == null || C2576A.H(strB2)) {
                jSONArray2 = new JSONArray();
            } else {
                try {
                    try {
                        jSONArray2 = new JSONArray(strB2);
                    } catch (JSONException unused3) {
                        jSONArray2 = new JSONArray();
                    }
                } catch (JSONException unused4) {
                    JSONObject jSONObject2 = new JSONObject(strB2);
                    JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray(strTnTj784);
                    JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray(strTnTj783);
                    JSONArray jSONArray4 = new JSONArray();
                    if (jSONArrayOptJSONArray3 != null) {
                        int length4 = jSONArrayOptJSONArray3.length();
                        for (int i10 = 0; i10 < length4; i10++) {
                            jSONArray4.put(jSONArrayOptJSONArray3.get(i10));
                        }
                    }
                    if (jSONArrayOptJSONArray4 != null) {
                        int length5 = jSONArrayOptJSONArray4.length();
                        for (int i11 = 0; i11 < length5; i11++) {
                            jSONArray4.put(jSONArrayOptJSONArray4.get(i11));
                        }
                    }
                    jSONArray2 = jSONArray4;
                }
            }
            this.f5404g = x3.d.s(jSONArray2);
        }
    }

    public final void f() throws JSONException {
        Y.d dVar = this.f5403d.f6709a;
        if (dVar != null) {
            JSONArray jSONArrayT = x3.d.t(this.f);
            kotlin.jvm.internal.j.f(jSONArrayT, numX49.tnTj78("bPu5"));
            String string = jSONArrayT.toString();
            kotlin.jvm.internal.j.f(string, "toString(...)");
            dVar.f6704a.f(numX49.tnTj78("bPuJ"), string);
        }
    }

    public final void g() {
        Y.d dVar = this.f5403d.f6709a;
        if (dVar != null) {
            JSONArray jSONArrayT = x3.d.t(this.f5404g);
            kotlin.jvm.internal.j.f(jSONArrayT, numX49.tnTj78("bPuI"));
            String string = jSONArrayT.toString();
            kotlin.jvm.internal.j.f(string, "toString(...)");
            dVar.f6704a.f("suppressed_ss", string);
        }
    }

    public final void i(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("ti");
        kotlin.jvm.internal.j.d(strOptString);
        this.f5404g.add(M.h(new Pair("wzrk_id", strOptString + '_' + this.h.format(new Date())), new Pair("wzrk_pivot", jSONObject.optString("wzrk_pivot", "wzrk_default")), new Pair("wzrk_cgId", Integer.valueOf(jSONObject.optInt("wzrk_cgId")))));
    }
}
