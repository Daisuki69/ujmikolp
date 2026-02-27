package Ag;

import cj.C1110A;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Ng.m {
    public final /* synthetic */ Headers c;

    public r(Headers headers) {
        this.c = headers;
    }

    @Override // Rg.s
    public final Set a() {
        return this.c.toMultimap().entrySet();
    }

    @Override // Rg.s
    public final void b(Function2 function2) {
        Xh.i.o(this, (j) function2);
    }

    @Override // Rg.s
    public final boolean c() {
        return true;
    }

    @Override // Rg.s
    public final String get(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        List<String> listValues = this.c.values(name);
        if (listValues.isEmpty()) {
            listValues = null;
        }
        if (listValues != null) {
            return (String) C1110A.B(listValues);
        }
        return null;
    }
}
