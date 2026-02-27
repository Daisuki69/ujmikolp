package Tj;

import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1129o;
import cj.M;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Pj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5863a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5864b;
    public final Object c;

    public g(Pj.a aVar) {
        r rVar = r.f5886a;
        this.f5864b = aVar;
        this.c = new j(r.f5887b, aVar.d());
    }

    @Override // Pj.a
    public Object a(N.e eVar) {
        switch (this.f5863a) {
            case 0:
                Rj.d enumDescriptor = d();
                eVar.getClass();
                kotlin.jvm.internal.j.g(enumDescriptor, "enumDescriptor");
                N.e eVar2 = (N.e) eVar.e;
                String name = eVar2.h();
                String suffix = " at path ".concat(((F.i) eVar2.c).e());
                Uj.b json = (Uj.b) eVar.c;
                kotlin.jvm.internal.j.g(enumDescriptor, "<this>");
                kotlin.jvm.internal.j.g(json, "json");
                kotlin.jvm.internal.j.g(name, "name");
                kotlin.jvm.internal.j.g(suffix, "suffix");
                int iC = Vj.f.c(enumDescriptor, json, name);
                if (iC == -3) {
                    throw new SerializationException(enumDescriptor.h() + " does not contain element with name '" + name + '\'' + suffix);
                }
                Enum[] enumArr = (Enum[]) this.f5864b;
                if (iC >= 0 && iC < enumArr.length) {
                    return enumArr[iC];
                }
                throw new SerializationException(iC + " is not among valid " + d().h() + " enum values, values size is " + enumArr.length);
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                kotlin.jvm.internal.j.g(linkedHashMap, "<this>");
                int size = linkedHashMap.size() * 2;
                N.e eVarB = eVar.b(d());
                while (true) {
                    int iJ = eVarB.j(d());
                    if (iJ == -1) {
                        eVarB.v(d());
                        kotlin.jvm.internal.j.g(linkedHashMap, "<this>");
                        return linkedHashMap;
                    }
                    int i = iJ + size;
                    LinkedHashMap builder = linkedHashMap;
                    kotlin.jvm.internal.j.g(builder, "builder");
                    r rVar = r.f5886a;
                    j jVar = (j) this.c;
                    Object objQ = eVarB.q(jVar, i, rVar, null);
                    int iJ2 = eVarB.j(jVar);
                    if (iJ2 != i + 1) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.a.c(i, iJ2, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
                    }
                    boolean zContainsKey = builder.containsKey(objQ);
                    Pj.a aVar = (Pj.a) this.f5864b;
                    builder.put(objQ, (!zContainsKey || (aVar.d().getKind() instanceof Rj.c)) ? eVarB.q(jVar, iJ2, aVar, null) : eVarB.q(jVar, iJ2, aVar, M.f(builder, objQ)));
                }
                break;
        }
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        switch (this.f5863a) {
            case 0:
                Enum value = (Enum) obj;
                kotlin.jvm.internal.j.g(value, "value");
                Enum[] enumArr = (Enum[]) this.f5864b;
                int iT = C1129o.t(enumArr, value);
                if (iT != -1) {
                    Rj.d enumDescriptor = d();
                    hVar.getClass();
                    kotlin.jvm.internal.j.g(enumDescriptor, "enumDescriptor");
                    hVar.k(enumDescriptor.e(iT));
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(value);
                sb2.append(" is not a valid enum ");
                sb2.append(d().h());
                sb2.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                kotlin.jvm.internal.j.f(string, "toString(...)");
                sb2.append(string);
                throw new SerializationException(sb2.toString());
            default:
                Map map = (Map) obj;
                kotlin.jvm.internal.j.g(map, "<this>");
                map.size();
                j descriptor = (j) this.c;
                kotlin.jvm.internal.j.g(descriptor, "descriptor");
                Vj.h hVarA = hVar.a(descriptor);
                Map map2 = (Map) obj;
                kotlin.jvm.internal.j.g(map2, "<this>");
                int i = 0;
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    Object value2 = entry.getValue();
                    int i4 = i + 1;
                    hVarA.i(descriptor, i, r.f5886a, key);
                    i += 2;
                    hVarA.i(descriptor, i4, (Pj.a) this.f5864b, value2);
                }
                hVarA.m(descriptor);
                return;
        }
    }

    @Override // Pj.a
    public final Rj.d d() {
        switch (this.f5863a) {
            case 0:
                return (Rj.d) ((InterfaceC1033d) this.c).getValue();
            default:
                return (j) this.c;
        }
    }

    public String toString() {
        switch (this.f5863a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + d().h() + '>';
            default:
                return super.toString();
        }
    }

    public g(String str, Enum[] values) {
        kotlin.jvm.internal.j.g(values, "values");
        this.f5864b = values;
        this.c = C1034e.b(new Ag.l(16, this, str));
    }
}
