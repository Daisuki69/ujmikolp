package com.paymaya.domain.model;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MissionsCategory {
    private final int id;
    private final String name;

    public MissionsCategory(int i, String name) {
        j.g(name, "name");
        this.id = i;
        this.name = name;
    }

    public static /* synthetic */ MissionsCategory copy$default(MissionsCategory missionsCategory, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = missionsCategory.id;
        }
        if ((i4 & 2) != 0) {
            str = missionsCategory.name;
        }
        return missionsCategory.copy(i, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final MissionsCategory copy(int i, String name) {
        j.g(name, "name");
        return new MissionsCategory(i, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionsCategory)) {
            return false;
        }
        MissionsCategory missionsCategory = (MissionsCategory) obj;
        return this.id == missionsCategory.id && j.b(this.name, missionsCategory.name);
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.id * 31);
    }

    public String toString() {
        return "MissionsCategory(id=" + this.id + ", name=" + this.name + ")";
    }
}
