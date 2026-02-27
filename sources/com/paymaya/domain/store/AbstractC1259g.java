package com.paymaya.domain.store;

import java.io.IOException;

/* JADX INFO: renamed from: com.paymaya.domain.store.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1259g {
    public static com.google.gson.y a(final com.google.gson.j jVar) {
        return new com.google.gson.y(jVar) { // from class: com.paymaya.domain.store.AutoValue_AgeRestricted$GsonTypeAdapter

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public volatile com.google.gson.y f11335a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public volatile com.google.gson.y f11336b;
            public final com.google.gson.j c;

            {
                this.c = jVar;
            }

            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                Integer num = null;
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                aVar.c();
                String str = null;
                String str2 = null;
                while (aVar.t()) {
                    String strE = aVar.E();
                    if (aVar.peek() != 9) {
                        strE.getClass();
                        switch (strE) {
                            case "age":
                                com.google.gson.y yVarH = this.f11335a;
                                if (yVarH == null) {
                                    yVarH = this.c.h(Integer.class);
                                    this.f11335a = yVarH;
                                }
                                num = (Integer) yVarH.read(aVar);
                                break;
                            case "title":
                                com.google.gson.y yVarH2 = this.f11336b;
                                if (yVarH2 == null) {
                                    yVarH2 = this.c.h(String.class);
                                    this.f11336b = yVarH2;
                                }
                                str = (String) yVarH2.read(aVar);
                                break;
                            case "message":
                                com.google.gson.y yVarH3 = this.f11336b;
                                if (yVarH3 == null) {
                                    yVarH3 = this.c.h(String.class);
                                    this.f11336b = yVarH3;
                                }
                                str2 = (String) yVarH3.read(aVar);
                                break;
                            default:
                                aVar.Q();
                                break;
                        }
                    } else {
                        aVar.G();
                    }
                }
                aVar.k();
                return new C1263i(num, str, str2);
            }

            public final String toString() {
                return "TypeAdapter(AgeRestricted)";
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                AbstractC1259g abstractC1259g = (AbstractC1259g) obj;
                if (abstractC1259g == null) {
                    bVar.r();
                    return;
                }
                bVar.f();
                bVar.m("age");
                C1263i c1263i = (C1263i) abstractC1259g;
                if (c1263i.f11447a == null) {
                    bVar.r();
                } else {
                    com.google.gson.y yVarH = this.f11335a;
                    if (yVarH == null) {
                        yVarH = this.c.h(Integer.class);
                        this.f11335a = yVarH;
                    }
                    yVarH.write(bVar, c1263i.f11447a);
                }
                bVar.m("title");
                if (c1263i.f11448b == null) {
                    bVar.r();
                } else {
                    com.google.gson.y yVarH2 = this.f11336b;
                    if (yVarH2 == null) {
                        yVarH2 = this.c.h(String.class);
                        this.f11336b = yVarH2;
                    }
                    yVarH2.write(bVar, c1263i.f11448b);
                }
                bVar.m("message");
                if (c1263i.c == null) {
                    bVar.r();
                } else {
                    com.google.gson.y yVarH3 = this.f11336b;
                    if (yVarH3 == null) {
                        yVarH3 = this.c.h(String.class);
                        this.f11336b = yVarH3;
                    }
                    yVarH3.write(bVar, c1263i.c);
                }
                bVar.k();
            }
        };
    }
}
