package O1;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements N1.o, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4602a;

    public o0() {
        AbstractC0529x.d(2, "expectedValuesPerKey");
        this.f4602a = 2;
    }

    @Override // N1.o
    public final Object get() {
        return new ArrayList(this.f4602a);
    }
}
