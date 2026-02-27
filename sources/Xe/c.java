package Xe;

import We.s;
import java.util.LinkedHashSet;
import net.zetetic.database.sqlcipher.SQLiteTransactionListener;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends LinkedHashSet implements SQLiteTransactionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6608b;

    public c(c cVar) {
        this.f6607a = cVar;
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
    public final void a() {
        this.f6608b = true;
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
    public final void c() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
    public final void d() {
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String str = String.format("%08x", Integer.valueOf(System.identityHashCode(this)));
        c cVar = this.f6607a;
        if (cVar == null) {
            return str;
        }
        StringBuilder sbV = s.v(str, " [");
        sbV.append(cVar.toString());
        sbV.append(']');
        return sbV.toString();
    }
}
