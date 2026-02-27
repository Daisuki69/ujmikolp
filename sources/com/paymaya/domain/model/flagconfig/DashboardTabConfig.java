package com.paymaya.domain.model.flagconfig;

import Q5.a;
import We.s;
import com.google.gson.n;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DashboardTabConfig {
    private static final String SERIALIZED_NAME_TAB_ID = "id";
    private static final String SERIALIZED_NAME_TAB_NAME = "name";

    @InterfaceC1497a
    @InterfaceC1498b("id")
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("name")
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final n deserializer = new a(1);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n getDeserializer() {
            return DashboardTabConfig.deserializer;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardTabConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DashboardTabConfig copy$default(DashboardTabConfig dashboardTabConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardTabConfig.name;
        }
        if ((i & 2) != 0) {
            str2 = dashboardTabConfig.id;
        }
        return dashboardTabConfig.copy(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.paymaya.domain.model.flagconfig.DashboardTabConfig deserializer$lambda$2(com.google.gson.o r3, java.lang.reflect.Type r4, com.google.gson.m r5) {
        /*
            com.google.gson.q r3 = r3.g()
            java.lang.String r4 = "id"
            com.google.gson.o r5 = r3.m(r4)
            java.lang.String r0 = "name"
            com.google.gson.o r1 = r3.m(r0)
            r2 = 0
            if (r5 != 0) goto L16
            if (r1 != 0) goto L16
            return r2
        L16:
            com.google.gson.o r5 = r3.m(r0)
            boolean r0 = r5 instanceof com.google.gson.r
            if (r0 == 0) goto L21
            com.google.gson.r r5 = (com.google.gson.r) r5
            goto L22
        L21:
            r5 = r2
        L22:
            if (r5 == 0) goto L33
            java.io.Serializable r0 = r5.f10035a
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r5 = r2
        L2c:
            if (r5 == 0) goto L33
            java.lang.String r5 = r5.j()
            goto L34
        L33:
            r5 = r2
        L34:
            com.google.gson.o r3 = r3.m(r4)
            boolean r4 = r3 instanceof com.google.gson.r
            if (r4 == 0) goto L3f
            com.google.gson.r r3 = (com.google.gson.r) r3
            goto L40
        L3f:
            r3 = r2
        L40:
            if (r3 == 0) goto L50
            java.io.Serializable r4 = r3.f10035a
            boolean r4 = r4 instanceof java.lang.String
            if (r4 == 0) goto L49
            goto L4a
        L49:
            r3 = r2
        L4a:
            if (r3 == 0) goto L50
            java.lang.String r2 = r3.j()
        L50:
            if (r5 == 0) goto L5a
            if (r2 == 0) goto L5a
            com.paymaya.domain.model.flagconfig.DashboardTabConfig r3 = new com.paymaya.domain.model.flagconfig.DashboardTabConfig
            r3.<init>(r5, r2)
            return r3
        L5a:
            com.google.gson.JsonParseException r3 = new com.google.gson.JsonParseException
            java.lang.String r4 = "Invalid DashboardTabDetails JSON values"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.domain.model.flagconfig.DashboardTabConfig.deserializer$lambda$2(com.google.gson.o, java.lang.reflect.Type, com.google.gson.m):com.paymaya.domain.model.flagconfig.DashboardTabConfig");
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.id;
    }

    public final DashboardTabConfig copy(String name, String id) {
        j.g(name, "name");
        j.g(id, "id");
        return new DashboardTabConfig(name, id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardTabConfig)) {
            return false;
        }
        DashboardTabConfig dashboardTabConfig = (DashboardTabConfig) obj;
        return j.b(this.name, dashboardTabConfig.name) && j.b(this.id, dashboardTabConfig.id);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.id.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return s.l("DashboardTabConfig(name=", this.name, ", id=", this.id, ")");
    }

    public DashboardTabConfig(String name, String id) {
        j.g(name, "name");
        j.g(id, "id");
        this.name = name;
        this.id = id;
    }

    public /* synthetic */ DashboardTabConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
