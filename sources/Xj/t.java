package xj;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f21016a = new t();

    public t() {
        super(1, y.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Type p02 = (Type) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        return y.a(p02);
    }
}
