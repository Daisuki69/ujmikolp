package com.google.gson.internal.bind;

import T3.l;
import com.google.gson.j;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.y;
import com.google.gson.z;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f9916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f9917b;
    public final j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TypeToken f9918d;
    public final z e;
    public final l f = new l(this, 27);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9919g;
    public volatile y h;

    public static final class SingleTypeFactory implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeToken f9920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9921b;
        public final s c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n f9922d;

        public SingleTypeFactory(Object obj, TypeToken typeToken, boolean z4) {
            s sVar = obj instanceof s ? (s) obj : null;
            this.c = sVar;
            n nVar = obj instanceof n ? (n) obj : null;
            this.f9922d = nVar;
            com.google.gson.internal.e.b((sVar == null && nVar == null) ? false : true);
            this.f9920a = typeToken;
            this.f9921b = z4;
        }

        @Override // com.google.gson.z
        public final y a(j jVar, TypeToken typeToken) {
            TypeToken typeToken2 = this.f9920a;
            if (typeToken2 == null) {
                typeToken.getRawType();
                throw null;
            }
            if (typeToken2.equals(typeToken) || (this.f9921b && typeToken2.getType() == typeToken.getRawType())) {
                return new TreeTypeAdapter(this.c, this.f9922d, jVar, typeToken, this, true);
            }
            return null;
        }
    }

    public TreeTypeAdapter(s sVar, n nVar, j jVar, TypeToken typeToken, z zVar, boolean z4) {
        this.f9916a = sVar;
        this.f9917b = nVar;
        this.c = jVar;
        this.f9918d = typeToken;
        this.e = zVar;
        this.f9919g = z4;
    }

    public static z b(TypeToken typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType());
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final y a() {
        if (this.f9916a != null) {
            return this;
        }
        y yVar = this.h;
        if (yVar != null) {
            return yVar;
        }
        y yVarI = this.c.i(this.e, this.f9918d);
        this.h = yVarI;
        return yVarI;
    }

    @Override // com.google.gson.y
    public final Object read(j3.a aVar) {
        n nVar = this.f9917b;
        if (nVar == null) {
            y yVarI = this.h;
            if (yVarI == null) {
                yVarI = this.c.i(this.e, this.f9918d);
                this.h = yVarI;
            }
            return yVarI.read(aVar);
        }
        o oVarI = com.google.gson.internal.e.i(aVar);
        if (this.f9919g) {
            oVarI.getClass();
            if (oVarI instanceof p) {
                return null;
            }
        }
        return nVar.deserialize(oVarI, this.f9918d.getType(), this.f);
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) throws IOException {
        s sVar = this.f9916a;
        if (sVar == null) {
            y yVarI = this.h;
            if (yVarI == null) {
                yVarI = this.c.i(this.e, this.f9918d);
                this.h = yVarI;
            }
            yVarI.write(bVar, obj);
            return;
        }
        if (this.f9919g && obj == null) {
            bVar.r();
            return;
        }
        this.f9918d.getType();
        i.f9975z.write(bVar, sVar.a(obj));
    }
}
