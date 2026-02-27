package com.dynatrace.agent.view;

import androidx.camera.core.impl.a;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewContext {
    private final String id;
    private final String name;

    public ViewContext(String id, String name) {
        j.g(id, "id");
        j.g(name, "name");
        this.id = id;
        this.name = name;
    }

    public static /* synthetic */ ViewContext copy$default(ViewContext viewContext, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewContext.id;
        }
        if ((i & 2) != 0) {
            str2 = viewContext.name;
        }
        return viewContext.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final ViewContext copy(String id, String name) {
        j.g(id, "id");
        j.g(name, "name");
        return new ViewContext(id, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewContext)) {
            return false;
        }
        ViewContext viewContext = (ViewContext) obj;
        return j.b(this.id, viewContext.id) && j.b(this.name, viewContext.name);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ViewContext(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        return a.n(sb2, this.name, ')');
    }
}
