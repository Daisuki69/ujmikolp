package uj;

import java.util.Random;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: uj.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2323b extends AbstractC2322a {
    public final a c = new a();

    /* JADX INFO: renamed from: uj.b$a */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Random();
        }
    }

    @Override // uj.AbstractC2322a
    public final Random f() {
        Object obj = this.c.get();
        j.f(obj, "get(...)");
        return (Random) obj;
    }
}
