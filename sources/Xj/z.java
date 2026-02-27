package xj;

import com.dynatrace.android.agent.Global;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
final class z implements WildcardType, Type {
    public static final a c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f21022d = new z(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f21023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f21024b;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public z(Type type, Type type2) {
        this.f21023a = type;
        this.f21024b = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f21024b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f21024b;
        if (type != null) {
            return "? super " + y.a(type);
        }
        Type type2 = this.f21023a;
        if (type2 == null || kotlin.jvm.internal.j.b(type2, Object.class)) {
            return Global.QUESTION;
        }
        return "? extends " + y.a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f21023a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
