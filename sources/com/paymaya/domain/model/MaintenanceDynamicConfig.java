package com.paymaya.domain.model;

import Q5.a;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.r;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MaintenanceDynamicConfig {
    private static final boolean DEFAULT_VALUE_IS_APP_MAINTENANCE = false;
    private static final String DEFAULT_VALUE_MESSAGE = "Oops! Something’s up. But don’t worry, we’re now looking into it. Please try again later.";
    private static final String SERIALIZED_NAME_APP_MAINTENANCE = "app_maintenance";
    private static final String SERIALIZED_NAME_MESSAGE = "message";

    @InterfaceC1497a
    @InterfaceC1498b(SERIALIZED_NAME_APP_MAINTENANCE)
    private final boolean isAppMaintenance;

    @InterfaceC1497a
    @InterfaceC1498b("message")
    private final String message;
    public static final Companion Companion = new Companion(null);
    private static final n deserializer = new a(2);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n getDeserializer() {
            return MaintenanceDynamicConfig.deserializer;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaintenanceDynamicConfig() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MaintenanceDynamicConfig copy$default(MaintenanceDynamicConfig maintenanceDynamicConfig, boolean z4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z4 = maintenanceDynamicConfig.isAppMaintenance;
        }
        if ((i & 2) != 0) {
            str = maintenanceDynamicConfig.message;
        }
        return maintenanceDynamicConfig.copy(z4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final MaintenanceDynamicConfig deserializer$lambda$2(o oVar, Type type, m mVar) {
        String strJ;
        int i = 3;
        boolean z4 = false;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        try {
            q qVarG = oVar.g();
            o oVarM = qVarG.m(SERIALIZED_NAME_APP_MAINTENANCE);
            r rVar = oVarM instanceof r ? (r) oVarM : null;
            if (rVar != null) {
                if (!(rVar.f10035a instanceof Boolean)) {
                    rVar = null;
                }
                if (rVar != null) {
                    boolean zC = rVar.c();
                    o oVarM2 = qVarG.m("message");
                    r rVar2 = oVarM2 instanceof r ? (r) oVarM2 : null;
                    if (rVar2 != null) {
                        if (!(rVar2.f10035a instanceof String)) {
                            rVar2 = null;
                        }
                        if (rVar2 != null && (strJ = rVar2.j()) != null) {
                            return new MaintenanceDynamicConfig(zC, strJ);
                        }
                    }
                    return new MaintenanceDynamicConfig(z4, str, i, objArr5 == true ? 1 : 0);
                }
            }
            return new MaintenanceDynamicConfig(z4, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
        } catch (Exception e) {
            e.printStackTrace();
            return new MaintenanceDynamicConfig(z4, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        }
    }

    public final boolean component1() {
        return this.isAppMaintenance;
    }

    public final String component2() {
        return this.message;
    }

    public final MaintenanceDynamicConfig copy(boolean z4, String message) {
        j.g(message, "message");
        return new MaintenanceDynamicConfig(z4, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaintenanceDynamicConfig)) {
            return false;
        }
        MaintenanceDynamicConfig maintenanceDynamicConfig = (MaintenanceDynamicConfig) obj;
        return this.isAppMaintenance == maintenanceDynamicConfig.isAppMaintenance && j.b(this.message, maintenanceDynamicConfig.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + ((this.isAppMaintenance ? 1231 : 1237) * 31);
    }

    public final boolean isAppMaintenance() {
        return this.isAppMaintenance;
    }

    public String toString() {
        return "MaintenanceDynamicConfig(isAppMaintenance=" + this.isAppMaintenance + ", message=" + this.message + ")";
    }

    public MaintenanceDynamicConfig(boolean z4, String message) {
        j.g(message, "message");
        this.isAppMaintenance = z4;
        this.message = message;
    }

    public /* synthetic */ MaintenanceDynamicConfig(boolean z4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z4, (i & 2) != 0 ? DEFAULT_VALUE_MESSAGE : str);
    }
}
