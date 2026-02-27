package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ShopHome;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ShopHome extends C$AutoValue_ShopHome {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(ShopHome)";
        }

        @Override // com.google.gson.y
        public ShopHome read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            ShopHome.Builder builderSBuilder = ShopHome.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("sections")) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mSections((String) yVarH.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, ShopHome shopHome) throws IOException {
            if (shopHome == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("sections");
            if (shopHome.mSections() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, shopHome.mSections());
            }
            bVar.k();
        }
    }

    public AutoValue_ShopHome(String str) {
        new ShopHome(str) { // from class: com.paymaya.domain.model.$AutoValue_ShopHome
            private final String mSections;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ShopHome$Builder */
            public static class Builder extends ShopHome.Builder {
                private String mSections;

                public /* synthetic */ Builder(ShopHome shopHome, int i) {
                    this(shopHome);
                }

                @Override // com.paymaya.domain.model.ShopHome.Builder
                public ShopHome build() {
                    String str = this.mSections == null ? " mSections" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_ShopHome(this.mSections);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.ShopHome.Builder
                public ShopHome.Builder mSections(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mSections");
                    }
                    this.mSections = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(ShopHome shopHome) {
                    this.mSections = shopHome.mSections();
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mSections");
                }
                this.mSections = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ShopHome) {
                    return this.mSections.equals(((ShopHome) obj).mSections());
                }
                return false;
            }

            public int hashCode() {
                return this.mSections.hashCode() ^ 1000003;
            }

            @Override // com.paymaya.domain.model.ShopHome
            @InterfaceC1498b("sections")
            public String mSections() {
                return this.mSections;
            }

            @Override // com.paymaya.domain.model.ShopHome
            public ShopHome.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return s.p(new StringBuilder("ShopHome{mSections="), this.mSections, "}");
            }
        };
    }
}
