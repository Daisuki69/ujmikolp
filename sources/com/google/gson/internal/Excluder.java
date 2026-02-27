package com.google.gson.internal;

import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import d4.AbstractC1331a;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Excluder implements z, Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Excluder f9876d = new Excluder();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9878b;
    public final List c;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.f9878b = list;
        this.c = list;
    }

    @Override // com.google.gson.z
    public final y a(final com.google.gson.j jVar, final TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        final boolean zC = c(rawType, true);
        final boolean zC2 = c(rawType, false);
        if (zC || zC2) {
            return new y() { // from class: com.google.gson.internal.Excluder.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public volatile y f9879a;

                @Override // com.google.gson.y
                public final Object read(j3.a aVar) {
                    if (zC2) {
                        aVar.Q();
                        return null;
                    }
                    y yVarI = this.f9879a;
                    if (yVarI == null) {
                        yVarI = jVar.i(Excluder.this, typeToken);
                        this.f9879a = yVarI;
                    }
                    return yVarI.read(aVar);
                }

                @Override // com.google.gson.y
                public final void write(j3.b bVar, Object obj) throws IOException {
                    if (zC) {
                        bVar.r();
                        return;
                    }
                    y yVarI = this.f9879a;
                    if (yVarI == null) {
                        yVarI = jVar.i(Excluder.this, typeToken);
                        this.f9879a = yVarI;
                    }
                    yVarI.write(bVar, obj);
                }
            };
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean c(Class cls, boolean z4) {
        if (!z4 && !Enum.class.isAssignableFrom(cls)) {
            qk.i iVar = i3.c.f17096a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z4 ? this.f9878b : this.c).iterator();
        if (it.hasNext()) {
            throw AbstractC1331a.n(it);
        }
        return false;
    }
}
