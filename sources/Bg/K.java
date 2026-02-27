package Bg;

import M8.A0;
import ej.C1449a;
import java.nio.charset.Charset;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f482a;

    public /* synthetic */ K(int i) {
        this.f482a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f482a) {
            case 0:
                return C1449a.a(A0.o((Charset) obj), A0.o((Charset) obj2));
            default:
                return C1449a.a((Float) ((Pair) obj2).f18161b, (Float) ((Pair) obj).f18161b);
        }
    }
}
