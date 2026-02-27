package androidx.navigation;

import androidx.navigation.NavArgument;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@NavDestinationDsl
public final class NavArgumentBuilder {
    private NavType<?> _type;
    private final NavArgument.Builder builder = new NavArgument.Builder();
    private Object defaultValue;
    private boolean nullable;

    public final NavArgument build() {
        return this.builder.build();
    }

    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final boolean getNullable() {
        return this.nullable;
    }

    public final NavType<?> getType() {
        NavType<?> navType = this._type;
        if (navType != null) {
            return navType;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final void setDefaultValue(Object obj) {
        this.defaultValue = obj;
        this.builder.setDefaultValue(obj);
    }

    public final void setNullable(boolean z4) {
        this.nullable = z4;
        this.builder.setIsNullable(z4);
    }

    public final void setType(NavType<?> value) {
        j.g(value, "value");
        this._type = value;
        this.builder.setType(value);
    }
}
