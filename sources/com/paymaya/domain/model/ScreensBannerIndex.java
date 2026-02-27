package com.paymaya.domain.model;

import Q5.a;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ScreensBannerIndex {
    private static final String SERIALIZED_NAME_SERVICES = "services";

    @InterfaceC1497a
    @InterfaceC1498b(SERIALIZED_NAME_SERVICES)
    private final Integer servicesScreen;
    public static final Companion Companion = new Companion(null);
    private static final n deserializer = new a(3);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n getDeserializer() {
            return ScreensBannerIndex.deserializer;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScreensBannerIndex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ScreensBannerIndex copy$default(ScreensBannerIndex screensBannerIndex, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = screensBannerIndex.servicesScreen;
        }
        return screensBannerIndex.copy(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ScreensBannerIndex deserializer$lambda$0(o oVar, Type type, m mVar) {
        Integer num = null;
        Object[] objArr = 0;
        try {
            o oVarM = oVar.g().m(SERIALIZED_NAME_SERVICES);
            return new ScreensBannerIndex(oVarM != null ? Integer.valueOf(oVarM.e()) : null);
        } catch (Exception e) {
            e.printStackTrace();
            return new ScreensBannerIndex(num, 1, objArr == true ? 1 : 0);
        }
    }

    public final Integer component1() {
        return this.servicesScreen;
    }

    public final ScreensBannerIndex copy(Integer num) {
        return new ScreensBannerIndex(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScreensBannerIndex) && j.b(this.servicesScreen, ((ScreensBannerIndex) obj).servicesScreen);
    }

    public final Integer getServicesScreen() {
        return this.servicesScreen;
    }

    public int hashCode() {
        Integer num = this.servicesScreen;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "ScreensBannerIndex(servicesScreen=" + this.servicesScreen + ")";
    }

    public ScreensBannerIndex(Integer num) {
        this.servicesScreen = num;
    }

    public /* synthetic */ ScreensBannerIndex(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
