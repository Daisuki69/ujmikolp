package kotlin.jvm.internal;

import cj.C1110A;
import com.dynatrace.android.agent.Global;
import defpackage.AbstractC1414e;
import java.util.List;
import xj.InterfaceC2488d;
import xj.InterfaceC2489e;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements xj.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f18178d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2489e f18179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18180b;
    public final int c;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public F(InterfaceC2489e interfaceC2489e, List arguments, int i) {
        j.g(arguments, "arguments");
        this.f18179a = interfaceC2489e;
        this.f18180b = arguments;
        this.c = i;
    }

    public final String a(boolean z4) {
        InterfaceC2489e interfaceC2489e = this.f18179a;
        InterfaceC2488d interfaceC2488d = interfaceC2489e instanceof InterfaceC2488d ? (InterfaceC2488d) interfaceC2489e : null;
        Class clsN = interfaceC2488d != null ? X5.f.n(interfaceC2488d) : null;
        int i = this.c;
        String string = clsN == null ? interfaceC2489e.toString() : (i & 4) != 0 ? "kotlin.Nothing" : clsN.isArray() ? clsN.equals(boolean[].class) ? "kotlin.BooleanArray" : clsN.equals(char[].class) ? "kotlin.CharArray" : clsN.equals(byte[].class) ? "kotlin.ByteArray" : clsN.equals(short[].class) ? "kotlin.ShortArray" : clsN.equals(int[].class) ? "kotlin.IntArray" : clsN.equals(float[].class) ? "kotlin.FloatArray" : clsN.equals(long[].class) ? "kotlin.LongArray" : clsN.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z4 && clsN.isPrimitive()) ? X5.f.o((InterfaceC2488d) interfaceC2489e).getName() : clsN.getName();
        List list = this.f18180b;
        return androidx.camera.core.impl.a.j(string, list.isEmpty() ? "" : C1110A.F(list, ", ", "<", ">", new com.squareup.wire.internal.a(this, 13), 24), (i & 1) != 0 ? Global.QUESTION : "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f = (F) obj;
        return this.f18179a.equals(f.f18179a) && j.b(this.f18180b, f.f18180b) && this.c == f.c;
    }

    public final int hashCode() {
        return AbstractC1414e.d(this.f18180b, this.f18179a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }
}
