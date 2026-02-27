package Ng;

import ej.C1449a;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C1449a.a(Double.valueOf(((h) obj2).c), Double.valueOf(((h) obj).c));
    }
}
