package N4;

import Bg.C0110g;
import Bg.g0;
import Fg.i;
import Ng.A;
import Ng.AbstractC0494b;
import Ng.C;
import Ng.C0496d;
import com.google.gson.internal.Excluder;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import w.C2360b;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends k implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f3531b = new f(1, 0);
    public static final f c = new f(1, 1);
    public static final f e = new f(1, 2);
    public static final f f = new f(1, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f3532g = new f(1, 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3533a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, int i4) {
        super(i);
        this.f3533a = i4;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3533a) {
            case 0:
                Ag.c engine = (Ag.c) obj;
                j.g(engine, "$this$engine");
                engine.f280a = new Ag.b(0, engine.f280a);
                break;
            case 1:
                i install = (i) obj;
                j.g(install, "$this$install");
                install.c = new d(0);
                install.f1612d = Fg.e.f1602d;
                break;
            case 2:
                g0 install2 = (g0) obj;
                j.g(install2, "$this$install");
                String[] strArr = g.f3534a;
                String property = System.getProperty("http.agent");
                if (property == null) {
                    property = "RavenSDK/1.2.1";
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < property.length(); i++) {
                    char cCharAt = property.charAt(i);
                    if (' ' > cCharAt || cCharAt >= 127) {
                        sb2.append(String.format("\\u%04x", Arrays.copyOf(new Object[]{Integer.valueOf(cCharAt)}, 1)));
                    } else {
                        sb2.append(cCharAt);
                    }
                }
                String string = sb2.toString();
                j.f(string, "toString(...)");
                install2.f528a = string;
                break;
            case 3:
                Dg.b install3 = (Dg.b) obj;
                j.g(install3, "$this$install");
                C0496d contentType = AbstractC0494b.f4422a;
                j.g(contentType, "contentType");
                com.google.gson.k kVar = new com.google.gson.k();
                com.google.gson.i iVar = com.google.gson.i.e;
                Objects.requireNonNull(iVar);
                kVar.f10027k = iVar;
                kVar.j = false;
                Excluder excluderClone = kVar.f10023a.clone();
                excluderClone.f9877a = true;
                kVar.f10023a = excluderClone;
                kVar.f10028l = 1;
                Unit unit = Unit.f18162a;
                install3.f1137b.add(new Dg.a(new Qg.f(kVar.a()), contentType, contentType.equals(contentType) ? Dg.j.f1153a : new C2360b(contentType, 18)));
                break;
            default:
                C0110g install4 = (C0110g) obj;
                j.g(install4, "$this$install");
                String value = g.e;
                j.g(value, "value");
                A a8 = install4.f527b;
                a8.getClass();
                a8.f4403a = value;
                C value2 = C.f4408d;
                j.g(value2, "value");
                a8.f4405d = value2;
                break;
        }
        return Unit.f18162a;
    }
}
