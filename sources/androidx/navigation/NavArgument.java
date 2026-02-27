package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NavArgument {
    private final Object defaultValue;
    private final boolean isDefaultValuePresent;
    private final boolean isNullable;
    private final NavType<Object> type;

    public static final class Builder {
        private Object defaultValue;
        private boolean defaultValuePresent;
        private boolean isNullable;
        private NavType<Object> type;

        public final NavArgument build() {
            NavType<Object> navTypeInferFromValueType = this.type;
            if (navTypeInferFromValueType == null) {
                navTypeInferFromValueType = NavType.Companion.inferFromValueType(this.defaultValue);
            }
            return new NavArgument(navTypeInferFromValueType, this.isNullable, this.defaultValue, this.defaultValuePresent);
        }

        public final Builder setDefaultValue(Object obj) {
            this.defaultValue = obj;
            this.defaultValuePresent = true;
            return this;
        }

        public final Builder setIsNullable(boolean z4) {
            this.isNullable = z4;
            return this;
        }

        public final <T> Builder setType(NavType<T> type) {
            j.g(type, "type");
            this.type = type;
            return this;
        }
    }

    public NavArgument(NavType<Object> type, boolean z4, Object obj, boolean z5) {
        j.g(type, "type");
        if (!type.isNullableAllowed() && z4) {
            throw new IllegalArgumentException((type.getName() + " does not allow nullable values").toString());
        }
        if (!z4 && z5 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.getName() + " has null value but is not nullable.").toString());
        }
        this.type = type;
        this.isNullable = z4;
        this.defaultValue = obj;
        this.isDefaultValuePresent = z5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && NavArgument.class.equals(obj.getClass())) {
            NavArgument navArgument = (NavArgument) obj;
            if (this.isNullable != navArgument.isNullable || this.isDefaultValuePresent != navArgument.isDefaultValuePresent || !j.b(this.type, navArgument.type)) {
                return false;
            }
            Object obj2 = this.defaultValue;
            if (obj2 != null) {
                return j.b(obj2, navArgument.defaultValue);
            }
            if (navArgument.defaultValue == null) {
                return true;
            }
        }
        return false;
    }

    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final NavType<Object> getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31;
        Object obj = this.defaultValue;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean isDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    public final boolean isNullable() {
        return this.isNullable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void putDefaultValue(String name, Bundle bundle) {
        j.g(name, "name");
        j.g(bundle, "bundle");
        if (this.isDefaultValuePresent) {
            this.type.put(bundle, name, this.defaultValue);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavArgument");
        sb2.append(" Type: " + this.type);
        sb2.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb2.append(" DefaultValue: " + this.defaultValue);
        }
        String string = sb2.toString();
        j.f(string, "sb.toString()");
        return string;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean verify(String name, Bundle bundle) {
        j.g(name, "name");
        j.g(bundle, "bundle");
        if (!this.isNullable && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.type.get(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
