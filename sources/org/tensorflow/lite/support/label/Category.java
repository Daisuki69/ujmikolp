package org.tensorflow.lite.support.label;

import We.s;
import java.util.Objects;
import org.tensorflow.lite.annotations.UsedByReflection;

/* JADX INFO: loaded from: classes5.dex */
@UsedByReflection
public final class Category {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18930b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18931d;

    @UsedByReflection
    public Category(String str, float f) {
        this(str, "", f, -1);
    }

    @UsedByReflection
    public static Category create(String str, String str2, float f, int i) {
        return new Category(str, str2, f, i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Category) {
            Category category = (Category) obj;
            if (category.f18930b.equals(this.f18930b)) {
                if (category.c.equals(this.c)) {
                    if (Math.abs(category.f18931d - this.f18931d) < 1.0E-6f) {
                        if (category.f18929a == this.f18929a) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18930b, this.c, Float.valueOf(this.f18931d), Integer.valueOf(this.f18929a));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<Category \"");
        sb2.append(this.f18930b);
        sb2.append("\" (displayName=");
        sb2.append(this.c);
        sb2.append(" score=");
        sb2.append(this.f18931d);
        sb2.append(" index=");
        return s.o(sb2, ")>", this.f18929a);
    }

    public Category(String str, String str2, float f, int i) {
        this.f18930b = str;
        this.c = str2;
        this.f18931d = f;
        this.f18929a = i;
    }

    @UsedByReflection
    public static Category create(String str, String str2, float f) {
        return new Category(str, str2, f, -1);
    }
}
