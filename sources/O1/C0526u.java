package O1;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: O1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0526u extends AbstractC0502c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f4609g;

    public C0526u() {
        super(C.b(12));
        AbstractC0529x.d(3, "expectedValuesPerKey");
        this.f4609g = 3;
    }

    @Override // O1.AbstractC0522p
    public final Collection g() {
        return new ArrayList(this.f4609g);
    }
}
