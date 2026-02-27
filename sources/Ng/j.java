package Ng;

import cj.C1132s;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4430a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4431b;
    public final Object c;

    public j(String content, List parameters) {
        kotlin.jvm.internal.j.g(content, "content");
        kotlin.jvm.internal.j.g(parameters, "parameters");
        this.f4431b = content;
        this.c = parameters;
    }

    public String a(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        List list = (List) this.c;
        int iF = C1132s.f(list);
        if (iF < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            i iVar = (i) list.get(i);
            if (zj.z.o(iVar.f4428a, name, true)) {
                return iVar.f4429b;
            }
            if (i == iF) {
                return null;
            }
            i++;
        }
    }

    public abstract String b();

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012d A[LOOP:1: B:16:0x0058->B:66:0x012d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ng.j.toString():java.lang.String");
    }

    public j(K3.a aVar) {
        this.f4431b = aVar;
        this.c = new U8.c(aVar);
    }
}
