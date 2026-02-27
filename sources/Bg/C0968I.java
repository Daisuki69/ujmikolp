package bg;

import java.util.ArrayList;

/* JADX INFO: renamed from: bg.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0968I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8812b;
    public final float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8813d;

    public /* synthetic */ C0968I(String str, float f) {
        this(str, f, 0.0f, new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0968I)) {
            return false;
        }
        C0968I c0968i = (C0968I) obj;
        return kotlin.jvm.internal.j.b(this.f8811a, c0968i.f8811a) && Float.compare(this.f8812b, c0968i.f8812b) == 0 && Float.compare(this.c, c0968i.c) == 0 && kotlin.jvm.internal.j.b(this.f8813d, c0968i.f8813d);
    }

    public final int hashCode() {
        String str = this.f8811a;
        int iFloatToIntBits = (Float.floatToIntBits(this.c) + ((Float.floatToIntBits(this.f8812b) + ((str != null ? str.hashCode() : 0) * 31)) * 31)) * 31;
        ArrayList arrayList = this.f8813d;
        return iFloatToIntBits + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "Emulator(name=" + this.f8811a + ", minExpectedScore=" + this.f8812b + ", totalScore=" + this.c + ", _rules=" + this.f8813d + ")";
    }

    public C0968I(String name, float f, float f3, ArrayList _rules) {
        kotlin.jvm.internal.j.h(name, "name");
        kotlin.jvm.internal.j.h(_rules, "_rules");
        this.f8811a = name;
        this.f8812b = f;
        this.c = f3;
        this.f8813d = _rules;
    }
}
