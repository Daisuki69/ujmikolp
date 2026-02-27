package Dg;

import Ng.AbstractC0494b;
import Ng.C0496d;
import Ng.InterfaceC0497e;
import cj.C1112C;
import java.util.List;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements InterfaceC0497e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f1153a = new j();

    @Override // Ng.InterfaceC0497e
    public final boolean a(C0496d contentType) {
        kotlin.jvm.internal.j.g(contentType, "contentType");
        if (!contentType.c(AbstractC0494b.f4422a)) {
            if (!((List) contentType.c).isEmpty()) {
                contentType = new C0496d(contentType.f4425d, contentType.e, C1112C.f9377a);
            }
            String string = contentType.toString();
            if (!z.v(string, "application/", true) || !z.m(string, "+json", true)) {
                return false;
            }
        }
        return true;
    }
}
