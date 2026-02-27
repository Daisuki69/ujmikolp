package Rg;

import cj.C1110A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v implements s {
    public final Map c;

    public v(Map values) {
        kotlin.jvm.internal.j.g(values, "values");
        h hVar = new h();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            hVar.put(str, arrayList);
        }
        this.c = hVar;
    }

    @Override // Rg.s
    public final Set a() {
        Set setEntrySet = this.c.entrySet();
        kotlin.jvm.internal.j.g(setEntrySet, "<this>");
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        kotlin.jvm.internal.j.f(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    @Override // Rg.s
    public final void b(Function2 function2) {
        for (Map.Entry entry : this.c.entrySet()) {
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // Rg.s
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (true != sVar.c()) {
            return false;
        }
        return a().equals(sVar.a());
    }

    @Override // Rg.s
    public final String get(String str) {
        List list = (List) this.c.get(str);
        if (list != null) {
            return (String) C1110A.B(list);
        }
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + 1182991;
    }

    @Override // Rg.s
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }
}
