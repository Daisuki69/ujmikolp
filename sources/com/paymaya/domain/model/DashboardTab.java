package com.paymaya.domain.model;

import We.s;
import com.paymaya.common.utility.EnumC1217f;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DashboardTab {
    private EnumC1217f eventTarget;
    private final String id;
    private final String name;

    public DashboardTab(String name, String id, EnumC1217f eventTarget) {
        j.g(name, "name");
        j.g(id, "id");
        j.g(eventTarget, "eventTarget");
        this.name = name;
        this.id = id;
        this.eventTarget = eventTarget;
    }

    public static /* synthetic */ DashboardTab copy$default(DashboardTab dashboardTab, String str, String str2, EnumC1217f enumC1217f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardTab.name;
        }
        if ((i & 2) != 0) {
            str2 = dashboardTab.id;
        }
        if ((i & 4) != 0) {
            enumC1217f = dashboardTab.eventTarget;
        }
        return dashboardTab.copy(str, str2, enumC1217f);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.id;
    }

    public final EnumC1217f component3() {
        return this.eventTarget;
    }

    public final DashboardTab copy(String name, String id, EnumC1217f eventTarget) {
        j.g(name, "name");
        j.g(id, "id");
        j.g(eventTarget, "eventTarget");
        return new DashboardTab(name, id, eventTarget);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardTab)) {
            return false;
        }
        DashboardTab dashboardTab = (DashboardTab) obj;
        return j.b(this.name, dashboardTab.name) && j.b(this.id, dashboardTab.id) && this.eventTarget == dashboardTab.eventTarget;
    }

    public final EnumC1217f getEventTarget() {
        return this.eventTarget;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.eventTarget.hashCode() + AbstractC1414e.c(this.name.hashCode() * 31, 31, this.id);
    }

    public final void setEventTarget(EnumC1217f enumC1217f) {
        j.g(enumC1217f, "<set-?>");
        this.eventTarget = enumC1217f;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.id;
        EnumC1217f enumC1217f = this.eventTarget;
        StringBuilder sbX = s.x("DashboardTab(name=", str, ", id=", str2, ", eventTarget=");
        sbX.append(enumC1217f);
        sbX.append(")");
        return sbX.toString();
    }

    public /* synthetic */ DashboardTab(String str, String str2, EnumC1217f enumC1217f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? EnumC1217f.DEFAULT : enumC1217f);
    }
}
