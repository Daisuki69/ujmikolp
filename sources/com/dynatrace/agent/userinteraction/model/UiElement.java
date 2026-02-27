package com.dynatrace.agent.userinteraction.model;

import androidx.camera.core.impl.a;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class UiElement {
    private final String component;
    private final String id;
    private final String name;

    public UiElement(String name, String component, String id) {
        j.g(name, "name");
        j.g(component, "component");
        j.g(id, "id");
        this.name = name;
        this.component = component;
        this.id = id;
    }

    public static /* synthetic */ UiElement copy$default(UiElement uiElement, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiElement.name;
        }
        if ((i & 2) != 0) {
            str2 = uiElement.component;
        }
        if ((i & 4) != 0) {
            str3 = uiElement.id;
        }
        return uiElement.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.component;
    }

    public final String component3() {
        return this.id;
    }

    public final UiElement copy(String name, String component, String id) {
        j.g(name, "name");
        j.g(component, "component");
        j.g(id, "id");
        return new UiElement(name, component, id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiElement)) {
            return false;
        }
        UiElement uiElement = (UiElement) obj;
        return j.b(this.name, uiElement.name) && j.b(this.component, uiElement.component) && j.b(this.id, uiElement.id);
    }

    public final String getComponent() {
        return this.component;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.id.hashCode() + AbstractC1414e.c(this.name.hashCode() * 31, 31, this.component);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UiElement(name=");
        sb2.append(this.name);
        sb2.append(", component=");
        sb2.append(this.component);
        sb2.append(", id=");
        return a.n(sb2, this.id, ')');
    }
}
